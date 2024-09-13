package com.LearnHashmap.HashMapImplementation;

public class MapNode <K,V>{
    K key;
    V value;
    MapNode<K,V>next;

    @Override
    public String toString() {
        return "MapNode{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
