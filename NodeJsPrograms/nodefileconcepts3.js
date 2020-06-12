//Node.js File System Module

//Node.js as a File Server

//The Node.js file system module allows you to work with the file system on your
//computer
//To include the file system module,use the require() method

//var fs=require('fs')

//common Use for the file system modules:
//Read file--fs.readFile()
//Create file
//Update file
//Delete file
//Rename file

var http=require('http');
var fs=require('fs')
http.createServer(function(req,res){
    fs.readFile('demofile1.html',function(err,data){
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write(data)
        return res.end()
    });
}).listen(8081);