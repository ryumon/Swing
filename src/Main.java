import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.spi.MidiFileReader;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;


public class Main {
	

	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		
		final Sequencer sequencer;
		File midi = new File("./sound/tam-n13.mid");
		try{
		  Sequence s = MidiSystem.getSequence(midi);
		  sequencer  = MidiSystem.getSequencer();
		  sequencer.open();
		  sequencer.setSequence(s);
		}catch(Exception e) {
		  e.printStackTrace();
		  return;
		}
		
		sequencer.start();
		FrmMain f = new FrmMain();
		f.setVisible(true);

	}

}
