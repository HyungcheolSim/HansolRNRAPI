package com.hansol.spring.product.service;

import com.hansol.spring.product.dao.DtaskDAO;
import com.hansol.spring.product.dto.DtaskDTO;
import com.hansol.spring.product.dto.RNRDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DtaskServiceImpl implements DtaskService{

    private final DtaskDAO dtaskDAO;

    @Autowired
    public DtaskServiceImpl(DtaskDAO dtaskDAO){
        this.dtaskDAO=dtaskDAO;
    }

    @Override
    public List<RNRDTO> getRNRList() {
        return dtaskDAO.selectRNRData();
    }

    @Override
    public List<DtaskDTO> getDtaskList() {
        return dtaskDAO.selectDtaskData();
    }

    @Override
    public DtaskDTO insertDtaskDTO(DtaskDTO dtaskDTO) {
        dtaskDAO.insertDtaskData(dtaskDTO);
        return dtaskDTO;
    }

    @Override
    public void deleteDtaskDTO(DtaskDTO dtaskDTO) {
        dtaskDAO.deleteDtaskData(dtaskDTO);
    }
}
