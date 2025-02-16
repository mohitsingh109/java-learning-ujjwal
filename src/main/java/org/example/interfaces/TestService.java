package org.example.interfaces;

public class TestService {

    public void readDocumentByAdmin(Admin admin) {
        admin.readDocument();
    }

    public void readDocumentByUser(User user) {
        user.readDocument();
    }
}

// SOLID
