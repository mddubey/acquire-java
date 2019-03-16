package com.acquire;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void isNeigbouringPosition() {
        Position position = new Position(3, 3);
        Position positionToCheck = new Position(2,3);
        assertFalse(position.isNeigbouringPosition(positionToCheck));
    }

    @Test
    void isSamePosition() {
    }
}