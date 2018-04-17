import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;

public class Colours{
    public static ArrayList<Color> generatedColours = new ArrayList<Color>();
    public static ArrayList<Integer> randomNum = new ArrayList<Integer>();
    public static void generate(int n){
        generateRandomNum(n*3);
        for(int i = 0;i<n;i++){
            generatedColours.add(i,new Color(randomNum.get(i+1),randomNum.get(i+2),randomNum.get(i+3)));
            //generatedColours.add(i,new Color.RED);
        }
    }
    private static void generateRandomNum(int n){
        Random random = new Random();
        for(int i = 0; i<n;i++){
            randomNum.add(i,random.nextInt(255)+1);
        }
    }

}

