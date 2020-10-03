package cotn.expense.tracker.service;

import cotn.expense.tracker.model.UserModel;
import cotn.expense.tracker.repository.UserModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:49 PM
 */
@Service
public class UserModelServiceImpl implements UserModelService {

    @Autowired
    UserModelRepository userModelRepository;

    @Override
    public UserModel createUser(UserModel userModel) {
        return userModelRepository.save(userModel);
    }

    @Override
    public UserModel findByEmailAndPassword(String email, String password) {
        return userModelRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public UserModel updateUser(UserModel userModel) {
        return userModelRepository.save(userModel);
    }

    @Override
    public void deleteUser(UserModel userModel) {
        userModelRepository.delete(userModel);
    }
}
