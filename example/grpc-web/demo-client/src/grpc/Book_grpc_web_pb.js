/**
 * @fileoverview gRPC-Web generated client stub for book
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js')
const proto = {};
proto.book = require('./Book_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.book.BookServiceClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.book.BookServicePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.google.protobuf.Empty,
 *   !proto.book.BookMessageList>}
 */
const methodDescriptor_BookService_findAll = new grpc.web.MethodDescriptor(
  '/book.BookService/findAll',
  grpc.web.MethodType.UNARY,
  google_protobuf_empty_pb.Empty,
  proto.book.BookMessageList,
  /**
   * @param {!proto.google.protobuf.Empty} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessageList.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.google.protobuf.Empty,
 *   !proto.book.BookMessageList>}
 */
const methodInfo_BookService_findAll = new grpc.web.AbstractClientBase.MethodInfo(
  proto.book.BookMessageList,
  /**
   * @param {!proto.google.protobuf.Empty} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessageList.deserializeBinary
);


/**
 * @param {!proto.google.protobuf.Empty} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.book.BookMessageList)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.book.BookMessageList>|undefined}
 *     The XHR Node Readable Stream
 */
proto.book.BookServiceClient.prototype.findAll =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/book.BookService/findAll',
      request,
      metadata || {},
      methodDescriptor_BookService_findAll,
      callback);
};


/**
 * @param {!proto.google.protobuf.Empty} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.book.BookMessageList>}
 *     A native promise that resolves to the response
 */
proto.book.BookServicePromiseClient.prototype.findAll =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/book.BookService/findAll',
      request,
      metadata || {},
      methodDescriptor_BookService_findAll);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.book.BookMessage,
 *   !proto.book.BookMessageList>}
 */
const methodDescriptor_BookService_findBookByQuery = new grpc.web.MethodDescriptor(
  '/book.BookService/findBookByQuery',
  grpc.web.MethodType.UNARY,
  proto.book.BookMessage,
  proto.book.BookMessageList,
  /**
   * @param {!proto.book.BookMessage} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessageList.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.book.BookMessage,
 *   !proto.book.BookMessageList>}
 */
const methodInfo_BookService_findBookByQuery = new grpc.web.AbstractClientBase.MethodInfo(
  proto.book.BookMessageList,
  /**
   * @param {!proto.book.BookMessage} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessageList.deserializeBinary
);


/**
 * @param {!proto.book.BookMessage} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.book.BookMessageList)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.book.BookMessageList>|undefined}
 *     The XHR Node Readable Stream
 */
proto.book.BookServiceClient.prototype.findBookByQuery =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/book.BookService/findBookByQuery',
      request,
      metadata || {},
      methodDescriptor_BookService_findBookByQuery,
      callback);
};


/**
 * @param {!proto.book.BookMessage} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.book.BookMessageList>}
 *     A native promise that resolves to the response
 */
proto.book.BookServicePromiseClient.prototype.findBookByQuery =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/book.BookService/findBookByQuery',
      request,
      metadata || {},
      methodDescriptor_BookService_findBookByQuery);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.book.BookMessage,
 *   !proto.book.BookMessage>}
 */
const methodDescriptor_BookService_addBook = new grpc.web.MethodDescriptor(
  '/book.BookService/addBook',
  grpc.web.MethodType.UNARY,
  proto.book.BookMessage,
  proto.book.BookMessage,
  /**
   * @param {!proto.book.BookMessage} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessage.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.book.BookMessage,
 *   !proto.book.BookMessage>}
 */
const methodInfo_BookService_addBook = new grpc.web.AbstractClientBase.MethodInfo(
  proto.book.BookMessage,
  /**
   * @param {!proto.book.BookMessage} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessage.deserializeBinary
);


/**
 * @param {!proto.book.BookMessage} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.book.BookMessage)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.book.BookMessage>|undefined}
 *     The XHR Node Readable Stream
 */
proto.book.BookServiceClient.prototype.addBook =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/book.BookService/addBook',
      request,
      metadata || {},
      methodDescriptor_BookService_addBook,
      callback);
};


/**
 * @param {!proto.book.BookMessage} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.book.BookMessage>}
 *     A native promise that resolves to the response
 */
proto.book.BookServicePromiseClient.prototype.addBook =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/book.BookService/addBook',
      request,
      metadata || {},
      methodDescriptor_BookService_addBook);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.google.protobuf.Empty,
 *   !proto.book.BookMessageList>}
 */
const methodDescriptor_BookService_streamAll = new grpc.web.MethodDescriptor(
  '/book.BookService/streamAll',
  grpc.web.MethodType.SERVER_STREAMING,
  google_protobuf_empty_pb.Empty,
  proto.book.BookMessageList,
  /**
   * @param {!proto.google.protobuf.Empty} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessageList.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.google.protobuf.Empty,
 *   !proto.book.BookMessageList>}
 */
const methodInfo_BookService_streamAll = new grpc.web.AbstractClientBase.MethodInfo(
  proto.book.BookMessageList,
  /**
   * @param {!proto.google.protobuf.Empty} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.book.BookMessageList.deserializeBinary
);


/**
 * @param {!proto.google.protobuf.Empty} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.book.BookMessageList>}
 *     The XHR Node Readable Stream
 */
proto.book.BookServiceClient.prototype.streamAll =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/book.BookService/streamAll',
      request,
      metadata || {},
      methodDescriptor_BookService_streamAll);
};


/**
 * @param {!proto.google.protobuf.Empty} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.book.BookMessageList>}
 *     The XHR Node Readable Stream
 */
proto.book.BookServicePromiseClient.prototype.streamAll =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/book.BookService/streamAll',
      request,
      metadata || {},
      methodDescriptor_BookService_streamAll);
};


module.exports = proto.book;

