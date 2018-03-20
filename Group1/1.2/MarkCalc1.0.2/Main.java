class Main extends BIO
{
    public static void main (String args[])
    {
        int cw;
        int ex;
        double fMark;
        double div = 2;
        
        System.out.println("Please enter the students exam mark:");
        ex = BIO.getInt();
        System.out.println("ex = "+ex);
        System.out.println("Please enter the students coursework mark:");
        cw = BIO.getInt();
        System.out.println("cw = "+cw);
        fMark = (cw + ex)/div;
        System.out.println("mark = " +fMark);
    }
}