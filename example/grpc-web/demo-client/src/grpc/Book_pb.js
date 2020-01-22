// source: Book.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
goog.object.extend(proto, google_protobuf_empty_pb);
goog.exportSymbol('proto.book.BookMessage', null, global);
goog.exportSymbol('proto.book.BookMessageList', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.book.BookMessage = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.book.BookMessage, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.book.BookMessage.displayName = 'proto.book.BookMessage';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.book.BookMessageList = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.book.BookMessageList.repeatedFields_, null);
};
goog.inherits(proto.book.BookMessageList, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.book.BookMessageList.displayName = 'proto.book.BookMessageList';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.book.BookMessage.prototype.toObject = function(opt_includeInstance) {
  return proto.book.BookMessage.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.book.BookMessage} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.book.BookMessage.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    author: jspb.Message.getFieldWithDefault(msg, 2, ""),
    isbn: jspb.Message.getFieldWithDefault(msg, 3, ""),
    category: jspb.Message.getFieldWithDefault(msg, 4, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.book.BookMessage}
 */
proto.book.BookMessage.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.book.BookMessage;
  return proto.book.BookMessage.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.book.BookMessage} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.book.BookMessage}
 */
proto.book.BookMessage.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthor(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setIsbn(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCategory(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.book.BookMessage.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.book.BookMessage.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.book.BookMessage} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.book.BookMessage.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAuthor();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getIsbn();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getCategory();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.book.BookMessage.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.book.BookMessage.prototype.setTitle = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string author = 2;
 * @return {string}
 */
proto.book.BookMessage.prototype.getAuthor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.book.BookMessage.prototype.setAuthor = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string isbn = 3;
 * @return {string}
 */
proto.book.BookMessage.prototype.getIsbn = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.book.BookMessage.prototype.setIsbn = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string category = 4;
 * @return {string}
 */
proto.book.BookMessage.prototype.getCategory = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.book.BookMessage.prototype.setCategory = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.book.BookMessageList.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.book.BookMessageList.prototype.toObject = function(opt_includeInstance) {
  return proto.book.BookMessageList.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.book.BookMessageList} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.book.BookMessageList.toObject = function(includeInstance, msg) {
  var f, obj = {
    bookList: jspb.Message.toObjectList(msg.getBookList(),
    proto.book.BookMessage.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.book.BookMessageList}
 */
proto.book.BookMessageList.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.book.BookMessageList;
  return proto.book.BookMessageList.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.book.BookMessageList} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.book.BookMessageList}
 */
proto.book.BookMessageList.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.book.BookMessage;
      reader.readMessage(value,proto.book.BookMessage.deserializeBinaryFromReader);
      msg.addBook(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.book.BookMessageList.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.book.BookMessageList.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.book.BookMessageList} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.book.BookMessageList.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBookList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.book.BookMessage.serializeBinaryToWriter
    );
  }
};


/**
 * repeated BookMessage book = 1;
 * @return {!Array<!proto.book.BookMessage>}
 */
proto.book.BookMessageList.prototype.getBookList = function() {
  return /** @type{!Array<!proto.book.BookMessage>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.book.BookMessage, 1));
};


/** @param {!Array<!proto.book.BookMessage>} value */
proto.book.BookMessageList.prototype.setBookList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.book.BookMessage=} opt_value
 * @param {number=} opt_index
 * @return {!proto.book.BookMessage}
 */
proto.book.BookMessageList.prototype.addBook = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.book.BookMessage, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 */
proto.book.BookMessageList.prototype.clearBookList = function() {
  this.setBookList([]);
};


goog.object.extend(exports, proto.book);
