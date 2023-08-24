package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final public class Dought1
{
    public static void main(String[] args) 
    {
        Collection<String> collection=new ArrayList<String>();
        List<String>list=new ArrayList<String>();
        ArrayList<String>arrayList=new ArrayList<String>();        

        collection.add("A");
        collection.add("B");

        list.add("A");
        list.add("B");

        arrayList.add("A");
        arrayList.add("B");

        Iterator<String>collectionIterator=collection.iterator();
        Iterator<String>listIterator=list.iterator();
        Iterator<String>arrayListIterator=arrayList.iterator();

        while(collectionIterator.hasNext())
        {
            System.out.println(collectionIterator.next());
        }

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        while(arrayListIterator.hasNext())
        {
            System.out.println(arrayListIterator.next());
        }
    }
}
