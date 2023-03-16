public class Stabel<E> extends LenkeListe<E>{
    @Override
    public void leggTil(E x) {
        if (head == null) {
            head = new Node(x);
        } else {
            Node tempNode = head;
            head = new Node(x);
            head.nextNode = tempNode;
        }
        size++;
    }
}
