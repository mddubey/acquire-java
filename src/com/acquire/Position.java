package com.acquire;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean isNeigbouringPosition(Position positionToCheck){
        List<Position> neighbouringPositions = new ArrayList<>();
        neighbouringPositions.add(new Position(this.row+1,this.column));
        neighbouringPositions.add(new Position(this.row-1,this.column));
        neighbouringPositions.add(new Position(this.row,this.column+1));
        neighbouringPositions.add(new Position(this.row,this.column-1));
        Iterator<Position> iterator = neighbouringPositions.iterator();
        while (iterator.hasNext()){
            if(positionToCheck.isSamePosition(iterator.next())){
                return true;
            }
        }
        return false;
    }

    public boolean isSamePosition(Position position){
        return position.row == this.row && position.column == this.column;
    }
}
