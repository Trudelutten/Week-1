import java.text.DecimalFormat;

public class bmi{
    public static void main (String[] args) {
        float weight, height;
        double bmi; 

        try {
            weight = Float.parseFloat(args[0]);
            height = Float.parseFloat(args[1]);  
        } catch (Exception e) {
            System.out.println("You must provide your weight in kilos and your hight in meters as commandline arguments");
            return;
        }

        //If the user likely have entered its height in cm instead of in meters
        if (height >= 100) {
            System.out.println("Did you provide your hight in cm? Or are you really " + height + "m. It is now convertet to meters. ");
            height = height/100;
        }

        //If the user likely have entered the wronge height in meters since he is taller then 3 meters  
        if (height < 100 && height > 3) {
            System.out.println( "Are you really " + height + "m? "  ); 
            System.out.println("You should first provide your weight in kilos and then your hight in meters as commandline arguments. ");
            return;
        }

        //If the user likely have changed the order of the commandline arguments
        if (height > weight && weight < 3) {
            System.out.println("It is likely that you have passed your hight as the first commandline argument and weight as the second. ");
            System.out.println("You should first provide your weight in kilos and then your hight in meters");
            return;
        }

        //If the user passes negative values
        if (height < 0 || weight < 0) {
            System.out.println("You have provided a negative value for your height or your weight, that is not physically possible. ");
            System.out.println("Please try again. ");
            System.out.println("You should first provide your weight in kilos and then your hight in meters as commandline arguments. ");
            return;
        }

        bmi = weight / (height*height);

        if (bmi < 18.5) {
            System.out.println( "The bmi calculator states that you are underweight, with a bmi of " + new DecimalFormat("#.00").format(bmi) );
        }
        else if (bmi >= 18.5 && bmi <=24.9 ) {
            System.out.println( "The bmi calculator states that you have a normal weight, with a bmi of " + new DecimalFormat("#.00").format(bmi) );
        }
        else if (bmi > 24.9 && bmi < 30) {
            System.out.println( "The bmi calculator states that you are overweight, with a bmi of " + new DecimalFormat("#.00").format(bmi) ); 
        }
        else {
            System.out.println( "The bmi calculater states that you are obese, with a bmi of " + new DecimalFormat("#.00").format(bmi) ); 
        }
    }

}