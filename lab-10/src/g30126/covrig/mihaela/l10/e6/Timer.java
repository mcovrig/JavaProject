package g30126.covrig.mihaela.l10.e6;

public class Timer extends Thread{
	int sec,min,msec;
	Chronometer chronometer;
	boolean paused;

	public Timer(Chronometer chronometer) {
		this.chronometer=chronometer;
	}
	@Override
	public void run() {
		while(true)
		{
			msec+=1;
			if(msec<100)
				chronometer.msecLabel.setText(String.format("%02d", msec));
			else if ((msec>=100) &&(sec<60)) {
				msec=0;
				sec++;
				chronometer.secLabel.setText(String.format("%02d", sec)+":");
				chronometer.msecLabel.setText(String.format("%02d", msec));
			}
			else if (sec >=60) {
				msec=0;
				sec=0;
				min++;
				chronometer.minLabel.setText(String.format("%02d", min)+":");
				chronometer.secLabel.setText(String.format("%02d", sec)+":");
				chronometer.msecLabel.setText(String.format("%02d", msec));
				}
		}
	}
	public void pause1() {
		// TODO Auto-generated method stub
		
	}
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	public void pause11() {
		// TODO Auto-generated method stub
		
	}
		}