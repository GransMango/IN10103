public class Prioritetskoe<E extends Comparable<E>> extends IndeksertListe<E>  {
    public void leggTil(E x) {
        if (node == null) {
            node = new Node(x);
        } else if (node.nextNode == null) {
            if (x.compareTo(node.data) >= 0) {
                node.nextNode = new Node(x);
            } if (x.compareTo(node.data) < 0) {
                Node tempNode = node;
                node = new Node(x);
                node.nextNode = tempNode;
            }
        } else {
            Node next = node;
            int count = 1;
            while (next.data.compareTo(x) > 0 || next.nextNode != null) {
                next = next.nextNode;
                count++;
            }
            leggTil(count, x);
            return;
        }

        size++;
    }

}
