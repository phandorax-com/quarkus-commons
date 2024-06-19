# exception-mapper



## Add Dependency

Quarkus - Gradle:
```shell script
implementation 'com.phandorax:exception-mapper:1.0.0-SNAPSHOT'
```

Quarkus - Maven:
```shell script
<dependency>
    <groupId>com.phandorax</groupId>
    <artifactId>exception-mapper</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## Response Body Errors


```shell script
{
  "errors": [
    {
	  "message": "{message}",
	  "path": "addAccount.accountDTO.email",
	  "value": "herjizagmail.com"
	}
  ]
}
```

## Table of Codes
| HTTP Error Code | Type Of Exception | Description                                                                                                                                                    |
|-----------------|---------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `400`           | Bad Request   | The request cannot be fulfilled due to bad syntax.                                                                                                             |
| `401`           | Unauthorized | The request was a legal request, but the server is refusing to respond to it. For use when authentication is possible but has failed or not yet been provided. |
| `403`           | Forbidden | The request was a legal request, but the server is refusing to respond to it. |
| `404`           | Not Found | The requested page could not be found but may be available again in the future. |
| `405`           | Method Not Allowed    | A request was made of a page using a request method not supported by that page. |
| `406`           | Not Acceptable     | The server can only generate a response that is not accepted by the client. |
| `500`           | Internal Server    | A generic error message, given when no more specific message is suitable. |
