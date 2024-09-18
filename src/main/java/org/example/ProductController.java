package org.example;

public class ProductController {
    private ProducrServlet producrServlet;

    public void setProducrServlet(ProducrServlet producrServlet)
    {
        this.producrServlet =producrServlet;
    }
    public void save(Product product)
    {
        producrServlet.save(product);
    }
}
