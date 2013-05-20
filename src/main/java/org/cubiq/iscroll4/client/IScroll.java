package org.cubiq.iscroll4.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

public final class IScroll extends JavaScriptObject {
	protected IScroll () { }

	public static native IScroll init (Widget w, IScrollOptions opts) /*-{
		var el = w.@com.google.gwt.user.client.ui.UIObject::getElement()();

		return new $wnd.iScroll(el, opts);
	}-*/;

	public native double getX () /*-{
		return this.x;
	}-*/;

	public native double getY () /*-{
	//$wnd.alert('getting scroll info: ' + this.x + ',' + this.y);
		return this.y;
	}-*/;

	public native void destroy () /*-{
		this.destroy();
	}-*/;

	public native void refresh () /*-{
		this.refresh();
	}-*/;

	public native void scrollTo (int x, int y, int time, boolean relative) /*-{
		this.scrollTo(x, y, time, relative);
	}-*/;

	public native void scrollToElement (Element el, int time) /*-{
		this.scrollToElement(el, time);
	}-*/;

	// TODO: 'next' 'prev'
	public native void scrollToPage (int pageX, int pageY, int time) /*-{
		this.scrollToPage(pageX, pageY, time);
	}-*/;

	public native void disable () /*-{
		this.disable();
	}-*/;

	public native void enable () /*-{
		this.enable();
	}-*/;

	public native void stop () /*-{
		this.stop();
	}-*/;

	public native void zoom (double x, double y, double scale, int time) /*-{
		this.zoom(x, y, scale, time);
	}-*/;

	public native boolean isReady () /*-{
		this.isReady();
	}-*/;

//	/**
//	 * TODO: Don't know if options is "public" and modificable.
//	 */
//	public native IScrollOptions getOptions () /*-{
//		return this.options;
//	}-*/;
}
