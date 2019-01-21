package jp.ac.uryukyu.ie.e185721;

import java.util.Random;
import java.util.Scanner;

public class Dealer {
    int[] Dealer = new int[10];

    Dealer() {
        add_number();
    }

    public int add_number() {
        int Dealer_point = 0;
        Random random = new Random();
        int card_hand = 2;
        for (int i = 0; i < card_hand; i++) {
            Dealer[i] += random.nextInt(13) + 1;
            if(Dealer[i] == 1){
                    Dealer[i] += 11;
                }
                if (Dealer[i] >= 10) {
                    Dealer[i] += 10;
                }
            System.out.println("Dealer" + (i + 1) + "枚目のカード" + Dealer[i]+"ポイント");
            Dealer_point += Dealer[i];
            System.out.println("The current dealer　score is " + Dealer_point + "point");

        }
        return Dealer_point;

    }
}
