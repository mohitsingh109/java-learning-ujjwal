package org.example.interfaces;

public interface ReportExport {

    void export(String destination, String data); // s3
}

//json, csv, pdf, html, raw_data
