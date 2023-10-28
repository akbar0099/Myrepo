import Node;

package Myrepo;
public class circularLinkedList {
    nodeRak head= null;
    nodeRak tail=null;
    public void add(String namarak){
        nodeRak node = new nodeRak(namarak);
        if (head == null){
            head = node;
            tail = node;
            head.prev=tail;
            tail.next=head;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
            tail.next=head;
            head.prev=tail;
        }
    }
    public void tambahBuku(String namaRaknya,Object namabuku,Object penulis,Object bahasa,Object halaman,Object ratings,Object kategori){
        nodeRak current=head;
        while(true){
            if(current.namaRak==namaRaknya){
                break;
            }
            current=current.next;
        }
        current.isiRak.add(namabuku, penulis, bahasa, halaman, ratings, kategori);
    }
    public void tambahBuku(String namaRaknya,String di,String nama,Object namabuku,Object penulis,Object bahasa,Object halaman,Object ratings,Object kategori){
        nodeRak current=head;
        while(true){
            if(current.namaRak==namaRaknya){
                break;
            }
            current=current.next;
        }
        if(di=="after"){
            current.isiRak.addAfter(nama, namabuku, penulis, bahasa, halaman, ratings, kategori);
        }else if(di=="before"){
            current.isiRak.addBefore(nama, namabuku, penulis, bahasa, halaman, ratings, kategori);
        }
    }
    public void deleteBuku(String namaRaknya,Object nama){
        nodeRak current=head;
        while(true){
            if(current.namaRak==namaRaknya){
                break;
            }
            current=current.next;
        }
        current.isiRak.delete(nama);
    }
    public void pindahRak(String namaRakYangDiPindah,String pindahKeRakLain){
        nodeRak current=head;
        nodeRak simpan=null;
        while(current.next!=head){
            if (current.next.namaRak==namaRakYangDiPindah) {
            simpan=current.next;
            break;
            }
            current=current.next;
        }
        if(current.next.next==head){
            current.next=head;
            head.prev=current;
        }else{
        current.next=simpan.next;
        current.next.prev=current;
        }
        current=head;
        while(current.next!=head){
            if (current.namaRak==pindahKeRakLain) {
                break;
            }
            current=current.next;
        }
        Node temp=simpan.isiRak.head;
        while (temp.next!=null) {    
            current.isiRak.add(temp);
            temp = temp.next;
        }
    } 
    public void printIsiRak(String namaRaknya){
        nodeRak current=head;
        while(true){
            if(current.namaRak==namaRaknya){
                break;
            }else if(current.next==head){
                System.out.println("Error");
                return;
            }
            current=current.next;
        }
        System.out.println("\n"+namaRaknya);
        current.isiRak.print();
    }
    public void printIsiSemuaRak(){
        nodeRak current=head;
        while (true) {
            System.out.println("\n"+current.namaRak);
            current.isiRak.print();
            current=current.next;
            if(current==head){
                break;
            }
        }
    }
}
