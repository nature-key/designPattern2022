package ChainResponsibilityPattern.dto;

import ChainResponsibilityPattern.entity.GatewayEntity;

public interface GatewayEntityDTO {


    GatewayEntity getGateWayEntity(Integer id);

    GatewayEntity getFirstGateWayEntity();

}
