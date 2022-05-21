package com.hansol.spring.product.dao;

import com.hansol.spring.product.dto.DtaskDTO;
import com.hansol.spring.product.dto.RNRDTO;

import java.util.List;

public interface DtaskDAO {

    List<RNRDTO> selectRNRData();
    List<DtaskDTO> selectDtaskData();

    void insertDtaskData(DtaskDTO dtaskDTO);


    void deleteDtaskData(DtaskDTO dtaskDTO);
    
    //RNR 추가
}
