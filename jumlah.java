package pertemuan1;

public class jumlah {
    public static void main(String[] args){
        int[] nim = {2,1,4,1,7,6,2,0,0,6};
        System.out.println("NIM : 2141762006");
        System.out.print("Penambahan ");
        int total = 0;
        for (int i = 0; i < nim.length; i++) {
            System.out.print(nim[i]+" + ");
            total += nim[i];
        }
        System.out.println("");
        System.out.println("Jumlah dari nilai nim : "+total);
    }
}
