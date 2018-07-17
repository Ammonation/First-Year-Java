class Main
{
    public static void main (String args[])
    {
        int cw;
        int ex;
        double mark;
        double div = 2;
        System.out.println("#Please enter the students coursework mark: ");
        cw = BIO.getInt();
        System.out.println("#Please enter the students exam mark: ");
        ex = BIO.getInt();
        mark =(cw+ex)/div;
        System.out.print("ex = "+ex+" cw = "+cw+" mark = "+mark); 
    
    }






}