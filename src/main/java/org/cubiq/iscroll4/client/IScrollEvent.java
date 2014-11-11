package org.cubiq.iscroll4.client;

import com.google.gwt.core.client.JavaScriptObject;

/*
absDistX: 15
absDistY: 450
absStartX: 0
absStartY: 0
aniTime: 14
animating: false
dirX: 0
dirY: 1
distX: -15
distY: -450
hScroll: false
hScrollbar: false
maxScrollX: 0
maxScrollY: -292
minScrollY: 0
moved: false
options: Object
pointX: 580
pointY: -43
scroller: div
scrollerH: 692
scrollerW: 430
startTime: 1405091337625
steps: Array[0]
vScroll: true
vScrollbar: true
vScrollbarIndicator: div
vScrollbarIndicatorSize: 227
vScrollbarMaxScroll: 169
vScrollbarProp: -0.5787671232876712
vScrollbarSize: 396
vScrollbarWrapper: div
wrapper: div.content
wrapperH: 400
wrapperOffsetLeft: 365
wrapperOffsetTop: 30
wrapperW: 430
zoomed: false

x: 0
y: -292
startX: 0
startY: -363
 *
 */
public final class IScrollEvent extends JavaScriptObject {
	protected IScrollEvent () { }

	public native int getX () /*-{
		return this.x || 0;
	}-*/;

	public native int getY () /*-{
		return this.y || 0;
	}-*/;

	public native int getStartX () /*-{
		return this.startX;
	}-*/;

	public native int getStartY () /*-{
		return this.startY;
	}-*/;
}
