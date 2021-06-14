// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/namespace.proto

package com.google.cloud.servicedirectory.v1beta1;

public interface NamespaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1beta1.Namespace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name for the namespace in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The resource name for the namespace in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}