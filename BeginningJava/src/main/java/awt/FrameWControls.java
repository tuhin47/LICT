package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameWControls extends Frame {
	public static void main(String args[]) {
		FrameWControls fwc = new FrameWControls();
		fwc.setLayout(new FlowLayout());
		fwc.setSize(600, 600);
		fwc.add(new Button("Test Me!"));
		fwc.add(new Label("Labe"));
		fwc.add(new TextField());
		CheckboxGroup cbg = new CheckboxGroup();
		fwc.add(new Checkbox("chk1", cbg, true));
		fwc.add(new Checkbox("chk2", cbg, false));
		fwc.add(new Checkbox("chk3", cbg, false));

		List list = new List(3, false);
		list.add("MTV");
		list.add("V");
		fwc.add(list);
		Choice chooser = new Choice();
		chooser.add("Avril");
		chooser.add("Monica");
		chooser.add("Britney");
		fwc.add(chooser);
		fwc.add(new Scrollbar());
		fwc.setVisible(true);
		fwc.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}
}
