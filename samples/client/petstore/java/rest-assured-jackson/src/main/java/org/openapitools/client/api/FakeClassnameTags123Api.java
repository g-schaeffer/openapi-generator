/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:43.132Z[UTC]
 *
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import static io.restassured.http.Method.*;


public class FakeClassnameTags123Api {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private FakeClassnameTags123Api(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static FakeClassnameTags123Api fakeClassnameTags123(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new FakeClassnameTags123Api(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if(reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public List<Oper> getAllOperations() {
        return Arrays.asList(
                testClassname()
        );
    }

    public TestClassnameOper testClassname() {
        return new TestClassnameOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public FakeClassnameTags123Api reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * To test class name in snake case
     * To test class name in snake case
     *
     * @see #body client model (required)
     * return Client
     */
    public static class TestClassnameOper implements Oper {

        public static final Method REQ_METHOD = PATCH;
        public static final String REQ_URI = "/fake_classname_test";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public TestClassnameOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /fake_classname_test
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * PATCH /fake_classname_test
         * @param handler handler
         * @return Client
         */
        public Client executeAs(Function<Response, Response> handler) {
            TypeRef<Client> type = new TypeRef<Client>(){};
            return execute(handler).as(type);
        }

         /**
         * @param body (Client) client model (required)
         * @return operation
         */
        public TestClassnameOper body(Client body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public TestClassnameOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public TestClassnameOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
