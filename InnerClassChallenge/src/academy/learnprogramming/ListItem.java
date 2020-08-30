package academy.learnprogramming;

import jdk.dynalink.linker.ConversionComparator;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.ListIterator;

public abstract class ListItem {

    public ListItem next;
    public ListItem previous;
    private LinkedList<Integer> item = new LinkedList<Integer>();

    public abstract void moveToNextItem();
    public abstract void backToPreviousItem();


    public LinkedList<Integer> getItem() {
        return item;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public ListItem getNext() {
        return next;
    }

    public ListItem getPrevious() {
        return previous;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }


}
