package edu.uaslp.list.linkedlist;

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

}
