class Main
{
    public static void main (String args[])
    {
        int cw;
        int ex;
        double fMark;
        System.out.println("Please enter the students coursework mark:");
        cw = BIO.getInt();
        System.out.println("Coursework Mark = "+cw);
        System.out.println("Please enter the students exam mark:");
        ex = BIO.getInt();
        System.out.println("Exam Mark = "+ex);
        fMark = (cw + ex)/2;
        System.out.println(fMark);
    }
}