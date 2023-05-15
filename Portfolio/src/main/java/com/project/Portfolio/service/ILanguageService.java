package com.project.Portfolio.service;

import com.project.Portfolio.model.Language;
import java.util.List;

public interface ILanguageService {

    public List<Language> getLanguages();

    public Language addLanguage(Language lang);

    public Language updateLanguage(Language lang);

    public void deleteLanguage(Long id);
}
