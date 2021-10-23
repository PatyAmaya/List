package edu.uaslp.list.linkedlist;

import edu.uaslp.list.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void whenListIsCreated_thenSizeIsZero(){
        //given:
        LinkedList<Integer> list= new  LinkedList<>();

        //when:
        int size = list.getSize();

        //then:
        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenANewList_whenAdd_thenSizeIsOne(){
        //given
        LinkedList<String> list = new LinkedList<>();

        //when
        list.add("Mario");

        //then
        Assertions.assertEquals(1, list.getSize());
    }

    @Test
    public void givenANewListWithOneElement_whenAdd_thenSizeIsTwo(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Luis");

        //when
        list.add("Mario");

        //then
        Assertions.assertEquals(2, list.getSize());

    }

    @Test
    public void givenAListWithThreeElements_whenGetAt_thenElementsAreReturnedSuccesfully(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Luis");
        list.add("Maria");
        list.add("Pancho");

        //when
        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Luis", list.getAt(0));
        Assertions.assertEquals("Maria", list.getAt(1));
        Assertions.assertEquals("Pancho", list.getAt(2));
    }

    @Test
    public void givenAListWithThreeElements_whenGetAtForIndex4_thenNullIsReturned(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Luis");
        list.add("Maria");
        list.add("Pancho");

        //when
        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertNull(list.getAt(4));
    }

    @Test
    public void givenAnEmptyList_whenInsert_thenElementIsInsertedSuccesfully(){
        //given
        LinkedList<Float> list = new LinkedList<>();

        //when
        list.insert(0,3.5f);

        //then
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals(3.5f, list.getAt(0));
    }

    @Test
    public void whenInsertForIndexLessThanZero_thenElementIsNotInserted(){
        //given
        LinkedList<Float> list = new LinkedList<>();

        //when
        list.insert(-1,3.5f);

        //then
        Assertions.assertEquals(0, list.getSize());
    }

    @Test
    public void whenInsertForIndexGreaterThanSize_thenElementIsNotInserted(){
        //given
        LinkedList<Float> list = new LinkedList<>();

        //when
        list.insert(1,3.5f);

        //then
        Assertions.assertEquals(0, list.getSize());
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex1_thenElementIsInserted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Tercero");

        //when
        list.insert(1,"Segundo");

        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex0_thenElementIsInserted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Segundo");
        list.add("Tercero");

        //when
        list.insert(0,"Primero");

        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex2_thenElementIsInserted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");

        //when
        list.insert(2,"Tercero");

        //then
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex0_thenElementIsDeleted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");

        //when
        list.delete(0);

        //then
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("Segundo", list.getAt(0));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndexMinus1_thenElementIsNotDeleted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");

        //when
        list.delete(-1);

        //then
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex3_thenElementIsNotDeleted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");

        //when
        list.delete(3);

        //then
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex1_thenElementIsDeleted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");

        //when
        list.delete(1);

        //then
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
    }

    @Test
    public void givenAListWith3Elements_whenDeleteForIndex1_thenElementIsDeleted(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");

        //when
        list.delete(1);

        //then
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Tercero", list.getAt(1));
    }

    @Test
    public void givenAListWith3Elements_whenIterator_thenIterationWorksFine(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");

        //when
        Iterator<String> it = list.getIterator();

        //then
        Assertions.assertTrue(it instanceof LinkedListIterator);

        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Primero", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Segundo", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Tercero", it.next());
        Assertions.assertFalse(it.hasNext());
    }

    @Test
    public void givenAListWith3Elements_whenReverseIterator_thenIterationWorksFine(){
        //given
        LinkedList<String> list = new LinkedList<>();
        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");

        //when
        Iterator<String> it = list.getReverseIterator();

        //then
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Tercero", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Segundo", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Primero", it.next());
        Assertions.assertFalse(it.hasNext());
    }
}
