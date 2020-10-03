package cotn.expense.tracker.controller;

import cotn.expense.tracker.exception.WebException;
import cotn.expense.tracker.model.UserModel;
import cotn.expense.tracker.service.UserModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:53 PM
 */
@RestController
@RequestMapping("api/user")
public class UserModelController {

    @Autowired
    UserModelService userModelService;

    @GetMapping("/version")
    public String getVersion(){
        return "the version is "+ System.getProperty("java.version");
    }

    @GetMapping("/user/version")
    public String getUserVersion(Principal principal){
        return "the version is "+ System.getProperty("java.runtime.version")+ " "+ principal.getName();
    }

    @GetMapping("/admin/version")
    public String getAdminVersion(Principal principal){
        return "the version is "+ System.getProperty("java.runtime.version")+ " "+ principal.getName();
    }

    @PostMapping("/register")
    public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userModel) {

        userModelService.createUser(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userModel);
    }

    @PostMapping("/login")
    public UserModel registerUser(@RequestParam("email") String email, @RequestParam String password) {
        return userModelService.findByEmailAndPassword(email, password);
    }

    @PutMapping("/update")
    public UserModel updateUser(@RequestBody UserModel userModel) {
        return userModelService.updateUser(userModel);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody UserModel userModel) {
        try{
            userModelService.deleteUser(userModel);
        }
        catch (WebException exception)
        {
            throw new WebException("User Model Entity is not valid");
        }

    }
}
