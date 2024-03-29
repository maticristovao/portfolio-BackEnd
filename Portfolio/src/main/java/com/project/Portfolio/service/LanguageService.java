package com.project.Portfolio.service;

import com.project.Portfolio.model.Language;
import com.project.Portfolio.repository.LanguageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LanguageService implements ILanguageService {
    
    @Autowired
    private LanguageRepository langRepo;
    
    @Override
    public List<Language> getLanguages() {
        return langRepo.findAllByOrderByOralDesc();
    }
    
    @Override
    public Language addLanguage(Language lang) {
        return langRepo.save(lang);
    }
    
    @Override
    public Language updateLanguage(Language lang) {
        return langRepo.save(lang);
    }
    
    @Override
    public void deleteLanguage(Long id) {
        langRepo.deleteById(id);
    }
    
}
