package az.edutech.pizzastore.store;

public class PizzaStore {

    // gettet ve setter metodlar elave edin.
    private String name;

    public PizzaStore(String name){
        this.name = name;
    }

    /*
    * Bu method sifarish vermek istediyiniz pizzanin adini ve sayini
    * sizden teleb edir. Ve neticesinde size bir cek qaytarir
    * hansi ki, orada sifarish etdiyiniz pizzanin adi sayi ve yekun mebleg eks olunur.
    * Bu metodun istifadesinde PizzaFactory-nin getPriceForPizza metodundan istifade edeceksiniz.
    * Mes: Name: Margarita, Count: 2, Price: 10.
    * */
    public String orderPizza(String pizzaName, Integer count){
        // Bu methodu implement etmelisiniz.
        return null;
    }

    /*
    Bu method butun pizza sifarish ceklerini qaytarmalidir.
    Bunun ucun butun cekleri yadda saxlamalisiniz.
    * */
    public String getAllOrderHistory(){
        return "";
    }
}
