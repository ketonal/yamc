package pl.wcja.yamc.frame.tools;

import pl.wcja.yamc.frame.IMainFrame;
import pl.wcja.yamc.plugin.MenuEntryPlugin;

/**
 * 
 * @author <a href="mailto:pawel.mika@geomar.pl">Pawe� Mika</a>, Geomar SA
 *
 */
public class QuitApp extends MenuEntryPlugin {

	public QuitApp(IMainFrame mf) {
		super(mf);
	}

	@Override
	public void entrySelected() {
		mf.quitApplication();
	}

	@Override
	public String getEntryName() {
		return "Quit application";
	}

	@Override
	public String getMenu() {
		return "File";
	}

	@Override
	public String getSubmenu() {
		return null;
	}
}