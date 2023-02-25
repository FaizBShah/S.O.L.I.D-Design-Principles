package org.example.interfacesegragation.good;

// This is good implementation, as
// it only declares the methods which
// are actually required by all the DAO classes
public interface DAOInterface {
    public void createRecord();
    public void deleteRecord();
}
