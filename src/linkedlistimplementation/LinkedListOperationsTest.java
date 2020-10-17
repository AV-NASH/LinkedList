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

    @Test
    public void givenData_return_CorrectNode() {
        Assert.assertEquals(30,linkedList.getNode(30).data);
    }

    @Test
    public void checkElemement_isInsertedAfter_ParticularElement() {

        linkedList.insert(30,40);
        Assert.assertEquals(40,linkedList.getNode(30).next.data);
    }

    @Test
    public void givenList_ReturnsCorrect_Size() {
        Assert.assertEquals(3,linkedList.size());
    }

    @Test
    public void whenRemoved_ReturnsCorrect_size() {
        linkedList.remove(30);
        Assert.assertEquals(2,linkedList.size());

    }
}