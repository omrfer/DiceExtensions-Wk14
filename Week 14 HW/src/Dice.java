import java.util.Random;
//Author @ Omar Fernandez
public class Dice {
		private int m_dicetotal, m_numberofdice;
	
		public Dice () {
			m_numberofdice = 1;
			//at least 1
		}
		public Dice(int dicenumber) {
			if (dicenumber > 0)
				m_numberofdice = dicenumber;
			else
				m_numberofdice = 1;
			// always have at least 1 dice
		}

		public int Roll() {
			int total = 0;
			Random rnumber = new Random();
			for (int i = 0; i < m_numberofdice; i++) {
				int cpunum = (rnumber.nextInt(6) + 1);
				total = cpunum + total;
				// System.out.println(cpunum);
			
			}
			m_dicetotal = total;
			return m_dicetotal ;
			
			
		}

		public void SetDices(int dicenumber) {
			m_numberofdice = dicenumber;
		}

		public int Value() {
			return m_dicetotal;
			// returns most recent random number generated
		}

	
	}

