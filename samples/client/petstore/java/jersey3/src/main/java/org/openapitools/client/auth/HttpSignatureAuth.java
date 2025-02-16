/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:39.711Z[UTC]
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


package org.openapitools.client.auth;

import org.openapitools.client.Pair;
import org.openapitools.client.ApiException;

import java.net.URI;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.List;
import java.util.TimeZone;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidKeyException;

import org.tomitribe.auth.signatures.Algorithm;
import org.tomitribe.auth.signatures.Signer;
import org.tomitribe.auth.signatures.Signature;
import org.tomitribe.auth.signatures.SigningAlgorithm;

/**
 * A Configuration object for the HTTP message signature security scheme.
 */
public class HttpSignatureAuth implements Authentication {

  private Signer signer;

  // An opaque string that the server can use to look up the component they need to validate the signature.
  private String keyId;

  // The HTTP signature algorithm.
  private SigningAlgorithm signingAlgorithm;

  // The HTTP cryptographic algorithm.
  private Algorithm algorithm;

  // The cryptographic parameters.
  private AlgorithmParameterSpec parameterSpec;

  // The list of HTTP headers that should be included in the HTTP signature.
  private List<String> headers;

  // The digest algorithm which is used to calculate a cryptographic digest of the HTTP request body.
  private String digestAlgorithm;

  // The maximum validity duration of the HTTP signature.
  private Long maxSignatureValidity;

  /**
   * Construct a new HTTP signature auth configuration object.
   *
   * @param keyId An opaque string that the server can use to look up the component they need to validate the signature.
   * @param signingAlgorithm The signature algorithm.
   * @param algorithm The cryptographic algorithm.
   * @param digestAlgorithm The digest algorithm.
   * @param headers The list of HTTP headers that should be included in the HTTP signature.
   * @param maxSignatureValidity The maximum validity duration of the HTTP signature.
   *                             Used to set the '(expires)' field in the HTTP signature.
   */
  public HttpSignatureAuth(String keyId,
                           SigningAlgorithm signingAlgorithm,
                           Algorithm algorithm,
                           String digestAlgorithm,
                           AlgorithmParameterSpec parameterSpec,
                           List<String> headers,
                           Long maxSignatureValidity) {
    this.keyId = keyId;
    this.signingAlgorithm = signingAlgorithm;
    this.algorithm = algorithm;
    this.parameterSpec = parameterSpec;
    this.digestAlgorithm = digestAlgorithm;
    this.headers = headers;
    this.maxSignatureValidity = maxSignatureValidity;
  }

  /**
   * Returns the opaque string that the server can use to look up the component they need to validate the signature.
   *
   * @return The keyId.
   */
  public String getKeyId() {
    return keyId;
  }

  /**
   * Set the HTTP signature key id.
   *
   * @param keyId An opaque string that the server can use to look up the component they need to validate the signature.
   */
  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  /**
   * Returns the HTTP signature algorithm which is used to sign HTTP requests.
   */
  public SigningAlgorithm getSigningAlgorithm() {
    return signingAlgorithm;
  }

  /**
   * Sets the HTTP signature algorithm which is used to sign HTTP requests.
   *
   * @param signingAlgorithm The HTTP signature algorithm.
   */
  public void setSigningAlgorithm(SigningAlgorithm signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
  }

  /**
   * Returns the HTTP cryptographic algorithm which is used to sign HTTP requests.
   */
  public Algorithm getAlgorithm() {
    return algorithm;
  }

  /**
   * Sets the HTTP cryptographic algorithm which is used to sign HTTP requests.
   *
   * @param algorithm The HTTP signature algorithm.
   */
  public void setAlgorithm(Algorithm algorithm) {
    this.algorithm = algorithm;
  }

  /**
   * Returns the cryptographic parameters which are used to sign HTTP requests.
   */
  public AlgorithmParameterSpec getAlgorithmParameterSpec() {
    return parameterSpec;
  }

  /**
   * Sets the cryptographic parameters which are used to sign HTTP requests.
   *
   * @param parameterSpec The cryptographic parameters.
   */
  public void setAlgorithmParameterSpec(AlgorithmParameterSpec parameterSpec) {
    this.parameterSpec = parameterSpec;
  }

  /**
   * Returns the digest algorithm which is used to calculate a cryptographic digest of the HTTP request body.
   *
   * @see java.security.MessageDigest
   */
  public String getDigestAlgorithm() {
    return digestAlgorithm;
  }

  /**
   * Sets the digest algorithm which is used to calculate a cryptographic digest of the HTTP request body.
   *
   * The exact list of supported digest algorithms depends on the installed security providers.
   * Every implementation of the Java platform is required to support "MD5", "SHA-1" and "SHA-256".
   * Do not use "MD5" and "SHA-1", they are vulnerable to multiple known attacks.
   * By default, "SHA-256" is used.
   *
   * @param digestAlgorithm The digest algorithm.
   *
   * @see java.security.MessageDigest
   */
  public void setDigestAlgorithm(String digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  /**
   * Returns the list of HTTP headers that should be included in the HTTP signature.
   */
  public List<String> getHeaders() {
    return headers;
  }

  /**
   * Sets the list of HTTP headers that should be included in the HTTP signature.
   *
   * @param headers The HTTP headers.
   */
  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }

  /**
   * Returns the maximum validity duration of the HTTP signature.
   * @return The maximum validity duration of the HTTP signature.
   */
  public Long getMaxSignatureValidity() {
    return maxSignatureValidity;
  }

  /**
   * Returns the signer instance used to sign HTTP messages.
   *
   * @return the signer instance.
   */
  public Signer getSigner() {
    return signer;
  }

  /**
   * Sets the signer instance used to sign HTTP messages.
   *
   * @param signer The signer instance to set.
   */
  public void setSigner(Signer signer) {
    this.signer = signer;
  }

  /**
   * Set the private key used to sign HTTP requests using the HTTP signature scheme.
   *
   * @param key The private key.
   *
   * @throws InvalidKeyException Unable to parse the key, or the security provider for this key
   * is not installed.
   */
  public void setPrivateKey(Key key) throws InvalidKeyException, ApiException {
    if (key == null) {
      throw new ApiException("Private key (java.security.Key) cannot be null");
    }
    signer = new Signer(key, new Signature(keyId, signingAlgorithm, algorithm, parameterSpec, null, headers, maxSignatureValidity));
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                            String payload, String method, URI uri) throws ApiException {
    try {
      if (headers.contains("host")) {
        headerParams.put("host", uri.getHost());
      }

      if (headers.contains("date")) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        headerParams.put("date", dateFormat.format(Calendar.getInstance().getTime()));
      }

      if (headers.contains("digest")) {
        headerParams.put("digest",
          this.digestAlgorithm + "=" +
            new String(Base64.getEncoder().encode(MessageDigest.getInstance(this.digestAlgorithm).digest(payload.getBytes()))));
      }

      if (signer == null) {
        throw new ApiException("Signer cannot be null. Please call the method `setPrivateKey` to set it up correctly");
      }

      // construct the path with the URL-encoded path and query.
      // Calling getRawPath and getRawQuery ensures the path is URL-encoded as it will be serialized
      // on the wire. The HTTP signature must use the encode URL as it is sent on the wire.
      String path = uri.getRawPath();
      if (uri.getRawQuery() != null && !"".equals(uri.getRawQuery())) {
        path += "?" + uri.getRawQuery();
      }

      headerParams.put("Authorization", signer.sign(method, path, headerParams).toString());
    } catch (Exception ex) {
      throw new ApiException("Failed to create signature in the HTTP request header: " + ex.toString());
    }
  }
}
