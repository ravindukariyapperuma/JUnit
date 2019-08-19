/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sejunitsample;

/**
 *
 * @author asanthika.i
 */
public class SESimpleAdd {

    static public int add(int a, int b) {
        return a + b;
    }

    static public int multiply(int a, int b) {
        return a * b;
    }

    static public int subtract(int a, int b) {
        return a - b;
    }
    
    public int AddString(String s1, String s2)
    {
        int value1 = Integer.parseInt(s1);
        int value2 = Integer.parseInt(s2);
        
        return value1+value2;
    }
}
