package cotn.expense.tracker.repository;

import cotn.expense.tracker.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kaustavbasu
 * @Date 8/12/20
 * @Time 11:42 AM
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
}
