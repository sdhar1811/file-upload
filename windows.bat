start "file-upload-jar" java -jar ./lib/fileupload-0.0.1-SNAPSHOT.jar
timeout /t 10
cmd /c start ./lib/dist/index.html
pause
