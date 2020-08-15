package cotn.expense.tracker.service;

import cotn.expense.tracker.model.Category;
import cotn.expense.tracker.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kaustavbasu
 * @Date 8/12/20
 * @Time 6:30 PM
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
