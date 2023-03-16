abstract class LenkeListe<E> implements Liste<E> {
    protected Node head;
    protected int size;
    public LenkeListe() {
        head = null;
    }

    public int stoerrelse() {
        return size;
    }

    public E hent() {
        return head.data;
    }

    public E fjern() throws UgyldigListeindeks {
        if (size == 0) {
            // Ingen indeks blir gitt, antar 0 er greit?
            throw new UgyldigListeindeks(0);
        }
        Node nextNode = head.nextNode;
        Node removeNode = head;
        head = nextNode;
        size--;
        return removeNode.data;

    }

    public void leggTil(E x) {
        if (head == null) {
            head = new Node(x);
        } else {
            Node next = head;
            while(next.nextNode != null) {
                next = next.nextNode;
            }
            next.nextNode = new Node(x);
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Node current = head;
        string.append(current.data);
        if (size > 1) {
            string.append(", ");
            // tar en loop for lite, slik at det ikke ender med ","
            for (int i = 0; i < size - 2; i++) {
                current = current.nextNode;
                string.append(current.data).append(", ");
            }
            string.append(current.nextNode.data);
        }
        return string.toString();
    }

    protected class Node {
        protected E data;
        protected Node nextNode;
        public Node (E data) {
            this.data = data;
            this.nextNode = null;
        }

    }
}
