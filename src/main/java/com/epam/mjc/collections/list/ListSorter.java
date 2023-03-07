package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        for (int i = 1; i < sourceList.size(); i++) {
            String move = sourceList.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (comparator.compare(move, sourceList.get(j)) < 0) {
                    Collections.swap(sourceList, j, j +1);


                }else if ((Math.pow(Integer.parseInt(move),2) == (Math.pow(Integer.parseInt(sourceList.get(j)),2))) &&
                        (Integer.parseInt(move) < Integer.parseInt(sourceList.get(j)))) {
                    Collections.swap(sourceList, j, j +1);
                    break;

                } else {
                    break;
                }
            }

        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer first = (int) (Math.pow((Integer.parseInt(a) * 5), 2) + 5);
        Integer second = (int) (Math.pow((Integer.parseInt(b) * 5), 2) + 5);
        return first.compareTo(second);
    }
}
