// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/graph_transfer_info.proto

package org.tensorflow.proto.framework;

public interface GraphTransferInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphTransferInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.GraphTransferNodeInfo node_info = 1;</code>
   */
  java.util.List<org.tensorflow.proto.framework.GraphTransferNodeInfo> 
      getNodeInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInfo node_info = 1;</code>
   */
  org.tensorflow.proto.framework.GraphTransferNodeInfo getNodeInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInfo node_info = 1;</code>
   */
  int getNodeInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInfo node_info = 1;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.GraphTransferNodeInfoOrBuilder> 
      getNodeInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInfo node_info = 1;</code>
   */
  org.tensorflow.proto.framework.GraphTransferNodeInfoOrBuilder getNodeInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferConstNodeInfo const_node_info = 2;</code>
   */
  java.util.List<org.tensorflow.proto.framework.GraphTransferConstNodeInfo> 
      getConstNodeInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferConstNodeInfo const_node_info = 2;</code>
   */
  org.tensorflow.proto.framework.GraphTransferConstNodeInfo getConstNodeInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferConstNodeInfo const_node_info = 2;</code>
   */
  int getConstNodeInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferConstNodeInfo const_node_info = 2;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.GraphTransferConstNodeInfoOrBuilder> 
      getConstNodeInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferConstNodeInfo const_node_info = 2;</code>
   */
  org.tensorflow.proto.framework.GraphTransferConstNodeInfoOrBuilder getConstNodeInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferNodeInputInfo node_input_info = 3;</code>
   */
  java.util.List<org.tensorflow.proto.framework.GraphTransferNodeInputInfo> 
      getNodeInputInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInputInfo node_input_info = 3;</code>
   */
  org.tensorflow.proto.framework.GraphTransferNodeInputInfo getNodeInputInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInputInfo node_input_info = 3;</code>
   */
  int getNodeInputInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInputInfo node_input_info = 3;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.GraphTransferNodeInputInfoOrBuilder> 
      getNodeInputInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeInputInfo node_input_info = 3;</code>
   */
  org.tensorflow.proto.framework.GraphTransferNodeInputInfoOrBuilder getNodeInputInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferNodeOutputInfo node_output_info = 4;</code>
   */
  java.util.List<org.tensorflow.proto.framework.GraphTransferNodeOutputInfo> 
      getNodeOutputInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeOutputInfo node_output_info = 4;</code>
   */
  org.tensorflow.proto.framework.GraphTransferNodeOutputInfo getNodeOutputInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferNodeOutputInfo node_output_info = 4;</code>
   */
  int getNodeOutputInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeOutputInfo node_output_info = 4;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.GraphTransferNodeOutputInfoOrBuilder> 
      getNodeOutputInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferNodeOutputInfo node_output_info = 4;</code>
   */
  org.tensorflow.proto.framework.GraphTransferNodeOutputInfoOrBuilder getNodeOutputInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferGraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  java.util.List<org.tensorflow.proto.framework.GraphTransferGraphInputNodeInfo> 
      getGraphInputNodeInfoList();
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferGraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  org.tensorflow.proto.framework.GraphTransferGraphInputNodeInfo getGraphInputNodeInfo(int index);
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferGraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  int getGraphInputNodeInfoCount();
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferGraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.GraphTransferGraphInputNodeInfoOrBuilder> 
      getGraphInputNodeInfoOrBuilderList();
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferGraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  org.tensorflow.proto.framework.GraphTransferGraphInputNodeInfoOrBuilder getGraphInputNodeInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferGraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  java.util.List<org.tensorflow.proto.framework.GraphTransferGraphOutputNodeInfo> 
      getGraphOutputNodeInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferGraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  org.tensorflow.proto.framework.GraphTransferGraphOutputNodeInfo getGraphOutputNodeInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferGraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  int getGraphOutputNodeInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferGraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.GraphTransferGraphOutputNodeInfoOrBuilder> 
      getGraphOutputNodeInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferGraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  org.tensorflow.proto.framework.GraphTransferGraphOutputNodeInfoOrBuilder getGraphOutputNodeInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Destination of graph transfer
   * </pre>
   *
   * <code>.tensorflow.GraphTransferInfo.Destination destination = 7;</code>
   */
  int getDestinationValue();
  /**
   * <pre>
   * Destination of graph transfer
   * </pre>
   *
   * <code>.tensorflow.GraphTransferInfo.Destination destination = 7;</code>
   */
  org.tensorflow.proto.framework.GraphTransferInfo.Destination getDestination();
}