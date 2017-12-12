package ds;

class HashMapCustom <K,V> {
    private Entry<K,V>[] table;  //Array of Entry.
    private int capacity = 4;  //Initial capacity of HashMap

    public class Entry<K,V> {
        private K key;
        private V value;
        private Entry<K,V> next;

        public Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public HashMapCustom(){
        table = new Entry[capacity];
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }

    private void put(K key, V value) {
        if(key == null)
            return;

        int hash = hash(key);
        Entry<K,V> newEntry = new Entry<K,V>(key, value, null);

        if(table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K,V> current = table[hash];
            while(current.next != null)
                current = current.next;
            current.next = newEntry;
        }

    }

    private V get(K key) {
        int hash = hash(key);
        if(table[hash] == null){
            return null;
        }else{
            Entry<K,V> temp = table[hash];
            while(temp != null){
                if(temp.key.equals(key))
                    return temp.value;
                temp = temp.next; //return value corresponding to key.
            }
            return null;   //returns null if key is not found.
        }
    }

    public void delete(K key) {
        int hash = hash(key);
        Entry<K, V> previous = null;
        Entry<K, V> current = table[hash];

        if(current == null)
            return;

        if(current.key == key) {
            current = current.next;
            table[hash] = current;
            return;
        }

        while(current != null) {
            if(current.key == key) {
                previous.next = current.next;
                current = previous;
                return;
            }

            previous = current;
            current = current.next;
        }

    }

    public void display(){

        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K, V> entry=table[i];
                while(entry!=null){
                    System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
                    entry=entry.next;
                }
            }
        }

    }


    public static void main(String[] args) {
        HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<>();
        for(Integer i=0;i<15;i++){
//            String key = i.toString().concat("c");
//            System.out.println("key ====" + key);
            hashMapCustom.put(i, i+10);
        }

        System.out.println("Displaying : ");
        hashMapCustom.display();

        hashMapCustom.delete(0);

        System.out.println("Displaying : ");
        hashMapCustom.display();

    }

}