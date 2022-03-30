// Time Complexity : O(1)
// Space Complexity : 0(N) ->
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : Yes, I accidently innitialied the bucket variable twice, due to which I was not able to accss the globle variable resulting divide by 0 exception.


// Your code here along with comments explaining your approach

class MyHashSet {
    
    boolean[][] arr;
    int bucket;
    int insideBucket;


    public MyHashSet() {
        bucket = 1000;
        insideBucket = 1000;
        arr = new boolean[bucket][];
        System.out.println(bucket);

    }
    

    int getBucketNumber(int key){
        return key % bucket;

    }
    
    int getInsideBucketNumber(int key){
        return key / 1000;
    }
    
    public void add(int key) {
        int bucketNumber = getBucketNumber(key);
        int insideBucketNumber = getInsideBucketNumber(key);
        
        if(arr[bucketNumber] == null){
            if (bucketNumber == 0)
                {
                    arr[bucketNumber] = new boolean[insideBucket + 1];
                }
                else
                {
                    arr[bucketNumber] = new boolean[insideBucket];
                }
            
        }
        
        arr[bucketNumber][insideBucketNumber] = true;
    }
    
    public void remove(int key) {
        int bucketNumber = getBucketNumber(key);
        int insideBucketNumber = getInsideBucketNumber(key);
        
        if(arr[bucketNumber] == null){
            return;
        }
        
        arr[bucketNumber][insideBucketNumber] = false;
    }
    
    public boolean contains(int key) {
        int bucketNumber = getBucketNumber(key);
        int insideBucketNumber = getInsideBucketNumber(key);
        
        if(arr[bucketNumber] == null){
            return false;
        }
        
        return arr[bucketNumber][insideBucketNumber];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */