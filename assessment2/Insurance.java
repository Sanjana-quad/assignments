package assessment2;

import java.util.Scanner;

public class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    public Insurance(String InsuranceNo, String InsuranceName, double AmountCovered) {
        this.insuranceNo = InsuranceNo;
        this.insuranceName = InsuranceName;
        this.amountCovered = AmountCovered;
    }

    public String InsuranceNo() {
        return insuranceNo;
    }
    public String InsuranceName() {
        return insuranceName;
    }
    public double AmountCovered() {
        return amountCovered;
    }
    public void setInsuranceNo(String InsuranceNo) {
        this.insuranceNo = InsuranceNo;
    }
    public void setInsuranceName(String InsuranceName) {
        this.insuranceName = InsuranceName;
    }
    public void setAmountCovered(double AmountCovered) {
        this.amountCovered = AmountCovered;
    }
}
class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public MotorInsurance(float depPercent,String InsuranceNo, String InsuranceName, double AmountCovered) {
        super(InsuranceNo, InsuranceName, AmountCovered);
        this.depPercent = depPercent;
    }
    public double Idv(){
        return idv;
    }
    public float DepPercent(){
        return depPercent;
    }
    public void setIdv(double idv) {
        this.idv = idv;
    }
    public void setDepPercent(float depPercent) {
        this.depPercent = depPercent;
    }
    public double calculatePremium(){
        double abc;
        setIdv(AmountCovered()-(AmountCovered()*DepPercent())/100);
        abc= .03 *Idv();
        return abc;
    }
}

class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;
    public LifeInsurance(String InsuranceNo, String InsuranceName, double AmountCovered,int policyTerm, float benefitPercent) {
        super(InsuranceNo, InsuranceName, AmountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }
    public int PolicyTerm(){
        return policyTerm;
    }
    public float BenefitPercent(){
        return benefitPercent;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }
    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }
    public float calculatePremium(){
        double abc;
        abc= AmountCovered()-((AmountCovered()*BenefitPercent())/100)/PolicyTerm();
        return (float)abc;
    }
}
class Program{
    public static void main(String[] args) {
        String InsuranceNo;
        String InsuranceName;
        double AmountCovered;
        char insuranceoption;
        System.out.println("Enter Insurance No.:");
        Scanner sc = new Scanner(System.in);
        InsuranceNo = sc.nextLine();
        System.out.println("Enter Insurance Name:");
        sc = new Scanner(System.in);
        InsuranceName = sc.nextLine();
        System.out.println("Enter Amount Covered:");
        sc = new Scanner(System.in);
        AmountCovered = sc.nextFloat();
        System.out.println("Enter Insurance Option:");
        sc = new Scanner(System.in);
        insuranceoption = sc.next().charAt(0);
        if(insuranceoption == '1'){
            System.out.println("Enter policy term: ");
            sc = new Scanner(System.in);
            int policy= sc.nextInt();
            System.out.println("Enter benefit percent: ");
            sc = new Scanner(System.in);
            float benefit = sc.nextFloat();
            LifeInsurance lf=new LifeInsurance(InsuranceNo,InsuranceName,AmountCovered,policy,benefit);
            Program.addPolicy(lf,insuranceoption);
        }
        else if(insuranceoption == '2'){
            System.out.println("Enter Depreciation percentage: ");
            sc = new Scanner(System.in);
            float depPercent = sc.nextFloat();
            MotorInsurance motor=new MotorInsurance(depPercent,InsuranceNo,InsuranceName,AmountCovered);
            Program.addPolicy(motor,insuranceoption);
        }

    }

    public static void addPolicy(LifeInsurance lf, char insuranceoption) {
        System.out.println("Calculated Premium: "+lf.calculatePremium());
    }
    public static void addPolicy(MotorInsurance motor, char insuranceoption) {
        System.out.println("Calculated Premium: "+motor.calculatePremium());
    }
}
