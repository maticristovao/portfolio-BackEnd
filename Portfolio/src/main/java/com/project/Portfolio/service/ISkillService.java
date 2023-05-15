package com.project.Portfolio.service;

import com.project.Portfolio.model.Skill;
import java.util.List;

public interface ISkillService {

    public List<Skill> getSkills();

    public Skill addSkill(Skill skill);

    public Skill updateSkill(Skill skill);

    public void deleteSkill(Long id);
}
