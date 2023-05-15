package com.project.Portfolio.repository;

import com.project.Portfolio.model.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

    @Query("SELECT e FROM Experience e ORDER BY COALESCE(e.endDate, '9999-99') DESC")
    List<Experience> findAllByOrderByEndDateDesc();
}
