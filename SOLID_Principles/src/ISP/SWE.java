/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP;

/**
 *
 * @author Avik
 */
public class SWE implements Department,IICT{

    @Override
    public void classroom() {
        System.out.println("SWE has classroom");
    }

    @Override
    public void office() {
        System.out.println("SWE has office");
    }

    @Override
    public void computerLab() {
        System.out.println("SWE has computer lab");
    }
    
}
