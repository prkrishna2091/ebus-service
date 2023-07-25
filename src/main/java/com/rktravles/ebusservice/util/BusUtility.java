package com.rktravles.ebusservice.util;


import java.util.Random;

public class BusUtility {

    public String generateRegNumber(){
        Random random = new Random();
        String stateCode="TS";
        int twoDigit= random.nextInt(100);

        int fourDigit = random.nextInt(10000);
        // now we will generate  2 unique alphabets
        char c = (char)('A' + random.nextInt(26));
        char c2 = (char)('A' + random.nextInt(26));

        return stateCode+" "+twoDigit+" "+c+c2+" "+fourDigit;

    }


}
