package cotn.expense.tracker.service;

import cotn.expense.tracker.model.Category;
import cotn.expense.tracker.model.Product;
import cotn.expense.tracker.repository.CategoryRepository;
import cotn.expense.tracker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kaustavbasu
 * @Date 8/12/20
 * @Time 11:44 AM
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Product saveProduct(Product product,Long category_id) {

        Category category=new Category();
        category=categoryRepository.findById(category_id).get();
        category.setTotalExpense(category.getTotalExpense()+product.getPrice());
        category.setId(category_id);
        product.setCategory(category);
        Product productResponse=new Product();
        productResponse=productRepository.save(product);
        categoryRepository.save(category);
        return productResponse;
    }
}
