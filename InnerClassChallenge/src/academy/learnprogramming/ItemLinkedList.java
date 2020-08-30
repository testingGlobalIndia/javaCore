package academy.learnprogramming;

import java.util.LinkedList;
import java.util.ListIterator;

public class ItemLinkedList extends ListItem {




    @Override
    public void moveToNextItem() {
        getNext();
    }

    @Override
    public void backToPreviousItem() {
        getPrevious();
    }

    public void addItem(LinkedList<Integer> item, int value){
        ListIterator<Integer> listIterator = getItem().listIterator();
        int result = listIterator.next().compareTo(value);
        if(result < 0){
            listIterator.previous().
        }
    }

}
