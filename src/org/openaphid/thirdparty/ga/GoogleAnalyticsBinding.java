package org.openaphid.thirdparty.ga;

import org.openaphid.bind.AphidJSFunction;
import org.openaphid.internal.AppDelegate;

import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import com.google.android.apps.analytics.Item;
import com.google.android.apps.analytics.Transaction;

public class GoogleAnalyticsBinding {
	@AphidJSFunction(isInUIThread = true)
	public void startTracker(String accountID, int period) {
		GoogleAnalyticsTracker.getInstance().startNewSession(accountID, period,
				AppDelegate.getApplicationContext());
	}

	@AphidJSFunction(isInUIThread = true)
	public void stopTracker() {
		GoogleAnalyticsTracker.getInstance().stopSession();
	}

	@AphidJSFunction(isInUIThread = true)
	public void trackPageView(String page) {
		GoogleAnalyticsTracker.getInstance().trackPageView(page);
	}

	@AphidJSFunction(isInUIThread = true)
	public void trackEvent(String event, String action, String label, int value) {
		GoogleAnalyticsTracker.getInstance()
				.trackEvent(event, action, label, value);
	}

	@AphidJSFunction(isInUIThread = true, name = "setCustomVariableForScope")
	public void setCustomVariable(int index, String name, String value, int scope) {
		GoogleAnalyticsTracker.getInstance()
				.setCustomVar(index, name, value, scope);
	}

	@AphidJSFunction(isInUIThread = true, name = "setCustomVariable")
	public void setCustomVariable(int index, String name, String value) {
		GoogleAnalyticsTracker.getInstance().setCustomVar(index, name, value);
	}

	@AphidJSFunction(isInUIThread = true)
	public String getVisitorCustomVar(int index) {
		return GoogleAnalyticsTracker.getInstance().getVisitorCustomVar(index);
	}

	@AphidJSFunction(isInUIThread = true)
	public boolean addTransaction(String orderID, double totalPrice,
			String storeName, double totalTax, double shippingCost) {
		GoogleAnalyticsTracker.getInstance().addTransaction(
				new Transaction.Builder(orderID, totalPrice)
					.setStoreName(storeName)
					.setTotalTax(totalTax)
					.setShippingCost(shippingCost)
					.build()
				);
		return true;
	}

	@AphidJSFunction(isInUIThread = true)
	public boolean addItem(String orderID, String itemSKU, double itemPrice,
			long itemCount, String itemName, String itemCategory) {
		GoogleAnalyticsTracker.getInstance().addItem(
				new Item.Builder(orderID, itemSKU, itemPrice, itemCount)
					.setItemName(itemName)
					.setItemCategory(itemCategory)
					.build()
				);
		return true;
	}

	@AphidJSFunction(isInUIThread = true)
	public boolean trackTransactions() {
		GoogleAnalyticsTracker.getInstance().trackTransactions();
		return true;
	}

	@AphidJSFunction(isInUIThread = true)
	public boolean clearTransactions() {
		GoogleAnalyticsTracker.getInstance().clearTransactions();
		return true;
	}

	@AphidJSFunction(isInUIThread = true)
	public boolean setReferrer(String referrer) {
		return GoogleAnalyticsTracker.getInstance().setReferrer(referrer);
	}

	@AphidJSFunction(isInUIThread = true)
	public boolean dispatch() {
		return GoogleAnalyticsTracker.getInstance().dispatch();
	}

}
