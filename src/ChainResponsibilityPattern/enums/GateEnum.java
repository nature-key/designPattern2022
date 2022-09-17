package ChainResponsibilityPattern.enums;

import ChainResponsibilityPattern.entity.GatewayEntity;

public enum  GateEnum {

    FIRSTGATEWAY(new GatewayEntity(1,"first",-1,2,"ChainResponsibilityPattern.handler.ApiLimitGatewayHandler")),
    SECONDGATEWAY(new GatewayEntity(2,"second",1,3,"ChainResponsibilityPattern.handler.BlacklistGatewayHandler")),
    THREEGATEWAY(new GatewayEntity(3,"three",2,4,"ChainResponsibilityPattern.handler.ParseGatewayHandler")),
    FOURTHGATEWAY(new GatewayEntity(4,"foure",3,-1,"ChainResponsibilityPattern.handler.RouteGatewayHandler"));


    GateEnum() {
    }

    GateEnum(GatewayEntity gatewayEntity) {
        this.gatewayEntity = gatewayEntity;
    }

    private GatewayEntity gatewayEntity;


    public GatewayEntity getGatewayEntity() {
        return gatewayEntity;
    }
}
