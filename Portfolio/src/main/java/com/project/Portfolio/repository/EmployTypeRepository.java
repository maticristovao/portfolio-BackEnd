package com.project.Portfolio.repository;

import com.project.Portfolio.model.EmployType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployTypeRepository extends JpaRepository<EmployType, Long> {

    List<EmployType> findAllByOrderByName();
}
