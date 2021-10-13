package com.assessment.striim.object.request;

import com.assessment.striim.object.enums.CipherEnum;
import com.assessment.striim.object.enums.ComDeComEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDetail {

    @NotNull
    private String fileName;

    private CipherEnum cipherType;

    private ComDeComEnum comDeComType;

}
