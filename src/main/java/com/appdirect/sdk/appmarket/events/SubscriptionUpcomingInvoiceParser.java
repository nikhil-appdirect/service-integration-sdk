package com.appdirect.sdk.appmarket.events;

class SubscriptionUpcomingInvoiceParser implements EventParser<SubscriptionUpcomingInvoice> {
	@Override
	public SubscriptionUpcomingInvoice parse(EventInfo eventInfo, EventExecutionContext eventContext) {
		return new SubscriptionUpcomingInvoice(eventContext.getConsumerKeyUsedByTheRequest(), eventInfo.getPayload().getAccount(), eventContext.getQueryParameters(), null);
	}
}
