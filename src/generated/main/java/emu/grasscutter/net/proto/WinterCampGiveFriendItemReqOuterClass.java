// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampGiveFriendItemReq.proto

package emu.grasscutter.net.proto;

public final class WinterCampGiveFriendItemReqOuterClass {
  private WinterCampGiveFriendItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampGiveFriendItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampGiveFriendItemReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getItemListList();
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index);
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index);

    /**
     * <code>uint32 uid = 2;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * Protobuf type {@code WinterCampGiveFriendItemReq}
   */
  public static final class WinterCampGiveFriendItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampGiveFriendItemReq)
      WinterCampGiveFriendItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampGiveFriendItemReq.newBuilder() to construct.
    private WinterCampGiveFriendItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampGiveFriendItemReq() {
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampGiveFriendItemReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampGiveFriendItemReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 16: {

              uid_ = input.readUInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              itemList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          itemList_ = java.util.Collections.unmodifiableList(itemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.internal_static_WinterCampGiveFriendItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.internal_static_WinterCampGiveFriendItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.class, emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.Builder.class);
    }

    /**
     * Protobuf enum {@code WinterCampGiveFriendItemReq.DJAGLGMAMFJ}
     */
    public enum DJAGLGMAMFJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8528;</code>
       */
      PEPPOHPHJOJ(1, 8528),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DJAGLGMAMFJ DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final DJAGLGMAMFJ EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8528;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8528;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DJAGLGMAMFJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DJAGLGMAMFJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8528: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DJAGLGMAMFJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DJAGLGMAMFJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DJAGLGMAMFJ>() {
              public DJAGLGMAMFJ findValueByNumber(int number) {
                return DJAGLGMAMFJ.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final DJAGLGMAMFJ[] VALUES = getStaticValuesArray();
      private static DJAGLGMAMFJ[] getStaticValuesArray() {
        return new DJAGLGMAMFJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static DJAGLGMAMFJ valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private DJAGLGMAMFJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:WinterCampGiveFriendItemReq.DJAGLGMAMFJ)
    }

    public static final int ITEMLIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemList_;
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam itemList = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
    }

    public static final int UID_FIELD_NUMBER = 2;
    private int uid_;
    /**
     * <code>uint32 uid = 2;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (uid_ != 0) {
        output.writeUInt32(2, uid_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(5, itemList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, uid_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, itemList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq other = (emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq) obj;

      if (!getItemListList()
          .equals(other.getItemListList())) return false;
      if (getUid()
          != other.getUid()) return false;
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
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEMLIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code WinterCampGiveFriendItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampGiveFriendItemReq)
        emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.internal_static_WinterCampGiveFriendItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.internal_static_WinterCampGiveFriendItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.class, emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          itemListBuilder_.clear();
        }
        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.internal_static_WinterCampGiveFriendItemReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq build() {
        emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq buildPartial() {
        emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq result = new emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq(this);
        int from_bitField0_ = bitField0_;
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
        }
        result.uid_ = uid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq other) {
        if (other == emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq.getDefaultInstance()) return this;
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
            }
          }
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(itemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder addItemList(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder addItemList(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam itemList = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 2;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 2;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:WinterCampGiveFriendItemReq)
    }

    // @@protoc_insertion_point(class_scope:WinterCampGiveFriendItemReq)
    private static final emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq();
    }

    public static emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampGiveFriendItemReq>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampGiveFriendItemReq>() {
      @java.lang.Override
      public WinterCampGiveFriendItemReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampGiveFriendItemReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampGiveFriendItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampGiveFriendItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampGiveFriendItemReqOuterClass.WinterCampGiveFriendItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampGiveFriendItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampGiveFriendItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!WinterCampGiveFriendItemReq.proto\032\017Ite" +
      "mParam.proto\"\252\001\n\033WinterCampGiveFriendIte" +
      "mReq\022\034\n\010itemList\030\005 \003(\0132\n.ItemParam\022\013\n\003ui" +
      "d\030\002 \001(\r\"`\n\013DJAGLGMAMFJ\022\010\n\004NONE\020\000\022\020\n\013PEPP" +
      "OHPHJOJ\020\320B\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPO" +
      "EA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_WinterCampGiveFriendItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampGiveFriendItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampGiveFriendItemReq_descriptor,
        new java.lang.String[] { "ItemList", "Uid", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
