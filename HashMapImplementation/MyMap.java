package com.LearnHashmap.HashMapImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyMap <K,V>{
List<MapNode<K,V>> bucket;
private int capacity ;
private int size;
private final int  INITIAL_CAPACITY=5;

    public MyMap() {
        bucket=new ArrayList<>();
        capacity=INITIAL_CAPACITY;
        for(int i=0;i<capacity;i++)
            bucket.add(null);
    }
     @Override
    public String toString() {
        return "MyMap{" +
                "bucket=" + bucket +
                '}';
    }
    
    private int getBucketIndex(K key){
        int hashCode =key.hashCode();
        return hashCode%capacity;
    }

    public V get(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V>mapnode=bucket.get(bucketIndex);
        while(mapnode!=null){
            if(mapnode.key.equals(key)){
                return mapnode.value;
            }
            mapnode=mapnode.next;
        }
        return null;
 }
 public void put(K key,V value){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V>mapNode=bucket.get(bucketIndex);
        while(mapNode!=null){
            if(mapNode.key.equals(key)){
                mapNode.value=value;
                return ;
            }
            mapNode=mapNode.next;
        }
        size++;
        MapNode<K,V>newEntry=new MapNode<>(key,value);
        mapNode=bucket.get(bucketIndex);
        newEntry.next=mapNode;
        bucket.set(bucketIndex,newEntry);
        double loadfactor=(size)/capacity;

        if(loadfactor>0.7){
            rehash();
        }

    }

    private void rehash(){
        System.out.println("rehashing buckets");
        List<MapNode<K,V>>temp=bucket;
        bucket=new ArrayList<>();
        capacity=2*capacity;
        for(int i=0;i<capacity;i++){
            bucket.add(null);
        }
        size=0;
        for(int i=0;i<temp.size();i++){
            MapNode<K,V>mapnode=temp.get(i);
            while(mapnode!=null){
                put(mapnode.key,mapnode.value);
                mapnode=mapnode.next;
            }
        }

    }
    public void remove(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V>mapNode=bucket.get(bucketIndex);
        MapNode<K,V>prev=null;
        while(mapNode!=null){
            if(mapNode.key.equals(key)){
                if(prev==null){
                    bucket.set(bucketIndex,mapNode.next);
                }
                else{
                    prev.next=mapNode.next;
                }
                mapNode.next=null;
                size--;
                break;
            }
        }
        prev=mapNode;
        mapNode=mapNode.next;
    }



}
