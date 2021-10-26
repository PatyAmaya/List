package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayListTest {

    @Test
    public void whenListIsCreated_thenSizeIsZero(){
        //given/when
        ArrayList<Integer> list = new ArrayList<>();

        //then
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAnEmptyList_whenAdd_thenElementIsAddedSuccesfully(){
        //given
        ArrayList<String> list = new ArrayList<>();

        //when
        list.add("Richy");

        //then
        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("Richy",list.getAt(0));
    }

    @Test
    public void givenAListWithAnInitialSizeOf5_thenArrayLenghtIsCorrect(){
        //given
        ArrayList<String> list = new ArrayList<>();

        //when
        //then
        Assertions.assertEquals(5,list.getListLength());
    }

    @Test
    public void givenAFullListWithAnInitialSizeOf5_whenAdd_thenArrayLenghtIsDoubled(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");
        list.add("Cuatro");
        list.add("Cinco");

        //when
        list.add("Seis");

        //then
        Assertions.assertEquals(6,list.getSize());
        Assertions.assertEquals(10,list.getListLength());
    }

    @Test
    public void givenAListWith3Elements_whenDeleteforIndex0_thenElementIsDeleted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");

        //when
        list.delete(0);

        //then
        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("Dos", list.getAt(0));
        Assertions.assertEquals("Tres", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex1_thenElementIsDeleted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");

        //when
        list.delete(1);

        //then
        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
    }

    @Test
    public void givenAListWith3Elements_whenDeleteForIndex1_thenElementIsDeleted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");

        //when
        list.delete(1);

        //then
        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Tres", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndexMinus1_thenElementIsNotDeleted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");

        //when
        list.delete(-1);

        //then
        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
    }

    @Test
    public void givenAListWith3Elements_whenDeleteforIndex3_thenElementIsNotDeleted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");

        //when
        list.delete(3);

        //then
        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
        Assertions.assertEquals("Tres", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex0_thenElementIsInserted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Dos");
        list.add("Tres");

        //when
        list.insert(0,"Uno");

        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
        Assertions.assertEquals("Tres", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex1_thenElementIsInserted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Tres");

        //when
        list.insert(1,"Dos");

        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
        Assertions.assertEquals("Tres", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex2_thenElementIsInserted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");

        //when
        list.insert(2,"Tres");

        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
        Assertions.assertEquals("Tres", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndexMinus1_thenElementIsNotInserted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");

        //when
        list.insert(-1,"MinusOne");

        //then
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex3_thenElementIsNotInserted(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");

        //when
        list.insert(3,"Tres");

        //then
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
    }

    @Test
    public void givenAFullList_whenInsertForIndex5_thenElementIsInsertedAndArrayLengthIsIncreased(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");
        list.add("Cuatro");
        list.add("Cinco");

        //when
        list.insert(5,"Seis");

        //then
        Assertions.assertEquals(6, list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
        Assertions.assertEquals("Tres", list.getAt(2));
        Assertions.assertEquals("Cuatro", list.getAt(3));
        Assertions.assertEquals("Cinco", list.getAt(4));
        Assertions.assertEquals("Seis", list.getAt(5));
        Assertions.assertEquals(10, list.getListLength());
    }

    @Test
    public void givenAFullList_whenInsertForIndex2_thenElementIsInsertedAndArrayLengthIsIncreased(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");
        list.add("Cuatro");
        list.add("Cinco");

        //when
        list.insert(2,"Seis");

        //then
        Assertions.assertEquals(6, list.getSize());
        Assertions.assertEquals("Uno", list.getAt(0));
        Assertions.assertEquals("Dos", list.getAt(1));
        Assertions.assertEquals("Seis", list.getAt(2));
        Assertions.assertEquals("Tres", list.getAt(3));
        Assertions.assertEquals("Cuatro", list.getAt(4));
        Assertions.assertEquals("Cinco", list.getAt(5));
        Assertions.assertEquals(10, list.getListLength());
    }

    @Test
    public void givenAListWithThreeElements_whenGetAt_thenElementsAreReturnedSuccesfully(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Richy");
        list.add("Luis");
        list.add("Montse");

        //when
        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Richy", list.getAt(0));
        Assertions.assertEquals("Luis", list.getAt(1));
        Assertions.assertEquals("Montse", list.getAt(2));
    }

    @Test
    public void givenAListWithThreeElements_whenGetAtForIndex3_thenElementIsNotReturned(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Richy");
        list.add("Luis");
        list.add("Montse");

        //when
        //then
        Assertions.assertNull(list.getAt(3));
    }

    @Test
    public void givenAListWithThreeElements_whenGetAtForIndexMinus1_thenElementIsNotReturned(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Richy");
        list.add("Luis");
        list.add("Montse");

        //when
        //then
        Assertions.assertNull(list.getAt(-1));
    }

    @Test
    public void givenAListWith3Elements_whenIterator_thenIterationWorksFine(){
        //given
        ArrayList<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");

        //when
        Iterator<String> it = list.getIterator();

        //then
        Assertions.assertTrue(it instanceof ArrayListIterator);

        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Uno", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Dos", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Tres", it.next());
        Assertions.assertFalse(it.hasNext());
    }
}
