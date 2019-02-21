class Q11 {

    public static void main(String[] args) {
        new SBI(2.5f, "gzb", "sbi");
        new BOI(1.4f, "delhi", "boi");
        new ICICI(3.2f, "noida", "icici");
    }
}
class bank {

    float rateOfInterest;
    String location;
    String bankName;


}

    class SBI extends bank{
         SBI(float roi, String loc, String bname) {
            this.rateOfInterest = roi;
            this.location = loc;
            this.bankName = bname;

            System.out.println(bname + " in location " + loc + " with rate of interest = " + roi);
        }
}
    class BOI extends bank{
        BOI(float roi, String loc, String bname) {
            this.rateOfInterest = roi;
            this.location = loc;
            this.bankName = bname;

            System.out.println(bname + " in location " + loc + " with rate of interest = " + roi);
    }
}
    class ICICI extends bank{
         ICICI(float roi, String loc, String bname) {
            this.rateOfInterest = roi;
            this.location = loc;
            this.bankName = bname;

            System.out.println(bname + " in location " + loc + " with rate of interest = " + roi);
    }
}

