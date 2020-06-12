var http=require("http")
http.createServer(function(request,response){
    //send the HTTP header
    //HTTP status:200:OK
    //contentType:text/plain
    response.writeHead(200,{'Content-Type':'text/plain'});
    //send the response body  as "helloworld"
    response.end("HelloWorld\n");
}).listen(8081);
//console will print the message
console.log("Server running at http://127.0.0.1:8081/");