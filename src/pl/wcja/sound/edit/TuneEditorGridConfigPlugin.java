package pl.wcja.sound.edit;

import pl.wcja.frame.IMainFrame;
import pl.wcja.plugin.MenuEntryPlugin;

/**
 * 
 * @author <a href="mailto:pawel.mika@geomar.pl">Pawe� Mika</a>, Geomar SA
 *
 */
public class TuneEditorGridConfigPlugin extends MenuEntryPlugin {

	public TuneEditorGridConfigPlugin(IMainFrame mf) {
		super(mf);
	}

	@Override
	public void entrySelected() {
		mf.getTuneEditor().configure();
	}

	@Override
	public String getEntryName() {
		return "Editor";
	}

	@Override
	public String getMenu() {
		return "Edit";
	}

	@Override
	public String getSubmenu() {
		return "Preferences";
	}

}
