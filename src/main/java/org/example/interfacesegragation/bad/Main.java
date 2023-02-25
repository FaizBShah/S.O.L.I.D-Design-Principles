package org.example.interfacesegragation.bad;

public class Main {
    public static void main(String[] args) {
        BadDAOInterface badDAOInterface;

        badDAOInterface = new BadDBDaoConnection();

        // This method won't work, and is also a bad code
        badDAOInterface.openFile();

        badDAOInterface = new BadFileDaoConnection();

        // This method won't work again, and is thus also again a bad code
        badDAOInterface.openConnection();
    }
}
