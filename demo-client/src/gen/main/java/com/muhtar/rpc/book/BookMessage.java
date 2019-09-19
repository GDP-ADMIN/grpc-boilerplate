// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bookshelf.proto

package com.muhtar.rpc.book;

/**
 * Protobuf type {@code com.muhtar.rpc.book.BookMessage}
 */
public  final class BookMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.muhtar.rpc.book.BookMessage)
    BookMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BookMessage.newBuilder() to construct.
  private BookMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BookMessage() {
    title_ = "";
    author_ = "";
    isbn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BookMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BookMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            author_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            isbn_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.muhtar.rpc.book.BookMessage.class, com.muhtar.rpc.book.BookMessage.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 1;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object author_;
  /**
   * <code>string author = 2;</code>
   */
  public java.lang.String getAuthor() {
    java.lang.Object ref = author_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      author_ = s;
      return s;
    }
  }
  /**
   * <code>string author = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAuthorBytes() {
    java.lang.Object ref = author_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      author_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISBN_FIELD_NUMBER = 3;
  private volatile java.lang.Object isbn_;
  /**
   * <code>string isbn = 3;</code>
   */
  public java.lang.String getIsbn() {
    java.lang.Object ref = isbn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      isbn_ = s;
      return s;
    }
  }
  /**
   * <code>string isbn = 3;</code>
   */
  public com.google.protobuf.ByteString
      getIsbnBytes() {
    java.lang.Object ref = isbn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      isbn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!getAuthorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, author_);
    }
    if (!getIsbnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, isbn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!getAuthorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, author_);
    }
    if (!getIsbnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, isbn_);
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
    if (!(obj instanceof com.muhtar.rpc.book.BookMessage)) {
      return super.equals(obj);
    }
    com.muhtar.rpc.book.BookMessage other = (com.muhtar.rpc.book.BookMessage) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getAuthor()
        .equals(other.getAuthor())) return false;
    if (!getIsbn()
        .equals(other.getIsbn())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
    hash = (53 * hash) + getAuthor().hashCode();
    hash = (37 * hash) + ISBN_FIELD_NUMBER;
    hash = (53 * hash) + getIsbn().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.muhtar.rpc.book.BookMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.muhtar.rpc.book.BookMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.muhtar.rpc.book.BookMessage parseFrom(
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
  public static Builder newBuilder(com.muhtar.rpc.book.BookMessage prototype) {
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
   * Protobuf type {@code com.muhtar.rpc.book.BookMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.muhtar.rpc.book.BookMessage)
      com.muhtar.rpc.book.BookMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.muhtar.rpc.book.BookMessage.class, com.muhtar.rpc.book.BookMessage.Builder.class);
    }

    // Construct using com.muhtar.rpc.book.BookMessage.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      title_ = "";

      author_ = "";

      isbn_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.muhtar.rpc.book.Bookshelf.internal_static_com_muhtar_rpc_book_BookMessage_descriptor;
    }

    @java.lang.Override
    public com.muhtar.rpc.book.BookMessage getDefaultInstanceForType() {
      return com.muhtar.rpc.book.BookMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.muhtar.rpc.book.BookMessage build() {
      com.muhtar.rpc.book.BookMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.muhtar.rpc.book.BookMessage buildPartial() {
      com.muhtar.rpc.book.BookMessage result = new com.muhtar.rpc.book.BookMessage(this);
      result.title_ = title_;
      result.author_ = author_;
      result.isbn_ = isbn_;
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
      if (other instanceof com.muhtar.rpc.book.BookMessage) {
        return mergeFrom((com.muhtar.rpc.book.BookMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.muhtar.rpc.book.BookMessage other) {
      if (other == com.muhtar.rpc.book.BookMessage.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getAuthor().isEmpty()) {
        author_ = other.author_;
        onChanged();
      }
      if (!other.getIsbn().isEmpty()) {
        isbn_ = other.isbn_;
        onChanged();
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
      com.muhtar.rpc.book.BookMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.muhtar.rpc.book.BookMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object author_ = "";
    /**
     * <code>string author = 2;</code>
     */
    public java.lang.String getAuthor() {
      java.lang.Object ref = author_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        author_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string author = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAuthorBytes() {
      java.lang.Object ref = author_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        author_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string author = 2;</code>
     */
    public Builder setAuthor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      author_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string author = 2;</code>
     */
    public Builder clearAuthor() {
      
      author_ = getDefaultInstance().getAuthor();
      onChanged();
      return this;
    }
    /**
     * <code>string author = 2;</code>
     */
    public Builder setAuthorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      author_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object isbn_ = "";
    /**
     * <code>string isbn = 3;</code>
     */
    public java.lang.String getIsbn() {
      java.lang.Object ref = isbn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        isbn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string isbn = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIsbnBytes() {
      java.lang.Object ref = isbn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        isbn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string isbn = 3;</code>
     */
    public Builder setIsbn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      isbn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string isbn = 3;</code>
     */
    public Builder clearIsbn() {
      
      isbn_ = getDefaultInstance().getIsbn();
      onChanged();
      return this;
    }
    /**
     * <code>string isbn = 3;</code>
     */
    public Builder setIsbnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      isbn_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.muhtar.rpc.book.BookMessage)
  }

  // @@protoc_insertion_point(class_scope:com.muhtar.rpc.book.BookMessage)
  private static final com.muhtar.rpc.book.BookMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.muhtar.rpc.book.BookMessage();
  }

  public static com.muhtar.rpc.book.BookMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BookMessage>
      PARSER = new com.google.protobuf.AbstractParser<BookMessage>() {
    @java.lang.Override
    public BookMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BookMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BookMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BookMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.muhtar.rpc.book.BookMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

