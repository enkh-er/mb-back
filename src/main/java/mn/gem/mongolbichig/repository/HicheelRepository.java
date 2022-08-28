package mn.gem.mongolbichig.repository;

import mn.gem.mongolbichig.model.Hicheel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HicheelRepository extends MongoRepository<Hicheel, String> {
}
