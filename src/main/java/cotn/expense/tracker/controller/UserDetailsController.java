package cotn.expense.tracker.controller;

import cotn.expense.tracker.exception.WebException;
import cotn.expense.tracker.model.UserDetails;
import cotn.expense.tracker.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author kaustavbasu
 * @Date 8/7/20
 * @Time 10:53 PM
 */
@RestController
@RequestMapping("api/user")
public class UserDetailsController {

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping("/register")
    public ResponseEntity<UserDetails> registerUser(@RequestBody UserDetails userDetails) {

        userDetailsService.createUser(userDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDetails);
    }

    @PostMapping("/login")
    public UserDetails registerUser(@RequestParam("email") String email, @RequestParam String password) {
        return userDetailsService.findByEmailAndPassword(email, password);
    }

    @PutMapping("/update")
    public UserDetails updateUser(@RequestBody UserDetails userDetails) {
        return userDetailsService.updateUser(userDetails);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody UserDetails userDetails) {
        try{
            userDetailsService.deleteUser(userDetails);
        }
        catch (WebException exception)
        {
            throw new WebException("User Details Entity is not valid");
        }

    }
}
