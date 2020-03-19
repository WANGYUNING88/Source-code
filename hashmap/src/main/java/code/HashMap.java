package code;

public class HashMap<K, V> implements Map<K, V> {

    private Entry[] table = null;
    int size = 0;//只记录数组的长度

    public HashMap() {
        this.table = new Entry[16];
    }

    /**
     * 1.通过key查询hash值
     * 2.hash取模下标
     * 3.下标找到数组对象
     * 4.是否为空进行储存
     *
     * @param k
     * @param v
     */
    public void put(K k, V v) {
        int index = hash(k);
        Entry<K,V> entry = table[index];
        if (entry==null) {
            table[index] = new Entry(k, v, index, null);
            size++;
        }else {
            table[index] = new Entry(k,v,index,entry);
        }
    }

    /**
     * 1.通过key查询hash值
     * 2.hash取模下标
     * 3.下标找到数组对象
     * 4.判断对象是否不为空->key hash
     * 5.不相等，遍历链表，直到找到或者为空
     * @param k
     * @return
     */
    public V get(K k) {
        int index = hash(k);
        Entry<K,V> entry = table[index];
        if (entry==null)
            return null;
        return find(k,entry);
    }

    private V find(K k, Entry<K,V> entry) {
        if (k==entry.getKey()||k.equals(entry.getKey()))
            return entry.getValue();
        if (entry.next!=null){
            return find(k,entry.next);
        }
        return null;
    }

    private int hash(K k) {
        int index = k.hashCode() % 16;
        return index >= 0 ? index : -index;
    }

    public int size() {
        return size;
    }

    class Entry<K, V> implements Map.Entry<K, V> {
        K k;
        V v;
        int hash;
        Entry<K, V> next;

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }

        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }
    }
}
