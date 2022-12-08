# jmhTestA2
For Assignment 2, Question 1 of Brock University's COSC 5P07 Course
## Files
Source codes are contained in the directory *jmhTestA2/src/main/java/*, where each folder (hashTests, linkedHashTests, treeTests) contains java classes for testing their namesake set types.
Files entitled \_\_\_Insert, \_\_\_Search, and \_\_\_Sort perform separate tests on these individual operations (Insertion, Search, Sorting), while files entitled \_\_\_All perform tests on all functions in sequence using all parameters.
The first three mentioned were created while familiarizing myself with the JMH process and have since been commented out as they aren't quite correct (and unnecessary); HashSetAll, LinkedHashAll and TreeSetAll should fit all necessary purposes. 

With Maven installed, the benchmarks can be run by entering the following commands into the command line from the jmhTestA2 folder. Note that each can take approximately 45 minutes.

```
mvn clean install
java -jar target/benchmarks.jar HashSetAll
```

```
mvn clean install
java -jar target/benchmarks.jar TreeSetAll
```

```
mvn clean install
java -jar target/benchmarks.jar LinkedHashAll
```
