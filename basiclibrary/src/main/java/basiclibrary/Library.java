/*
 * This Java source file was generated by the Gradle 'init' task.
 */
    package basiclibrary;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static void main(String[] args) {
        int[] myRoll = roll(6);
        for (int i = 0; i < myRoll.length; i++) {
            System.out.println(myRoll[i]);
        }

    }

    public static int[] roll(int valueOfRoll) {
        int[] returnNewArray = new int[valueOfRoll];
        for (int i = 0; i < returnNewArray.length; i++) {
            returnNewArray[i] = (int) (Math.random() * 6 + 1);
        }
        return returnNewArray;


    }

    public static boolean containsDuplicates(int[] numElementsInx) {
        for (int i = 0; i < numElementsInx.length; i++) {
            for (int j = 1; j < numElementsInx.length; j++) {
                if (numElementsInx[i] == numElementsInx[j] && i != j) return true;
            }
        }
        return false;
    }

    public static int calculateAvg(int[] cal){
        int avg = 0;
        for(int i = 0; i < cal.length; i++){
            avg = avg + cal[i];
        }
        return avg/cal.length;
    }


    public static String arrayAvgValue(int[][] lowestArray){
        ArrayList<Integer> averages = new ArrayList<>();
        int lowestAvg = Integer.MAX_VALUE;
        int lowestAvgIndex = 0;
        int avg = 0;
        for(int i = 0; i < lowestArray.length; i++){
            int sum = 0;
            for(int j = 0; j < lowestArray[i].length; j++){
                sum += lowestArray[i][j];
                avg = sum/7;
            }
            averages.add(avg);
        }

        for(int j = 0; j < averages.size(); j++){
            if(averages.get(j) < lowestAvg){
                lowestAvg = averages.get(j);
                lowestAvgIndex = j;
            }
        }
        return Arrays.toString(lowestArray[lowestAvgIndex]);
    }

    }








