/**
 * 
 */
package cz.martinbayer.e4.analyser.description.gui;

import org.eclipse.jface.resource.ImageDescriptor;

import cz.martinbayer.analyser.logic.processor.LogProcessor;

/**
 * @author Martin Bayer
 */
public interface ProcessorsPaletteItem {

	public ImageDescriptor getImageDescriptor();

	public ImageDescriptor getSmallImageDescriptor();

	public ImageDescriptor getImageDescriptor(int width, int height);

	public void setType(Class<? extends LogProcessor> clazz);

	public Class<? extends LogProcessor> getType();
}
