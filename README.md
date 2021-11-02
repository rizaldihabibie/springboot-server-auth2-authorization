# springboot-server-auth2-authorization
This is a restful application example which is act as authorization server implementing Oauth2. This application also use auth0 to authorize token

## How to run JAR file
Use this command to run application using default port 8080<br/>
`java -jar demo-0.0.1-SNAPSHOT.jar`

Use this command to run application using different port<br/>
`java -Dserver.port=PORT_NUMBER -jar demo-0.0.1-SNAPSHOT.jar`
## How to run via Docker
1. Pull image from docker hub <br/>
`docker image pull rizaldihabibie/demo-server-auth2-authorization:0.0.1`
2. Run Container<br />
`docker run --name demo-server --rm -d -e SERVER_PORT=8111 -p 8111:8111 demo-server-auth2-authorization:latest`
<br/>

## Endpoint Specification
This server only have one endpoint :<br/>
`POST` /demo/report <br/>
Header :
```
accept: application/json
content-type: application/json
Authorization: Bearer some_token
```
payload :
```
{
  "id":"client_id",
  "ip":"ip"
}
```
response ;
```
{
  'status':200,
  'message': 'some message',
  'data':{
    'id':'clientId',
    'ip':'IP submitted by user'
    'detectedIP: 'user public IP detected by server'
  }
}
```
