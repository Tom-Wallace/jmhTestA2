package treeTests;
//Tom Wallace
//6482558
//A benchmark of Insertion on TreeSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.TreeSet;

public class TreeSetInsert {

    static int numToTest = 1000000;
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 2)
    public static void insertThrough() {//Test of Throughput on TreeSet
        TreeSet test1 = new TreeSet();
        for (int i=0; i<numToTest; i++){
            test1.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 2)
    public static void insertTime() {//Test of Average Time on TreeSet
        TreeSet test2 = new TreeSet();
        for (int i=0; i<numToTest; i++){
            test2.add(i);
        }
    }


    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSampleT() {//Test of Sample Time on TreeSet
        TreeSet test3 = new TreeSet();
        for (int i=0; i<numToTest; i++){
            test3.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSingleShotT() {//Test of Single Shot Time on TreeSet
        TreeSet test4 = new TreeSet();
        for (int i=0; i<numToTest; i++){
            test4.add(i);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing TreeSet Insert with "+numToTest+" Integers");
        org.openjdk.jmh.Main.main(args);
    }
}
