package com.ds.queue.array;

import com.ds.queue.Queue;

/**
 * 数组队列
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    /**
     * 入队
     * @param e
     */
    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * 出队
     * @return
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**
     * 获取队首元素
     * @return
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    /**
     * 获取队列大小
     * @return
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 获取队列容量
     * @return
     */
    public int getCapacity() {
        return array.getCapacity();
    }

    /**
     * 队列是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue: ");
        stringBuilder.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (i != array.getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("] tail");
        return stringBuilder.toString();
    }
}
