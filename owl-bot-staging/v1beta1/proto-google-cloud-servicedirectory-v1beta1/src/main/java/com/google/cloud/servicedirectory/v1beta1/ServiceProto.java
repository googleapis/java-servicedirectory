// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/service.proto

package com.google.cloud.servicedirectory.v1beta1;

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
    internal_static_google_cloud_servicedirectory_v1beta1_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_servicedirectory_v1beta1_Service_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Service_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/servicedirectory/v1beta1/" +
      "service.proto\022%google.cloud.servicedirec" +
      "tory.v1beta1\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\0324google" +
      "/cloud/servicedirectory/v1beta1/endpoint" +
      ".proto\032\037google/protobuf/timestamp.proto\032" +
      "\034google/api/annotations.proto\"\330\003\n\007Servic" +
      "e\022\021\n\004name\030\001 \001(\tB\003\340A\005\022S\n\010metadata\030\002 \003(\0132<" +
      ".google.cloud.servicedirectory.v1beta1.S" +
      "ervice.MetadataEntryB\003\340A\001\022G\n\tendpoints\030\003" +
      " \003(\0132/.google.cloud.servicedirectory.v1b" +
      "eta1.EndpointB\003\340A\003\0224\n\013create_time\030\006 \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upda" +
      "te_time\030\007 \001(\0132\032.google.protobuf.Timestam" +
      "pB\003\340A\003\032/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001:\177\352A|\n\'servicedirectory.g" +
      "oogleapis.com/Service\022Qprojects/{project" +
      "}/locations/{location}/namespaces/{names" +
      "pace}/services/{service}B\220\002\n)com.google." +
      "cloud.servicedirectory.v1beta1B\014ServiceP" +
      "rotoP\001ZUgoogle.golang.org/genproto/googl" +
      "eapis/cloud/servicedirectory/v1beta1;ser" +
      "vicedirectory\370\001\001\252\002%Google.Cloud.ServiceD" +
      "irectory.V1Beta1\312\002%Google\\Cloud\\ServiceD" +
      "irectory\\V1beta1\352\002(Google::Cloud::Servic" +
      "eDirectory::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.servicedirectory.v1beta1.EndpointProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_servicedirectory_v1beta1_Service_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1beta1_Service_descriptor,
        new java.lang.String[] { "Name", "Metadata", "Endpoints", "CreateTime", "UpdateTime", });
    internal_static_google_cloud_servicedirectory_v1beta1_Service_MetadataEntry_descriptor =
      internal_static_google_cloud_servicedirectory_v1beta1_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Service_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1beta1_Service_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.servicedirectory.v1beta1.EndpointProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}