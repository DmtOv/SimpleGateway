#### Spring Cloud simple gateway application

Example Spring Cloud gateway service who use Demo service with CORS, Preflight request and RewRite filter
    

    Gateway -> Demo


Check correct work CORS and Preflight request: 
 
``` 
curl 'http://localhost:8081/option'
 -X OPTIONS 
 -H 'Access-Control-Request-Method: GET' 
 -H 'Origin: https://branch.dev.example.ru' 
 -H 'Referer: https://branch.dev.example.ru/mcp/form' 
 -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36'
 -H 'Access-Control-Request-Headers: authorization,id-token' 
 --compressed   -v

*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8081 (#0)
> OPTIONS /option HTTP/1.1
> Host: localhost:8081
> Accept: */*
> Accept-Encoding: deflate, gzip
> Access-Control-Request-Method: GET
> Origin: https://branch.dev.rbopro.raiffeisen.ru
> Referer: https://branch.dev.rbopro.raiffeisen.ru/acquiring/mcp/form
> User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36
> Access-Control-Request-Headers: authorization,id-token
> 
< HTTP/1.1 200 OK
< Vary: Origin
< Vary: Access-Control-Request-Method
< Vary: Access-Control-Request-Headers
< Access-Control-Allow-Origin: *
< Access-Control-Allow-Methods: GET
< Access-Control-Allow-Headers: authorization, id-token
< Access-Control-Max-Age: 3600
< Allow: GET, HEAD, POST, PUT, DELETE, OPTIONS, PATCH
< Content-Length: 0
< Date: Sun, 03 Nov 2019 23:30:16 GMT
< 
* Connection #0 to host localhost left intact
```