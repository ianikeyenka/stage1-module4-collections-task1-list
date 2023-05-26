package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (Math.pow(Integer.parseInt(a), 2) * 5 + Integer.parseInt(a) * 3 >
                Math.pow(Integer.parseInt(b), 2) * 5 + Integer.parseInt(b) * 3) {
            return 1;
        }
        return -1;
    }
}
