package 责任链模式.enums;

import 责任链模式.entity.GatewayEntity;

public enum  GateEnum {

    FIRSTGATEWAY(new GatewayEntity(1,"first",-1,2,"责任链模式.handler.ApiLimitGatewayHandler")),
    SECONDGATEWAY(new GatewayEntity(2,"second",1,3,"责任链模式.handler.BlacklistGatewayHandler")),
    THREEGATEWAY(new GatewayEntity(3,"three",2,4,"责任链模式.handler.ParseGatewayHandler")),
    FOURTHGATEWAY(new GatewayEntity(4,"foure",3,-1,"责任链模式.handler.RouteGatewayHandler"));


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
