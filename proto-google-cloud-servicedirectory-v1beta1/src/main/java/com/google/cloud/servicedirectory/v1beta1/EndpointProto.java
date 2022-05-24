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
// source: google/cloud/servicedirectory/v1beta1/endpoint.proto

package com.google.cloud.servicedirectory.v1beta1;

public final class EndpointProto {
  private EndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/servicedirectory/v1beta1/"
          + "endpoint.proto\022%google.cloud.servicedire"
          + "ctory.v1beta1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\034google/api/a"
          + "nnotations.proto\"\224\004\n\010Endpoint\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\005\022\024\n\007address\030\002 \001(\tB\003\340A\001\022\021\n\004port\030\003"
          + " \001(\005B\003\340A\001\022T\n\010metadata\030\004 \003(\0132=.google.clo"
          + "ud.servicedirectory.v1beta1.Endpoint.Met"
          + "adataEntryB\003\340A\001\022@\n\007network\030\005 \001(\tB/\340A\005\372A)"
          + "\n\'servicedirectory.googleapis.com/Networ"
          + "k\0224\n\013create_time\030\006 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\0224\n\013update_time\030\007 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\032/\n\rMetadat"
          + "aEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\226"
          + "\001\352A\222\001\n(servicedirectory.googleapis.com/E"
          + "ndpoint\022fprojects/{project}/locations/{l"
          + "ocation}/namespaces/{namespace}/services"
          + "/{service}/endpoints/{endpoint}B\365\002\n)com."
          + "google.cloud.servicedirectory.v1beta1B\rE"
          + "ndpointProtoP\001ZUgoogle.golang.org/genpro"
          + "to/googleapis/cloud/servicedirectory/v1b"
          + "eta1;servicedirectory\370\001\001\252\002%Google.Cloud."
          + "ServiceDirectory.V1Beta1\312\002%Google\\Cloud\\"
          + "ServiceDirectory\\V1beta1\352\002(Google::Cloud"
          + "::ServiceDirectory::V1beta1\352Aa\n\'serviced"
          + "irectory.googleapis.com/Network\0226project"
          + "s/{project}/locations/global/networks/{n"
          + "etwork}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor,
            new java.lang.String[] {
              "Name", "Address", "Port", "Metadata", "Network", "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_descriptor =
        internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
