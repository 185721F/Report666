package jp.ac.uryukyu.ie.e185721;

import java.util.Random;
import java.util.Scanner;


public class Player {
    int[] Player = new int[10];

    Player() {
        add_number();
    }

    public int add_number() {
        int Player_point = 0;
        Random random = new Random();
        int card_hand = 2;
        for (int i = 0; i < card_hand; i++) {
            Player[i] += random.nextInt(13) + 1;
            if (Player[i] == 1) {
                System.out.print("Please select 1 or 11");
                Scanner serect = new Scanner(System.in);
                String number = serect.nextLine();
                if (number.equals("1")) {
                    Player[i] += 1;
                }
                if (number.equals("11")) {
                    Player[i] += 11;
                }
            if (Player[i] >= 10) {
                Player[i] += 10;
            }

            }
            Player_point += Player[i];
            System.out.println("Player" + (i + 1) + "枚目のカード" + Player_point+"ポイント");

        }
        return Player_point;

    }
}


