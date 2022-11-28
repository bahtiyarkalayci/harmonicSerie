public class Main {
    public static void main(String[] args) {

        double arr[]={1.0,2.0,3.0,4.0,5.0};


double division=0.0;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            division+=1/arr[i];
            double average=arr.length/division;

        }
        double average=arr.length/division;
        System.out.println("harmonic series average="+average);

    }
}