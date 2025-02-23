package org.example.interfaces;

public interface AccessControl {

    void readDocument();

    void writeDocument();

    void deleteDocument();

    void shareDocument(String email);
}

