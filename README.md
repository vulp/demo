# demo
JWT testing

Using https://jwt.io/ for token generating

Expired Test token:
Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTY5ODYwNDU4LCJleHAiOjE0MzA3NzMyMDAwMDAsInVzZXJuYW1lIjoidHR0In0.eYVSDSroIRlSaA4lWb1sPjn8JTd9nOPNSqlgeL9oLiE

Valid:
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJhc2RmIiwidXNlcm5hbWUiOiJKb2huIERvZSIsImlhdCI6MTUxNjIzOTAyMiwiZXhwIjoyNTM1MzEwODAwMDAwfQ.xhzktrE2_UTOaH5Qk_Bq9_9xCTUV4RS0B7ZYn-uVmNo



Start mongodb instance:
docker run -p 27017:27017 --name mongodb -d mongo:4.2.0-bionic

stop mongo:
docker stop mongodb

remove instance
docker rm mongodb

docker-machine ip to check ip for mongo and change spring.data.mongodb.host
