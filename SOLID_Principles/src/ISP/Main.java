/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP;

/**
 *
 * @author Avik
 */
public class Main {
    public static void main(String[] args) {
        SWE swe = new SWE();
        swe.classroom();
        swe.office();
        swe.computerLab();
        
        CSE cse = new CSE();
        cse.classroom();
        cse.office();
        cse.computerLab();
        
        
        ENG eng = new ENG();
        eng.classroom();
        eng.office();
        //ENG don't have computer lab
    }
}
