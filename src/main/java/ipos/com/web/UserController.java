package ipos.com.web;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getPermission")
    public Principal user(Principal principal) {
        return principal;
    }
}
