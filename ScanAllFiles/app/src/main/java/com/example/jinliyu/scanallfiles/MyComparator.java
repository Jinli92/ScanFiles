package com.example.jinliyu.scanallfiles;

import java.util.Comparator;

/**
 * Created by jinliyu on 4/8/18.
 */

public class MyComparator implements Comparator{



    @Override
    public int compare(Object o1, Object o2) {
        FileInfo file1 = (FileInfo) o1;
        FileInfo file2 = (FileInfo) o2;

        //compare file 1 and file 2
        //if file1 size > file2 size, return -1 for descending order
        if (file1.getFileSize() > file2.getFileSize()) {
            return -1;
            //else return 1
        } else if (file1.getFileSize() < file2.getFileSize()) {
            return 1;
        }

        //if equal return 0
        return 0;
    }
}
