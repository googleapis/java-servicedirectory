/*
 * Copyright 2020 Google LLC
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
package com.google.cloud.servicedirectory.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.servicedirectory.v1.ResolveServiceRequest;
import com.google.cloud.servicedirectory.v1.ResolveServiceResponse;
import com.google.common.collect.ImmutableMap;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Service Directory API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcLookupServiceStub extends LookupServiceStub {

  private static final MethodDescriptor<ResolveServiceRequest, ResolveServiceResponse>
      resolveServiceMethodDescriptor =
          MethodDescriptor.<ResolveServiceRequest, ResolveServiceResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.servicedirectory.v1.LookupService/ResolveService")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ResolveServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ResolveServiceResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<ResolveServiceRequest, ResolveServiceResponse> resolveServiceCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcLookupServiceStub create(LookupServiceStubSettings settings)
      throws IOException {
    return new GrpcLookupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcLookupServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcLookupServiceStub(LookupServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcLookupServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcLookupServiceStub(
        LookupServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcLookupServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcLookupServiceStub(LookupServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcLookupServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcLookupServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcLookupServiceStub(
      LookupServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<ResolveServiceRequest, ResolveServiceResponse>
        resolveServiceTransportSettings =
            GrpcCallSettings.<ResolveServiceRequest, ResolveServiceResponse>newBuilder()
                .setMethodDescriptor(resolveServiceMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ResolveServiceRequest>() {
                      @Override
                      public Map<String, String> extract(ResolveServiceRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();

    this.resolveServiceCallable =
        callableFactory.createUnaryCallable(
            resolveServiceTransportSettings, settings.resolveServiceSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<ResolveServiceRequest, ResolveServiceResponse> resolveServiceCallable() {
    return resolveServiceCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
