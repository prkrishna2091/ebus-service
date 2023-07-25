package com.rktravles.ebusservice.service.impl;

import com.rktravles.ebusservice.entity.BusEntity;
import com.rktravles.ebusservice.model.Bus;
import com.rktravles.ebusservice.repo.BusRepository;
import com.rktravles.ebusservice.service.BusService;
import com.rktravles.ebusservice.util.BusUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;


    @Override
    public List<Bus> createBus(Integer count) {

        List<BusEntity> listOfBuses = new ArrayList<>();

        BusUtility busUtility=new BusUtility();
        for(int i=1;i<=count;i++){
           BusEntity busEntity = BusEntity.builder().registerNumber(busUtility.generateRegNumber())
                            .owner("SELF")
                                    .capacity("40")
                    .serviceNumber("R"+new Random().nextInt(1000))
                    .creationDate(LocalDate.now())
                    .updateDate(LocalDate.now())
                    .build();

              BusEntity result = busRepository.save(busEntity);

              listOfBuses.add(result);
        }

        return (List<Bus>) listOfBuses.stream().map((entity)->{
            return Bus.builder().busId(entity.getBus_id().toString())
                    .busRegNumber(entity.getRegisterNumber())
                    .serviceNumber(entity.getServiceNumber())
                    .build();
          }).toList();
    }

    @Override
    public List<Bus> fetchBuses() {
      List<BusEntity> listOfBuses =  busRepository.findAll();
        return (List<Bus>) listOfBuses.stream().map((entity)->{
            return Bus.builder().busId(entity.getBus_id().toString())
                    .busRegNumber(entity.getRegisterNumber())
                    .serviceNumber(entity.getServiceNumber())
                    .owner(entity.getOwner())
                   // .creationDate(entity.getCreationDate())
                    .capacity(entity.getCapacity())
                    .build();
        }).toList();
    }
}
