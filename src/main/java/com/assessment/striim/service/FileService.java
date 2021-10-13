package com.assessment.striim.service;

import com.assessment.striim.object.request.FileDetail;
import com.assessment.striim.object.response.FileResponse;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    public FileResponse readFile(FileDetail fileDetail) {

        if (fileDetail.getCipherType() != null) {

        }

        if (fileDetail.getComDeComType() != null) {

        }
        return FileResponse.builder().status("SUCCESS").build();
    }
}
