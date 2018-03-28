class Main{
    public static void main (String args[])
    {
        int sn; //Student number
        int ex; //Exam Mark
        int cw; //Coursework Mark
        double mk;  //Overall Mark
        System.out.print("#Enter the student number: ");
        sn = BIO.getInt();
        while(sn != 0){
            System.out.print("#Enter the coursework mark: ");
            cw = BIO.getInt();
            System.out.print("#Enter the exam mark: ");
            ex = BIO.getInt();
            mk = (double)(cw+ex)/2;
            System.out.println("sn="+sn+" ex= "+ex+" cw= "+cw+" mark= "+mk);
            System.out.print("#Enter the student number: ");
            sn = BIO.getInt();
        }
    }
}
/*This work was completed by Harry Ammon*/