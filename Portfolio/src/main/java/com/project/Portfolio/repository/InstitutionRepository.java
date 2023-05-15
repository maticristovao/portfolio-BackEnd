package com.project.Portfolio.repository;

import com.project.Portfolio.model.Institution;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    List<Institution> findAllByOrderByName();
}
