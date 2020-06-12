//Append the file

var fs=require('fs')
//Create a file named mynewfile1.txt
fs.appendFile('mynewfile1.txt','helloworld',function(err){
    if(err) throw err;
    console.log('saved');
});