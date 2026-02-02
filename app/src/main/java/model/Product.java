
package model;

public class Product {
    private String name;
    private String category;
    private double price;
    private int imageResId;
    public Product(String name, String category, double price, int imageResId){
        this.name = name;
        this.category=category;
        this.price=price;
        this.imageResId = imageResId;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public int getImageResId(){
        return imageResId;
    }
}
