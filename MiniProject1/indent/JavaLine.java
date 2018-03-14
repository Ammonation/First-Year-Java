/**
 * Stores a line of a Java program for later analysis
 */
class JavaLine
{
    private String java    = ""; // Java code on line
    private String comment = ""; // The single line comment
    private int    lenJava = 0;  // The line length of just the java code
    private boolean hasComment; //Checks to see if input line contains a comment

    /**
     * Constructor
     * @param line of a java program
     */
    public JavaLine( String line )
    {
        /**OWN COMMENTS
         * Need to check if line has a comment on to be able to split it
         * If there is a comment, line is split and white space removed
         * If no comment line is written to variable java and white space removed
         */
        hasComment = lineHasComment(line);
        if (hasComment){
            String split [] = line.split("//");
            java = split[0];
            comment = split[1].trim();
        }
        else {
            java = line;
        }
        lenJava = getJavaLineLength();
        

        // Split line into the Java code part 'variable java' and the // comment
        // into 'variable comment'.
        // Trailing spaces are removed from the variable 'java'
        // Record the length of the java code part of the line
        //   into the variable 'lenJava'

        // For example the line:     String s = "// comment";  // Initialise s
        // column position char: 123456789012345678901234567890123456789012345

        // would set the instance variables to be:
        //  java    ->      String s = "// comment";
        //  column:     1234567890123456789012345678 position of chars
        //  comment ->  // Initialise s
        //  lenJava ->  28
        //System.out.println("This is the line: "+line); //Used for testing purposes only
        //System.out.println("This is the java: "+java); //Used for testing purposes only
        //System.out.println("This is the comment: "+comment); //Used for testing purposes only
        //System.out.println("This is the length of the java code: "+lenJava+"\n"); //Used for testing purposes only
    }

    /**
     * Return the length of the Java part of the stored line.<PRE>
     * JavaLine j = new JavaLine("int a; // Declaration");
     * int jp = j.getJavaLineLength();
     * Would set jp the be 6</PRE>
     * @return The length of the Java code in the line
     */
    public int getJavaLineLength()
    {
        int len=java.length();
        return len;
    }

    /**
     * Return as an 'indented' line with the // comment
     * starting at column pos<PRE>
     * JavaLine j = new JavaLine("int a; // Declaration");
     * String res = j.returnLineWithCommentAt(10);
     * Would set res to be the following string:
     * int a;   // Declaration</PRE>
     * @param pos Start // comment at pos
     * @return A new version of the line with any // comment
     * starting at column pos.
     */
    public String returnLineWithCommentAt(int pos )
    {
        String output;
        //output =java+spaces(pos-lenJava)+"//"+comment; //This was used for testing purposes only
        if (hasComment){
            output = java+spaces(pos-lenJava)+"//"+comment;
        }
        else{
            output = java;
        }
        return output;
    }

    /**
     * Return a string of 'number' spaces.
     * @param number of spaces required
     * @return A string of 'number' spaces
     * The number of spaces to be added to the end of the string will be
     * findMaxJavaLine + 1 - javaLength
     */
    public String spaces( int number )
    {
        String spaces = "";
        for (int i=0;i<number;i++){
            spaces += " ";
        }       
        return spaces;
    }
    

    /**
     * This method will check if a comment is present in each line
     * If a comment is present then true will be returned
     */
    public boolean lineHasComment(String line){
        int lineLength = line.length()-1;
        for (int i = 0;i<lineLength;i++){
            char letters []= line.toCharArray();
            if(letters[i]=='/' && letters[i+1]=='/'){ //Remember to use single quotes for chars
                return true;
            }         
        }
        return false;
    }
}
