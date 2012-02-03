package pl.wcja.yamc.plugin;

import javax.swing.JMenuItem;

import pl.wcja.yamc.frame.IMainFrame;
import pl.wcja.yamc.frame.ToolBarEntry;

/**
 * 
 * @author <a href="mailto:pawel.mika@geomar.pl">Pawe� Mika</a>, Geomar SA
 *
 */
public abstract class ToolBarEntryPlugin extends BasePlugin implements ToolBarEntry {

	private JMenuItem jMenuItem = null;

	public ToolBarEntryPlugin(IMainFrame mf) {
		super(mf);
	}
	
	public ToolBarEntryPlugin(IMainFrame mf, JMenuItem menuItem) {
		super(mf);
		this.jMenuItem = menuItem;
	}
	
	public JMenuItem getMenuItem() {
		return jMenuItem;
	}
	
	public void setMenuItem(JMenuItem jmi) {
		this.jMenuItem = jmi;
	}	
}