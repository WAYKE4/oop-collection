package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);  scanner.nextLine();
        String str = "1,      2. 3 ! 4,     4, 5";
        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll(" +", " ");
        String[] arrStr = str.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrStr));
        System.out.println(arrayList);
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);
    }
}
