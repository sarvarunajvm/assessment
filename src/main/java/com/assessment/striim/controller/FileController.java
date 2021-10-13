package com.assessment.striim.controller;

import com.assessment.striim.object.request.FileDetail;
import com.assessment.striim.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class FileController {

    @Autowired
    FileService fileService;

    public ResponseEntity readFile(@RequestBody @Valid FileDetail fileDetail){
        return ResponseEntity.ok(fileService.readFile(fileDetail));
    }

}
