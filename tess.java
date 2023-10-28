package Myrepo;
public class tess {
   public static void main(String[] args) {

   circularLinkedList rakBuku = new circularLinkedList();
   rakBuku.add("Rak Science & Fuction");
   rakBuku.tambahBuku("Rak Science & Fuction","The Machine Stops"," E.M. Forster","Inggris","36 ","4.5 ","Science & Fiction");
   rakBuku.tambahBuku("Rak Science & Fuction","Anthem","Ayn Rand","Inggris","70","4","Science & Fiction");
   rakBuku.tambahBuku("Rak Science & Fuction","At the Earths Core","Edgar Rice Burroughs","Inggris","131","4.3","Science & Fiction"); 
   // rakBuku.printIsiRak("Rak Science & Fuction");

   rakBuku.add("Rak Biographies");
   rakBuku.tambahBuku("Rak Biographies","Adventures in Friendship","David Grayson","Inggris","140","4","Biographies");
   rakBuku.tambahBuku("Rak Biographies","Abraham Lincoln","Thomas Mears Eddy","Inggris","29","5","Biographies");
   rakBuku.tambahBuku("Rak Biographies","My Life and Work","Henry Ford","Inggris","233","4.5","Biographies");
   rakBuku.tambahBuku("Rak Biographies","Alexander The Great","Jacob Abbott","Indonesia","231","5","Biographies");
   rakBuku.tambahBuku("Rak Biographies","Walden","Henry David Thoreau","Indonesia","244","4","Biographies");

   rakBuku.tambahBuku("Rak Science & Fuction","after","The Machine Stops","A Princess of Mars ","Edgar Rice Burroughs","Inggris","176","4.5","Science & Fiction");
   rakBuku.tambahBuku("Rak Science & Fuction","before","At the Earths Core","The Mysterious Island","Julis Verne","Indonesia","492","5","Science & Fiction");
   // rakBuku.printIsiRak("Rak Biographies");
   // rakBuku.printIsiRak("Rak Science & Fuction");
   
   rakBuku.add("Rak Fantasy");
   rakBuku.tambahBuku("Rak Fantasy","Time Machine","H.G Wells","Indonesia","78","4","Fantasy");
   rakBuku.tambahBuku("Rak Fantasy","All the Way to Fairyland","Evelyn Sharp","Inggris","125","3","Fantasy");
   rakBuku.tambahBuku("Rak Fantasy","The Return of Tarzan","Edgar Rice Burroughs","Inggris","240","4.8","Fantasy");
   rakBuku.tambahBuku("Rak Fantasy","The Book of Wonder","Lord Dunsay","Indonesia","58","3.5","Fantasy");
   rakBuku.tambahBuku("Rak Fantasy","Adventures of Pinocchio","Carlo Collodi","Indonesia","136","4.2","Fantasy");
   rakBuku.tambahBuku("Rak Fantasy","after","Time Machine","Adventures of Huckleberry Finn","Mark Twain","Indonesia","305","5","Action & Adventure");
   rakBuku.printIsiRak("Rak Fantasy");

   rakBuku.add("Rak Action & Adventure");
   rakBuku.tambahBuku("Rak Action & Adventure","Fast as the wind","Nat Gould","Indonesia","172","3","Action & Adventure");
   rakBuku.tambahBuku("Rak Action & Adventure","Around The World","Jules Verne","Indonesia","198","4.5","Action & Adventure");
   rakBuku.tambahBuku("Rak Action & Adventure","A Tale of Two Cities","Charles Dickens'","Inggris","355","4.3","Action & Adventure");
   rakBuku.tambahBuku("Rak Action & Adventure","Robin Crusoe ","Daniel Defoe","Indonesia","143","4","Action & Adventure");
   // rakBuku.printIsiRak("Rak Action & Adventure");

   // rakBuku.printIsiSemuaRak();

   rakBuku.deleteBuku("Rak Fantasy", "The Return of Tarzan");
   // rakBuku.printIsiRak("Rak Fantasy");

   rakBuku.pindahRak("Rak Action & Adventure", "Rak Biographies");
   rakBuku.printIsiRak("Rak Biographies");
}
}
