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

## Results
An Excel sheet Results.xlsx comparing the results is available in the SampleOutputs directory, as well as text files containing the raw output of each benchmark. The results will be summarized here as well. It should be noted that while the Insert and Sort operations are measured in operations/second or seconds/operation, the searches are measured in milliseconds as they tend to be performed that much faster. For throughput (ops/s or ops/ms) a higher number is desirable, while for the other modes (s/op or ms/op) a lower number is more desirable.

### Insert

![Screenshot_2576](https://user-images.githubusercontent.com/36076870/207176284-3a81448c-4302-488e-b6ce-ca6789d084d1.png)

It is observed that for throughput, average time and sample measurements, the HashInsert performed best, followed closely by the LinkedHashInsert, with TreeInsert being the slowest. For the single shot measurement, the LinkedHashInsert was fastest, followed by the HashInsert and the TreeInsert in that order. The LinkedHashInsert had the highest margin of error relative to its measurements, the highest being its throughput measurement with a margin of error of 6.816 compared to its 6.837 measurement.

###Search

![Screenshot_2577](https://user-images.githubusercontent.com/36076870/207176828-eba5e3cf-878e-49e6-a855-1dc6762a9b69.png)

It is observed that for throughput, the LinkedHashSearch has the best performance, but also the highest error, higher than even the measurement. The throughput performance is followed by the HashSearch and the TreeSearch, with the same ranking for the single shot measurements. For the average time, the HashSearch performed best, followed by the LinkedHashSearch and Treesearch. For the sample, the TreeSearch performed best, followed closely by the HashSearch and then the LinkedHashSearch.

###Sort

![Screenshot_2578](https://user-images.githubusercontent.com/36076870/207186547-c7115133-b8c4-4c7b-8a07-c8bef9a78535.png)

It is observed that for all measurement modes (Throughput, Avg. time, sample, & single shot), TreeSort was the fastest by far, followed by the HashSort, and finally the LinkedHashSort. This is most likely because the TreeSet sorts automatically during the creation and insertion process.
