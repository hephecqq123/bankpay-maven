package plugins.quickpay.impl;

import plugins.AbstractPlugin;
import plugins.quickpay.QuickPayPlugin;

import common.exception.PluginException;
import common.logger.PluginLogger;

import data.dto.QuickPayRequestData;

public class ICBCQuickPayPlugin extends AbstractPlugin implements QuickPayPlugin {

	private static final PluginLogger log = PluginLogger.getLogger(ICBCQuickPayPlugin.class);

	@Override
	public Integer checkOrder(QuickPayRequestData request) {
		final String methodName = "checkOrder";
		log.entering(methodName);

		System.out.println(getProperties().get("host"));
		System.out.println(getProperties().get("port"));

		System.out.println(request.getOrderId());

		log.exiting(methodName);
		return 1;
	}

	@Override
	public Integer refundOrder(QuickPayRequestData request) throws PluginException {
		// TODO Auto-generated method stub
		return null;
	}

}
