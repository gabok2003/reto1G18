package co.edu.usa.miproyectog18.reto1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.miproyectog18.reto1.model.User;
import co.edu.usa.miproyectog18.reto1.repository.UserRepository;
//import co.edu.usa.miproyectog18.reto1.repository.crud.UserCrudRepository;

@Service
public class UserService {
    
     
    @Autowired
    private UserRepository userRepository;
    //private UserCrudRepository userCrudRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> getUser(int id) {
        return userRepository.getUser(id);
    }

    public User save(User usuario) {
        if (usuario.getId() == null) {
            return userRepository.save(usuario);
        } else {
            Optional<User> consulta = userRepository.getUser(usuario.getId());
            if (consulta.isEmpty()) {
                return userRepository.save(usuario);
            } else {
                return usuario;

            }
        }
    }


  public Boolean get_Email(String email) {
      Optional<User> email_e = userRepository.getEmailExistence(email);
      
    if (email_e.isPresent()){
        return true;
    }
    else{ return false;}
}
 /*
  public Optional<User> validacion (String email, String password){
      return userRepository.validacionEmailPassword(email, password);
  }
*/
  public User validacion (String email, String password){
    User datos =  userRepository.validacionEmailPassword(email, password);
    if (datos!=null){
        return userRepository.validacionEmailPassword(email, password);
    }
    else{
        return userRepository.userNoEncontrado(email, password);
    }
}



}