package com.ds.linkedlist;

/**
 * 链表
 * @param <E>
 */
public class LinkedList<E> {

    /**
     * 虚拟头结点
     */
    private Node dummyHead;

    /**
     * 元素个数
     */
    private int size;

    public LinkedList() {
        this.dummyHead = new Node(null, null);
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表的index(0-based)位置添加新的元素e
     * 这个操作在链表中不是一个常见的操作, 练习用.
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prev = dummyHead; // 找到要添加的位置的前一个元素
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;

    }

    /**
     * 向链表的头部添加元素
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 向链表尾部添加元素
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prev = dummyHead; // 找到要删除位置的前一个元素
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        size --;
        return retNode.e;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 查找元素, 下标从0开始
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node current = dummyHead.next; // 找到要查找第index元素
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.e;
    }

    /**
     * 查找第一个元素
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 查找最后一个元素
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 修改某个位置的元素
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node current = dummyHead.next; // 找到要查找第index元素
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.e = e;
    }

    /**
     * 是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node current = dummyHead.next;
        while (current != null) {
            if (current.e.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(Node cur = dummyHead.next ; cur != null ; cur = cur.next)
            res.append(cur + "->");
        res.append("NULL");

        return res.toString();
    }

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

}
