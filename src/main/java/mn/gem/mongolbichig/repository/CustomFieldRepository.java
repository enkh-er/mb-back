package mn.gem.mongolbichig.repository;

import mn.gem.mongolbichig.model.CustomField;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldRepository extends MongoRepository<CustomField,String> {
}
