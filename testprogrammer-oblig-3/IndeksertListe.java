public class IndeksertListe<E> extends LenkeListe<E>{

    public void leggTil(int pos, E x) throws UgyldigListeindeks{
        if (! (0 <= pos && pos <=size)) {
            throw new UgyldigListeindeks(pos);
        }

        if (pos == 0) {
            Node tempNode = head;
            head = new Node(x);
            head.nextNode = tempNode;
        } else {
            Node current = head;
            for (int i = 1; i < pos; i++) {
                current = current.nextNode;
            }
            Node tempNode = current.nextNode;
            current.nextNode = new Node(x);
            current.nextNode.nextNode = tempNode;
        }
        size++;
    }

    public void sett(int pos, E x) {
        if (! (0 <= pos && pos <size)) {
            throw new UgyldigListeindeks(pos);
        }

        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.nextNode;
        }
        current.data = x;
    }

    public E hent(int pos) throws UgyldigListeindeks {
        if (! (0 <= pos && pos<size)) {
            throw new UgyldigListeindeks(pos);
        }

        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.nextNode;
        }
        return current.data;
    }

    public E fjern(int pos) throws UgyldigListeindeks{
        if (! (0 <= pos && pos<size)) {
            throw new UgyldigListeindeks(pos);
        }
        if (pos == 0) {
            return super.fjern();
        }

        Node current = head;
        for (int i = 1; i < pos; i++) {
            current = current.nextNode;
        }
        Node tempNode = current.nextNode;
        current.nextNode = tempNode.nextNode;
        size--;
        return tempNode.data;
    }
}
