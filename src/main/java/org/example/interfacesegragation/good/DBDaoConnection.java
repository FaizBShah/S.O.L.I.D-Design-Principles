package org.example.interfacesegragation.good;

public class DBDaoConnection implements DAOInterface, DBDaoInterface {
    @Override
    public void createRecord() {
        // Create Record Logic
    }

    @Override
    public void deleteRecord() {
        // Delete Record Logic
    }

    @Override
    public void openConnection() {
        // Open DB Connection Logic
    }
}
