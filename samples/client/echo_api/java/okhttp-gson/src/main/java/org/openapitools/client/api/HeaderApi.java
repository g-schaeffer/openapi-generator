/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:40.991Z[UTC]
 *
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;


public class HeaderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HeaderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HeaderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for testHeaderIntegerBooleanString
     * @param integerHeader  (optional)
     * @param booleanHeader  (optional)
     * @param stringHeader  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call testHeaderIntegerBooleanStringCall(Integer integerHeader, Boolean booleanHeader, String stringHeader, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/header/integer/boolean/string";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (integerHeader != null) {
            localVarHeaderParams.put("integer_header", localVarApiClient.parameterToString(integerHeader));
        }

        if (booleanHeader != null) {
            localVarHeaderParams.put("boolean_header", localVarApiClient.parameterToString(booleanHeader));
        }

        if (stringHeader != null) {
            localVarHeaderParams.put("string_header", localVarApiClient.parameterToString(stringHeader));
        }

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call testHeaderIntegerBooleanStringValidateBeforeCall(Integer integerHeader, Boolean booleanHeader, String stringHeader, final ApiCallback _callback) throws ApiException {
        return testHeaderIntegerBooleanStringCall(integerHeader, booleanHeader, stringHeader, _callback);

    }

    /**
     * Test header parameter(s)
     * Test header parameter(s)
     * @param integerHeader  (optional)
     * @param booleanHeader  (optional)
     * @param stringHeader  (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public String testHeaderIntegerBooleanString(Integer integerHeader, Boolean booleanHeader, String stringHeader) throws ApiException {
        ApiResponse<String> localVarResp = testHeaderIntegerBooleanStringWithHttpInfo(integerHeader, booleanHeader, stringHeader);
        return localVarResp.getData();
    }

    /**
     * Test header parameter(s)
     * Test header parameter(s)
     * @param integerHeader  (optional)
     * @param booleanHeader  (optional)
     * @param stringHeader  (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> testHeaderIntegerBooleanStringWithHttpInfo(Integer integerHeader, Boolean booleanHeader, String stringHeader) throws ApiException {
        okhttp3.Call localVarCall = testHeaderIntegerBooleanStringValidateBeforeCall(integerHeader, booleanHeader, stringHeader, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Test header parameter(s) (asynchronously)
     * Test header parameter(s)
     * @param integerHeader  (optional)
     * @param booleanHeader  (optional)
     * @param stringHeader  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call testHeaderIntegerBooleanStringAsync(Integer integerHeader, Boolean booleanHeader, String stringHeader, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = testHeaderIntegerBooleanStringValidateBeforeCall(integerHeader, booleanHeader, stringHeader, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
