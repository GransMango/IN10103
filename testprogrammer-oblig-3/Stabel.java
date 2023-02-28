public class Stabel<E> extends LenkeListe<E>{
    @Override
    public void leggTil(E x) {
        if (node == null) {
            node = new Node(x);
        } else {
            Node tempNode = node;
            node = new Node(x);
            node.nextNode = tempNode;
        }

        size++;
    }
}
