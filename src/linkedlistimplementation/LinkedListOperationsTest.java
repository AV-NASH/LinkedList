package linkedlistimplementation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListOperationsTest {
    LinkedList linkedList;
    @Before
    public void setUp() throws Exception {
         linkedList=new LinkedList();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
    }

    @Test
    public void WhenElement_isPresent_ReturnTrue(){
        Assert.assertTrue(linkedList.search(30));
    }
}