package cotn.expense.tracker.controller;

import cotn.expense.tracker.exception.WebException;
import cotn.expense.tracker.model.Category;
import cotn.expense.tracker.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author kaustavbasu
 * @Date 8/12/20
 * @Time 7:43 PM
 */
@RestController
@RequestMapping("api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {

        categoryService.saveCategory(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @DeleteMapping("/delete")
    public void deleteCategory(@RequestBody Category category) {
        try{
            categoryService.deleteCategory(category);
        }
        catch (WebException exception)
        {
            throw new WebException("Category Details Entity is not valid");
        }

    }
}
