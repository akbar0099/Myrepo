class Node{
    Node(Object namabuku1,Object penulis1,Object bahasa1,Object halaman1,Object ratings1,Object kategori1){
        namaBuku=namabuku1;
        penulis=penulis1;
        bahasa=bahasa1;
        halaman=halaman1;
        ratings=ratings1;
        kategori=kategori1;
    }
    Object namaBuku,penulis,bahasa,halaman,ratings,kategori;
    Node next;
    Node prev;
}