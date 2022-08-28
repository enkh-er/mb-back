package mn.gem.mongolbichig.repository;

import mn.gem.mongolbichig.model.Dasgal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DasgalRepository extends MongoRepository<Dasgal,String> {
}
