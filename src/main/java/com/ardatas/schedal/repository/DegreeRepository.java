package com.ardatas.schedal.repository;

import com.ardatas.schedal.domain.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeRepository extends JpaRepository<Degree, Integer> {
}
