package site.metacoding.mongotest.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface NaverRepository extends MongoRepository<Naver, String> {

    @Query("{title: ?0, company: ?1}")
    List<Naver> mFindByTitleAndCompany(String title, String company);
}
