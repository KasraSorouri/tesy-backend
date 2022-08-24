package com.example.tesy.observationtype;

import com.example.tesy.observation.ObservationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObservationTypeService {
    private final ObservationTypeRepository observationTypeRepository;

    @Autowired
    public ObservationTypeService(ObservationTypeRepository observationTypeRepository) {
        this.observationTypeRepository = observationTypeRepository;
    }

    public void addNewObservationTypeEntity(ObservationTypeEntity observationTypeEntity) {
    }

    public List<ObservationEntity> getObservationTypeEntitys() {
        return observationTypeRepository.findAll();
    }

    public void deleteObservationTypeEntity(Long typeId) {
    }

    public void updateObservationTypeEntity(Long typeId, String obsType_name) {
    }
}