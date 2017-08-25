package np_core;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by oluwalekefakorede on 29/07/2017.
 */
public class LekeLinkedList <E> {
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;
    protected transient int modCount = 0;


//    private E[] elements;

    public LekeLinkedList(){
    }
//    public E search(LekeLinkedList<E> list, E value){
//
//    }

    public E peekLast() {
        final Node<E> l = last;
        return (l == null) ? null : l.item;
    }
    public E peekFirst() {
        final Node<E> f = first;
        return (f == null) ? null : f.item;
    }
    private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }

    private E unlinkLast(Node<E> l) {
        // assert l == last && l != null;
        final E element = l.item;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        modCount++;
        return element;
    }
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
    public E pollLast() {
        final Node<E> l = last;
        return (l == null) ? null : unlinkLast(l);
    }
    public E pollFirst() {
        final Node<E> f = first;
        return (f == null) ? null : unlinkFirst(f);
    }
    public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);
    }

    public E removeLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return unlinkLast(l);
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    public int size() {
        return size;
    }

//    public E remove(int index) {
//        checkElementIndex(index);
//        return unlink(node(index));
//    } TODO

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)){}
//            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }


    private static class Node<E> {
        E item;
        LekeLinkedList.Node<E> next;
        LekeLinkedList.Node<E> prev;

        Node(LekeLinkedList.Node<E> prev, E element, LekeLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
