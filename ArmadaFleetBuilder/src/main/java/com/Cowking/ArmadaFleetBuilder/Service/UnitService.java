package com.Cowking.ArmadaFleetBuilder.Service;

import com.Cowking.ArmadaFleetBuilder.Model.Unit;
import com.Cowking.ArmadaFleetBuilder.Util.UnitSearchInfo;

public interface UnitService {
    public Iterable<Unit> findUnits(UnitSearchInfo unitSearchInfo);

}
