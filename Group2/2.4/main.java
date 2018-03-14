class main{
    public static void main(String args []){
        System.out.println("#********DIAMOND PRINTER********#");
        System.out.println("#Rules: ");
        System.out.println("#1.Length must be an odd number");
        System.out.println("#2.Length must be between 5 - 41");
        System.out.print("#Enter side length: ");
        int longest = BIO.getInt();
        if (checkRange(longest)){
            String output = "("+longest+")";
            System.out.println("Side of diamond "+output+" must be between 5 & 41");
        }
        else if (checkEven(longest)){
            String output = "("+longest+")";
            System.out.println("Side of diamond "+output+" must be odd");
        }
        else{
            for(int row=1; row<=longest; row++){
                int stars = (2*row)-1; //Calcs number of stars
                if (stars>longest){
                    stars = 2*(longest-row+1)-1;
                }
                for(int j=0;j<(longest-stars)/2; j++){
                    System.out.print(".");
                }//Will print out dots before hand
                for(int h=0;h<stars;h++){
                    if (h ==0 || h==stars-1 ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(".");
                    }

                }//Will print out stars
                for(int g=0;g<(longest-stars)/2;g++){
                    System.out.print(".");           
                }//Will print out dots after hand
                System.out.print("\n");//Will print new line
            }
        } 
    }

    private static boolean checkEven(int side){
        if (side % 2 == 1){
            return false;
        }
        else {
            return true;
        }
    }

    private static boolean checkRange(int side){
        if (side >= 5 && side <=41){
            return false;
        }
        else {
            return true;
        }
    }
}