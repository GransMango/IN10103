public class Prioritetskoe<E extends Comparable<E>> extends IndeksertListe  {
    /*
    public void leggTil(E x) {
        if (node == null) {
            node = new Node(x);
        } else if (node.nextNode == null) {
            if (x.compareTo(node.getData()) > 0)
        } else {
            Node next = node;
            while (next.nextNode != null) {
                next = next.nextNode;
            }
            next.nextNode = new Node(x);
        }

        size++;
    }

     */
    public void leggTil(E x) {
        Node newNode = new Node(x);
        if (node == null) {
            node = newNode;
        } else if ( < 0) {
            newNode.nextNode = node;
            node = newNode;
        } else {
            Node current = node;
            while (current.nextNode != null && current.data.com >= 0) {
                current = current.nextNode;
            }
            newNode.nextNode = current.nextNode;
            current.nextNode = newNode;
        }
        size++;
    }

}
