package com.tts;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    //The diamond operators "<" and ">" specify which type of Objects the List will hold
    private List<Entry> listOfEntries;

    public AddressBook() {
        //initialize list of entries
        this.listOfEntries = new ArrayList<>();
    }

    public void add(Entry addressBookEntry) {
        //List.add adds a new Object to a List
        this.listOfEntries.add(addressBookEntry);
    }

    public void delete(int index) {
        //List.remove(int index) removes a object at the given index
        this.listOfEntries.remove(index);
    }

    public Entry get(int index) {
        //List.get(int index) returns the object at the given index
        return this.listOfEntries.get(index);
    }

    public Entry[] viewAll() {
        //create a new array with the size of our list
        Entry[] result = new Entry[this.listOfEntries.size()];

        //List.toArray(Arr[] array) fills our array with data from the list
        this.listOfEntries.toArray(result);

        //return the filled array
        return result;
    }
}