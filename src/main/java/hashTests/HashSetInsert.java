package hashTests;
//Tom Wallace
//6482558
//A benchmark of Insertion on HashSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.HashSet;

public class HashSetInsert {

    static int numToTest = 1000000;
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 2)
    public static void insertThrough() {//Test of Throughput on Hashset
        HashSet test1 = new HashSet();
        for (int i=0; i<numToTest; i++){
            test1.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void insertTime() {//Test of Average Time on Hashset
        HashSet test2 = new HashSet();
        for (int i=0; i<numToTest; i++){
            test2.add(i);
        }
    }


    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSampleT() {//Test of Sample Time on HashSet
        HashSet test3 = new HashSet();
        for (int i=0; i<numToTest; i++){
            test3.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @Fork(value = 1, warmups = 2)
    public static void insertSingleShotT() {//Test of Single Shot Time on HashSet
        HashSet test4 = new HashSet();
        for (int i=0; i<numToTest; i++){
            test4.add(i);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing HashSet Insert with "+numToTest+" Integers");
        org.openjdk.jmh.Main.main(args);
    }
}
