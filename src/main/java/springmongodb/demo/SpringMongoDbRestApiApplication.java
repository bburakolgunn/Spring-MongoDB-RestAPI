package springmongodb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories //Bu projede kullanılan MongoRepository enable etmemiz için kullanırız.
public class SpringMongoDbRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbRestApiApplication.class, args);
	}

}
