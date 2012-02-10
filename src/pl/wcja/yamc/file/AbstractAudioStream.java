package pl.wcja.yamc.file;

import java.io.File;

import javax.sound.sampled.AudioFileFormat;

/**
 * 
 * @author:		<a href="mailto:ketonal80@gmail.com">Pablo</a>, wcja.pl
 * @date:		10-02-2012
 *
 */
public abstract class AbstractAudioStream {

	//underlying stream file
	protected File file = null;
	//audio stream file format
	protected AudioFileFormat audioFileFormat = null;
	
	public AbstractAudioStream(File file) {
		this.file = file;
	}
	
	public File getFile() {
		return this.file;
	}
	
	/**
	 * 
	 * @return
	 */
	public AudioFileFormat getAudioFileFormat() {
		return this.audioFileFormat;
	}

	/**
	 * Get specified sample
	 * @param index
	 * @return requested sample in double array form [channel1]...[channelN]
	 */
	public abstract double[] getSample(long index);
	
	/**
	 * Get the raw stream data without any conversions.
	 * 
	 * @param offset audio stream beginning offset
	 * @param length lenght of data to get
	 * @return byte array of raw audio stream data
	 */
	public abstract byte[] getRawData(int offset, int length);
	
	/**
	 * Get the stream data converted to double values.
	 * 
	 * @param offset sample offset from the beginning od the stream
	 * @param length number of samples to get
	 * @return double array of arrays od data, containtin N channels
	 */
	public abstract double[][] getData(int offset, int length);
}
