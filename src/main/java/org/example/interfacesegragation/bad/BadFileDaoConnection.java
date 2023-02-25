package org.example.interfacesegragation.bad;

public class BadFileDaoConnection implements BadDAOInterface {
    @Override
    public void openConnection() {
        // We are in File Connection, so we cannot implement database-related logic
        throw new UnsupportedOperationException("Open Connection not supported");
    }

    @Override
    public void createRecord() {
        // Create Record Logic
    }

    @Override
    public void openFile() {
        // Open File Logic
    }

    @Override
    public void deleteRecord() {
        // Delete Record Logic
    }
}
