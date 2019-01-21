package jp.ac.uryukyu.ie.e185721;

import java.util.Random;
import java.util.Scanner;


public class Card {

    public void hand() {
        add_number();
        add_number_A();

        }
    }

    public int add_number() {
        int[] Player = new int[10];
        Random random   = new Random();
        int card_hand = 2;
        for (int i; i < card_hand; i++){
            Player[i] = random.nextInt(13) + 1;
            return i;
    }

    public void add_number_A(){
            if (Player[add_number()] == 1) {
                System.out.print("Please select 1 or 11");
                Scanner serect = new Scanner(System.in);
                String number = serect.nextLine();
                if (number.equals("1")) {
                    Player[add_number()] = 1;
                }
                if (number.equals("11")) {
                    Player[add_number()] = 11;
                }

            }

    public more(){
    }
}
