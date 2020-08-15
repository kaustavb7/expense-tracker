package cotn.expense.tracker.service;

import cotn.expense.tracker.model.Product;
import cotn.expense.tracker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kaustavbasu
 * @Date 8/12/20
 * @Time 11:44 AM
 */
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
