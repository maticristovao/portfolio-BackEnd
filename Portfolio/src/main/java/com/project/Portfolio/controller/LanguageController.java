package com.project.Portfolio.controller;

import com.project.Portfolio.model.Language;
import com.project.Portfolio.service.ILanguageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private ILanguageService langServ;

    @GetMapping("/all")
    public ResponseEntity<List<Language>> getExperiences() {
        List<Language> langList = langServ.getLanguages();
        return new ResponseEntity<>(langList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Language> addExperience(@RequestBody Language lang) {
        Language newLang = langServ.addLanguage(lang);
        return new ResponseEntity<>(newLang, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Language> updateExperience(@RequestBody Language lang) {
        Language updatedLang = langServ.updateLanguage(lang);
        return new ResponseEntity<>(updatedLang, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMapping(@PathVariable Long id) {
        langServ.deleteLanguage(id);
    }
}
