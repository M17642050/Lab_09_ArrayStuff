import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[]args){
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        for(int i=0;i<dataPoints.length;i++){
            dataPoints[i] = rnd.nextInt(100)+1;
        }
        for(int i=0;i<dataPoints.length;i++){
            System.out.print("| "+dataPoints[i]+" ");
        }
        int arraySum = 0;
        for(int i=0;i<dataPoints.length;i++){
            arraySum += dataPoints[i];
        }
        double arrayAvg = (double) arraySum / dataPoints.length;
        System.out.println("\nThe sum of all 'dataPoints' array elements is "+arraySum+".\nThe average of all 'dataPoints' array elements is "+arrayAvg+".");
        Scanner in = new Scanner(System.in);
        int userInput = SafeInput.getRangedInt(in,"Enter an integer between, and including, 1 and 100: ",1,100);
        int dataMatch = 0;
        for(int i=0;i<dataPoints.length;i++){
            if(dataPoints[i]==userInput){
                dataMatch++;
            }
        }
        if(dataMatch==1){
            System.out.println("Your value of "+userInput+" was found "+dataMatch+" time in the 'dataPoints' array.");
        }
        else if(dataMatch==0){
            System.out.println("Your value of "+userInput+" was never found in the 'dataPoints' array.");
        }
        else {
            System.out.println("Your value of "+userInput+" was found "+dataMatch+" times in the 'dataPoints' array.");
        }
        int userInput2 = SafeInput.getRangedInt(in,"Enter another integer between, and including, 1 and 100: ",1,100);
        boolean valueFound = false;
        for(int i=0;i<dataPoints.length;i++){
            if(dataPoints[i]==userInput2){
                System.out.println("The first occurrence of "+userInput2+" was found at the index position "+i+" from the beginning of the 'dataPoints' array.");
                valueFound = true;
                break;
            }
        }
        if(!valueFound){
            System.out.println("Your value of "+userInput2+" was never found in the 'dataPoints' array.");
        }
        int min = 100;
        int max = 0;
        for(int i=0;i<dataPoints.length;i++){
            if(dataPoints[i]<min){
                min = dataPoints[i];
            }
            if(dataPoints[i]>max){
                max = dataPoints[i];
            }
        }
        System.out.println("After searching through the entire 'dataPoints' array, we have found "+min+" and "+max+" to be the minimum and maximum values, respectively.");
        System.out.println("The Average of dataPoints is: "+getAverage(dataPoints));
    }
    public static double getAverage(int values[]){
        int valuesSum = 0;
        for(int i=0;i<values.length;i++){
            valuesSum += values[i];
        }
        double valuesAvg = (double) valuesSum / values.length;
        return valuesAvg;
    }
}