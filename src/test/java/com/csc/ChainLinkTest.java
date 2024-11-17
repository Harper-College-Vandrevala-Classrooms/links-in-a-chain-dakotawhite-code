package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChainLinkTest {
    private LinkedList list;
    private ChainLink linkRed;
    private ChainLink linkBlue;
    private ChainLink linkGreen;

    @BeforeEach
    public void setUp() {
        list = new LinkedList();
        linkRed = new ChainLink("red");
        linkBlue = new ChainLink("blue");
        linkGreen = new ChainLink("green");
    }

    @Test
    public void testAppend() {
        list.append(linkRed);
        list.append(linkBlue);
        list.append(linkGreen);
        assertEquals("red", list.get(0).color, "Color at index 0 should be red");
        assertEquals("blue", list.get(1).color, "Color at index 1 should be blue");
        assertEquals("green", list.get(2).color, "Color at index 2 should be green");
    }

    @Test
    public void testGetElementAtValidIndex() {
        list.append(linkRed);
        list.append(linkBlue);
        ChainLink retrievedLink = list.get(1);
        assertNotNull(retrievedLink, "Retrieved link should not be null");
        assertEquals("blue", retrievedLink.color, "Color at index 1 should be blue");
    }

    @Test
    public void testGetElementAtInvalidIndex() {
        list.append(linkRed);
        list.append(linkBlue);
        ChainLink invalidLink = list.get(3);
        assertNull(invalidLink, "Retrieved link at invalid index should be null");
    }

    @Test
    public void testGetFromEmptyList() {
        ChainLink emptyLink = list.get(0);
        assertNull(emptyLink, "Retrieved link from an empty list should be null");
    }

    @Test
    public void testAppendMultipleItems() {
        list.append(linkRed);
        list.append(linkBlue);
        list.append(linkGreen);
        assertEquals("red", list.get(0).color, "Color at index 0 should be red");
        assertEquals("blue", list.get(1).color, "Color at index 1 should be blue");
        assertEquals("green", list.get(2).color, "Color at index 2 should be green");
    }
}