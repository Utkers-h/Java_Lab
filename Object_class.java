
class Laptop{
    private String brand;
    private int price;

    // Overriding the tostring method  of the object class
    public String toString(){
        return "Brand name: " + brand + "\nPrice: "+ price;
    }

    Laptop(String brand , int price ){
        this.brand = brand;
        this.price= price;
    }

    public boolean equals(Laptop obj){
        return (this.brand.equals(obj.brand) && this.price == obj.price);
    }

}


public class Object_class {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop("Asus",80000);
        System.out.println(obj1);

        Laptop obj2 = new Laptop("Asus", 80000);

        System.out.println(obj1.equals(obj2));

    }
}
