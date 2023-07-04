/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRP;

/**
 *
 * @author Avik
 */
public class UsernamePasswordAuthentication  implements StudentMailHandler{
    private StudentMailHandler studentMailHandler;
    @Override
    public void setNextHandler(StudentMailHandler studentMailHandler) {
        this.studentMailHandler = studentMailHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        if (userName.equals("admin") && password.equals("admin123")) {
            System.out.println("UsernamePasswordAuthentication: Authentication successful.");
            return true;
        } else {
            System.out.println("UsernamePasswordAuthentication: Authentication failed.");
            return false;
        }
    }
}
