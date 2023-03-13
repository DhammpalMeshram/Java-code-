package SnakeLadderGame.service;

import SnakeLadderGame.module.Board;
import SnakeLadderGame.module.Snake;
import SnakeLadderGame.module.Ladder;
import SnakeLadderGame.module.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Random;

public class GameService {
    public static void playGame(Board board, List<Player> playerList){
        boolean gameOver = false;
        Random random = new Random();
        int min =1;
        int currentPlayerNumber = 0;
        int totalCells = board.getTotalCells();
        int totalPlayers = playerList.size();

        HashMap<Integer, Integer> snakeMap = new HashMap<>();
        for(Snake i:board.getSnakeList()){
            snakeMap.put(i.getHeadPosition(), i.getTailPosition());
        }

        HashMap<Integer, Integer> ladderMap = new HashMap<>();
        for(Ladder i:board.getLadderList()){
            ladderMap.put(i.getStartPosition(),i.getEndPosition());
        }

        while(!gameOver){
            Player playerPlaying = playerList.get(currentPlayerNumber);

            int diceNumber = random.nextInt(6)+min;
            int oldPos = playerPlaying.getCurrentPosition();
            int newPos = oldPos + diceNumber;

            if(newPos>totalCells){
                if(currentPlayerNumber+1 == totalPlayers){
                    currentPlayerNumber = 0;
                }
                else{
                    currentPlayerNumber++;
                }

                System.out.println(playerPlaying.getPlayerName()+ " has rolled a dice with number "+ diceNumber+ " and positon is out of bound i.e. from "+ oldPos+ "to" + newPos +" which is not allowed. Changing the player.");

                continue;
            }

            if(ladderMap.containsKey(newPos)){
                newPos = ladderMap.get(newPos);
            }
            if(snakeMap.containsKey(newPos)){
                newPos = snakeMap.get(newPos);
            }

            playerPlaying.setCurrentPosition(newPos);

            System.out.println(playerPlaying.getPlayerName()+" had rolled a dice with number "+diceNumber+" and position is changed from "+oldPos+" to "+newPos);

            if(newPos == totalCells){
                gameOver = true;
                System.out.println("Game over and the Winner is "+ playerPlaying.getPlayerName());
            }

            if(currentPlayerNumber+1 == totalPlayers){
                currentPlayerNumber =0;
            }
            else{
                currentPlayerNumber++;
            }
        }
    }
    
}




















