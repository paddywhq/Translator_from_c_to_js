java -cp lib/antlrworks-1.4.3.jar org.antlr.Tool -fo src src\calculator.g
mkdir bin
javac -cp lib/antlrworks-1.4.3.jar -d bin src\*.java
java -cp "lib/antlrworks-1.4.3.jar;bin" Main calculator.cpp > calculator.js
pause