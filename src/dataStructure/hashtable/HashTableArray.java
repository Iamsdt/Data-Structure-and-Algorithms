package dataStructure.hashtable;

public class HashTableArray<T> {

    Entry[] entries;
    int size;

    public HashTableArray(int size){
        this.size = size;
        entries = new Entry[size];

        for (int i = 0; i < size ; i++) {
            entries[i] = new Entry();
        }

    }

    int GetHash(int key){
        return key % size;
    }



}
