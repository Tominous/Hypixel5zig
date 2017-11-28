package plugin.hypixel5zig.modules;

import eu.the5zig.mod.modules.GameModeItem;
import eu.the5zig.mod.server.GameMode;
import eu.the5zig.mod.server.GameState;
import plugin.hypixel5zig.games.Hypixel;

public class KitItem extends GameModeItem<Hypixel> {
	public KitItem() {
		super(Hypixel.class);
	}
	@Override
	protected Object getValue(boolean dummy) {
		if (dummy) {
			return "Default";
		}
		return getGameMode().getKit();
	}

	@Override
	public String getTranslation()
	{
		return "ingame.kit";
	}
}
