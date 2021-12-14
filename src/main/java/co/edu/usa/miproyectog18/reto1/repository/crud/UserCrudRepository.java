package co.edu.usa.miproyectog18.reto1.repository.crud;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.miproyectog18.reto1.model.User;

public interface UserCrudRepository extends CrudRepository <User, Integer>{
  
   @Transactional(readOnly = true)
    public Optional <User> findByEmail(String email); 

    /*
    public Optional <User> findByEmailAndPassword(String email, String password);
*/

    public User findByEmailAndPassword(String email, String password);
}
