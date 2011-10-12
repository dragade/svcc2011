package com.dragade.svcc.java;

import java.util.List;
import java.util.ArrayList;

public class Partition {

  public static class Partitions {
    public List<Integer> first = new ArrayList<Integer>();
    public List<Integer> second = new ArrayList<Integer>();
  }

  public static interface PartitionPredicate {
    boolean isFirstPart(Integer v);
  }

  public static Partitions partition(List<Integer> values, PartitionPredicate partitioner) {
    Partitions result = new Partitions();
    for (Integer v : values) {
      if (partitioner.isFirstPart(v)) {
        result.first.add(v);
      }
      else {
        result.second.add(v);
      }
    }
    return result;
  }

  public static void main(String args[]) {
    ArrayList<Integer> ints = new ArrayList<Integer>();
    for (int i=0; i < 10; i++) {
      ints.add(i);
    }

    Partitions partitions = Partition.partition(ints, new PartitionPredicate() {
      @Override
      public boolean isFirstPart(Integer v) {
        return v % 2 == 0;
      }
    });

    System.out.println("Odds are " + partitions.first.toString());
    System.out.println("Evens are " + partitions.second.toString());
  }
}
