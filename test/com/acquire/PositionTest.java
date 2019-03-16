package com.acquire;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    @DisplayName("should return false for the one that is not a neighbour(which is not side to that)")
    void isNeigbouringPosition() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(2, 2);
        assertFalse(position.isNeigbouringPosition(positionToCheck));
    }


    @Test
    @DisplayName("should return true for the one that is right to the position")
    void isNeigbouringPosition1() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(3, 4);
        assertTrue(position.isNeigbouringPosition(positionToCheck));
    }

    @Test
    @DisplayName("should return true for the one that is left to the position")
    void isNeigbouringPosition2() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(3, 2);
        assertTrue(position.isNeigbouringPosition(positionToCheck));
    }

    @Test
    @DisplayName("should return true for the one that is top to the position")
    void isNeigbouringPosition3() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(2, 3);
        assertTrue(position.isNeigbouringPosition(positionToCheck));
    }

    @Test
    @DisplayName("should return true for the one that is bottom to the position")
    void isNeigbouringPosition4() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(4, 3);
        assertTrue(position.isNeigbouringPosition(positionToCheck));
    }

    @Test
    @DisplayName("should return true for the one which is having same position")
    void isSamePostion() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(3, 3);
        assertTrue(position.isSamePosition(positionToCheck));
    }

    @Test
    @DisplayName("should return false for the one which is having another position which is not same")
    void isSamePostion1() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(3, 2);
        assertFalse(position.isSamePosition(positionToCheck));
    }
}