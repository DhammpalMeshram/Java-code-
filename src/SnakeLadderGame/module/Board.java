package SnakeLadderGame.module;
import java.util.List;

public class Board {
   int numberOfCells;
    int numberOfSnakes;
    int numberOfLadders;
    int numberOfPlayers;
    List<Snake> snakeList;
    List<Ladder> laderList;

    public Board(int cells, int snakes, int ladders, int players){
        this.numberOfCells = cells;
        this.numberOfSnakes = snakes;
        this.numberOfLadders = ladders;
        this.numberOfPlayers = players;
    }

    public void setSnakeList(List<Snake> snakeList){
        this.snakeList = snakeList;
    }
    public void setLadderList(List<Ladder> ladderList){
        this.laderList = ladderList;
    }
    public int getTotalCells(){
        return numberOfCells;
    }
    public List<Snake> getSnakeList(){
        return snakeList;
    }
    public List<Ladder> getLadderList(){
        return laderList;
    }
}
