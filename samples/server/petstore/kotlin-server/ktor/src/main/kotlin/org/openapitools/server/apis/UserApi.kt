/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.http.*
import io.ktor.response.*
import org.openapitools.server.Paths
import io.ktor.locations.*
import io.ktor.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.models.User

@KtorExperimentalLocationsAPI
fun Route.UserApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    post<Paths.createUser> {
        call.respond(HttpStatusCode.NotImplemented)

    }

    post<Paths.createUsersWithArrayInput> {
        call.respond(HttpStatusCode.NotImplemented)

    }

    post<Paths.createUsersWithListInput> {
        call.respond(HttpStatusCode.NotImplemented)

    }

    delete<Paths.deleteUser> {
        call.respond(HttpStatusCode.NotImplemented)

    }

    get<Paths.getUserByName> {
        val exampleContentType = "application/json"
val exampleContentString = """{
          "firstName" : "firstName",
          "lastName" : "lastName",
          "password" : "password",
          "userStatus" : 6,
          "phone" : "phone",
          "id" : 0,
          "email" : "email",
          "username" : "username"
        }"""

when (exampleContentType) {
    "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
    else -> call.respondText(exampleContentString)
}

    }

    get<Paths.loginUser> {
        call.respond(HttpStatusCode.NotImplemented)

    }

    get<Paths.logoutUser> {
        call.respond(HttpStatusCode.NotImplemented)

    }

    put<Paths.updateUser> {
        call.respond(HttpStatusCode.NotImplemented)

    }

}
