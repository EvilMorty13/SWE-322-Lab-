/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRP;

/**
 *
 * @author Avik
 */
public class Main {
    public static void main(String[] args) {
        StudentMailHandler upHandler = new UsernamePasswordAuthentication();
        StudentMailHandler ipHandler = new IPCheck();

        ipHandler.setNextHandler(upHandler);

        boolean isAuthenticated = ipHandler.authenticate("admin", "admin123");
        if (isAuthenticated) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
