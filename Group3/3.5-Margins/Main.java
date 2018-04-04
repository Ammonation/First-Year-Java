import java.util.ArrayList;
import java.util.List;
class Main{// This is my sixth attempt with the text being input line by line
    public static List <String> buildLine = new ArrayList<String>();
    public static List <Character> lettersOfLine = new ArrayList<Character>();
    public static List <String> textToBeOutput = new ArrayList<String>();
    public static void main(String args[]){
        System.out.println("#Please enter line length: ");//Triggers user action
        int width = BIO.getInt();//Uses the BIO class
        System.out.println("#Please enter string: ");//Triggers user action
        String input = BIO.getString().trim();//Gets 
        while (!input.equals("END")){
            buildLine.add(input);
            //buildLine.add(" ");
            System.out.println("#Please enter string: ");
            input = BIO.getString().trim();
        }
        for (int i = 0;i<buildLine.size();i++){
            String line = buildLine.get(i);
            for(int j = 0;j<line.length(); j++){ 
                lettersOfLine.add(line.charAt(j));
            }
            Boolean correctSize = false;
            while(!correctSize){
                if (lettersOfLine.size()<width){
                    addOneSpace();
                }
                else{
                    correctSize=true;
                }
            }
            addSpacesEvenly(width);         
        }
        for (int l=0;l<textToBeOutput.size();l++){
                String temp = textToBeOutput.get(l);
                temp=temp.replace("!"," ");
                temp=temp.replace(" ",".");
                System.out.println(temp);
        }
    }

    private static void addOneSpace(){
        int i = 0;
        while(true){
            if (lettersOfLine.get(i)==' '){
                lettersOfLine.add(i+1,'!');// ! is being used to show added spaces, remember to change to actual spaces when submitting
                break; 
            }
            else if (lettersOfLine.size()==1){
                lettersOfLine.add(' ');
            }
            else{
                i++;
            }
        }
    }

    private static void addSpacesEvenly(int width){
        int numberOfSpacesAdded=0;
        for(int i=0;i<lettersOfLine.size();i++){                
            if (lettersOfLine.get(i)=='!'){ //This counts the number of spaces that need to be added and removes the added spaces
                numberOfSpacesAdded++;
                lettersOfLine.remove(i);
                i--;               
            }
        }
        int j=0;
        while(j<numberOfSpacesAdded){
            for(int h=0;h<lettersOfLine.size();h++){
                if(lettersOfLine.get(h)==' '){
                    lettersOfLine.add(h+1, '!');
                    j++;
                }
                else if(j==numberOfSpacesAdded){
                    break;
                }
            }
        }
        String anotherTempString="";
        for (int k=0;k<width;k++){ //Loops through array adding elements to a string
            anotherTempString=anotherTempString+lettersOfLine.get(0);
            lettersOfLine.remove(0);                
        }
        textToBeOutput.add(anotherTempString);
    }
}
 