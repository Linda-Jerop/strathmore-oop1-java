import javax.swing.JFrame; //import the class

public class Demonstrations {
    public static void main(String args[]){
        //you may be asked to use some code to illustrate the difference between object creation and object declaration

        JFrame helloWindow; //object declaration or variable declaration

        helloWindow = new JFrame(); //object creation

        //call the first behaviour
        helloWindow.setTitle("Hello JAVA Window");
        helloWindow.setSize(300,200); //Best to use a LAYOUT MANAGER 
        helloWindow.setVisible(true); // must explicitly be called in order to render it to the user
    }
    
}

/*Please note:
Java, like JS, uses camelCase for naming but PascalCase for naming Classes
Python uses snake_case for naming variables and PascalCase for naming Classes


java.lang.String (the lang pacage, String class) is sth you can import because it was already imported in the system
String FName;

String is an object