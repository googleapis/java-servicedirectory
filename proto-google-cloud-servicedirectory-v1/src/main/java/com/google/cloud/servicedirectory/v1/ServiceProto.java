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
// source: google/cloud/servicedirectory/v1/service.proto

package com.google.cloud.servicedirectory.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/servicedirectory/v1/servi"
          + "ce.proto\022 google.cloud.servicedirectory."
          + "v1\032\034google/api/annotations.proto\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032/google/cloud/servicedirect"
          + "ory/v1/endpoint.proto\"\353\002\n\007Service\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\005\022T\n\013annotations\030\004 \003(\0132:.goog"
          + "le.cloud.servicedirectory.v1.Service.Ann"
          + "otationsEntryB\003\340A\001\022B\n\tendpoints\030\003 \003(\0132*."
          + "google.cloud.servicedirectory.v1.Endpoin"
          + "tB\003\340A\003\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001:\177\352A|\n\'servicedirector"
          + "y.googleapis.com/Service\022Qprojects/{proj"
          + "ect}/locations/{location}/namespaces/{na"
          + "mespace}/services/{service}B\367\001\n$com.goog"
          + "le.cloud.servicedirectory.v1B\014ServicePro"
          + "toP\001ZPgoogle.golang.org/genproto/googlea"
          + "pis/cloud/servicedirectory/v1;servicedir"
          + "ectory\370\001\001\252\002 Google.Cloud.ServiceDirector"
          + "y.V1\312\002 Google\\Cloud\\ServiceDirectory\\V1\352"
          + "\002#Google::Cloud::ServiceDirectory::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.servicedirectory.v1.EndpointProto.getDescriptor(),
            });
    internal_static_google_cloud_servicedirectory_v1_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Service_descriptor,
            new java.lang.String[] {
              "Name", "Annotations", "Endpoints",
            });
    internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor =
        internal_static_google_cloud_servicedirectory_v1_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.servicedirectory.v1.EndpointProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
