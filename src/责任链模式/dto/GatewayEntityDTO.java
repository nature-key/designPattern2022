package 责任链模式.dto;

import 责任链模式.entity.GatewayEntity;

public interface GatewayEntityDTO {


    GatewayEntity getGateWayEntity(Integer id);

    GatewayEntity getFirstGateWayEntity();

}
