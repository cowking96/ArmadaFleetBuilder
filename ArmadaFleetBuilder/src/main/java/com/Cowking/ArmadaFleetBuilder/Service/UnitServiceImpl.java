package com.Cowking.ArmadaFleetBuilder.Service;

import com.Cowking.ArmadaFleetBuilder.Model.Unit;
import com.Cowking.ArmadaFleetBuilder.Util.UnitSearchInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UnitServiceImpl implements UnitService {
    @Override
    public Iterable<Unit> findUnits(UnitSearchInfo unitSearchInfo) {
        return null;
    }
}
