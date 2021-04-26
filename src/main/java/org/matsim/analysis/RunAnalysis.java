package org.matsim.analysis;

import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.events.EventsUtils;
import org.w3.xlink.Simple;

public class RunAnalysis {

    public static void main(String[] args) {

        EventsManager manager = EventsUtils.createEventsManager();
        SimpleEventsHandler handler = new SimpleEventsHandler();
        manager.addHandler(handler);

        EventsUtils.readEvents(manager, "C:\\Users\\Janekdererste\\Projects\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz");
    }
}
