package com.learn.cardatabase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.learn.cardatabase.domain.Owner;
import com.learn.cardatabase.domain.OwnerRepository;

@DataJpaTest
public class OwnerRepositoryTest {
	
	@Autowired
	private OwnerRepository orepository;
	
	@Test
	@DisplayName("Test to check save owner")
	void saveOwner() {
	    orepository.save(new Owner("Lucy", "Smith"));
	    assertThat(orepository.findByFirstname("Lucy").isPresent()).isTrue();
	}

	
	@Test
	void deleteOwners() {
	    Owner owner = orepository.save(new Owner("John", "Doe"));
	    orepository.delete(owner);

	    assertThat(orepository.findById(owner.getOwnerId()).isEmpty()).isTrue();
	}

}
