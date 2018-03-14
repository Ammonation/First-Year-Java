class Main{
    static String transfer;
    public static void main (String args []){
        String temp;
        System.out.println("#************Palindrome Checker************#");
        System.out.print("#Please enter a word: ");
        String word = BIO.getString();
        while (!word.equals("END")){            
            temp = word.trim();
            transfer = temp.toLowerCase();
            if (isPalindrome(transfer)){
                System.out.println(temp+"           is a palindrome");
            }
            else{
                System.out.println(temp+"           is not a palindrome");
            }
            System.out.print("#Please enter a word: ");
            word = BIO.getString();            
        }
    }
    private static boolean isPalindrome(String transfer){
        char letters [] = transfer.toCharArray();
        
        int k = (transfer.length()-1);
        int i = 0;
        int j = transfer.length();
        
        //if ((j % 2) == 0){
            for (int n = transfer.length()/2;n>0;n--){
                if (letters[i]==letters[k]){
                    i++;
                    k--;
                }
                else {
                    return false;
                }
            }
            return true;
        //}
        /*else{
            for (int n = transfer.length()/2;n>0;n--){
                if (letters[i]==letters[k]){
                    i++;
                    k--;
                }
                else {
                    return false;
                }
            }
            return true;   
        }*/
        //Unneserray code due to truncation that occurs when dividing an odd integer number by 2 
    }
}