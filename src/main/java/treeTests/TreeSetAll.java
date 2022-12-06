package treeTests;
//Tom Wallace
//6482558
//A benchmark of Insertion, Sorting, and Searching on TreeSet
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Random;

public class TreeSetAll {
    static int numToTest = 1000000;
    static TreeSet<Integer> test2;
    static TreeSet<Integer> test3;
    static ArrayList<Integer> testList2;

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void TreeInsert() {//Test of Insert on Treeset
        TreeSet test1 = new TreeSet();
        for (int i=0; i<numToTest; i++){
            test1.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void TreeSort() {//Test of Sort on Treeset
        Collections.sort(testList2);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 2)
    public static void TreeSearch() {//Test of Search on TreeSet
        test3.contains(numToTest/2);
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Testing TreeSet Insert with "+numToTest+" Integers");
        test2 = new TreeSet<Integer>();
        test3 = new TreeSet<Integer>();
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
