package service;

import dao.IProductDao;
import dao.ProductDao;
import model.Product;

import java.util.List;

public class ProductService implements IProductService {

    private IProductDao productDao = new ProductDao();

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
