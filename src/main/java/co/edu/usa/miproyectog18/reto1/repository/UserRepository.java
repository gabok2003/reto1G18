package co.edu.usa.miproyectog18.reto1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.miproyectog18.reto1.model.User;
import co.edu.usa.miproyectog18.reto1.repository.crud.UserCrudRepository;

@Repository
public class UserRepository {
    @Autowired
    UserCrudRepository userCrudRepository;
    
    public List<User>getAll(){
        return (List<User>)userCrudRepository.findAll();
    }

    public Optional<User>getUser(int id){
        return userCrudRepository.findById(id);
    }
    
  
    public Optional<User>getEmailExistence(String email){
        return userCrudRepository.findByEmail(email);

    }
   

    public User save (User usuario){
        return userCrudRepository.save(usuario);
    }
    /*
    public Optional<User> validacionEmailPassword(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    */
    public User validacionEmailPassword(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
}

    public User userNoEncontrado (String email, String password){
        User noDefinido= new User();
        noDefinido.setEmail(email);
        noDefinido.setPassword(password);
        noDefinido.setName("NO DEFINIDO");
        noDefinido.setId(null);

        return noDefinido;
    }

}
