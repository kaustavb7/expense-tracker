package cotn.expense.tracker.service;

import cotn.expense.tracker.model.UserDetails;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:48 PM
 */
public interface UserDetailsService {

    public UserDetails createUser(UserDetails userDetails);

    public UserDetails findByEmailAndPassword(String email, String password);

    public UserDetails updateUser(UserDetails userDetails);

    public void deleteUser(UserDetails userDetails);
}
