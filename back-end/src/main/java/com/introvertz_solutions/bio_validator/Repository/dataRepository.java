package com.introvertz_solutions.bio_validator.Repository;

import com.introvertz_solutions.bio_validator.entity.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dataRepository extends JpaRepository<data,Long> {
}
