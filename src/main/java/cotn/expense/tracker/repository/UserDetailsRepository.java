package cotn.expense.tracker.repository;

import cotn.expense.tracker.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:46 PM
 */
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

    public UserDetails findByEmailAndPassword(String email,String password);

}
