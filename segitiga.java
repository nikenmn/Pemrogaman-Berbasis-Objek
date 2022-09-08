package pertemuan1;

public class segitiga {
    public static void main(String[] args){
        int[] nim = {2,1,4,1,7,6,2,0,0,6};

        int i = 0;
        while (i <= nim.length){
            int j = 0;
            while (j < nim.length){
                int k = 0;
                while(k >= 0) {
                    System.out.print(" ");
                    k--;
                }
                if (nim.length - j <= i) {
                    System.out.print(nim[j]);
                }

               j++;
            }
            i++;
            System.out.println("");
        }
    }
}
