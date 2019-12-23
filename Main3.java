import java.util.*;
class Patient extends Main
{
    String patientname;
    Double patientweight,patientheight
    double patient(double patientweight,double patientheight)
    {
        double bmi=(patientweight/(patientheight*patientheight))*703;
        return bmi;
    }
}
class Main3
{
    public static void main(String args[])
    {
        Patient p=new Patient();
        double m=p.patient(37.0,23.5);
        System.out.println("BMI is: "+m);
        
    }
}
