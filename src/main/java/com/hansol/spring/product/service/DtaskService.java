package com.hansol.spring.product.service;

import com.hansol.spring.product.dto.DtaskDTO;
import com.hansol.spring.product.dto.RNRDTO;

import java.util.List;

public interface DtaskService {

    List<RNRDTO> getRNRList();
    List<DtaskDTO> getDtaskList();

    DtaskDTO insertDtaskDTO(DtaskDTO dtaskDTO);


    void deleteDtaskDTO(DtaskDTO dtaskDTO);
}
