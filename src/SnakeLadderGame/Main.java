package SnakeLadderGame;

import SnakeLadderGame.module.Board;
import SnakeLadderGame.module.Snake;
import SnakeLadderGame.module.Ladder;
import SnakeLadderGame.module.Player;
import SnakeLadderGame.service.GameService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int snakes = sc.nextInt();
        ArrayList<Snake> snakeList = new ArrayList<>();
        for(int i =0; i<snakes; i++){
            int head = sc.nextInt();
            int tail = sc.nextInt();
            snakeList.add(new Snake(head, tail));
        }

        int ladder = sc.nextInt();
        ArrayList<Ladder> ladderList = new ArrayList<>();
        for(int i =0; i<ladder; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            ladderList.add(new Ladder(start, end));
        }

        int player = sc.nextInt();
        ArrayList<Player> playerList = new ArrayList<>();
        for(int i=0; i<player; i++){
            String name = sc.next();
            playerList.add(new Player(name, 0));
        }

        Board board = new Board(100, snakes, ladder, player);
        board.setSnakeList(snakeList);
        board.setLadderList(ladderList);

        GameService.playGame(board,playerList);
        sc.close();
        
    }
    
}
// 9
// 62 5
// 33 6
// 49 9
// 88 16
// 41 20
// 56 53
// 98 64
// 93 73
// 95 75
// 8
// 2 37
// 27 46
// 10 32
// 51 68
// 61 79
// 65 84
// 71 91
// 81 100
// 2
// Gaurav
// Sagar