package pr2.task09;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    private static final String[] SUITS = {"Пики", "Трефы", "Бубны", "Червы"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Валет", "Дама", "Король", "Туз"};
    private static final int CARDS_PER_PLAYER = 5;

    public static void main(String[] args) {
        int deckSize = SUITS.length * RANKS.length;
        int maxPlayers = deckSize / CARDS_PER_PLAYER;
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество игроков (1-" + maxPlayers + "): ");
        int n = 0;
        while (n < 1 || n > maxPlayers) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else if (sc.hasNext()) {
                sc.next();
            } else {
                return;
            }
            if (n < 1 || n > maxPlayers) {
                System.out.print("Введите число от 1 до " + maxPlayers + ": ");
            }
        }

        String[] deck = new String[deckSize];
        for (int i = 0; i < deckSize; i++) {
            deck[i] = RANKS[i % RANKS.length] + " " + SUITS[i / RANKS.length];
        }
        // Тасование Фишера-Йетса
        Random rnd = new Random();
        for (int i = deckSize - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            String tmp = deck[i];
            deck[i] = deck[j];
            deck[j] = tmp;
        }

        for (int p = 0; p < n; p++) {
            System.out.println();
            System.out.println("Игрок " + (p + 1) + ":");
            for (int c = 0; c < CARDS_PER_PLAYER; c++) {
                System.out.println("  " + deck[p * CARDS_PER_PLAYER + c]);
            }
        }
    }
}
