package cotn.expense.tracker.repository;

import cotn.expense.tracker.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:46 PM
 */
public interface UserModelRepository extends JpaRepository<UserModel,Long> {

    public UserModel findByEmailAndPassword(String email, String password);

}
