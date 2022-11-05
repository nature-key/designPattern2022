package 责任链模式.test;

import 责任链模式.factory.GateWayHandlerFatory;
import 责任链模式.handler.GatewayHandler;

public class GateWayTest {

    public static void main(String[] args) {
        GatewayHandler firstGateWayhandler = GateWayHandlerFatory.getFirstGateWayhandler();
        firstGateWayhandler.handler();


    }
}
