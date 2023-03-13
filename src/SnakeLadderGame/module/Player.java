package SnakeLadderGame.module;

public class Player{
    String playerName;
    int currentPosition;

    public Player(String name, int currPos){
        this.playerName = name;
        this.currentPosition = currPos;
    }

    public void setCurrentPosition(int currPos){
        this.currentPosition = currPos;
    }

    public int getCurrentPosition(){
        return currentPosition;
    }
    public String getPlayerName(){
        return playerName;
    }

}