package co.edu.usa.miproyectog18.reto1.web;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.miproyectog18.reto1.model.User;
import co.edu.usa.miproyectog18.reto1.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class UserControlador {
       
    @Autowired
    private UserService userService;
        
    @GetMapping("/all")
    public List<User> getUser() {
        return userService.getAll();
    }

    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody  User usuario) {
        return userService.save(usuario);
    }
/*


@GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }



-----------------------------------
    @GetMapping("/{email}")
    public Optional<User> getEmailUsuario (@PathVariable("email")String email ){
        return userService.correo(email);
    }
@GetMapping("Hola")
public Boolean getEmailUsuariooo ( ){
    return true;
}
    @GetMapping("/{email}")
  public Boolean getExistenciaEmail(@PathVariable("email") String email){
        return getExistenciaEmail(email);
    }
-------------------------------

--------------------------------





**/


/**
 * @GetMapping("/{email}")
public Optional<User> conseguirEmail(@PathVariable("email") String email) {
    return userService.conseguirEmail(email);
} 


*/

@GetMapping("/{email}")
public Boolean get_Email(@PathVariable("email") String email) {
    return userService.get_Email(email);
}


/** 
@GetMapping("/{email}/{password}")
public  Optional<User> validacionFinal (@PathVariable("email") String email,@PathVariable("password") String password) {
    return userService.validacion(email, password);
}
*/
@GetMapping("/{email}/{password}")
public  User validacionFinal (@PathVariable("email") String email,@PathVariable("password") String password) {
    return userService.validacion(email, password);
}

}
