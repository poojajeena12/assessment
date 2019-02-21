class Q6 {

    public static void main(String[] args) {

        college c1 = new college();
        c1.duplicate();
    }
}
class college{
 
	int arr3[]={2,4,6,3,2,4,3};
    	int m=arr3.length;

void duplicate(){
         int initial=0;
        for (int i=0; i<m; i++){
                initial=initial ^ arr3 [i];
            }

           System.out.println("non repeated element : " + initial);

        }
}
