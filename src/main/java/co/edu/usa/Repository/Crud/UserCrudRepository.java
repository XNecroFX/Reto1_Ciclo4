package co.edu.usa.Repository.Crud;

import co.edu.usa.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author NecroF
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);  
}
