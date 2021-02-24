test:
	mkdir -p out
	javac -sourcepath src src/**/*.java -d out
	java -cp ./out com.CrittersUsage