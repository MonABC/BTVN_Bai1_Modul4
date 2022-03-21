package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements  IProductService{
    public static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "vivo", 800, "moi","/WEB-INF/views/img/vivo.jpg" ));
        products.add(new Product(2, "iphone", 1000, "moi","/WEB-INF/views/img/iphone.jpg" ));
        products.add(new Product(3, "iphone", 1000, "moi","/WEB-INF/views/img/iphone.jpg" ));
        products.add(new Product(4, "iphone", 1000, "moi","/WEB-INF/views/img/iphone.jpg" ));
    }

    public ProductService() {
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void createProduct(Product product) {
        products.add(product);
    }

    @Override
    public int findById(int id) {
        int index = -1;
        for (int  i = 0; i<products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public Product findProductById(int id) {
        int index = -1;
        for (int i = 0; i<products.size(); i++) {
            if (products.get(i).getId() == id ) {
                index =  i;
                return products.get(index);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        int index = findById(id);
        products.set(index, product);
    }

    @Override
    public void delete(Product product) {
        products.remove(product);

    }
}
