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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1/lookup_service.proto

package com.google.cloud.servicedirectory.v1;

/**
 *
 *
 * <pre>
 * The response message for
 * [LookupService.ResolveService][google.cloud.servicedirectory.v1.LookupService.ResolveService].
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1.ResolveServiceResponse}
 */
public final class ResolveServiceResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1.ResolveServiceResponse)
    ResolveServiceResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResolveServiceResponse.newBuilder() to construct.
  private ResolveServiceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResolveServiceResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResolveServiceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ResolveServiceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.servicedirectory.v1.Service.Builder subBuilder = null;
              if (service_ != null) {
                subBuilder = service_.toBuilder();
              }
              service_ =
                  input.readMessage(
                      com.google.cloud.servicedirectory.v1.Service.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(service_);
                service_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.servicedirectory.v1.LookupServiceProto
        .internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1.LookupServiceProto
        .internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1.ResolveServiceResponse.class,
            com.google.cloud.servicedirectory.v1.ResolveServiceResponse.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;
  private com.google.cloud.servicedirectory.v1.Service service_;
  /**
   * <code>.google.cloud.servicedirectory.v1.Service service = 1;</code>
   *
   * @return Whether the service field is set.
   */
  @java.lang.Override
  public boolean hasService() {
    return service_ != null;
  }
  /**
   * <code>.google.cloud.servicedirectory.v1.Service service = 1;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.Service getService() {
    return service_ == null
        ? com.google.cloud.servicedirectory.v1.Service.getDefaultInstance()
        : service_;
  }
  /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.ServiceOrBuilder getServiceOrBuilder() {
    return getService();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (service_ != null) {
      output.writeMessage(1, getService());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (service_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getService());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.servicedirectory.v1.ResolveServiceResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1.ResolveServiceResponse other =
        (com.google.cloud.servicedirectory.v1.ResolveServiceResponse) obj;

    if (hasService() != other.hasService()) return false;
    if (hasService()) {
      if (!getService().equals(other.getService())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasService()) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.servicedirectory.v1.ResolveServiceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response message for
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1.LookupService.ResolveService].
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1.ResolveServiceResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1.ResolveServiceResponse)
      com.google.cloud.servicedirectory.v1.ResolveServiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.servicedirectory.v1.LookupServiceProto
          .internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1.LookupServiceProto
          .internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1.ResolveServiceResponse.class,
              com.google.cloud.servicedirectory.v1.ResolveServiceResponse.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1.ResolveServiceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (serviceBuilder_ == null) {
        service_ = null;
      } else {
        service_ = null;
        serviceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1.LookupServiceProto
          .internal_static_google_cloud_servicedirectory_v1_ResolveServiceResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.ResolveServiceResponse getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1.ResolveServiceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.ResolveServiceResponse build() {
      com.google.cloud.servicedirectory.v1.ResolveServiceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.ResolveServiceResponse buildPartial() {
      com.google.cloud.servicedirectory.v1.ResolveServiceResponse result =
          new com.google.cloud.servicedirectory.v1.ResolveServiceResponse(this);
      if (serviceBuilder_ == null) {
        result.service_ = service_;
      } else {
        result.service_ = serviceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.servicedirectory.v1.ResolveServiceResponse) {
        return mergeFrom((com.google.cloud.servicedirectory.v1.ResolveServiceResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.servicedirectory.v1.ResolveServiceResponse other) {
      if (other == com.google.cloud.servicedirectory.v1.ResolveServiceResponse.getDefaultInstance())
        return this;
      if (other.hasService()) {
        mergeService(other.getService());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.servicedirectory.v1.ResolveServiceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.servicedirectory.v1.ResolveServiceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.servicedirectory.v1.Service service_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.servicedirectory.v1.Service,
            com.google.cloud.servicedirectory.v1.Service.Builder,
            com.google.cloud.servicedirectory.v1.ServiceOrBuilder>
        serviceBuilder_;
    /**
     * <code>.google.cloud.servicedirectory.v1.Service service = 1;</code>
     *
     * @return Whether the service field is set.
     */
    public boolean hasService() {
      return serviceBuilder_ != null || service_ != null;
    }
    /**
     * <code>.google.cloud.servicedirectory.v1.Service service = 1;</code>
     *
     * @return The service.
     */
    public com.google.cloud.servicedirectory.v1.Service getService() {
      if (serviceBuilder_ == null) {
        return service_ == null
            ? com.google.cloud.servicedirectory.v1.Service.getDefaultInstance()
            : service_;
      } else {
        return serviceBuilder_.getMessage();
      }
    }
    /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
    public Builder setService(com.google.cloud.servicedirectory.v1.Service value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        service_ = value;
        onChanged();
      } else {
        serviceBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
    public Builder setService(
        com.google.cloud.servicedirectory.v1.Service.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        service_ = builderForValue.build();
        onChanged();
      } else {
        serviceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
    public Builder mergeService(com.google.cloud.servicedirectory.v1.Service value) {
      if (serviceBuilder_ == null) {
        if (service_ != null) {
          service_ =
              com.google.cloud.servicedirectory.v1.Service.newBuilder(service_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          service_ = value;
        }
        onChanged();
      } else {
        serviceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
    public Builder clearService() {
      if (serviceBuilder_ == null) {
        service_ = null;
        onChanged();
      } else {
        service_ = null;
        serviceBuilder_ = null;
      }

      return this;
    }
    /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
    public com.google.cloud.servicedirectory.v1.Service.Builder getServiceBuilder() {

      onChanged();
      return getServiceFieldBuilder().getBuilder();
    }
    /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
    public com.google.cloud.servicedirectory.v1.ServiceOrBuilder getServiceOrBuilder() {
      if (serviceBuilder_ != null) {
        return serviceBuilder_.getMessageOrBuilder();
      } else {
        return service_ == null
            ? com.google.cloud.servicedirectory.v1.Service.getDefaultInstance()
            : service_;
      }
    }
    /** <code>.google.cloud.servicedirectory.v1.Service service = 1;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.servicedirectory.v1.Service,
            com.google.cloud.servicedirectory.v1.Service.Builder,
            com.google.cloud.servicedirectory.v1.ServiceOrBuilder>
        getServiceFieldBuilder() {
      if (serviceBuilder_ == null) {
        serviceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.servicedirectory.v1.Service,
                com.google.cloud.servicedirectory.v1.Service.Builder,
                com.google.cloud.servicedirectory.v1.ServiceOrBuilder>(
                getService(), getParentForChildren(), isClean());
        service_ = null;
      }
      return serviceBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1.ResolveServiceResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1.ResolveServiceResponse)
  private static final com.google.cloud.servicedirectory.v1.ResolveServiceResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1.ResolveServiceResponse();
  }

  public static com.google.cloud.servicedirectory.v1.ResolveServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResolveServiceResponse> PARSER =
      new com.google.protobuf.AbstractParser<ResolveServiceResponse>() {
        @java.lang.Override
        public ResolveServiceResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ResolveServiceResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ResolveServiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResolveServiceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.ResolveServiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
