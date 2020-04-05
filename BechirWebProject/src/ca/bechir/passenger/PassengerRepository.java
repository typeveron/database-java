package ca.bechir.passenger;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {

	@Query(value="SELECT c FROM Passenger c WHERE c.name LIKE '%' || keyword || '%''"
			+ "OR c.email LIKE '%' || :keyword || '%'" 	+ "OR c.birthdate LIKE '%' || :keyword || '%'" 
			+ "OR c.address LIKE '%' || :keyword || '%'" 	+ "OR c.family LIKE '%' || :keyword || '%'" 
			+ "OR c.paymentCard LIKE '%' || :keyword || '%'", nativeQuery = true)
	public List<Passenger> search(@Param("keyword") String keyword);
}
