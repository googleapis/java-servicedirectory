// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/namespace.proto

package com.google.cloud.servicedirectory.v1beta1;

public final class NamespaceProto {
  private NamespaceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Namespace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/servicedirectory/v1beta1/" +
      "namespace.proto\022%google.cloud.servicedir" +
      "ectory.v1beta1\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\037goog" +
      "le/protobuf/timestamp.proto\"\374\002\n\tNamespac" +
      "e\022\021\n\004name\030\001 \001(\tB\003\340A\005\022Q\n\006labels\030\002 \003(\0132<.g" +
      "oogle.cloud.servicedirectory.v1beta1.Nam" +
      "espace.LabelsEntryB\003\340A\001\0224\n\013create_time\030\004" +
      " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n" +
      "\013update_time\030\005 \001(\0132\032.google.protobuf.Tim" +
      "estampB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001:n\352Ak\n)servicedirector" +
      "y.googleapis.com/Namespace\022>projects/{pr" +
      "oject}/locations/{location}/namespaces/{" +
      "namespace}B\222\002\n)com.google.cloud.serviced" +
      "irectory.v1beta1B\016NamespaceProtoP\001ZUclou" +
      "d.google.com/go/servicedirectory/apiv1be" +
      "ta1/servicedirectorypb;servicedirectoryp" +
      "b\370\001\001\252\002%Google.Cloud.ServiceDirectory.V1B" +
      "eta1\312\002%Google\\Cloud\\ServiceDirectory\\V1b" +
      "eta1\352\002(Google::Cloud::ServiceDirectory::" +
      "V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor,
        new java.lang.String[] { "Name", "Labels", "CreateTime", "UpdateTime", });
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_descriptor =
      internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
