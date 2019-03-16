package com.acquire;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TileTest {

    @Test
    @DisplayName("should return true if the values of it are same")
    void isSameValue() {
        Position position = new Position(1,1);
        Tile tile = new Tile(position,"1A");
        Tile tileToCheck = new Tile(new Position(2,2),"1A");
        assertTrue(tile.isSameValue(tileToCheck));
    }

    @Test
    @DisplayName("should return false if the values of it are not same")
    void isSameValue1() {
        Position position = new Position(1,1);
        Tile tile = new Tile(position,"1A");
        Tile tileToCheck = new Tile(new Position(2,2),"2B");
        assertFalse(tile.isSameValue(tileToCheck));
    }

    @Test
    @DisplayName("should return true if it is neighbour to the tile")
    void isNeighbour() {
        Position position = new Position(1,1);
        Tile tile = new Tile(position,"1A");
        Tile tileToCheck = new Tile(new Position(1,2),"1B");
        assertTrue(tile.isNeighbour(tileToCheck));
    }

    @Test
    @DisplayName("should return false if it is not neighbour to the tile")
    void isNeighbour1() {
        Position position = new Position(1,1);
        Tile tile = new Tile(position,"1A");
        Tile tileToCheck = new Tile(new Position(2,2),"2B");
        assertFalse(tile.isNeighbour(tileToCheck));
    }
}