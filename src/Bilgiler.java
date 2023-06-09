public class Bilgiler {
    private static String name;
    private static int yas;
     public Bilgiler(String name,int yas){
        this.name=name;
        this.yas=yas;

    }
    public  void print(String name,int yas){
         System.out.println("Reisin Adi:"+name);
         System.out.println("Reisin Yasi:"+yas);

    }
    public  void print2() {
        System.out.println("Reisin Adi:"+name);
        System.out.println("Reisin Yasi:"+yas);

    }

}
