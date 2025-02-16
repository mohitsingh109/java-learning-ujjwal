package org.example.interfaces;

public class Admin implements AccessControl{
    @Override
    public void readDocument() {
        System.out.println("Reading");
    }

    @Override
    public void writeDocument() {
        System.out.println("Writing");
    }

    @Override
    public void deleteDocument() {
        System.out.println("delete");
    }

    @Override
    public void shareDocument(String email) {
        System.out.println("Sharing email: %s".formatted(email));
    }
}
