gwt-iscroll4
============

GWT wrapper for [iScroll4](http://cubiq.org/iscroll-4).

Usage
-----

Inherit gwt-scroll4 module in your gwt module like this:

    <!-- standard inherits...-->
    <inherits name='com.google.gwt.user.User'/>

    <inherits name="org.cubiq.iscroll4.IScroll4"/>

    <entry-point...

Create two FlowPanel. The first one is the container, the second one is scrolled.

Container flow panel must be position:relative.

Fill the second flow panel with whatever widget/content you want.

```java
  	final FlowPanel scrollArea = new FlowPanel();
		scrollArea.setStyleName("container");

		final FlowPanel scrolledContent = new FlowPanel();

		for (char i = 'A'; i < 'Z'; ++i) {
			Label a = new Label(i + " choice");
			a.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					GWT.log(((Label)event.getSource()).getText() + " clicked");
				}
			});

			scrolledContent.add(a);
		}

		scrollArea.add(scrolledContent);

		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			@Override
			public void execute() {
				Widget w = scrolledContent.getWidget(0);
				int width = w.getOffsetWidth() * scrolledContent.getWidgetCount();
				int height = w.getOffsetHeight();

				scrolledContent.setPixelSize(width, height);

				IScrollOptions opts = IScrollOptions.defaults();
				opts.setVScroll(false);
				IScroll s = IScroll.init(scrollArea, opts);
			}
		});

		RootPanel.get().add(scrollArea);
```

What's that deferred command?! Just an (awfull) hack. Scrolled content must have width and height explicitly defined *before* you initialize iScroll.
If scrolled content size is statically known you can use a CSS class.
Otherwise, you let the browser render the page, and then query width and height. Deferred commands are executed just after a rendering phase.
