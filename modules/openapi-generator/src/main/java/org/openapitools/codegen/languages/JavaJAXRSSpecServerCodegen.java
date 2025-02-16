/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.languages;

import io.swagger.v3.oas.models.media.Schema;
import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.*;
import org.openapitools.codegen.meta.features.DocumentationFeature;
import org.openapitools.codegen.model.ModelMap;
import org.openapitools.codegen.model.ModelsMap;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import static org.openapitools.codegen.languages.features.GzipFeatures.USE_GZIP_FEATURE;
import static org.openapitools.codegen.utils.StringUtils.underscore;

public class JavaJAXRSSpecServerCodegen extends AbstractJavaJAXRSServerCodegen {

    public static final String INTERFACE_ONLY = "interfaceOnly";
    public static final String RETURN_RESPONSE = "returnResponse";
    public static final String GENERATE_POM = "generatePom";
    public static final String USE_SWAGGER_ANNOTATIONS = "useSwaggerAnnotations";
    public static final String USE_MICROPROFILE_OPENAPI_ANNOTATIONS = "useMicroProfileOpenAPIAnnotations";
    public static final String OPEN_API_SPEC_FILE_LOCATION = "openApiSpecFileLocation";
    public static final String GENERATE_BUILDERS = "generateBuilders";
    public static final String USE_UNKNOWN_FIELDS_RETENTION = "useUnknownFieldsRetention";

    public static final String QUARKUS_LIBRARY = "quarkus";
    public static final String THORNTAIL_LIBRARY = "thorntail";
    public static final String OPEN_LIBERTY_LIBRARY = "openliberty";
    public static final String HELIDON_LIBRARY = "helidon";
    public static final String KUMULUZEE_LIBRARY = "kumuluzee";
    public static final String START_ENUMS_WITH_UNKNOWN = "startEnumsWithUnknown";
    public static final String START_ENUMS_WITH_UNSPECIFIED = "startEnumsWithUnspecified";
    public static final String ENUM_STRUCT_NAME_AS_PREFIX = "enumStructNameAsPrefix";
    public static final String KEEP_ENUM_NAME_ORIGINAL_CASE = "keepEnumNameOriginalCase";

    private boolean interfaceOnly = false;
    private boolean returnResponse = false;
    private boolean generatePom = true;
    private boolean generateBuilders = false;
    private boolean useUnknownFieldsRetention = false;
    private boolean useSwaggerAnnotations = true;
    private boolean useMicroProfileOpenAPIAnnotations = false;

    protected boolean useGzipFeature = false;
    private boolean useJackson = false;
    private String openApiSpecFileLocation = "src/main/openapi/openapi.yaml";
    private boolean startEnumsWithUnknown = false;

    private boolean startEnumsWithUnspecified = false;

    private boolean enumStructNameAsPrefix = false;

    private boolean keepEnumNameOriginalCase = false;

    public JavaJAXRSSpecServerCodegen() {
        super();

        modifyFeatureSet(features -> features.includeDocumentationFeatures(DocumentationFeature.Readme));

        invokerPackage = "org.openapitools.api";
        artifactId = "openapi-jaxrs-server";
        outputFolder = "generated-code/JavaJaxRS-Spec";
        apiPackage = "org.openapitools.api";
        modelPackage = "org.openapitools.model";

        // cliOptions default redefinition need to be updated
        updateOption(CodegenConstants.INVOKER_PACKAGE, this.getInvokerPackage());
        updateOption(CodegenConstants.ARTIFACT_ID, this.getArtifactId());
        updateOption(CodegenConstants.API_PACKAGE, apiPackage);
        updateOption(CodegenConstants.MODEL_PACKAGE, modelPackage);

        modelTemplateFiles.put("model.mustache", ".java");
        apiTemplateFiles.put("api.mustache", ".java");

        apiTestTemplateFiles.clear(); // TODO: add api test template
        modelTestTemplateFiles.clear(); // TODO: add model test template

        // clear model and api doc template as this codegen
        // does not support auto-generated markdown doc at the moment
        //TODO: add doc templates
        modelDocTemplateFiles.remove("model_doc.mustache");
        apiDocTemplateFiles.remove("api_doc.mustache");

        additionalProperties.put("title", title);

        typeMapping.put("date", "LocalDate");

        importMapping.put("LocalDate", "org.joda.time.LocalDate");

        super.embeddedTemplateDir = templateDir = JAXRS_TEMPLATE_DIRECTORY_NAME + File.separator + "spec";

        removeOption(CodegenConstants.LIBRARY);
        CliOption library = new CliOption(CodegenConstants.LIBRARY, CodegenConstants.LIBRARY_DESC).defaultValue(DEFAULT_LIBRARY);
        supportedLibraries.put(DEFAULT_LIBRARY, "JAXRS spec only, to be deployed in an app server (TomEE, JBoss, WLS, ...)");
        supportedLibraries.put(QUARKUS_LIBRARY, "Server using Quarkus");
        supportedLibraries.put(THORNTAIL_LIBRARY, "Server using Thorntail");
        supportedLibraries.put(OPEN_LIBERTY_LIBRARY, "Server using Open Liberty");
        supportedLibraries.put(HELIDON_LIBRARY, "Server using Helidon");
        supportedLibraries.put(KUMULUZEE_LIBRARY, "Server using KumuluzEE");
        library.setEnum(supportedLibraries);

        cliOptions.add(library);
        cliOptions.add(CliOption.newBoolean(GENERATE_POM, "Whether to generate pom.xml if the file does not already exist.").defaultValue(String.valueOf(generatePom)));
        cliOptions.add(CliOption.newBoolean(GENERATE_BUILDERS, "Whether to generate builders for models.").defaultValue(String.valueOf(generateBuilders)));
        cliOptions.add(CliOption.newBoolean(USE_UNKNOWN_FIELDS_RETENTION,
                "Whether to generate unknown fields retention for models.").defaultValue(String.valueOf(useUnknownFieldsRetention)));
        cliOptions.add(CliOption.newBoolean(INTERFACE_ONLY, "Whether to generate only API interface stubs without the server files.").defaultValue(String.valueOf(interfaceOnly)));
        cliOptions.add(CliOption.newBoolean(RETURN_RESPONSE, "Whether generate API interface should return javax.ws.rs.core.Response instead of a deserialized entity. Only useful if interfaceOnly is true.").defaultValue(String.valueOf(returnResponse)));
        cliOptions.add(CliOption.newBoolean(USE_SWAGGER_ANNOTATIONS, "Whether to generate Swagger annotations.", useSwaggerAnnotations));
        cliOptions.add(CliOption.newBoolean(USE_MICROPROFILE_OPENAPI_ANNOTATIONS, "Whether to generate Microprofile OpenAPI annotations. Only valid when library is set to quarkus.", useMicroProfileOpenAPIAnnotations));
        cliOptions.add(CliOption.newString(OPEN_API_SPEC_FILE_LOCATION, "Location where the file containing the spec will be generated in the output folder. No file generated when set to null or empty string."));
        cliOptions.add(CliOption.newBoolean(SUPPORT_ASYNC, "Wrap responses in CompletionStage type, allowing asynchronous computation (requires JAX-RS 2.1).", supportAsync));
        cliOptions.add(CliOption.newBoolean(START_ENUMS_WITH_UNKNOWN, "Introduces \"UNKNOWN\" as the first element of enumerations.", startEnumsWithUnknown));
        cliOptions.add(CliOption.newBoolean(START_ENUMS_WITH_UNSPECIFIED, "Introduces \"UNSPECIFIED\" as the first element of enumerations.", startEnumsWithUnspecified));
        cliOptions.add(CliOption.newBoolean(ENUM_STRUCT_NAME_AS_PREFIX, "Uses enum structure name as prefix for the enum values.", startEnumsWithUnspecified));
        cliOptions.add(CliOption.newBoolean(KEEP_ENUM_NAME_ORIGINAL_CASE, "Keep the original case of enum name.", keepEnumNameOriginalCase));
    }

    @Override
    public void processOpts() {
        if (additionalProperties.containsKey(GENERATE_POM)) {
            generatePom = Boolean.parseBoolean(additionalProperties.get(GENERATE_POM).toString());
        }
        if (additionalProperties.containsKey(INTERFACE_ONLY)) {
            interfaceOnly = Boolean.parseBoolean(additionalProperties.get(INTERFACE_ONLY).toString());
            if (!interfaceOnly) {
                additionalProperties.remove(INTERFACE_ONLY);
            }
        }
        if (additionalProperties.containsKey(RETURN_RESPONSE)) {
            returnResponse = Boolean.parseBoolean(additionalProperties.get(RETURN_RESPONSE).toString());
            if (!returnResponse) {
                additionalProperties.remove(RETURN_RESPONSE);
            }
        }
        if (additionalProperties.containsKey(SUPPORT_ASYNC)) {
            supportAsync = Boolean.parseBoolean(additionalProperties.get(SUPPORT_ASYNC).toString());
            if (!supportAsync) {
                additionalProperties.remove(SUPPORT_ASYNC);
            } else {
                // java8 tag has been deprecated
                //setJava8ModeAndAdditionalProperties(true);
            }
        }
        if (QUARKUS_LIBRARY.equals(library) || THORNTAIL_LIBRARY.equals(library) || HELIDON_LIBRARY.equals(library) || OPEN_LIBERTY_LIBRARY.equals(library) || KUMULUZEE_LIBRARY.equals(library)) {
            useSwaggerAnnotations = false;
        } else {
            if (additionalProperties.containsKey(USE_SWAGGER_ANNOTATIONS)) {
                useSwaggerAnnotations = Boolean.parseBoolean(additionalProperties.get(USE_SWAGGER_ANNOTATIONS).toString());
            }
        }
        if (KUMULUZEE_LIBRARY.equals(library)){
            super.setSourceFolder("src/main/java");
        }
        writePropertyBack(USE_SWAGGER_ANNOTATIONS, useSwaggerAnnotations);

        if (QUARKUS_LIBRARY.equals(library)) {
            if (additionalProperties.containsKey(USE_MICROPROFILE_OPENAPI_ANNOTATIONS)) {
                useMicroProfileOpenAPIAnnotations = Boolean.parseBoolean(additionalProperties.get(USE_MICROPROFILE_OPENAPI_ANNOTATIONS).toString());
            }
            writePropertyBack(USE_MICROPROFILE_OPENAPI_ANNOTATIONS, useMicroProfileOpenAPIAnnotations);
        }


        if (additionalProperties.containsKey(GENERATE_BUILDERS)) {
            generateBuilders = Boolean.parseBoolean(additionalProperties.get(GENERATE_BUILDERS).toString());
        }
        additionalProperties.put(GENERATE_BUILDERS, generateBuilders);

        if (additionalProperties.containsKey(USE_UNKNOWN_FIELDS_RETENTION)) {
            useUnknownFieldsRetention = Boolean.parseBoolean(additionalProperties.get(USE_UNKNOWN_FIELDS_RETENTION).toString());
        }
        additionalProperties.put(USE_UNKNOWN_FIELDS_RETENTION, useUnknownFieldsRetention);

        if (additionalProperties.containsKey(OPEN_API_SPEC_FILE_LOCATION)) {
            openApiSpecFileLocation = additionalProperties.get(OPEN_API_SPEC_FILE_LOCATION).toString();
        } else if(QUARKUS_LIBRARY.equals(library) || THORNTAIL_LIBRARY.equals(library) || HELIDON_LIBRARY.equals(library) || KUMULUZEE_LIBRARY.equals(library)) {
            openApiSpecFileLocation = "src/main/resources/META-INF/openapi.yaml";
        } else if(OPEN_LIBERTY_LIBRARY.equals(library)) {
            openApiSpecFileLocation = "src/main/webapp/META-INF/openapi.yaml";
        }

        additionalProperties.put(OPEN_API_SPEC_FILE_LOCATION, openApiSpecFileLocation);

        useJackson = convertPropertyToBoolean(JACKSON);

        if (interfaceOnly) {
            // Change default artifactId if generating interfaces only, before command line options are applied in base class.
            artifactId = "openapi-jaxrs-client";
        }

        super.processOpts();

        supportingFiles.clear(); // Don't need extra files provided by AbstractJAX-RS & Java Codegen
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md")
            .doNotOverwrite());
        supportingFiles.add(new SupportingFile("RestResourceRoot.mustache",
                (sourceFolder + '/' + invokerPackage).replace(".", "/"), "RestResourceRoot.java")
                .doNotOverwrite());

        if (generatePom) {
            supportingFiles.add(new SupportingFile("pom.mustache", "", "pom.xml")
                .doNotOverwrite());
        }
        if (!interfaceOnly) {
            supportingFiles.add(new SupportingFile("RestApplication.mustache",
                    (sourceFolder + '/' + invokerPackage).replace(".", "/"), "RestApplication.java")
                .doNotOverwrite());
        }

        if(StringUtils.isNotEmpty(openApiSpecFileLocation)) {
            int index = openApiSpecFileLocation.lastIndexOf('/');
            String fileFolder;
            String fileName;
            if(index >= 0) {
                fileFolder = openApiSpecFileLocation.substring(0, index);
                fileName = openApiSpecFileLocation.substring(index + 1);
            } else {
                fileFolder = "";
                fileName = openApiSpecFileLocation;
            }
            supportingFiles.add(new SupportingFile("openapi.mustache", fileFolder, fileName));
        }

        if(QUARKUS_LIBRARY.equals(library)) {
            supportingFiles.add(new SupportingFile("application.properties.mustache", "src/main/resources", "application.properties")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("Dockerfile.jvm.mustache", "src/main/docker", "Dockerfile.jvm")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("Dockerfile.native.mustache", "src/main/docker", "Dockerfile.native")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("dockerignore.mustache", "", ".dockerignore")
                    .doNotOverwrite());
        } else if(OPEN_LIBERTY_LIBRARY.equals(library)) {
            supportingFiles.add(new SupportingFile("server.xml.mustache", "src/main/liberty/config", "server.xml")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("beans.xml.mustache", "src/main/webapp/META-INF", "beans.xml")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("MANIFEST.MF.mustache", "src/main/webapp/META-INF", "MANIFEST.MF")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("microprofile-config.properties.mustache", "src/main/webapp/META-INF", "microprofile-config.properties")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("ibm-web-ext.xml.mustache", "src/main/webapp/WEB-INF", "ibm-web-ext.xml")
                    .doNotOverwrite());
        } else if(HELIDON_LIBRARY.equals(library)) {
            additionalProperties.computeIfAbsent("helidonVersion", key -> "2.4.1");
            supportingFiles.add(new SupportingFile("logging.properties.mustache", "src/main/resources", "logging.properties")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("microprofile-config.properties.mustache", "src/main/resources/META-INF", "microprofile-config.properties")
                    .doNotOverwrite());
            supportingFiles.add(new SupportingFile("beans.xml.mustache", "src/main/resources/META-INF", "beans.xml")
                    .doNotOverwrite());
        } else if(KUMULUZEE_LIBRARY.equals(library)) {
            supportingFiles.add(new SupportingFile("config.yaml.mustache", "src/main/resources", "config.yaml"));
        }

        if (additionalProperties.containsKey(USE_GZIP_FEATURE)) {
            useGzipFeature = Boolean.parseBoolean(additionalProperties.get(USE_GZIP_FEATURE).toString());
            if (!useGzipFeature) {
                additionalProperties.remove(USE_GZIP_FEATURE);
            }
        }

        if (additionalProperties.containsKey(this.START_ENUMS_WITH_UNKNOWN)) {
            this.startEnumsWithUnknown = convertPropertyToBooleanAndWriteBack(START_ENUMS_WITH_UNKNOWN);
        }

        if (additionalProperties.containsKey(this.START_ENUMS_WITH_UNSPECIFIED)) {
            this.startEnumsWithUnspecified = convertPropertyToBooleanAndWriteBack(START_ENUMS_WITH_UNSPECIFIED);
        }

        if (additionalProperties.containsKey(this.ENUM_STRUCT_NAME_AS_PREFIX)) {
            this.enumStructNameAsPrefix = convertPropertyToBooleanAndWriteBack(ENUM_STRUCT_NAME_AS_PREFIX);
        }

        if (additionalProperties.containsKey(this.KEEP_ENUM_NAME_ORIGINAL_CASE)) {
            this.keepEnumNameOriginalCase = convertPropertyToBooleanAndWriteBack(KEEP_ENUM_NAME_ORIGINAL_CASE);
        }
    }

    @Override
    public String getName() {
        return "jaxrs-spec";
    }

    public String getOpenApiSpecFileLocation() {
        return openApiSpecFileLocation;
    }

    /**
     * Location where the file containing the spec will be generated in the output folder.
     * @param location location inside the output folder. No file generated when set to null or empty string.
     */
    public void setOpenApiSpecFileLocation(String location) {
        this.openApiSpecFileLocation = location;
    }

    @Override
    public CodegenModel fromModel(String name, Schema model) {
        CodegenModel codegenModel = super.fromModel(name, model);
        if (!useSwaggerAnnotations) {
            codegenModel.imports.remove("ApiModelProperty");
            codegenModel.imports.remove("ApiModel");
        }
        if (!useJackson) {
            codegenModel.imports.remove("JsonSerialize");
            codegenModel.imports.remove("ToStringSerializer");
            codegenModel.imports.remove("JsonValue");
            codegenModel.imports.remove("JsonProperty");
        }
        return codegenModel;
    }

    @Override
    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> objs) {
        generateYAMLSpecFile(objs);
        return super.postProcessSupportingFileData(objs);
    }

    /**
     * Adds prefix to the enum allowable values
     * NOTE: Enum values use C++ scoping rules, meaning that enum values are siblings of their type, not children of it. Therefore, enum value must be unique
     *
     * @param allowableValues allowable values
     * @param prefix          added prefix
     * @param dataType dataType
     */
    public void addEnumValuesPrefix(Map<String, Object> allowableValues, String prefix, String dataType){
        if(allowableValues.containsKey("enumVars")) {
            List<Map<String, Object>> enumVars = (List<Map<String, Object>>)allowableValues.get("enumVars");

            if (this.enumStructNameAsPrefix) {
                for (Map<String, Object> value : enumVars) {
                    String name = (String) value.get("name");
                    value.put("name", toEnumVarName(prefix + "_" + name, dataType));
                    value.put("value", toEnumValue(prefix + "_" + name, dataType));
                }
            }
        }

        // update values
        if(allowableValues.containsKey("values")) {
            List values = (List)allowableValues.get("values");
            for(int i = 0 ; i < values.size() ; i++) {
                String valueAsString = (values.get(i) instanceof String) ?
                  (String) values.get(i) : values.get(i).toString();
                if (!valueAsString.startsWith(prefix + "_")) {
                    String value = valueAsString;
                    if (this.enumStructNameAsPrefix) {
                        value = prefix + "_" + value;
                    }
                    if (!keepEnumNameOriginalCase) {
                        value = underscore(value).toUpperCase(Locale.ROOT);
                    }
                    values.set(i, value);
                }
            }
        }
    }

    @Override
    public String getHelp() {
        return "Generates a Java JAXRS Server according to JAXRS 2.0 specification.";
    }

    @Override
    public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
        super.postProcessModelProperty(model, property);

        // Add imports for java.util.Arrays
        if (property.isByteArray) {
            model.imports.add("Arrays");
        }
    }

    /**
     * Adds unknown value to the enum allowable values
     *
     * @param allowableValues allowable values
     */
    public void addUnknownToAllowableValues(Map<String, Object> allowableValues) {
        if(startEnumsWithUnspecified || startEnumsWithUnknown) {
            String value = startEnumsWithUnspecified ? "UNSPECIFIED" : "UNKNOWN";
            if(allowableValues.containsKey("enumVars")) {
                List<Map<String, Object>> enumVars = (List<Map<String, Object>>)allowableValues.get("enumVars");

                // add unspecified only if not already present
                if (enumVars.size() > 0 && !value.equals(enumVars.get(0).get("name"))) {
                    HashMap<String, Object> unknown = new HashMap<String, Object>();
                    unknown.put("name", value);
                    unknown.put("isString", "false");
                    unknown.put("value", "\"" + value + "\"");

                    enumVars.add(0, unknown);
                }
            }

            // add unspecified only if not already present
            if(allowableValues.containsKey("values") && !((List<String>)allowableValues.get("values")).get(0).endsWith(value)) {
                List<String> values = (List<String>)allowableValues.get("values");
                values.add(0, value);
            }
        }
    }

    @Override
    public ModelsMap postProcessModels(ModelsMap objs) {
        for (ModelMap modelMap : objs.getModels()) {
            CodegenModel model = modelMap.getModel();
            if (model.isEnum) {
                Map<String, Object> allowableValues = model.getAllowableValues();
                addUnknownToAllowableValues(allowableValues);
                addEnumValuesPrefix(allowableValues, model.getClassname(), model.dataType);
            }

            model.getVars().stream()
                    .filter(property -> property.isEnum)
                    .forEach(property -> {
                            addUnknownToAllowableValues(property.allowableValues);
                            addEnumValuesPrefix(property.allowableValues, property.baseName, property.baseType);
                    });
        }

        return super.postProcessModels(objs);
    }
}
