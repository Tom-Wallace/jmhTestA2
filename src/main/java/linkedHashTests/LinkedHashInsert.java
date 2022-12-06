package linkedHashTests;
//Tom Wallace
//6482558
//A benchmark of Insertion on LinkedHashSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.LinkedHashSet;

public class LinkedHashInsert {

    static int numToTest = 1000000;
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 2)
    public static void insertThrough() {//Test of Throughput on Hashset
        LinkedHashSet test1 = new LinkedHashSet();
        for (int i=0; i<numToTest; i++){
            test1.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 2)
    public static void insertTime() {//Test of Average Time on Hashset
        LinkedHashSet test2 = new LinkedHashSet();
        for (int i=0; i<numToTest; i++){
            test2.add(i);
        }
    }


    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSampleT() {//Test of Sample Time on HashSet
        LinkedHashSet test3 = new LinkedHashSet();
        for (int i=0; i<numToTest; i++){
            test3.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSingleShotT() {//Test of Single Shot Time on HashSet
        LinkedHashSet test4 = new LinkedHashSet();
        for (int i=0; i<numToTest; i++){
            test4.add(i);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing HashSet Insert with "+numToTest+" Integers");
        org.openjdk.jmh.Main.main(args);
    }
}
