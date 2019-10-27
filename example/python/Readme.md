## Python Example
- Compile proto using `python -m grpc_tools.protoc -I {proto dir} --python_out={protobuf output dir} --grpc_python_out={grpc output dir} {path to proto}`
- Example `python -m grpc_tools.protoc -I ../../proto --python_out=book --grpc_python_out=book ../../proto/Book.proto`

### Generate stub for this project
- run `./generate.sh`