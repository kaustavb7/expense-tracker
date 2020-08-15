package cotn.expense.tracker.service;

import cotn.expense.tracker.model.UserDetails;
import cotn.expense.tracker.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:49 PM
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails createUser(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    @Override
    public UserDetails findByEmailAndPassword(String email, String password) {
        return userDetailsRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public UserDetails updateUser(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    @Override
    public void deleteUser(UserDetails userDetails) {
        userDetailsRepository.delete(userDetails);
    }
}
