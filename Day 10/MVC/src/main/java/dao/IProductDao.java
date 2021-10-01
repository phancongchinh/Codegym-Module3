package dao;

import model.Product;

import java.util.List;

public interface IProductDao {
    List<Product> getAllProduct();

    void add(Product product);

    void update(int id, Product product);

    void delete(int id, Product product);

    Product findById(int id);
}
