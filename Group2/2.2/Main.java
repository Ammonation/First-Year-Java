class Main{
    static public void main (String args[]){
        System.out.print("#Enter Students Name: ");
        String stuName = BIO.getString();
        int mark;
        while (! stuName.equals("END")){
            System.out.print("#Enter Students Mark: ");
            mark = BIO.getInt();
            if (mark >= 70){
                String outMark = "["+mark+"]";
                System.out.print(stuName+" "+outMark+" "+"gains a 1st\n"); 
            
            }
            else if (mark >= 60){
                String outMark = "["+mark+"]";
                System.out.print(stuName+" "+outMark+" "+"gains a 2.1\n");
            }
            else if (mark >= 50){
                String outMark = "["+mark+"]";
                System.out.print(stuName+" "+outMark+" "+"gains a 2.2\n");
            }
            else if (mark >= 40){
                String outMark = "["+mark+"]";
                System.out.print(stuName+" "+outMark+" "+"gains a 3rd\n");
            }
            else{
                String outMark = "["+mark+"]";
                System.out.print(stuName+" "+outMark+" "+"fails\n");
            }
            System.out.print("#Enter Students Name: ");
            stuName = BIO.getString();
        }
    }
}//This code was created by Harry Ammon