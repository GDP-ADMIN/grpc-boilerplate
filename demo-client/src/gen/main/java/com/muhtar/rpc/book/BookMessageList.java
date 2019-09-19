// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bookshelf.proto

package com.muhtar.rpc.book;

/**
 * Protobuf type {@code com.muhtar.rpc.book.BookMessageList}
 */
public  final class BookMessageList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.muhtar.rpc.book.BookMessageList)
    BookMessageListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BookMessageList.newBuilder() to construct.
  private BookMessageList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BookMessageList() {
    book_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BookMessageList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BookMessageList(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              book_ = new java.util.ArrayList<com.muhtar.rpc.book.BookMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            book_.add(
                input.readMessage(com.muhtar.rpc.book.BookMessage.parser(), extensionRegistry));
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
        book_ = java.util.Collections.unmodifiableList(book_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessageList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessageList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.muhtar.rpc.book.BookMessageList.class, com.muhtar.rpc.book.BookMessageList.Builder.class);
  }

  public static final int BOOK_FIELD_NUMBER = 1;
  private java.util.List<com.muhtar.rpc.book.BookMessage> book_;
  /**
   * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
   */
  public java.util.List<com.muhtar.rpc.book.BookMessage> getBookList() {
    return book_;
  }
  /**
   * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
   */
  public java.util.List<? extends com.muhtar.rpc.book.BookMessageOrBuilder> 
      getBookOrBuilderList() {
    return book_;
  }
  /**
   * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
   */
  public int getBookCount() {
    return book_.size();
  }
  /**
   * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
   */
  public com.muhtar.rpc.book.BookMessage getBook(int index) {
    return book_.get(index);
  }
  /**
   * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
   */
  public com.muhtar.rpc.book.BookMessageOrBuilder getBookOrBuilder(
      int index) {
    return book_.get(index);
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
    for (int i = 0; i < book_.size(); i++) {
      output.writeMessage(1, book_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < book_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, book_.get(i));
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
    if (!(obj instanceof com.muhtar.rpc.book.BookMessageList)) {
      return super.equals(obj);
    }
    com.muhtar.rpc.book.BookMessageList other = (com.muhtar.rpc.book.BookMessageList) obj;

    if (!getBookList()
        .equals(other.getBookList())) return false;
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
    if (getBookCount() > 0) {
      hash = (37 * hash) + BOOK_FIELD_NUMBER;
      hash = (53 * hash) + getBookList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.muhtar.rpc.book.BookMessageList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessageList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.muhtar.rpc.book.BookMessageList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.muhtar.rpc.book.BookMessageList parseFrom(
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
  public static Builder newBuilder(com.muhtar.rpc.book.BookMessageList prototype) {
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
   * Protobuf type {@code com.muhtar.rpc.book.BookMessageList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.muhtar.rpc.book.BookMessageList)
      com.muhtar.rpc.book.BookMessageListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessageList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessageList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.muhtar.rpc.book.BookMessageList.class, com.muhtar.rpc.book.BookMessageList.Builder.class);
    }

    // Construct using com.muhtar.rpc.book.BookMessageList.newBuilder()
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
        getBookFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (bookBuilder_ == null) {
        book_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bookBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessageList_descriptor;
    }

    @java.lang.Override
    public com.muhtar.rpc.book.BookMessageList getDefaultInstanceForType() {
      return com.muhtar.rpc.book.BookMessageList.getDefaultInstance();
    }

    @java.lang.Override
    public com.muhtar.rpc.book.BookMessageList build() {
      com.muhtar.rpc.book.BookMessageList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.muhtar.rpc.book.BookMessageList buildPartial() {
      com.muhtar.rpc.book.BookMessageList result = new com.muhtar.rpc.book.BookMessageList(this);
      int from_bitField0_ = bitField0_;
      if (bookBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          book_ = java.util.Collections.unmodifiableList(book_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.book_ = book_;
      } else {
        result.book_ = bookBuilder_.build();
      }
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
      if (other instanceof com.muhtar.rpc.book.BookMessageList) {
        return mergeFrom((com.muhtar.rpc.book.BookMessageList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.muhtar.rpc.book.BookMessageList other) {
      if (other == com.muhtar.rpc.book.BookMessageList.getDefaultInstance()) return this;
      if (bookBuilder_ == null) {
        if (!other.book_.isEmpty()) {
          if (book_.isEmpty()) {
            book_ = other.book_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBookIsMutable();
            book_.addAll(other.book_);
          }
          onChanged();
        }
      } else {
        if (!other.book_.isEmpty()) {
          if (bookBuilder_.isEmpty()) {
            bookBuilder_.dispose();
            bookBuilder_ = null;
            book_ = other.book_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bookBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBookFieldBuilder() : null;
          } else {
            bookBuilder_.addAllMessages(other.book_);
          }
        }
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
      com.muhtar.rpc.book.BookMessageList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.muhtar.rpc.book.BookMessageList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.muhtar.rpc.book.BookMessage> book_ =
      java.util.Collections.emptyList();
    private void ensureBookIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        book_ = new java.util.ArrayList<com.muhtar.rpc.book.BookMessage>(book_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.muhtar.rpc.book.BookMessage, com.muhtar.rpc.book.BookMessage.Builder, com.muhtar.rpc.book.BookMessageOrBuilder> bookBuilder_;

    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public java.util.List<com.muhtar.rpc.book.BookMessage> getBookList() {
      if (bookBuilder_ == null) {
        return java.util.Collections.unmodifiableList(book_);
      } else {
        return bookBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public int getBookCount() {
      if (bookBuilder_ == null) {
        return book_.size();
      } else {
        return bookBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public com.muhtar.rpc.book.BookMessage getBook(int index) {
      if (bookBuilder_ == null) {
        return book_.get(index);
      } else {
        return bookBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder setBook(
        int index, com.muhtar.rpc.book.BookMessage value) {
      if (bookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBookIsMutable();
        book_.set(index, value);
        onChanged();
      } else {
        bookBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder setBook(
        int index, com.muhtar.rpc.book.BookMessage.Builder builderForValue) {
      if (bookBuilder_ == null) {
        ensureBookIsMutable();
        book_.set(index, builderForValue.build());
        onChanged();
      } else {
        bookBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder addBook(com.muhtar.rpc.book.BookMessage value) {
      if (bookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBookIsMutable();
        book_.add(value);
        onChanged();
      } else {
        bookBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder addBook(
        int index, com.muhtar.rpc.book.BookMessage value) {
      if (bookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBookIsMutable();
        book_.add(index, value);
        onChanged();
      } else {
        bookBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder addBook(
        com.muhtar.rpc.book.BookMessage.Builder builderForValue) {
      if (bookBuilder_ == null) {
        ensureBookIsMutable();
        book_.add(builderForValue.build());
        onChanged();
      } else {
        bookBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder addBook(
        int index, com.muhtar.rpc.book.BookMessage.Builder builderForValue) {
      if (bookBuilder_ == null) {
        ensureBookIsMutable();
        book_.add(index, builderForValue.build());
        onChanged();
      } else {
        bookBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder addAllBook(
        java.lang.Iterable<? extends com.muhtar.rpc.book.BookMessage> values) {
      if (bookBuilder_ == null) {
        ensureBookIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, book_);
        onChanged();
      } else {
        bookBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder clearBook() {
      if (bookBuilder_ == null) {
        book_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bookBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public Builder removeBook(int index) {
      if (bookBuilder_ == null) {
        ensureBookIsMutable();
        book_.remove(index);
        onChanged();
      } else {
        bookBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public com.muhtar.rpc.book.BookMessage.Builder getBookBuilder(
        int index) {
      return getBookFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public com.muhtar.rpc.book.BookMessageOrBuilder getBookOrBuilder(
        int index) {
      if (bookBuilder_ == null) {
        return book_.get(index);  } else {
        return bookBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public java.util.List<? extends com.muhtar.rpc.book.BookMessageOrBuilder> 
         getBookOrBuilderList() {
      if (bookBuilder_ != null) {
        return bookBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(book_);
      }
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public com.muhtar.rpc.book.BookMessage.Builder addBookBuilder() {
      return getBookFieldBuilder().addBuilder(
          com.muhtar.rpc.book.BookMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public com.muhtar.rpc.book.BookMessage.Builder addBookBuilder(
        int index) {
      return getBookFieldBuilder().addBuilder(
          index, com.muhtar.rpc.book.BookMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.muhtar.rpc.book.BookMessage book = 1;</code>
     */
    public java.util.List<com.muhtar.rpc.book.BookMessage.Builder> 
         getBookBuilderList() {
      return getBookFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.muhtar.rpc.book.BookMessage, com.muhtar.rpc.book.BookMessage.Builder, com.muhtar.rpc.book.BookMessageOrBuilder> 
        getBookFieldBuilder() {
      if (bookBuilder_ == null) {
        bookBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.muhtar.rpc.book.BookMessage, com.muhtar.rpc.book.BookMessage.Builder, com.muhtar.rpc.book.BookMessageOrBuilder>(
                book_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        book_ = null;
      }
      return bookBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.muhtar.rpc.book.BookMessageList)
  }

  // @@protoc_insertion_point(class_scope:com.muhtar.rpc.book.BookMessageList)
  private static final com.muhtar.rpc.book.BookMessageList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.muhtar.rpc.book.BookMessageList();
  }

  public static com.muhtar.rpc.book.BookMessageList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BookMessageList>
      PARSER = new com.google.protobuf.AbstractParser<BookMessageList>() {
    @java.lang.Override
    public BookMessageList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BookMessageList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BookMessageList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BookMessageList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.muhtar.rpc.book.BookMessageList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

