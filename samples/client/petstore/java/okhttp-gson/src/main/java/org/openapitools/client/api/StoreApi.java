/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:41.838Z[UTC]
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


import org.openapitools.client.model.Order;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;


public class StoreApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StoreApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StoreApi(ApiClient apiClient) {
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
     * Build call for deleteOrder
     * @param orderId ID of the order that needs to be deleted (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteOrderCall(String orderId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/store/order/{order_id}"
            .replace("{" + "order_id" + "}", localVarApiClient.escapeString(orderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteOrderValidateBeforeCall(String orderId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling deleteOrder(Async)");
        }

        return deleteOrderCall(orderId, _callback);

    }

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     * @param orderId ID of the order that needs to be deleted (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteOrder(String orderId) throws ApiException {
        deleteOrderWithHttpInfo(orderId);
    }

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     * @param orderId ID of the order that needs to be deleted (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteOrderWithHttpInfo(String orderId) throws ApiException {
        okhttp3.Call localVarCall = deleteOrderValidateBeforeCall(orderId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete purchase order by ID (asynchronously)
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     * @param orderId ID of the order that needs to be deleted (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteOrderAsync(String orderId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteOrderValidateBeforeCall(orderId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInventory
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInventoryCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/store/inventory";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInventoryValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getInventoryCall(_callback);

    }

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     * @return Map&lt;String, Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, Integer> getInventory() throws ApiException {
        ApiResponse<Map<String, Integer>> localVarResp = getInventoryWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     * @return ApiResponse&lt;Map&lt;String, Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, Integer>> getInventoryWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getInventoryValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Map<String, Integer>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns pet inventories by status (asynchronously)
     * Returns a map of status codes to quantities
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInventoryAsync(final ApiCallback<Map<String, Integer>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInventoryValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Map<String, Integer>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOrderById
     * @param orderId ID of pet that needs to be fetched (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOrderByIdCall(Long orderId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/store/order/{order_id}"
            .replace("{" + "order_id" + "}", localVarApiClient.escapeString(orderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml",
            "application/json"
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
    private okhttp3.Call getOrderByIdValidateBeforeCall(Long orderId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling getOrderById(Async)");
        }

        return getOrderByIdCall(orderId, _callback);

    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     * @param orderId ID of pet that needs to be fetched (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public Order getOrderById(Long orderId) throws ApiException {
        ApiResponse<Order> localVarResp = getOrderByIdWithHttpInfo(orderId);
        return localVarResp.getData();
    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     * @param orderId ID of pet that needs to be fetched (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Order> getOrderByIdWithHttpInfo(Long orderId) throws ApiException {
        okhttp3.Call localVarCall = getOrderByIdValidateBeforeCall(orderId, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find purchase order by ID (asynchronously)
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     * @param orderId ID of pet that needs to be fetched (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOrderByIdAsync(Long orderId, final ApiCallback<Order> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOrderByIdValidateBeforeCall(orderId, _callback);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for placeOrder
     * @param order order placed for purchasing the pet (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Order </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call placeOrderCall(Order order, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = order;

        // create path and map variables
        String localVarPath = "/store/order";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call placeOrderValidateBeforeCall(Order order, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new ApiException("Missing the required parameter 'order' when calling placeOrder(Async)");
        }

        return placeOrderCall(order, _callback);

    }

    /**
     * Place an order for a pet
     * 
     * @param order order placed for purchasing the pet (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Order </td><td>  -  </td></tr>
     </table>
     */
    public Order placeOrder(Order order) throws ApiException {
        ApiResponse<Order> localVarResp = placeOrderWithHttpInfo(order);
        return localVarResp.getData();
    }

    /**
     * Place an order for a pet
     * 
     * @param order order placed for purchasing the pet (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Order </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Order> placeOrderWithHttpInfo(Order order) throws ApiException {
        okhttp3.Call localVarCall = placeOrderValidateBeforeCall(order, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Place an order for a pet (asynchronously)
     * 
     * @param order order placed for purchasing the pet (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Order </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call placeOrderAsync(Order order, final ApiCallback<Order> _callback) throws ApiException {

        okhttp3.Call localVarCall = placeOrderValidateBeforeCall(order, _callback);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
