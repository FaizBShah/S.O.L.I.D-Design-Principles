package org.example.interfacesegragation.good;

// Only declares the methods used by DBDao
public interface DBDaoInterface {
    public void openConnection();
}
