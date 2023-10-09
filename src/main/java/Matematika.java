public class Matematika {
    int penambahan = 0;
    int pengurangan = 0;
    double hasil = 0;

    //deklarasi variabel penambahan, pengurangan, dan hasil
    //dengan nilai default 0
    void penambahanMtk(int a, int b){
        penambahan = a + b;
        System.out.println("Penambahan: "+a+"+"+b+"= " +penambahan);
    }//deklarasi method penambahanMtk dengan parameter a dan b
    //di dalam method ini atribut a ditambahkan dengan b kemudian ditampilkan

    void penguranganMtk(int a, int b){
        pengurangan = a - b;
        System.out.println("Pengurangan: "+a+"-"+b+"= " +pengurangan);
    }//deklarasi method penguranganMtk dengan parameter a dan b
    //di dalam method ini atribut a dikurangi dengan b kemudian ditampilkan
}
