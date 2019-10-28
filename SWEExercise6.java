/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweexercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class SWEExercise6 {

    private static LinkedList<String> splitInput(String strs) {
        String[] str = strs.split(" ");
        LinkedList<String> rs = new LinkedList<>();
        rs.addAll(Arrays.asList(str));
        return rs;
    }

    private static LinkedList<String> removeRepetition(LinkedList<String> strs) {
        LinkedList<String> rs1 = new LinkedList<>();
        for (String str : strs) {
            if (!rs1.contains(str)) {
                rs1.add(str);
            }
        }

        return rs1;
    }

    private static LinkedList<String> checkRepetitive(LinkedList<String> strs) {
        LinkedList<String> repetive = new LinkedList<>();
        LinkedList<String> rs = new LinkedList<>();

        int[] indexOf = new int[strs.size()];
        for (String str : strs) {
            if (!repetive.contains(str)) {
                repetive.add(str);
            } else {
                rs.add(str);
            }
        }
        return rs;
    }

    private static String result(LinkedList<String> afterCheck, LinkedList<String> repetive) {
        String rs = "";
        for (String string : afterCheck) {
            if (!repetive.contains(string)) {
                rs += string + " ";
            } else {
                rs += "REPEAT ";
            }
        }
        return rs;
    }

    public static void main(String[] args) {

        String testCase1 = "I want to to go to the the zoo";

        String testCase2 = "playing playing game to relax relax";

        String testCase3 = "Get 3 3 dollads";

        String testCase4 = "wanna wanna play with with you ";

        String[] testCases = {testCase1, testCase2, testCase3, testCase4};

        for (String testCase : testCases) {
            
            LinkedList<String> string = removeRepetition(splitInput(testCase));

            LinkedList<String> repetitive = checkRepetitive(splitInput(testCase));

            String rs = result(string, repetitive);

            System.out.println(rs);
            
        }

    }

}
