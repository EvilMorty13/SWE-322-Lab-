/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP;

/**
 *
 * @author Avik
 */
public class CSE implements Department,IICT{

    @Override
    public void classroom() {
        System.out.println("CSE has classroom");
    }

    @Override
    public void office() {
        System.out.println("CSE has office");
    }

    @Override
    public void computerLab() {
        System.out.println("CSE has computer lab");
    }
    
}