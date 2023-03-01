public class Prioritetskoe<E extends Comparable<E>> extends IndeksertListe<E> {
    @Override
    public void leggTil(E x) {
        if (node == null) {
            super.leggTil(x);
        } else {
            Node current = node; // 3
            int count = 0;
            while (true) {
                if (current.data.compareTo(x) > 0) {
                    System.out.println(current.data.compareTo(x));
                    break;
                }
                if (current.nextNode == null) {
                    count++;
                    break;
                }
                current = current.nextNode;
                count++;
            }
            super.leggTil(count, x);
        }
    }

    // SUPER BAD, FIND SOLUTION
    @Override
    public void leggTil(int pos, E x) {
        leggTil(x);
    }

}


/*
 else if (node.nextNode == null) {
         if (x.compareTo(node.data)  0) {
         node.nextNode = new Node(x);
         } else if (x.compareTo(node.data) < 0) {
        Node tempNode = node;
        node = new Node(x);
        node.nextNode = tempNode;
        }
        size++;
        }


 */