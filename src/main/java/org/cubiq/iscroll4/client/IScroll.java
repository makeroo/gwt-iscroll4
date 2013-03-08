package org.cubiq.iscroll4.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public final class IScroll extends JavaScriptObject {
	protected IScroll () { }

	public static native IScroll init (Widget w, IScrollOptions opts) /*-{
		var el = w.@com.google.gwt.user.client.ui.UIObject::getElement()();

		return new $wnd.iScroll(el, opts);
	}-*/;
}
