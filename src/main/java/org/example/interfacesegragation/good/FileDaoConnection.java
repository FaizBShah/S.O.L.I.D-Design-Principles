package org.example.interfacesegragation.good;

public class FileDaoConnection implements DAOInterface, FileDaoInterface {
    @Override
    public void createRecord() {
        // Create Record Logic
    }

    @Override
    public void deleteRecord() {
        // Delete Record Logic
    }

    @Override
    public void openFile() {
        // Open File Logic
    }
}
