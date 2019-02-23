package java2;

class barista{
 static int token=0;
     barista(){
    token++;
    System.out.println("order processing");
    }
    static void order_complete(int token){
        System.out.println("order ready for token number = " + token);
    }
}
class cashier extends barista{
    String order;
    int payment;

    public cashier(String order, int payment) {
        this.order=order;
        this.payment=payment;
    }
}
class customer extends cashier{
    String name;
    customer(String order, int payment, String name){
        super(order, payment);
        this.name=name;
    }
}

public class q10 {
    public static void main(String[] args) {

        customer customer = new customer("coffee", 100, "pooja");
        System.out.println(customer.name + " => token no.= " + barista.token + ", order name = " + customer.order);
        System.out.println("---------------------------------------------------------------------------------------");
        customer customer1 = new customer("tea", 150, "mona");
        System.out.println(customer1.name + " => token no.= " + barista.token + ", order name " + customer1.order);

        for (int i=1;i<=barista.token;i++) {
            System.out.println("---------------------------------------------------------------------------------------");
            barista.order_complete(i);
        }
    }
}
