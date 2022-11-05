package 责任链模式.factory;

import 责任链模式.dto.GatewayEntityDTO;
import 责任链模式.dto.GatewayEntityImp;
import 责任链模式.entity.GatewayEntity;
import 责任链模式.handler.GatewayHandler;

public class GateWayHandlerFatory {

    private static GatewayEntityDTO imp = new GatewayEntityImp();

    public static GatewayHandler getFirstGateWayhandler() {
        GatewayEntity firstGateWayEntity = imp.getFirstGateWayEntity();
        GatewayHandler firstgatewayHandler = newInstance(firstGateWayEntity.getClassPath());

        if (firstgatewayHandler == null) {
            return null;
        }
        Integer nextId = null;

        GatewayEntity gatewayEntityTemp = firstGateWayEntity;
        GatewayHandler gatewayHandlerTemp = firstgatewayHandler;

        /**
         * 处理责任链
         */
        while ((nextId = gatewayEntityTemp.getNext()) > 0) {

            GatewayEntity gateWayEntity = imp.getGateWayEntity(nextId);
            GatewayHandler gatewayHandler = newInstance(gateWayEntity.getClassPath());

            gatewayHandlerTemp.setNext(gatewayHandler);

            gatewayEntityTemp = gateWayEntity;
            gatewayHandlerTemp = gatewayHandler;
        }
        return firstgatewayHandler;
    }


    private static GatewayHandler newInstance(String name) {
        try {
            Class<?> aClass = Class.forName(name);
            return (GatewayHandler) aClass.newInstance();
        } catch (Exception e) {
        }

        return null;

    }


}
