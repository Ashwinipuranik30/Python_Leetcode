class MyCircularDeque {
    Deque<Integer> deque;
    int maxcapacity;

    public MyCircularDeque(int k) {
        deque=new ArrayDeque<>(); 
        maxcapacity=k;     
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            deque.offerFirst(value);
            return true;
            
        }
        else{
            return false;
        }
        
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            deque.offerLast(value);
            return true;
            
        }
        else{
            return false;
        }
        
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
           deque.pollFirst();
           return true;
           
        }
        return false;
        

        
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
           deque.pollLast();
           return true;
          
        }
        return false;
        
    }
    
    public int getFront() {
        if(!isEmpty()){
            return deque.peekFirst();
        }
        return -1;  

    }
    
    
    public int getRear() {
        if(!isEmpty()){
            return deque.peekLast();
        }
        return -1; 
        
    }
    
    public boolean isEmpty() {
        return deque.size()==0;
           
        
    }
    
    public boolean isFull() {
        return deque.size()==maxcapacity;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */