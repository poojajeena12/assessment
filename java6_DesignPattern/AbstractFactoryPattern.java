package java6_DesignPattern;

enum CarType{

    MINI, HATCHBACK, SEDAN;

}
enum CountryName{

    INDIA, USA, CHINA;

}

abstract class CountryCar{

    CarType carType;
    CountryName countryName;

    public void CountryCar(CarType carType, CountryName countryName){

        this.carType=carType;
        this.countryName=countryName;
    }

    abstract void carDetail();

    @Override
    public String toString() {
        return "CountryCar{" +
                "carType=" + carType +
                ", countryName=" + countryName +
                '}';
    }
}

class IndianCars extends CountryCar{

    public IndianCars(CarType carType){
        super.CountryCar(carType, CountryName.INDIA);
    }
    @Override
    void carDetail() {
        System.out.println("Cars in India");
    }

}

class USACars extends CountryCar{

    public USACars(CarType carType){
        super.CountryCar(carType, CountryName.USA);
    }
    @Override
    void carDetail() {
        System.out.println("Cars in USA");
    }
}
class ChineseCars extends CountryCar{

    public ChineseCars(CarType carType){
        super.CountryCar(carType, CountryName.CHINA);
    }
    @Override
    void carDetail() {
        System.out.println("Cars in China");
    }
}

class HatchbackCarFactory{
    static CountryCar Country(CountryName countryName){
        CountryCar countryCar=null;
        switch (countryName){
            case INDIA:
                countryCar=new IndianCars(CarType.HATCHBACK);
                break;
            case USA:
                countryCar=new USACars(CarType.HATCHBACK);
                break;
            case CHINA:
                countryCar=new ChineseCars(CarType.HATCHBACK);
                break;
        }
        return countryCar;
    }
}

class MiniCarFactory{
    static CountryCar Country(CountryName countryName){
        CountryCar countryCar=null;
        switch (countryName){
            case INDIA:
                countryCar=new IndianCars(CarType.MINI);
                break;
            case USA:
                countryCar=new USACars(CarType.MINI);
                break;
            case CHINA:
               countryCar=new ChineseCars(CarType.MINI);
                break;
        }

        return countryCar;
    }
}

class SedanCarFactory{
    static CountryCar Country(CountryName countryName){
        CountryCar countryCar=null;
        switch (countryName){
            case INDIA:
                countryCar=new IndianCars(CarType.SEDAN);
                break;
            case USA:
                countryCar=new USACars(CarType.SEDAN);
                break;
            case CHINA:
                countryCar=new ChineseCars(CarType.SEDAN);
                break;
        }

        return countryCar;
    }
}

class CarCountryFactory{
    static CountryCar Country(CountryName countryName, CarType carType){
       CountryCar countryCar = null;
        switch (carType){
            case MINI:
               countryCar = MiniCarFactory.Country(countryName);
               break;

            case HATCHBACK:
                countryCar = HatchbackCarFactory.Country(countryName);
                //System.out.println("Hatchback");
                break;

            case SEDAN:
                countryCar = SedanCarFactory.Country(countryName);
                break;
        }
        return countryCar;
    }
}

public class AbstractFactoryPattern {
    public static void main(String[] args) {

        System.out.println(CarCountryFactory.Country(CountryName.USA, CarType.HATCHBACK));
    }
}
