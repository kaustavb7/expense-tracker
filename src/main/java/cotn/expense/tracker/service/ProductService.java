package cotn.expense.tracker.service;

import cotn.expense.tracker.model.Product;

/**
 * @author kaustavbasu
 * @Date 8/12/20
 * @Time 11:43 AM
 */
public interface ProductService {

    public Product saveProduct(Product product, Long category_id);
}
