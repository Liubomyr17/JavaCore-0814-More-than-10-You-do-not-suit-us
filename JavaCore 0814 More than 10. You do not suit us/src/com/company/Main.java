package com.company;

/*
0814 More than 10. You do not suit us.
Create a set of numbers (Set <Integer>), enter 20 different numbers there.
Remove from the set all numbers greater than 10.

Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The Solution class should contain only three methods.
4. The createSet () method should create and return a set of HashSets consisting of 20 different numbers.
5. The removeAllNumbersMoreThan10 () method should remove from the set all numbers greater than 10.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<20; i++) {
            set.add(i);
        }
        return set;
    }
    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> sort = new HashSet<>();
        for(Integer i : set) {
            if(i<=10)
                sort.add(i);
        }
        return sort;
    }

        public static void main(String[] args) throws IOException {
        }
    }




