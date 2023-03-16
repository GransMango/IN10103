public class Prioritetskoe<E extends Comparable<E>> extends LenkeListe<E> {
    @Override
    public void leggTil(E x) {
        if (head == null) {
            super.leggTil(x);
        } else if (head.data.compareTo(x) > 0) {
            Node tempNode = head;
            head = new Node(x);
            head.nextNode = tempNode;
            size++;
        } else if (head.data.compareTo(x) <= 0) {
            super.leggTil(x);
        } else {
            Node current = head; // 3
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