package ChainResponsibilityPattern.factory;

import ChainResponsibilityPattern.dto.GatewayEntityDTO;
import ChainResponsibilityPattern.dto.GatewayEntityImp;
import ChainResponsibilityPattern.entity.GatewayEntity;
import ChainResponsibilityPattern.handler.GatewayHandler;

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
