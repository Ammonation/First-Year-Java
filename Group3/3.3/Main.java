class Main{
    public static String line;
    public static void main (String args[]){
        String user;
        System.out.println("#Enter a word: ");
        user = BIO.getString();
        while (!user.equals("END")){
            //System.out.println("The while loop is running");
            line = user.trim();
            line = line.toLowerCase();
            //System.out.println(line);
            if(inOrder(line)){
                System.out.println(user+"        letters in ascending order");
            }
            else{
                System.out.println(user+"        letters not in ascending order");
            }
            
            System.out.println("#Enter a word: ");
            user = BIO.getString();
        }
    }
    private static boolean inOrder(String line){
        char letters [];
        int n=line.length();
        letters=line.toCharArray();
        for (int j=0; j<line.length(); j++) {
            for (int i = 0; i < n - 1; i++) {
                int k = i + 1;
                if (letters[i] > letters[k]) {
                    return false;
                }
                
            }
        }
        return true;
    }
}