package ChainResponsibilityPattern.test;

import ChainResponsibilityPattern.factory.GateWayHandlerFatory;
import ChainResponsibilityPattern.handler.GatewayHandler;

public class GateWayTest {

    public static void main(String[] args) {
        GatewayHandler firstGateWayhandler = GateWayHandlerFatory.getFirstGateWayhandler();
        firstGateWayhandler.handler();


    }
}
