class Main{
    public static void main (String args[])
    {
        System.out.print("#Please enter the length of the side of the square: ");
        int z = BIO.getInt();
        int x = z;
        while (x>0){
            //System.out.print("*");
            int y = z;
            while (y>0){
                System.out.print("*");
                y=y-1;
            }
            x=x-1;
            System.out.println();
        }
    }
}
/*This work was completed by Harry Ammon*/
