public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Linda";
        String str3 = "You are " + str2; //+ is the join operator, aka concatenation operator. It joins two strings together.
        
        System.out.println("Welcome: " + str3); //This is a string literal. It is a string that is hard coded into the program. It is not stored in a variable.
        //METHODS:
        System.out.println(str1.length()); //This is a method call. It is a method that is called on the string object str1. It returns the length of the string.
        System.out.println(str1.toUpperCase()); //This is a method call. It is a method that is called on the string object str1. It returns the string in uppercase.
        System.out.println(str1.toLowerCase()); //This is a method call. It is a method that is called on the string object str1. It returns the string in lowercase.
        System.out.println(str1.charAt(0)); //This is a method call. It is a method that is called on the string object str1. It returns the character at the specified index. The index is zero based, so the first character is at index 0.
        System.out.println(str1.indexOf('l')); //This is a method call. It is a method that is called on the string object str1. It returns the index of the first occurrence of the specified character. If the character is not found, it returns -1.
        System.out.println(str2);
        System.out.println(str3);
    }
    
}
