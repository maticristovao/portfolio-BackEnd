package com.project.Portfolio.repository;

import com.project.Portfolio.model.Province;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {

    List<Province> findByCountry_IdOrderByName(Long countryId);
}
