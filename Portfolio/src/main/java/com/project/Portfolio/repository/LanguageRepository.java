package com.project.Portfolio.repository;

import com.project.Portfolio.model.Language;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

    List<Language> findAllByOrderByOralDesc();
}
