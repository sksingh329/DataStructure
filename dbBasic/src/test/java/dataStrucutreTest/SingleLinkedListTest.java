package dataStrucutreTest;

import dataStructure.SingleLinkedList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleLinkedListTest {
    @Test
    public void addFirstTest(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(20);
        singleLinkedList.addFirst(10);
        Assert.assertEquals(singleLinkedList.getFirst(),10);
        Assert.assertEquals(singleLinkedList.getLast(),20);
    }
    @Test
    public void addLastTest(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(10);
        singleLinkedList.addLast(20);
        singleLinkedList.addLast(30);
        Assert.assertEquals(singleLinkedList.getLast(),30);
    }
    @Test
    public void sizeTest(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(10);
        singleLinkedList.addLast(20);
        singleLinkedList.addLast(30);
        Assert.assertEquals(singleLinkedList.size(),3);
    }
    @Test
    public void deleteTest(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(10);
        singleLinkedList.addLast(20);
        singleLinkedList.addLast(30);
        singleLinkedList.deleteValue(30);
        singleLinkedList.deleteValue(10);
        Assert.assertEquals(singleLinkedList.getFirst(),20);
        Assert.assertEquals(singleLinkedList.getLast(),20);
    }
}
