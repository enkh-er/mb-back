package mn.gem.mongolbichig.repository;

import mn.gem.mongolbichig.model.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends MongoRepository<Menu,String> {
}
