public class Prioritetskoe<E extends Comparable<E>> extends IndeksertListe<E>  {
    @Override
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
            int count = 0;
            while (true) {
                if (next.data.compareTo(x) > 0 || next.nextNode == null) {
                    System.out.println(next.data.compareTo(x));
                    System.out.println(node.data + " " + x);
                    break;
                }
                next = next.nextNode;
                count++;
            }
            leggTil(count, x);
            return;
        }

        size++;
    }

}
