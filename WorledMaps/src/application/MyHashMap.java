package application;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    private class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<LinkedList<Entry<K, V>>> buckets;
    private int size;

    public MyHashMap() {
        buckets = new LinkedList<>();
        for (int i = 0; i < 16; i++) {
            buckets.add(new LinkedList<>());
        }
        size = 0;
    }

    private int hash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode() % 16); // Using a fixed capacity of 16 for simplicity
    }

    public void put(K key, V value) {
        int bucketIndex = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(bucketIndex);

        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> entry = bucket.get(i);
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int bucketIndex = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(bucketIndex);

        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> entry = bucket.get(i);
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    public boolean containsKey(K key) {
        int bucketIndex = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(bucketIndex);

        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> entry = bucket.get(i);
            if (entry.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public LinkedList<K> keySet() {
        LinkedList<K> keys = new LinkedList<>();
        for (int i = 0; i < buckets.size(); i++) {
            LinkedList<Entry<K, V>> bucket = buckets.get(i);
            for (int j = 0; j < bucket.size(); j++) {
                keys.add(bucket.get(j).key);
            }
        }
        return keys;
    }
    public LinkedList<String> getFilteredAndSortedNames() {
        LinkedList<String> names = new LinkedList<>();

        for (int i = 0; i < buckets.size(); i++) {
            LinkedList<Entry<K, V>> bucket = buckets.get(i);
            for (int j = 0; j < bucket.size(); j++) {
                V value = bucket.get(j).value;
                if (value instanceof CNode) {
                    CNode CNode = (CNode) value;
                    String name = CNode.getCity();
                    if (!Character.isDigit(name.charAt(1))) {
                        insertSorted(names, name);
                    }
                }
            }
        }

        return names;
    }

    public void remove(Object key) {
        int bucketIndex = hash((K) key);
        LinkedList<Entry<K, V>> bucket = buckets.get(bucketIndex);

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }
    private void insertSorted(LinkedList<String> names, String name) {
        if (names.isEmpty()) {
            names.add(name);
            return;
        }

        int index = 0;
        while (index < names.size() && name.compareTo(names.get(index)) > 0) {
            index++;
        }

        names.add(index, name);
    }

    public LinkedList<V> values() {
        LinkedList<V> values = new LinkedList<>();
        for (int i = 0; i < buckets.size(); i++) {
            LinkedList<Entry<K, V>> bucket = buckets.get(i);
            for (int j = 0; j < bucket.size(); j++) {
                values.add(bucket.get(j).value);
            }
        }
        return values;
    }

    public int size() {
        return size;
    }
}
