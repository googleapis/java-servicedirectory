// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1/service.proto

package com.google.cloud.servicedirectory.v1;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_servicedirectory_v1_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/servicedirectory/v1/servi" +
      "ce.proto\022 google.cloud.servicedirectory." +
      "v1\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032/google/cloud/ser" +
      "vicedirectory/v1/endpoint.proto\"\353\002\n\007Serv" +
      "ice\022\021\n\004name\030\001 \001(\tB\003\340A\005\022T\n\013annotations\030\004 " +
      "\003(\0132:.google.cloud.servicedirectory.v1.S" +
      "ervice.AnnotationsEntryB\003\340A\001\022B\n\tendpoint" +
      "s\030\003 \003(\0132*.google.cloud.servicedirectory." +
      "v1.EndpointB\003\340A\003\0322\n\020AnnotationsEntry\022\013\n\003" +
      "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\177\352A|\n\'servi" +
      "cedirectory.googleapis.com/Service\022Qproj" +
      "ects/{project}/locations/{location}/name" +
      "spaces/{namespace}/services/{service}B\367\001" +
      "\n$com.google.cloud.servicedirectory.v1B\014" +
      "ServiceProtoP\001ZPgoogle.golang.org/genpro" +
      "to/googleapis/cloud/servicedirectory/v1;" +
      "servicedirectory\370\001\001\252\002 Google.Cloud.Servi" +
      "ceDirectory.V1\312\002 Google\\Cloud\\ServiceDir" +
      "ectory\\V1\352\002#Google::Cloud::ServiceDirect" +
      "ory::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.servicedirectory.v1.EndpointProto.getDescriptor(),
        });
    internal_static_google_cloud_servicedirectory_v1_Service_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1_Service_descriptor,
        new java.lang.String[] { "Name", "Annotations", "Endpoints", });
    internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor =
      internal_static_google_cloud_servicedirectory_v1_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1_Service_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.servicedirectory.v1.EndpointProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
