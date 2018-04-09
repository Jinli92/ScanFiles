package com.example.jinliyu.scanallfiles;

/**
 * Created by jinliyu on 4/8/18.
 */

public class FileInfo {


    private String fileName;
    private long fileSize;
//    private String extension;

    public FileInfo(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
//        this.extension = extension;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
}
