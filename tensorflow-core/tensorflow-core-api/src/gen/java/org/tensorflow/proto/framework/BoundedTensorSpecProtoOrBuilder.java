// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/struct.proto

package org.tensorflow.proto.framework;

public interface BoundedTensorSpecProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.BoundedTensorSpecProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  boolean hasShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.proto.framework.TensorShapeProto getShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.proto.framework.TensorShapeProtoOrBuilder getShapeOrBuilder();

  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  int getDtypeValue();
  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  org.tensorflow.proto.framework.DataType getDtype();

  /**
   * <code>.tensorflow.TensorProto minimum = 4;</code>
   */
  boolean hasMinimum();
  /**
   * <code>.tensorflow.TensorProto minimum = 4;</code>
   */
  org.tensorflow.proto.framework.TensorProto getMinimum();
  /**
   * <code>.tensorflow.TensorProto minimum = 4;</code>
   */
  org.tensorflow.proto.framework.TensorProtoOrBuilder getMinimumOrBuilder();

  /**
   * <code>.tensorflow.TensorProto maximum = 5;</code>
   */
  boolean hasMaximum();
  /**
   * <code>.tensorflow.TensorProto maximum = 5;</code>
   */
  org.tensorflow.proto.framework.TensorProto getMaximum();
  /**
   * <code>.tensorflow.TensorProto maximum = 5;</code>
   */
  org.tensorflow.proto.framework.TensorProtoOrBuilder getMaximumOrBuilder();
}
