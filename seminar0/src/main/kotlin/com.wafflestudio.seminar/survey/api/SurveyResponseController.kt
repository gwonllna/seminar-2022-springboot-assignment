package com.wafflestudio.seminar.survey.api

import com.wafflestudio.seminar.survey.domain.SurveyResponse
import com.wafflestudio.seminar.survey.service.SurveyResponseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/surveyresponse")
class SurveyResponseController(
    private val surveyResponseService: SurveyResponseService,
) {
    
    @GetMapping("/all")
    fun findAll(): List<SurveyResponse>{
        return surveyResponseService.findAll()
    }
    
    @GetMapping("/id={id}")
    fun findById(
        @PathVariable id: Long,
    ): SurveyResponse{
        return surveyResponseService.findById(id)
    }
}