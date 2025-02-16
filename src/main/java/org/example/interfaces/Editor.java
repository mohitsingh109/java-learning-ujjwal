package org.example.interfaces;

public class Editor implements AccessControl{
    @Override
    public void readDocument() {
        System.out.println("Read");
    }

    @Override
    public void writeDocument() {
        System.out.println("Write ok");
    }

    @Override
    public void deleteDocument() {
        System.out.println("403");
    }

    @Override
    public void shareDocument(String email) {
        System.out.println("403");
    }
}
