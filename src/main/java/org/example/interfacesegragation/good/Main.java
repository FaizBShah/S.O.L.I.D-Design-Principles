package org.example.interfacesegragation.good;

public class Main {
    public static void main(String[] args) {
        DBDaoConnection dbDaoConnection = new DBDaoConnection();
        FileDaoConnection fileDaoConnection = new FileDaoConnection();

        // This method will work and the object doesn't
        // have any openFile() function, hence it's a good code
        dbDaoConnection.openConnection();

        // This method will work and the object doesn't
        // have any openConnection() function, hence it's a good code
        fileDaoConnection.openFile();
    }
}
