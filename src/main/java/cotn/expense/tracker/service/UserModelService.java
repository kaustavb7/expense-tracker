package cotn.expense.tracker.service;

import cotn.expense.tracker.model.UserModel;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:48 PM
 */
public interface UserModelService {

    public UserModel createUser(UserModel userDetails);

    public UserModel findByEmailAndPassword(String email, String password);

    public UserModel updateUser(UserModel userDetails);

    public void deleteUser(UserModel userDetails);
}
