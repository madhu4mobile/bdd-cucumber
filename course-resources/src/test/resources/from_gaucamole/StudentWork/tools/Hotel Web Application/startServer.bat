@echo off
where /q java
IF ERRORLEVEL 1 (
    ECHO Java is not available to start the web application.
    ECHO Ensure it is installed and properly defined in your PATH environment variable
    EXIT /B
) 

IF "%~1" == "" (
  java -jar hotel.roomservice.jar
) else (
  java -Dserver.port=%1 -jar hotel.roomservice.jar
)
