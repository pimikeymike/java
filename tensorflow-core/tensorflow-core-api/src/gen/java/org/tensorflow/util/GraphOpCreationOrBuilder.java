// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.util;

public interface GraphOpCreationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphOpCreation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the op (e.g., "MatMul").
   * </pre>
   *
   * <code>string op_type = 1;</code>
   */
  java.lang.String getOpType();
  /**
   * <pre>
   * Type of the op (e.g., "MatMul").
   * </pre>
   *
   * <code>string op_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getOpTypeBytes();

  /**
   * <pre>
   * Name of the op (e.g., "Dense/MatMul_1").
   * </pre>
   *
   * <code>string op_name = 2;</code>
   */
  java.lang.String getOpName();
  /**
   * <pre>
   * Name of the op (e.g., "Dense/MatMul_1").
   * </pre>
   *
   * <code>string op_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getOpNameBytes();

  /**
   * <pre>
   * Name of the graph that the op is a part of (if available).
   * </pre>
   *
   * <code>string graph_name = 3;</code>
   */
  java.lang.String getGraphName();
  /**
   * <pre>
   * Name of the graph that the op is a part of (if available).
   * </pre>
   *
   * <code>string graph_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getGraphNameBytes();

  /**
   * <pre>
   * Unique ID of the graph (generated by debugger).
   * This is the ID of the immediately-enclosing graph.
   * </pre>
   *
   * <code>string graph_id = 4;</code>
   */
  java.lang.String getGraphId();
  /**
   * <pre>
   * Unique ID of the graph (generated by debugger).
   * This is the ID of the immediately-enclosing graph.
   * </pre>
   *
   * <code>string graph_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getGraphIdBytes();

  /**
   * <pre>
   * Name of the device that the op is assigned to (if available).
   * </pre>
   *
   * <code>string device_name = 5;</code>
   */
  java.lang.String getDeviceName();
  /**
   * <pre>
   * Name of the device that the op is assigned to (if available).
   * </pre>
   *
   * <code>string device_name = 5;</code>
   */
  com.google.protobuf.ByteString
      getDeviceNameBytes();

  /**
   * <pre>
   * Names of the input tensors to the op.
   * </pre>
   *
   * <code>repeated string input_names = 6;</code>
   */
  java.util.List<java.lang.String>
      getInputNamesList();
  /**
   * <pre>
   * Names of the input tensors to the op.
   * </pre>
   *
   * <code>repeated string input_names = 6;</code>
   */
  int getInputNamesCount();
  /**
   * <pre>
   * Names of the input tensors to the op.
   * </pre>
   *
   * <code>repeated string input_names = 6;</code>
   */
  java.lang.String getInputNames(int index);
  /**
   * <pre>
   * Names of the input tensors to the op.
   * </pre>
   *
   * <code>repeated string input_names = 6;</code>
   */
  com.google.protobuf.ByteString
      getInputNamesBytes(int index);

  /**
   * <pre>
   * Number of output tensors emitted by the op.
   * </pre>
   *
   * <code>int32 num_outputs = 7;</code>
   */
  int getNumOutputs();

  /**
   * <pre>
   * The unique ID for code location (stack trace) of the op's creation.
   * </pre>
   *
   * <code>.tensorflow.CodeLocation code_location = 8;</code>
   */
  boolean hasCodeLocation();
  /**
   * <pre>
   * The unique ID for code location (stack trace) of the op's creation.
   * </pre>
   *
   * <code>.tensorflow.CodeLocation code_location = 8;</code>
   */
  org.tensorflow.util.CodeLocation getCodeLocation();
  /**
   * <pre>
   * The unique ID for code location (stack trace) of the op's creation.
   * </pre>
   *
   * <code>.tensorflow.CodeLocation code_location = 8;</code>
   */
  org.tensorflow.util.CodeLocationOrBuilder getCodeLocationOrBuilder();

  /**
   * <pre>
   * Unique IDs for the output tensors of this op.
   * </pre>
   *
   * <code>repeated int32 output_tensor_ids = 9;</code>
   */
  java.util.List<java.lang.Integer> getOutputTensorIdsList();
  /**
   * <pre>
   * Unique IDs for the output tensors of this op.
   * </pre>
   *
   * <code>repeated int32 output_tensor_ids = 9;</code>
   */
  int getOutputTensorIdsCount();
  /**
   * <pre>
   * Unique IDs for the output tensors of this op.
   * </pre>
   *
   * <code>repeated int32 output_tensor_ids = 9;</code>
   */
  int getOutputTensorIds(int index);
}