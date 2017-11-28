package plugin.hypixel5zig.modules;

import eu.the5zig.mod.modules.GameModeItem;
import eu.the5zig.mod.modules.StringItem;
import plugin.hypixel5zig.listener.HypixelListener;

public class MapItem extends StringItem {
	public MapItem() {
		super();
	}
	@Override
	protected Object getValue(boolean dummy) {
		if (dummy) {
			return "Tribute";
		}
		return HypixelListener.Map;
	}

	@Override
	public String getTranslation()
	{
		return "ingame.map";
	}
}
