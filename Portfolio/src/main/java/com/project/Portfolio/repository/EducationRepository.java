package com.project.Portfolio.repository;

import com.project.Portfolio.model.Education;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{
    List<Education> findAllByOrderByEndDateDesc();
}
