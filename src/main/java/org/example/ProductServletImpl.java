package org.example;
public class ProductServletImpl implements ProducrServlet{
    @Override
    public void save(Product product){
        System.out.println(product);
    }
}
