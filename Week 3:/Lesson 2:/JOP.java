import javax.swing.JOptionPane; /* so that we use JOptionPane.showMessageDialogue to print instead of println, as it is used differently. 
JOptionPane is a static method. We use it directly
*/ 
public class JOP{
    public static void main(String args[]){

        String fName; //object declaration

        fName = new String("Espresso"); //object creation

        JOptionPane.showMessageDialog(null, fName.substring(3, 3)); //calling methods on the String object fName e.g. 
        // fName.toUpperCase, fName.charAt(3), fName.indexOf("sth"), fName.substring(2) or (2, 5)

    }
    
}
/*Read the documentation */