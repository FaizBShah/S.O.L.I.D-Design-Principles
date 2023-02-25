package org.example.interfacesegragation.bad;

public class BadDBDaoConnection implements BadDAOInterface {
    @Override
    public void openConnection() {
        // Open DB Connection Logic
    }

    @Override
    public void createRecord() {
        // Create Record Logic
    }

    @Override
    public void openFile() {
        // We are in DB Connection, so we cannot implement file-related logic
        throw new UnsupportedOperationException("Open File not supported");
    }

    @Override
    public void deleteRecord() {
        // Delete Record Logic
    }
}
