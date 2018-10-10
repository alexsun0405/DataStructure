package com.ds.queue;

/**
 * 队列
 * @param <E>
 */
public interface Queue<E> {

    /**
     * 入队
     * O(1)
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     * O(n)
     * @return
     */
    E dequeue();

    /**
     * 获取队首元素
     * O(1)
     * @return
     */
    E getFront();

    /**
     * 队列长度
     * O(1)
     * @return
     */
    int getSize();

    /**
     * 队列是否为空
     * O(1)
     * @return
     */
    boolean isEmpty();
}
