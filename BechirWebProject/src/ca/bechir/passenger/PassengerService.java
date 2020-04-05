package ca.bechir.passenger;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class PassengerService {
@Autowired
private PassengerRepository repo;

public List<Passenger> listAll() {
	return (List<Passenger>) repo.findAll();
}

public void save(Passenger passenger) {
	repo.save(passenger);
}

public Passenger get(long id) {
	Optional<Passenger> result = repo.findById(id);
	return result.get();
}

public void delete(long id) {
	repo.deleteById(id);
}

public List<Passenger> search(String keyword) {
	return repo.search(keyword);
}
}
