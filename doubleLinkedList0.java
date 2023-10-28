import Node;

package Myrepo;
public class doubleLinkedList0 {
    Node head= null;
    Node tail=null;
    public void add(Object namabuku,Object penulis,Object bahasa,Object halaman,Object ratings,Object kategori){
        Node node = new Node(namabuku,penulis,bahasa,halaman,ratings,kategori);
        if (head == null){
            head = node;
            tail = node;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    public void add(Node node){
        if (head == null){
            head = node;
            tail = node;
        }else{

            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    public void addAfter(String afterNama,Object namabuku,Object penulis,Object bahasa,Object halaman,Object ratings,Object kategori){
        Node node = new Node(namabuku,penulis,bahasa,halaman,ratings,kategori);
        Node curr = head;
        while(curr!=null){
            if(curr.namaBuku==afterNama){
                break;
            }
            curr=curr.next;
        }
        if(curr.next==null){
            node.next=null;
            node.prev=curr;
            curr.next=node;
            tail = node;
            return;
        }
        node.next=curr.next;
        node.prev=curr;
        curr.next.prev=node;
        curr.next=node;
    }
    public void addBefore(String beforeNama,Object namabuku,Object penulis,Object bahasa,Object halaman,Object ratings,Object kategori){
        Node node = new Node(namabuku,penulis,bahasa,halaman,ratings,kategori);
        Node curr = tail;
        while(curr!=null){
            if(curr.namaBuku==beforeNama){
                break;
            }
            curr=curr.prev;
        }
        if(curr.prev==null){
            node.next=curr;
            node.prev=null;
            curr.prev=node;
            head = node;
            return;
        }
        node.next=curr;
        node.prev=curr.prev;
        curr.prev.next=node;
        curr.prev=node;
    }
    public void delete(Object nama){
        Node curr = head;
        while(curr!=null){
            if(curr.next.namaBuku==nama){
                break;
            }
            curr=curr.next;
        }
        if(curr.next.next==head){
            curr.next=head;
            tail=curr;
            head.prev=tail;
            return;
        }
        curr.next=curr.next.next;
        curr.next.prev=curr;
    }
    public void print(){
        Node curr = head;
        while (curr!=null){
            System.out.println("--------------------------------------");
            System.out.println("Judul Buku       : "+curr.namaBuku);
            System.out.println("Nama Penulis     : "+curr.penulis);
            System.out.println("Bahasa           : "+curr.bahasa);
            System.out.println("Jumlah halaman   : "+curr.halaman);
            System.out.println("Rating buku      : "+curr.ratings);
            System.out.println("Kategori         : "+curr.kategori);
            curr = curr.next;
        }
    }
}
