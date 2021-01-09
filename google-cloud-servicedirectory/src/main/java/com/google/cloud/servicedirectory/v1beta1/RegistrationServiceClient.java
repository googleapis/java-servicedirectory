/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.servicedirectory.v1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.servicedirectory.v1beta1.stub.RegistrationServiceStub;
import com.google.cloud.servicedirectory.v1beta1.stub.RegistrationServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service Directory API for registering services. It defines the following
 * resource model:
 *
 * <p>- The API has a collection of [Namespace][google.cloud.servicedirectory.v1beta1.Namespace]
 * resources, named `projects/&#42;/locations/&#42;/namespaces/&#42;`.
 *
 * <p>- Each Namespace has a collection of [Service][google.cloud.servicedirectory.v1beta1.Service]
 * resources, named `projects/&#42;/locations/&#42;/namespaces/&#42;/services/&#42;`.
 *
 * <p>- Each Service has a collection of [Endpoint][google.cloud.servicedirectory.v1beta1.Endpoint]
 * resources, named
 * `projects/&#42;/locations/&#42;/namespaces/&#42;/services/&#42;/endpoints/&#42;`.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the RegistrationServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of RegistrationServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * RegistrationServiceSettings registrationServiceSettings =
 *     RegistrationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegistrationServiceClient registrationServiceClient =
 *     RegistrationServiceClient.create(registrationServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * RegistrationServiceSettings registrationServiceSettings =
 *     RegistrationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RegistrationServiceClient registrationServiceClient =
 *     RegistrationServiceClient.create(registrationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class RegistrationServiceClient implements BackgroundResource {
  private final RegistrationServiceSettings settings;
  private final RegistrationServiceStub stub;

  /** Constructs an instance of RegistrationServiceClient with default settings. */
  public static final RegistrationServiceClient create() throws IOException {
    return create(RegistrationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegistrationServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RegistrationServiceClient create(RegistrationServiceSettings settings)
      throws IOException {
    return new RegistrationServiceClient(settings);
  }

  /**
   * Constructs an instance of RegistrationServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(RegistrationServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RegistrationServiceClient create(RegistrationServiceStub stub) {
    return new RegistrationServiceClient(stub);
  }

  /**
   * Constructs an instance of RegistrationServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected RegistrationServiceClient(RegistrationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RegistrationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RegistrationServiceClient(RegistrationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegistrationServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegistrationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a namespace, and returns the new Namespace.
   *
   * @param parent Required. The resource name of the project and location the namespace will be
   *     created in.
   * @param namespace Required. A namespace with initial fields set.
   * @param namespaceId Required. The Resource ID must be 1-63 characters long, and comply with
   *     &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   *     Specifically, the name must be 1-63 characters long and match the regular expression
   *     `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase
   *     letter, and all following characters must be a dash, lowercase letter, or digit, except the
   *     last character, which cannot be a dash.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace createNamespace(
      LocationName parent, Namespace namespace, String namespaceId) {
    CreateNamespaceRequest request =
        CreateNamespaceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setNamespace(namespace)
            .setNamespaceId(namespaceId)
            .build();
    return createNamespace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a namespace, and returns the new Namespace.
   *
   * @param parent Required. The resource name of the project and location the namespace will be
   *     created in.
   * @param namespace Required. A namespace with initial fields set.
   * @param namespaceId Required. The Resource ID must be 1-63 characters long, and comply with
   *     &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   *     Specifically, the name must be 1-63 characters long and match the regular expression
   *     `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase
   *     letter, and all following characters must be a dash, lowercase letter, or digit, except the
   *     last character, which cannot be a dash.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace createNamespace(String parent, Namespace namespace, String namespaceId) {
    CreateNamespaceRequest request =
        CreateNamespaceRequest.newBuilder()
            .setParent(parent)
            .setNamespace(namespace)
            .setNamespaceId(namespaceId)
            .build();
    return createNamespace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a namespace, and returns the new Namespace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace createNamespace(CreateNamespaceRequest request) {
    return createNamespaceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a namespace, and returns the new Namespace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateNamespaceRequest, Namespace> createNamespaceCallable() {
    return stub.createNamespaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all namespaces.
   *
   * @param parent Required. The resource name of the project and location whose namespaces we'd
   *     like to list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNamespacesPagedResponse listNamespaces(LocationName parent) {
    ListNamespacesRequest request =
        ListNamespacesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listNamespaces(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all namespaces.
   *
   * @param parent Required. The resource name of the project and location whose namespaces we'd
   *     like to list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNamespacesPagedResponse listNamespaces(String parent) {
    ListNamespacesRequest request = ListNamespacesRequest.newBuilder().setParent(parent).build();
    return listNamespaces(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all namespaces.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNamespacesPagedResponse listNamespaces(ListNamespacesRequest request) {
    return listNamespacesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all namespaces.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListNamespacesRequest, ListNamespacesPagedResponse>
      listNamespacesPagedCallable() {
    return stub.listNamespacesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all namespaces.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListNamespacesRequest, ListNamespacesResponse>
      listNamespacesCallable() {
    return stub.listNamespacesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a namespace.
   *
   * @param name Required. The name of the namespace to retrieve.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace getNamespace(NamespaceName name) {
    GetNamespaceRequest request =
        GetNamespaceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getNamespace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a namespace.
   *
   * @param name Required. The name of the namespace to retrieve.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace getNamespace(String name) {
    GetNamespaceRequest request = GetNamespaceRequest.newBuilder().setName(name).build();
    return getNamespace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a namespace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace getNamespace(GetNamespaceRequest request) {
    return getNamespaceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a namespace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetNamespaceRequest, Namespace> getNamespaceCallable() {
    return stub.getNamespaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a namespace.
   *
   * @param namespace Required. The updated namespace.
   * @param updateMask Required. List of fields to be updated in this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace updateNamespace(Namespace namespace, FieldMask updateMask) {
    UpdateNamespaceRequest request =
        UpdateNamespaceRequest.newBuilder()
            .setNamespace(namespace)
            .setUpdateMask(updateMask)
            .build();
    return updateNamespace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a namespace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Namespace updateNamespace(UpdateNamespaceRequest request) {
    return updateNamespaceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a namespace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateNamespaceRequest, Namespace> updateNamespaceCallable() {
    return stub.updateNamespaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a namespace. This also deletes all services and endpoints in the namespace.
   *
   * @param name Required. The name of the namespace to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteNamespace(NamespaceName name) {
    DeleteNamespaceRequest request =
        DeleteNamespaceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteNamespace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a namespace. This also deletes all services and endpoints in the namespace.
   *
   * @param name Required. The name of the namespace to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteNamespace(String name) {
    DeleteNamespaceRequest request = DeleteNamespaceRequest.newBuilder().setName(name).build();
    deleteNamespace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a namespace. This also deletes all services and endpoints in the namespace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteNamespace(DeleteNamespaceRequest request) {
    deleteNamespaceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a namespace. This also deletes all services and endpoints in the namespace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<DeleteNamespaceRequest, Empty> deleteNamespaceCallable() {
    return stub.deleteNamespaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a service, and returns the new Service.
   *
   * @param parent Required. The resource name of the namespace this service will belong to.
   * @param service Required. A service with initial fields set.
   * @param serviceId Required. The Resource ID must be 1-63 characters long, and comply with &lt;a
   *     href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   *     Specifically, the name must be 1-63 characters long and match the regular expression
   *     `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase
   *     letter, and all following characters must be a dash, lowercase letter, or digit, except the
   *     last character, which cannot be a dash.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service createService(NamespaceName parent, Service service, String serviceId) {
    CreateServiceRequest request =
        CreateServiceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setService(service)
            .setServiceId(serviceId)
            .build();
    return createService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a service, and returns the new Service.
   *
   * @param parent Required. The resource name of the namespace this service will belong to.
   * @param service Required. A service with initial fields set.
   * @param serviceId Required. The Resource ID must be 1-63 characters long, and comply with &lt;a
   *     href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   *     Specifically, the name must be 1-63 characters long and match the regular expression
   *     `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase
   *     letter, and all following characters must be a dash, lowercase letter, or digit, except the
   *     last character, which cannot be a dash.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service createService(String parent, Service service, String serviceId) {
    CreateServiceRequest request =
        CreateServiceRequest.newBuilder()
            .setParent(parent)
            .setService(service)
            .setServiceId(serviceId)
            .build();
    return createService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a service, and returns the new Service.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service createService(CreateServiceRequest request) {
    return createServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a service, and returns the new Service.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateServiceRequest, Service> createServiceCallable() {
    return stub.createServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all services belonging to a namespace.
   *
   * @param parent Required. The resource name of the namespace whose services we'd like to list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices(NamespaceName parent) {
    ListServicesRequest request =
        ListServicesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all services belonging to a namespace.
   *
   * @param parent Required. The resource name of the namespace whose services we'd like to list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices(String parent) {
    ListServicesRequest request = ListServicesRequest.newBuilder().setParent(parent).build();
    return listServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all services belonging to a namespace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices(ListServicesRequest request) {
    return listServicesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all services belonging to a namespace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListServicesRequest, ListServicesPagedResponse>
      listServicesPagedCallable() {
    return stub.listServicesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all services belonging to a namespace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListServicesRequest, ListServicesResponse> listServicesCallable() {
    return stub.listServicesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a service.
   *
   * @param name Required. The name of the service to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service getService(ServiceName name) {
    GetServiceRequest request =
        GetServiceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a service.
   *
   * @param name Required. The name of the service to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service getService(String name) {
    GetServiceRequest request = GetServiceRequest.newBuilder().setName(name).build();
    return getService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a service.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service getService(GetServiceRequest request) {
    return getServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a service.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetServiceRequest, Service> getServiceCallable() {
    return stub.getServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a service.
   *
   * @param service Required. The updated service.
   * @param updateMask Required. List of fields to be updated in this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service updateService(Service service, FieldMask updateMask) {
    UpdateServiceRequest request =
        UpdateServiceRequest.newBuilder().setService(service).setUpdateMask(updateMask).build();
    return updateService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a service.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service updateService(UpdateServiceRequest request) {
    return updateServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a service.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateServiceRequest, Service> updateServiceCallable() {
    return stub.updateServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a service. This also deletes all endpoints associated with the service.
   *
   * @param name Required. The name of the service to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteService(ServiceName name) {
    DeleteServiceRequest request =
        DeleteServiceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a service. This also deletes all endpoints associated with the service.
   *
   * @param name Required. The name of the service to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteService(String name) {
    DeleteServiceRequest request = DeleteServiceRequest.newBuilder().setName(name).build();
    deleteService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a service. This also deletes all endpoints associated with the service.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteService(DeleteServiceRequest request) {
    deleteServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a service. This also deletes all endpoints associated with the service.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<DeleteServiceRequest, Empty> deleteServiceCallable() {
    return stub.deleteServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a endpoint, and returns the new Endpoint.
   *
   * @param parent Required. The resource name of the service that this endpoint provides.
   * @param endpoint Required. A endpoint with initial fields set.
   * @param endpointId Required. The Resource ID must be 1-63 characters long, and comply with &lt;a
   *     href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   *     Specifically, the name must be 1-63 characters long and match the regular expression
   *     `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase
   *     letter, and all following characters must be a dash, lowercase letter, or digit, except the
   *     last character, which cannot be a dash.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint createEndpoint(ServiceName parent, Endpoint endpoint, String endpointId) {
    CreateEndpointRequest request =
        CreateEndpointRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setEndpoint(endpoint)
            .setEndpointId(endpointId)
            .build();
    return createEndpoint(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a endpoint, and returns the new Endpoint.
   *
   * @param parent Required. The resource name of the service that this endpoint provides.
   * @param endpoint Required. A endpoint with initial fields set.
   * @param endpointId Required. The Resource ID must be 1-63 characters long, and comply with &lt;a
   *     href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   *     Specifically, the name must be 1-63 characters long and match the regular expression
   *     `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase
   *     letter, and all following characters must be a dash, lowercase letter, or digit, except the
   *     last character, which cannot be a dash.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint createEndpoint(String parent, Endpoint endpoint, String endpointId) {
    CreateEndpointRequest request =
        CreateEndpointRequest.newBuilder()
            .setParent(parent)
            .setEndpoint(endpoint)
            .setEndpointId(endpointId)
            .build();
    return createEndpoint(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a endpoint, and returns the new Endpoint.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint createEndpoint(CreateEndpointRequest request) {
    return createEndpointCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a endpoint, and returns the new Endpoint.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateEndpointRequest, Endpoint> createEndpointCallable() {
    return stub.createEndpointCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all endpoints.
   *
   * @param parent Required. The resource name of the service whose endpoints we'd like to list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEndpointsPagedResponse listEndpoints(ServiceName parent) {
    ListEndpointsRequest request =
        ListEndpointsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listEndpoints(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all endpoints.
   *
   * @param parent Required. The resource name of the service whose endpoints we'd like to list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEndpointsPagedResponse listEndpoints(String parent) {
    ListEndpointsRequest request = ListEndpointsRequest.newBuilder().setParent(parent).build();
    return listEndpoints(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all endpoints.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEndpointsPagedResponse listEndpoints(ListEndpointsRequest request) {
    return listEndpointsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all endpoints.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListEndpointsRequest, ListEndpointsPagedResponse>
      listEndpointsPagedCallable() {
    return stub.listEndpointsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all endpoints.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListEndpointsRequest, ListEndpointsResponse> listEndpointsCallable() {
    return stub.listEndpointsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a endpoint.
   *
   * @param name Required. The name of the endpoint to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint getEndpoint(EndpointName name) {
    GetEndpointRequest request =
        GetEndpointRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getEndpoint(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a endpoint.
   *
   * @param name Required. The name of the endpoint to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint getEndpoint(String name) {
    GetEndpointRequest request = GetEndpointRequest.newBuilder().setName(name).build();
    return getEndpoint(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a endpoint.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint getEndpoint(GetEndpointRequest request) {
    return getEndpointCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a endpoint.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetEndpointRequest, Endpoint> getEndpointCallable() {
    return stub.getEndpointCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a endpoint.
   *
   * @param endpoint Required. The updated endpoint.
   * @param updateMask Required. List of fields to be updated in this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint updateEndpoint(Endpoint endpoint, FieldMask updateMask) {
    UpdateEndpointRequest request =
        UpdateEndpointRequest.newBuilder().setEndpoint(endpoint).setUpdateMask(updateMask).build();
    return updateEndpoint(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a endpoint.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Endpoint updateEndpoint(UpdateEndpointRequest request) {
    return updateEndpointCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a endpoint.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateEndpointRequest, Endpoint> updateEndpointCallable() {
    return stub.updateEndpointCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a endpoint.
   *
   * @param name Required. The name of the endpoint to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEndpoint(EndpointName name) {
    DeleteEndpointRequest request =
        DeleteEndpointRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteEndpoint(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a endpoint.
   *
   * @param name Required. The name of the endpoint to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEndpoint(String name) {
    DeleteEndpointRequest request = DeleteEndpointRequest.newBuilder().setName(name).build();
    deleteEndpoint(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a endpoint.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEndpoint(DeleteEndpointRequest request) {
    deleteEndpointCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a endpoint.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<DeleteEndpointRequest, Empty> deleteEndpointCallable() {
    return stub.deleteEndpointCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the IAM Policy for a resource (namespace or service only).
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the IAM Policy for a resource (namespace or service only).
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the IAM Policy for a resource (namespace or service only).
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the IAM Policy for a resource (namespace or service only).
   *
   * <p>Sample code:
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Tests IAM permissions for a resource (namespace or service only).
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Tests IAM permissions for a resource (namespace or service only).
   *
   * <p>Sample code:
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListNamespacesPagedResponse
      extends AbstractPagedListResponse<
          ListNamespacesRequest,
          ListNamespacesResponse,
          Namespace,
          ListNamespacesPage,
          ListNamespacesFixedSizeCollection> {

    public static ApiFuture<ListNamespacesPagedResponse> createAsync(
        PageContext<ListNamespacesRequest, ListNamespacesResponse, Namespace> context,
        ApiFuture<ListNamespacesResponse> futureResponse) {
      ApiFuture<ListNamespacesPage> futurePage =
          ListNamespacesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListNamespacesPage, ListNamespacesPagedResponse>() {
            @Override
            public ListNamespacesPagedResponse apply(ListNamespacesPage input) {
              return new ListNamespacesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListNamespacesPagedResponse(ListNamespacesPage page) {
      super(page, ListNamespacesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListNamespacesPage
      extends AbstractPage<
          ListNamespacesRequest, ListNamespacesResponse, Namespace, ListNamespacesPage> {

    private ListNamespacesPage(
        PageContext<ListNamespacesRequest, ListNamespacesResponse, Namespace> context,
        ListNamespacesResponse response) {
      super(context, response);
    }

    private static ListNamespacesPage createEmptyPage() {
      return new ListNamespacesPage(null, null);
    }

    @Override
    protected ListNamespacesPage createPage(
        PageContext<ListNamespacesRequest, ListNamespacesResponse, Namespace> context,
        ListNamespacesResponse response) {
      return new ListNamespacesPage(context, response);
    }

    @Override
    public ApiFuture<ListNamespacesPage> createPageAsync(
        PageContext<ListNamespacesRequest, ListNamespacesResponse, Namespace> context,
        ApiFuture<ListNamespacesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListNamespacesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListNamespacesRequest,
          ListNamespacesResponse,
          Namespace,
          ListNamespacesPage,
          ListNamespacesFixedSizeCollection> {

    private ListNamespacesFixedSizeCollection(List<ListNamespacesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNamespacesFixedSizeCollection createEmptyCollection() {
      return new ListNamespacesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNamespacesFixedSizeCollection createCollection(
        List<ListNamespacesPage> pages, int collectionSize) {
      return new ListNamespacesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListServicesPagedResponse
      extends AbstractPagedListResponse<
          ListServicesRequest,
          ListServicesResponse,
          Service,
          ListServicesPage,
          ListServicesFixedSizeCollection> {

    public static ApiFuture<ListServicesPagedResponse> createAsync(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ApiFuture<ListServicesResponse> futureResponse) {
      ApiFuture<ListServicesPage> futurePage =
          ListServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListServicesPage, ListServicesPagedResponse>() {
            @Override
            public ListServicesPagedResponse apply(ListServicesPage input) {
              return new ListServicesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListServicesPagedResponse(ListServicesPage page) {
      super(page, ListServicesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListServicesPage
      extends AbstractPage<ListServicesRequest, ListServicesResponse, Service, ListServicesPage> {

    private ListServicesPage(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ListServicesResponse response) {
      super(context, response);
    }

    private static ListServicesPage createEmptyPage() {
      return new ListServicesPage(null, null);
    }

    @Override
    protected ListServicesPage createPage(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ListServicesResponse response) {
      return new ListServicesPage(context, response);
    }

    @Override
    public ApiFuture<ListServicesPage> createPageAsync(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ApiFuture<ListServicesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListServicesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListServicesRequest,
          ListServicesResponse,
          Service,
          ListServicesPage,
          ListServicesFixedSizeCollection> {

    private ListServicesFixedSizeCollection(List<ListServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListServicesFixedSizeCollection createEmptyCollection() {
      return new ListServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListServicesFixedSizeCollection createCollection(
        List<ListServicesPage> pages, int collectionSize) {
      return new ListServicesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListEndpointsPagedResponse
      extends AbstractPagedListResponse<
          ListEndpointsRequest,
          ListEndpointsResponse,
          Endpoint,
          ListEndpointsPage,
          ListEndpointsFixedSizeCollection> {

    public static ApiFuture<ListEndpointsPagedResponse> createAsync(
        PageContext<ListEndpointsRequest, ListEndpointsResponse, Endpoint> context,
        ApiFuture<ListEndpointsResponse> futureResponse) {
      ApiFuture<ListEndpointsPage> futurePage =
          ListEndpointsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListEndpointsPage, ListEndpointsPagedResponse>() {
            @Override
            public ListEndpointsPagedResponse apply(ListEndpointsPage input) {
              return new ListEndpointsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListEndpointsPagedResponse(ListEndpointsPage page) {
      super(page, ListEndpointsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListEndpointsPage
      extends AbstractPage<
          ListEndpointsRequest, ListEndpointsResponse, Endpoint, ListEndpointsPage> {

    private ListEndpointsPage(
        PageContext<ListEndpointsRequest, ListEndpointsResponse, Endpoint> context,
        ListEndpointsResponse response) {
      super(context, response);
    }

    private static ListEndpointsPage createEmptyPage() {
      return new ListEndpointsPage(null, null);
    }

    @Override
    protected ListEndpointsPage createPage(
        PageContext<ListEndpointsRequest, ListEndpointsResponse, Endpoint> context,
        ListEndpointsResponse response) {
      return new ListEndpointsPage(context, response);
    }

    @Override
    public ApiFuture<ListEndpointsPage> createPageAsync(
        PageContext<ListEndpointsRequest, ListEndpointsResponse, Endpoint> context,
        ApiFuture<ListEndpointsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListEndpointsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListEndpointsRequest,
          ListEndpointsResponse,
          Endpoint,
          ListEndpointsPage,
          ListEndpointsFixedSizeCollection> {

    private ListEndpointsFixedSizeCollection(List<ListEndpointsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListEndpointsFixedSizeCollection createEmptyCollection() {
      return new ListEndpointsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListEndpointsFixedSizeCollection createCollection(
        List<ListEndpointsPage> pages, int collectionSize) {
      return new ListEndpointsFixedSizeCollection(pages, collectionSize);
    }
  }
}
