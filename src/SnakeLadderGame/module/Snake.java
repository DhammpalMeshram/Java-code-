package SnakeLadderGame.module;

public class Snake {
    int headPosition;
    int tailPosition;

    public Snake(int head, int tail){
        this.headPosition = head;
        this.tailPosition =tail;
    }

    public int getHeadPosition(){
        return headPosition;
    }
    public int getTailPosition(){
        return tailPosition;
    }
}
