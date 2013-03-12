package org.cubiq.iscroll4.client;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public interface IScrollPanelContainer {
	void childResized (Widget w);

	public static class Utils {
		public static void fireChildResized (Widget w) {
			for (; w != null; w = w.getParent())
				if (w instanceof IScrollPanelContainer) {
					((IScrollPanelContainer)w).childResized(w);

					return;
				}
		}

		public static void stackVertically (Widget container) {
			if (container instanceof HasWidgets == false)
				return;

			HasWidgets c = (HasWidgets)container;

			int width = 0, height = 0;
			for (Widget child : c) {
				width = Math.max(width, child.getOffsetWidth());
				height += child.getOffsetHeight();
			}

			container.setPixelSize(width, height);
		}

		public static void stackHorizontally (Widget container) {
			if (container instanceof HasWidgets == false)
				return;

			HasWidgets c = (HasWidgets)container;
			int width = 0, height = 0;

			for (Widget child : c) {
				width += child.getOffsetWidth();
				height = Math.max(height, child.getOffsetHeight());
			}

			container.setPixelSize(width, height);
		}
	}
}
