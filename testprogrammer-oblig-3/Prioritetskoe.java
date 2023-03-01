public class Prioritetskoe<E extends Comparable<E>> extends LenkeListe<E> {
    @Override
    public void leggTil(E x) {
        if (node == null) {
            super.leggTil(x);
        } else if (node.data.compareTo(x) > 0) {
            Node tempNode = node;
            node = new Node(x);
            node.nextNode = tempNode;
            size++;
        } else if (node.data.compareTo(x) <= 0) {
            super.leggTil(x);
        } else {
            Node current = node; // 3
            for (int i = 1; i < size; i++) {
                current = current.nextNode;
                if (current.data.compareTo(x) > 0) {
                    Node tempNode = current.nextNode;
                    current.nextNode = new Node(x);
                    current.nextNode.nextNode = tempNode;
                    break;
                }
            }
            size++;
        }
    }


}