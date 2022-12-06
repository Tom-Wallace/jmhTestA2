package hashTests;
//Tom Wallace
//6482558
//A benchmark of Insertion, Sorting, and Searching on HashSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class HashSetAll {
    static int numToTest = 1000000;
    static HashSet<Integer> test2;
    static HashSet<Integer> test3;
    static ArrayList<Integer> testList2;

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void HashInsert() {//Test of Insert on Hashset
        HashSet test1 = new HashSet();
        for (int i=0; i<numToTest; i++){
            test1.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void HashSort() {//Test of Sort on Hashset
        Collections.sort(testList2);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void HashSearch() {//Test of Search on HashSet
        test3.contains(numToTest/2);
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing HashSet Insert with "+numToTest+" Integers");
        test2 = new HashSet<Integer>();
        test3 = new HashSet<Integer>();
        Random rand = new Random(25565);
        int insert = 0;
        for (int i=0; i<numToTest; i++){
            insert = rand.nextInt(1000000);
            test2.add(insert);
            test3.add(i);
        }
        ArrayList<Integer> testList2 = new ArrayList<Integer>(test2);

        org.openjdk.jmh.Main.main(args);
    }
}
