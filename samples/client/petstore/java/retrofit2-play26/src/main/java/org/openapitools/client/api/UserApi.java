package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.time.OffsetDateTime;
import org.openapitools.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.*;
import retrofit2.Response;


public interface UserApi {
  /**
   * Create user
   * This can only be done by the logged in user.
   * @param body Created user object (required)
   * @return Call&lt;Void&gt;
   */
  @POST("user")
  CompletionStage<Response<Void>> createUser(
    @retrofit2.http.Body User body
  );

  /**
   * Creates list of users with given input array
   * 
   * @param body List of user object (required)
   * @return Call&lt;Void&gt;
   */
  @POST("user/createWithArray")
  CompletionStage<Response<Void>> createUsersWithArrayInput(
    @retrofit2.http.Body List<User> body
  );

  /**
   * Creates list of users with given input array
   * 
   * @param body List of user object (required)
   * @return Call&lt;Void&gt;
   */
  @POST("user/createWithList")
  CompletionStage<Response<Void>> createUsersWithListInput(
    @retrofit2.http.Body List<User> body
  );

  /**
   * Delete user
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/{username}")
  CompletionStage<Response<Void>> deleteUser(
    @retrofit2.http.Path("username") String username
  );

  /**
   * Get user by user name
   * 
   * @param username The name that needs to be fetched. Use user1 for testing. (required)
   * @return Call&lt;User&gt;
   */
  @GET("user/{username}")
  CompletionStage<Response<User>> getUserByName(
    @retrofit2.http.Path("username") String username
  );

  /**
   * Logs user into the system
   * 
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return Call&lt;String&gt;
   */
  @GET("user/login")
  CompletionStage<Response<String>> loginUser(
    @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
  );

  /**
   * Logs out current logged in user session
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("user/logout")
  CompletionStage<Response<Void>> logoutUser();
    

  /**
   * Updated user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted (required)
   * @param body Updated user object (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("user/{username}")
  CompletionStage<Response<Void>> updateUser(
    @retrofit2.http.Path("username") String username, @retrofit2.http.Body User body
  );

}
