package dataStrucutreTest;

import dataStructure.DoubleLinkedList;
import dataStructure.SingleLinkedList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleLinkedListTest {
    @Test
    public void addFirstTest(){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        Assert.assertEquals(doubleLinkedList.size(),0);
        doubleLinkedList.addFirst(20);
        doubleLinkedList.addFirst(10);
        Assert.assertEquals(doubleLinkedList.getFirst(),10);
        Assert.assertEquals(doubleLinkedList.getLast(),20);
        Assert.assertEquals(doubleLinkedList.size(),2);
    }
    @Test
    public void addLastTest(){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(10);
        doubleLinkedList.addLast(20);
        doubleLinkedList.addLast(30);
        Assert.assertEquals(doubleLinkedList.getLast(),30);
    }
    @Test
    public void searchTest(){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(10);
        doubleLinkedList.addLast(20);
        doubleLinkedList.addLast(30);
        Assert.assertTrue(doubleLinkedList.isExist(20));
        Assert.assertFalse(doubleLinkedList.isExist(40));
    }
    @Test
    public void deleteTest(){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(10);
        doubleLinkedList.addLast(20);
        doubleLinkedList.addLast(30);
        System.out.println(doubleLinkedList.isExist(30));
        doubleLinkedList.deleteValue(30);
        doubleLinkedList.deleteValue(10);
        Assert.assertEquals(doubleLinkedList.getFirst(),20);
        Assert.assertEquals(doubleLinkedList.getLast(),20);
    }

}
