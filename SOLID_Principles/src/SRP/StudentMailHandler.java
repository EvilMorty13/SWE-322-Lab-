/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SRP;

/**
 *
 * @author Avik
 */
public interface StudentMailHandler {
    void setNextHandler(StudentMailHandler studentMailHandler);
    boolean authenticate(String userName, String password);
}
