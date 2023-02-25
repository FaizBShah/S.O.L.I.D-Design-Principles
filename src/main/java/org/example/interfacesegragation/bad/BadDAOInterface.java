package org.example.interfacesegragation.bad;

// This is a bad implementation as we have
// declared all the functions in a single interface
// This interface is declaring methods for both DBDDao
// and FileDao
public interface BadDAOInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
