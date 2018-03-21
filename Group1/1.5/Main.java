class Main{
    public static void main (String args[]){
        int size;
        System.out.print("#Enter square side length: ");
        size = BIO.getInt();

        String output;
        output ="";
        for (int i = size; i>0; i--)//Logic for printing the top and bottom lines
        {
            output = output + "*";
        }
        System.out.println(output);//Top Line
        int dots = size-2;
        for (int i = dots; i>0; i--)
        {
            System.out.print("*");//Star at start of line
            for (int o = dots;o>0; o--)
            {
                System.out.print(".");//Inside Dots
            }
            System.out.println("*");//Star on the end of line    
        }
        System.out.println(output);//Bottom Line
    }
}
/*This code was written by Harry Ammon*/