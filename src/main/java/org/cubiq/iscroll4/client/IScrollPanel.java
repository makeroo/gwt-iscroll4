package org.cubiq.iscroll4.client;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class IScrollPanel extends SimplePanel {

	private final IScroll iscroll;

	public IScrollPanel (IScrollOptions opts) {
		this(new FlowPanel(), opts);
	}

	public IScrollPanel (Widget content, IScrollOptions opts) {
		setWidget(content);

		iscroll = IScroll.init(this, opts);
	}

	public IScroll getIScroll () {
		return iscroll;
	}
}
