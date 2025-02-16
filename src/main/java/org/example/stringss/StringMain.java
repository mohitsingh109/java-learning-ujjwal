package org.example.stringss;

public class StringMain {

    public static void main(String[] args) {
        //char[] data1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String data = "abcdefgh";

        if (data.equals("abcdefgh")) {
            System.out.println("same");
        }

        if (data.equalsIgnoreCase("AbCdefgh")) {
            System.out.println("same");
        }

        if(data.contains("def")) {
            System.out.println("Yes def is present");
        }

        String queueData = "                ";
        String emptyData = "";
        if (emptyData.isEmpty()) { // string is empty
            System.out.println("Yes i am empty");
        }

        if (queueData.isBlank()) {
            System.out.println("Yes i am blank");
        }

        String spacedData = "   value  ";
        spacedData = spacedData.trim();

        System.out.println(spacedData.length());

        // test.json
        String file = "test.json";
        if (file.endsWith(".json")) {
            // how to process json file
        } else if (file.endsWith(".cvs")) {
            // how to process csv file
        }

        //Report ID:  WKO-akshfakh, FKO-kdhfksdhf, OPS-kfaskha

        String reportId = "WKO-akshfakh";
        if(reportId.startsWith("WKO")) {
            //dfdsfsd
        } else if(reportId.startsWith("FKO")) {

        }
    }
}
