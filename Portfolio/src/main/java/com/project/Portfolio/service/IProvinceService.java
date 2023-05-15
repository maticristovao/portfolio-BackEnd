package com.project.Portfolio.service;

import com.project.Portfolio.model.Province;
import java.util.List;

public interface IProvinceService {

    public List<Province> getProvinces();

    public List<Province> getProvincesByCountryId(Long id);

}
