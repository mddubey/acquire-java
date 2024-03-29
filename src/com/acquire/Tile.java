package com.acquire;

public class Tile {
    private Position position;
    private String value;

    public Tile(Position position, String value) {
        this.position = position;
        this.value = value;
    }

    public boolean isSameValue(Tile tile){
        return this.value.equals(tile.value);
    }

    public String getValue() {
        return value;
    }

    public boolean isNeighbour(Tile tileToCheck){
        return this.position.isNeigbouringPosition(tileToCheck.position);
    }
}
