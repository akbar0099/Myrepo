public class DoubleLinkedList {
    Node head = null;
    Node tail = null;
    public void Add(object NamaBuku, object Penulis, object Bahasa, object Halaman, object Rating, Object Kategori){
        Node node = new Node (NamaBuku, Penulis, Bahasa, Halaman, Rating, Kategori);
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    public void Add(Node node){
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    public void AddAfter (string AfterName, object NamaBuku, object Penulis, object Bahasa, object Halaman, Object 
    Rating, object Kategori){
        Node node = new Node (NamaBuku, Penulis, Bahasa, Halaman, Rating, Kategori);
        Node curr = head;
        while (curr! = null){
            if (curr.NamaBuku == AfterName){
                break;
            }
            curr = curr.next;
        }
        if(curr.next = null){
            node.next = null;
            node.prev = curr;
            curr.next = node;
            tail = node;
            return;
        }
        node.next = curr.next;
        node.prev = curr;
        curr.next.prev = node;
        curr.next = node;
    }
    public void AddBefore(String BeforeName, object NamaBuku, object Penulis, object Bahasa, object Halaman, object Rating, object Kategori){
        Node node = new Node(NamaBuku, Penulis, Bahasa, Halaman, Rating, Kategori);
        Node curr = tail;
        while(curr!=null){
            if(curr.NmaBuku = BeforeName){
                break;
            }
            curr = curr.prev;
        }
        if(curr.prev == null){
            node.next = curr;
            node.prev = null;
            curr.prev = node;
            head = node;
            return;
        }
        node.next = curr;
        node.prev = curr.prev;
        curr.prev.next = node;
        curr.prev = node;
    }
    public void Delete(object Naama){
        node curr = head;
        while(curr != null){
            if(curr.next.NamaBuku == Nama){
                break;
            }
            curr = curr.next;
        }
    }
}
