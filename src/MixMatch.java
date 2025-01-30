public class MixMatch {

    public static void main(String [] args) {
    String name = "Christian";
    char grade = 'A';
    short shrt_num = 100;
    int num = 2000;
    long lng_num = 300000000;
    float flo_pi = 3.14f;
    double double_pi= 3.1415926;
    boolean found = true;

    System.out.println(name + "<-String, In order to use the data type string you must capitalize S"); 
    System.out.println(grade + "<-char, A single character or an ASCII value");
    System.out.println(shrt_num + "<-short, An integer between -32,768 and +32,767");
    System.out.println(num + "<-integer between -2 to the power of 31 and 2 to the power of 31 -1"); 
    System.out.println(lng_num + "<-long, between -2 to the power of 63 and 2 to the power of 63 -1"); 
    System.out.println(flo_pi + "<-float, A floating-point between +-3.4 * to the power of 38 and +- 3.4 * 10 to the power of 38 and is accurate to 7 decimal places"); 
    System.out.println(double_pi + "<-double, A floating-point between +-1.7 * to the power of -308 and +-1.7 * 10 to the power of 308 and is accurate to 15 decimal places"); 
    System.out.println(found + "<-boolean, can only be true or false");
    }
}