//Node to read a file synchronusly
var inputfile=require('fs')
var data=inputfile.readFileSync('f1.txt','utf-8')
console.log(data)
console.log('Done!')