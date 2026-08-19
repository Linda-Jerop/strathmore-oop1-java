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
        System.out.println(str3.substring(0, 5)); //This is a method call. It is a method that is called on the string object str3. It returns a new string that is a substring of the original string. The substring starts at the specified index and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex - beginIndex.
        System.out.println(str3.substring(4)); //This is a method call. It is a method that is called on the string object str3. It returns a new string that is a substring of the original string. The substring starts at the specified index and extends to the end of the string. Thus the length of the substring is str.length() - beginIndex.
        System.out.println(str2.compareTo(str3)); //compareTo() method compares two strings lexicographically. It returns a negative integer, zero, or a positive integer as the first string is less than, equal to, or greater than the second string.
        System.out.println(str3.compareToIgnoreCase(str3)); //compareToIgnoreCase() method compares two strings lexicographically, ignoring case differences. It returns a negative integer, zero, or a positive integer as the first string is less than, equal to, or greater than the second string, ignoring case considerations.
        System.out.println(str3.equals(str3)); //equals() method compares two strings for content equality. It returns true if the strings are equal, and false otherwise.

        //more:
        System.out.println(str3.replace("Linda", "John")); //replace() method replaces all occurrences of a specified substring in the string with another substring. It returns a new string with the replacements made.
        System.out.println(str3.replace('L', 'l')); //replace() method replaces all occurrences of a specified character in the string with another character. It returns a new string with the replacements made.
        System.out.println(str3.trim()); //trim() method removes leading and trailing whitespace from the string. It returns a new string with the whitespace removed.
        System.out.println(str3.toCharArray()); //toCharArray() method converts the string into a new character array. It returns a new character array containing the characters of the string.
        System.out.println(str3.equalsIgnoreCase(str3)); //equalsIgnoreCase() method compares two strings for content equality, ignoring case considerations. It returns true if the strings are equal, and
        System.out.println(str2.startsWith("You"));
        System.out.println(str1.endsWith("Linda"));
        System.out.println(str1.contains("Linda"));
        System.out.println(str3.isEmpty()); //isEmpty() method checks if the string is empty (i.e., has a length of 0). It returns true if the string is empty, and false otherwise.
        System.out.println(str2.concat(" is a student")); //concat() method concatenates the specified string to the end of the original string. It returns a new string that is the result of the concatenation.
        // System.out.println(str3.split(" ")[0]); // split() method splits the string into an array of substrings based on the specified delimiter. It returns an array of strings. In this case, the delimiter is a space character (" "), so the string is split into words.
  

        System.out.println(str2);
        System.out.println(str3);
    }
    
}
