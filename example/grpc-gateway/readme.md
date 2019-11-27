## gRPC Gateway
The grpc-gateway is a plugin of the Google protocol buffers compiler protoc. It reads protobuf service definitions and generates a reverse-proxy server which 'translates a RESTful HTTP API into gRPC.

### Preparation
- make sure you can run go-grpc example
- download following packages:
```
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger
go get -u github.com/golang/protobuf/protoc-gen-go
```

### Generate stub
- cd proto
- run `./generate.sh`

### Run gRPC
- `go run server/server.go`
- open http://localhost:8081/employees to check HTTP response
- `go run client/client.go` to check gRPC client call
