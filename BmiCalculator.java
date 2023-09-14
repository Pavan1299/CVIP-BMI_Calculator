import java.util.Scanner;
class BmiCalculator
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter 1 for BMI method\nEnter 2 for BMI prime method");
        int n=c.nextInt();
        double w,h,bmi=0;
        switch(n)
        {
            case 1:
                System.out.println("Enter weight in pounds(lbs) : ");
                w=c.nextDouble();
                System.out.println("Enter height in inches : ");
                h=c.nextDouble();
                bmi=(w/(h*h))*703;
                break;
            case 2:
                System.out.println("Enter weight in kilogram(kgs) : ");
                w=c.nextDouble();
                System.out.println("Enter height in meters : ");
                h=c.nextDouble();
                bmi=(w/(h*h*(h*0.5)))*1.3;
                break;
            default:
                System.out.println("Given value is not valid!!! Please try again later");
                break;
        }
        if(n==1)
        {
            if(bmi<16.0)
                System.out.println("Your are having Severe Thinness with "+bmi+" bmi value");
            else if(16.0>=bmi && bmi<17.0)
                System.out.println("Your are having Moderate Thinness with "+bmi+" bmi value");
            else if(17.0>=bmi && bmi<18.5)
                System.out.println("Your are having Mild Thinness with "+bmi+" bmi value");
            else if(18.5>=bmi && bmi<25.0)
                System.out.println("Your are having Normal with "+bmi+" bmi value");
            else if(25.0>=bmi && bmi<30.0)
                System.out.println("Your are having OverWeight with "+bmi+" bmi value");
            else if(30.0>=bmi && bmi<35.0)
                System.out.println("Your are having Obesity Class-1 with "+bmi+" bmi value");
            else if(35.0>=bmi && bmi<40.0)
                System.out.println("Your are having Obesity Class-2 with "+bmi+" bmi value");
            else 
                System.out.println("Your are having Obesity Class-3 with "+bmi+" bmi value");
        }
        else if(n==2)
        {
            if(bmi<0.64)
                System.out.println("Your are having Severe Thinness with "+bmi+" bmi value");
            else if(0.64>=bmi && bmi<0.68)
                System.out.println("Your are having Moderate Thinness with "+bmi+" bmi value");
            else if(0.68>=bmi && bmi<0.74)
                System.out.println("Your are having Mild Thinness with "+bmi+" bmi value");
            else if(0.74>=bmi && bmi<1.00)
                System.out.println("Your are having Normal with "+bmi+" bmi value");
            else if(1.00>=bmi && bmi<1.20)
                System.out.println("Your are having OverWeight with "+bmi+" bmi value");
            else if(1.20>=bmi && bmi<1.40)
                System.out.println("Your are having Obesity Class-1 with "+bmi+" bmi value");
            else if(1.40>=bmi && bmi<1.60)
                System.out.println("Your are having Obesity Class-2 with "+bmi+" bmi value");
            else 
                System.out.println("Your are having Obesity Class-3 with "+bmi+" bmi value");
        }
    }
}
