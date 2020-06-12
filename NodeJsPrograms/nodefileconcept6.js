//Deletefile
//To delete a file with the FileSystem module,Use the fs.unlink() method to be used.

var fs=require('fs')
fs.unlink('myfile2.txt',function(err){
    if(err)throw err;
    console.log("FileDeleted..")
});