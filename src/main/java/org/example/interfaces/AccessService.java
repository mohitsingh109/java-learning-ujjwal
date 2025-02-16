package org.example.interfaces;

public class AccessService {

    public void readDoc(AccessControl ac) { // security ??
        ac.readDocument();
    }

    public void writeDoc(AccessControl ac) {
        ac.writeDocument();
    }

    public void deleteDoc(AccessControl ac) {
        ac.deleteDocument();
    }
}
