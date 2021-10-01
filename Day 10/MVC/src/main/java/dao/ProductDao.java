package dao;

import model.Product;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProductDao implements IProductDao {

    public static Map<Integer, Product> products = new LinkedHashMap<>();

    static {
        Product product1 = new Product(1, "Samsung1", "New1", 2001, "");
        Product product2 = new Product(2, "Samsung2", "New2", 2002, "");
        Product product3 = new Product(3, "Samsung3", "New3", 2003, "");
        Product product4 = new Product(4, "Samsung4", "New4", 2004, "");
        Product product5 = new Product(5, "Samsung5", "New5", 2005, "");
        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
        products.put(product4.getId(), product4);
        products.put(product5.getId(), product5);
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public void add(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id, Product product) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
