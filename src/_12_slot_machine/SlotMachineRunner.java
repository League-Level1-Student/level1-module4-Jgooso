package _12_slot_machine;

import java.net.MalformedURLException;

public class SlotMachineRunner {
	static SlotMachine slot = new SlotMachine();
	
	public static void main(String[] args) {
		slot.go();
		slot.spin();
	}
}
