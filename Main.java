
import java.util.*;

public class Main
{
static  String loneHorse = "loneHorse";
static  String dynamicDuo = "dynamicDuo";
static  String threeMusketeer = "threeMusketeer";
static  String quadrilateral = "quadrilateral";
static Random random = new Random();
static  String[] horseArr = {loneHorse,dynamicDuo,threeMusketeer,quadrilateral};




static ArrayList<String> noDuplicates = new ArrayList<>();
    static void randomizeHorse() {


        String horse = horseArr[random.nextInt(horseArr.length)];

        if(noDuplicates.contains(horse) == false){
            noDuplicates.add(horse);
        }

        if(noDuplicates.size() < 4){
            randomizeHorse();
       }
       else{
           System.out.println(noDuplicates);
       }
        
    }

    
    public static void main(String[] args) {

        randomizeHorse();
    }


}