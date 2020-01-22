## gRPC Gateway
The grpc-gateway is a plugin of the Google protocol buffers compiler protoc. It reads protobuf service definitions and generates a reverse-proxy server which 'translates a RESTful HTTP API into gRPC. For more detail explanation you can follow [this link](https://github.com/grpc-ecosystem/grpc-gateway).

### Preparation
- make sure you can run go-grpc example
- download following packages:
```
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger
go get -u github.com/golang/protobuf/protoc-gen-go
```

### Generate stub
- run `./generate.sh`

### Run gRPC
- `go run server/server.go`
- GET http://localhost:8081/employees to check HTTP response
- `go run client/client.go` to check gRPC client call
