import java.util.Arrays;

public class start4 {

    public static void main(String[] args) {
        // defining

        String[] productName={"MI","ONE-PLUS","SAMSUNG"};
        //Arrays homogenous
        //fixed size
        //non-primitive
        String[] name=new String[10];
        //item accessing
        System.out.println(productName[1]);


        //print array
        System.out.println(Arrays.toString(productName));
        //edit items
        productName[0]="RealmE";
        //iterate
        for(int i=0;i<productName.length;++i){
            System.out.print(productName[i]+" ");

        }
        System.out.println("");
        // iterate through for-each loop
        for(String product: productName){
            System.out.println(product);
        }

        //2D arrays

        int[][] arr={{1,2,3},{4,5,6}};
        //print
        System.out.println(Arrays.deepToString(arr));

        //edit

        //access
        for(int[] k: arr){
            for(int f: k){
                System.out.println(f);
            }
        }


    // Strings
        char letter='s';
        char[] word={'s','o'};
        //Literal Definition
        String nameNew="Rahul";
        //Another type
        String newName=new String("Soumik Dey");
        //methods
        System.out.println(newName.charAt(1));
        System.out.println(newName.indexOf('S'));
        System.out.println(newName.length());
        System.out.println(newName.concat("Coder_trying"));
        System.out.println(newName.equals("Rahul"));
        System.out.println(newName.compareTo("Rahul"));
        System.out.println(newName.contains("ey"));
        System.out.println(newName.isBlank());
        System.out.println(Arrays.toString(newName.split(" ")));
        System.out.println(newName.toCharArray());
        System.out.println(newName.substring(2,5));








    }

}
