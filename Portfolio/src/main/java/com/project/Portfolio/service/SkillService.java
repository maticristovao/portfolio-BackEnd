package com.project.Portfolio.service;

import com.project.Portfolio.model.Skill;
import com.project.Portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    
    @Autowired
    private SkillRepository skillRepo;
    
    @Override
    public List<Skill> getSkills() {
        return skillRepo.findAll();
    }
    
    @Override
    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }
    
    @Override
    public Skill updateSkill(Skill skill) {
        return skillRepo.save(skill);
    }
    
    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }
    
}
