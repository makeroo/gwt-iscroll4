package org.cubiq.iscroll4.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class IScrollOptions extends JavaScriptObject {
	public interface ScrollEventHandler {
		void onScrollEvent (/*JavaScriptObject event*/);
	}

	public native void setOnScrollMove (ScrollEventHandler h) /*-{
		var me = this;

		me.scrollMove = h;

		if (this.onScrollMove == undefined) {
			this.onScrollMove = function (iscr, e) {
				me.scrollMove.@org.cubiq.iscroll4.client.IScrollOptions.ScrollEventHandler::onScrollEvent()();
			};
		}
	}-*/;

	protected IScrollOptions () { }

	public native boolean isHScroll () /*-{
		return this.hScroll;
	}-*/;

	public native void setHScroll (boolean f) /*-{
		this.hScroll = f;
	}-*/;

	public native boolean isVScroll () /*-{
		return this.vScroll;
	}-*/;

	public native void setVScroll (boolean f) /*-{
		this.vScroll = f;
	}-*/;

	public native int getX () /*-{
		return this.x;
	}-*/;

	public native void setX (int x) /*-{
		this.x = x;
	}-*/;

	public native int getY () /*-{
		return this.y;
	}-*/;

	public native void setY (int y) /*-{
		this.y = y;
	}-*/;

	public native boolean isBounce () /*-{
		return this.bounce;
	}-*/;

	public native void setBounce (boolean f) /*-{
		this.bounce = f;
	}-*/;

	public native boolean isBounceLock () /*-{
		return this.bounceLock;
	}-*/;

	public native void setBounceLock (boolean f) /*-{
		this.bounceLock = f;
	}-*/;

	public native boolean isMomentum () /*-{
		return this.momentum;
	}-*/;

	public native void setMomentum (boolean f) /*-{
		this.momentum = f;
	}-*/;

	public native boolean isLockDirection () /*-{
		return this.lockDirection;
	}-*/;

	public native void setLockDirection (boolean f) /*-{
		this.lockDirection = f;
	}-*/;

	public native boolean isUseTransform () /*-{
		return this.useTransform;
	}-*/;

	public native void setUseTransform (boolean f) /*-{
		this.useTransform = f;
	}-*/;

	public native boolean isUseTransition () /*-{
		return this.useTransition;
	}-*/;

	public native void setUseTransition (boolean f) /*-{
		this.useTransition = f;
	}-*/;

	public native int getTopOffset () /*-{
		return this.topOffset;
	}-*/;

	public native void setTopOffset (int o) /*-{
		this.topOffset = o;
	}-*/;

	public native boolean isCheckDOMChanges () /*-{
		return this.checkDOMChanges;
	}-*/;

	public native void setCheckDOMChanges (boolean f) /*-{
		this.checkDOMChanges = f;
	}-*/;

	public native boolean isHandleClick () /*-{
		return this.handleClick;
	}-*/;

	public native void setHandleClick (boolean f) /*-{
		this.handleClick = f;
	}-*/;

	public native boolean isHScrollbar () /*-{
		return this.hScrollbar;
	}-*/;

	public native void setHScrollbar (boolean f) /*-{
		this.hScrollbar = f;
	}-*/;

	public native boolean isVScrollbar () /*-{
		return this.vScrollbar;
	}-*/;

	public native void setVScrollbar (boolean f) /*-{
		this.vScrollbar = f;
	}-*/;

	public native boolean isFixedScrollbar () /*-{
		return this.fixedScrollbar;
	}-*/;

	public native void setFixedScrollbar (boolean f) /*-{
		this.fixedScrollbar = f;
	}-*/;

	public native boolean isHideScrollbar () /*-{
		return this.hideScrollbar;
	}-*/;

	public native void setHideScrollbar (boolean f) /*-{
		this.hideScrollbar = f;
	}-*/;

	public native boolean isFadeScrollbar () /*-{
		return this.fadeScrollbar;
	}-*/;

	public native void setFadeScrollbar (boolean f) /*-{
		this.fadeScrollbar = f;
	}-*/;

	public native String getScrollbarClass () /*-{
		return this.scrollbarClass;
	}-*/;

	public native void setScrollbarClass (String f) /*-{
		this.scrollbarClass = f;
	}-*/;

	public native boolean isZoom () /*-{
		return this.zoom;
	}-*/;

	public native void setZoom (boolean f) /*-{
		this.zoom = f;
	}-*/;

	public native double getZoomMin () /*-{
		return this.zoomMin;
	}-*/;

	public native void setZoomMin (double f) /*-{
		this.zoomMin = f;
	}-*/;

	public native double getZoomMax () /*-{
		return this.zoomMax;
	}-*/;

	public native void setZoomMax (double f) /*-{
		this.zoomMax = f;
	}-*/;

	public native double getDoubleTapZoom () /*-{
		return this.doubleTapZoom;
	}-*/;

	public native void setDoubleTapZoom (double f) /*-{
		this.doubleTapZoom = f;
	}-*/;

	public native String getWheelAction () /*-{
		return this.wheelAction;
	}-*/;

	public native void setWheelAction (String f) /*-{
		this.wheelAction = f;
	}-*/;

	public native boolean isSnap () /*-{
		return this.snap;
	}-*/;

	public native void setSnap (boolean f) /*-{
		this.snap = f;
	}-*/;

	public native String isSnapThreshold () /*-{
		return this.snapThreshold;
	}-*/;

	public native void setSnapThreshold (String f) /*-{
		this.snapThreshold = f;
	}-*/;

	// TODO: events

	public static native IScrollOptions defaults () /*-{
		return {};
	}-*/;
}