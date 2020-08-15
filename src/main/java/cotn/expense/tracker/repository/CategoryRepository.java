package cotn.expense.tracker.repository;

import cotn.expense.tracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kaustavbasu
 * @Date 8/12/20
 * @Time 6:28 PM
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
