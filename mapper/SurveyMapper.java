package com.example.Gombuless.mapper;

import com.example.Gombuless.dao.entity.Survey;
import com.example.Gombuless.dto.request.SurveyRequest1;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SurveyMapper {
    Survey dtoToEntity(SurveyRequest1 dto);


}
