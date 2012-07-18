package pl.wcja.yamc.sound.edit;


/**
 * 
 * @author <a href="mailto:ketonal80@gmail.com">Pablo</a>, wcja.pl
 *
 */
public interface TuneEditorGridListener {
	
	public void markerLocationChanged(MarkerLocationChangedEvent e);
	
	public void visibleAreaChanged(VisibleAreaChangedEvent e);

	public void selectionChanged(SelectionChangedEvent e);
	
	//public void trackItemMoved(); + scaled?
	
}
