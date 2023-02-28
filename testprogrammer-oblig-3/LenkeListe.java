abstract class LenkeListe<E> implements Liste<E> {
    protected Node node;
    protected int size;
    public LenkeListe() {
        node = null;
    }

    public int stoerrelse() {
        return size;
    }

    public E hent() {
        return node.data;
    }

    public E fjern() throws UgyldigListeindeks {
        if (size == 0) {
            // Ingen indeks blir gitt, antar 0 er greit?
            throw new UgyldigListeindeks(0);
        }
        Node nextNode = node.nextNode;
        Node removeNode = node;
        node = nextNode;
        size--;
        return removeNode.data;

    }

    public void leggTil(E x) {
        if (node == null) {
            node = new Node(x);
        } else if (node.nextNode == null) {
            node.nextNode = new Node(x);
        } else {
            Node next = node;
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
        Node current = node;
        string.append(current.data + ", ");
        for(int i = 0; i < size-1; i++) {
            current = current.nextNode;
            string.append(current.data + ", ");
        }
        return string.toString();
    }
    public class Node {
        protected E data;
        protected Node nextNode;
        public Node (E data) {
            this.data = data;
            this.nextNode = null;
        }

        public E getData() {
            return data;
        }


    }
}
