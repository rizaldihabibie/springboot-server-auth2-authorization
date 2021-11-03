# springboot-server-auth2-authorization
This is a restful application example which is act as authorization server implementing Oauth2. This application also use auth0 to authorize token
## How to build JAR
### Using Netbeans IDE 11
1. Import project to IDE <br/>
2. Right click on the folder root <br/>
3. click clean and build <br/>
### Using terminal
1. Open the terminal
2. go to project root directory
3. run this comman <br/>
`mvn clean install`
## How to run JAR file
Use this command to run application using default port 8080<br/>
`java -jar demo-0.0.1-SNAPSHOT.jar`

Use this command to run application using different port<br/>
`java -Dserver.port=PORT_NUMBER -jar demo-0.0.1-SNAPSHOT.jar`
## How to run via Docker
1. If jar and Dockerfile is in the same directory, use this command to build Docker image <br/>
`docker build -t IMAGE_NAME .`
2. If jar and Dockerfile is not in ther same directory, use this command <br/>
`docker build -t IMAGE_NAME-f /path/to/Dockerfile .`
4. Run container <br />
`docker run --name demo-server --rm -d -e SERVER_PORT=8111 -p 8111:8111 IMAGE_NAME`
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
