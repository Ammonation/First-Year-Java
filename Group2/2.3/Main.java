class Main{
    static public void main (String args[]){
        System.out.print("#Enter Students Name: ");
        String stuName = BIO.getString();
        int exm, cwm;
        while (!stuName.equals("END")){
            System.out.print("#Enter Coursework Mark: ");
            cwm = BIO.getInt();
            System.out.print("#Enter Exam Mark: ");
            exm = BIO.getInt();
            if (fortyCheck(cwm, exm)){
                if (thresholdCheck(cwm, exm)){
                    String out = "["+cwm+","+exm+"]";
                    double mdm = (cwm+exm)/2.0;
                    System.out.println(stuName+" "+out+" "+mdm+" Pass");
                    System.out.print("#Enter Students Name: ");
                    stuName = BIO.getString();
                }
                else{
                    String out = "["+cwm+","+exm+"]";
                    double mdm = (cwm+exm)/2.0;
                    System.out.println(stuName+" "+out+" "+mdm+" Fail [Threshold]");
                    System.out.print("#Enter Students Name: ");
                    stuName = BIO.getString();
                }
            }
            else{
                String out = "["+cwm+","+exm+"]";
                double mdm = (cwm+exm)/2.0;
                System.out.println(stuName+" "+out+" "+mdm+" Fail");
                System.out.print("#Enter Students Name: ");
                stuName = BIO.getString();
            }
        }
    }
    public static boolean thresholdCheck(int cwm ,int exm){
        //System.out.println("thresholdCheck is running");
        if (cwm <= 29 || exm <= 29){
            return false;
        }
        else {
            return true;
        }
        
    }
    public static boolean fortyCheck(int cwm, int exm){
        //System.out.println("fortyCheck is running");
        int mdm = (cwm+exm)/2;
        if (mdm >= 40){
            return true;
        }
        else {
            return false;
        }
    }
}