package jp.ac.uryukyu.ie.e185721;

import java.util.Random;
import java.util.Scanner;


public class Player {
    int[] Player = new int[10];
    int Player_point = 0;
    Player() {
        add_number(2);
        add_card();
    }

    public int add_number(int card_hand) {

        Random random = new Random();
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
            System.out.println("Player" + (i + 1) + "枚目のカード" + Player[i]+"ポイント");
            Player_point += Player[i];
            System.out.println("The current player　score is " + Player_point + "point");

        }

        return Player_point;
    }


    public void add_card(){
        System.out.println("Please enter ｢Hit」 if you draw a card, 「Stand」 if you do not draw");
        Scanner br = new Scanner(System.in);
        String str = br.nextLine();
        while (str.equals("Stand")) {

            if (str.equals("Hit")) {
                add_number(3);
            }
            if (Player_point >= 22) {
                System.out.println("Player burst");
            }
        }
    }
}