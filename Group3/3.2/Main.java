class Main{
    public static void main (String args[]){
        System.out.print("#Please enter a string: ");
        String s = BIO.getString();
        String h;
        while(!s.equals("END")){
            h = s.toLowerCase();
            System.out.println("[   "+count(h)+"] vowels in "+"\""+s+"\"");
            System.out.print("#Please enter a string: ");
            s = BIO.getString();
            
        }
    }
    private static int count(String h){
        char vowels[]="aeiou".toCharArray();
        int count=0;
        for (int i=0;i<h.length() ;i++){
            for (int n=0;n<=4;n++){
                if (h.charAt(i)== vowels[n]){
                    count++;
                }
            }
        }
        return count;
    }
}