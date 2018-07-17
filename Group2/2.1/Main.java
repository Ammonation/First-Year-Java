class Main{
    public static void main(String args[]){
        System.out.print("#Enter Students Name: ");
        String studentName = BIO.getString();
        //int num = BIO.getInt();
        System.out.println();
        while (!studentName.equals("END")){ //NOTE TO READ INTO THIS
            System.out.print("#Enter their module mark: "); 
            int modMark = BIO.getInt();
            if (modMark >= 40){
                System.out.println(studentName + " Pass");
            }
            else{
                System.out.println(studentName + " Fail");
            }
            System.out.print("#Enter Students Name: ");
            studentName = BIO.getString();
            System.out.println();
        }
    }
}