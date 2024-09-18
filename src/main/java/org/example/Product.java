package org.example;

public class Product {
    private  Integer id;
    private  String name;
    private  String subTitle;
    private  float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
   public String toString()
    {
        return "product[id="+id+",name="+name+",subTitle"+subTitle+",price="+price+"]";
    }
}
