package java2;
// class class_def{
//     void print(){
//         System.out.println("NoClassDefFoundError");
//     }
// }
public class q3 {

        public static void main(String args[]) {

            try {
                Class.forName("q4");
            }catch (ClassNotFoundException e){
                System.out.println(e);
            }

        }
    }
