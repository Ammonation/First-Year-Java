class Main{
    public static void main(String args[]){
        int size;   //This will be for where the input is stored and the counter for the main loop
        int x;      //This will be where size is copied to for the inner loop
        int y;      //This will be the variable that is used to reset the inner loop value back to the original value stored in size
        System.out.print("#What length would you like the side of the square to be?: ");
        size = BIO.getInt();
        y = size;
        //System.out.println(size+x+y);
        while (size>0){
            x=y;
            while (x>1){//Has to be 1 as the last star will be printed by the main loop 
                System.out.print("*");
                x = x-1;
            }
            System.out.println("*");
            size = size -1;
            
        }
    }
}