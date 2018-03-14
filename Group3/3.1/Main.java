class Main {
    public static void main (String args[]){
        System.out.print("#Please enter a string: ");
        String s = BIO.getString();
        while (!s.equals("END")){
            System.out.println("[ "+spaces(s)+"]"+"spaces in "+"\"" + s +"\"");
            System.out.println("#Please enter a string: ");
            s= BIO.getString();
        }
    }
    private static int spaces (String s){
        int spaces;
        spaces = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)==' '){
                spaces++;
            }
        } 
        return spaces;
    }
}