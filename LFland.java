import java.util.Random;

public class LFland{
    public static void main(String[] args){
        double Pthreshold = 0.8;
        double probability;
        double Plevy;
        double Snew;
        double newprobability=0;
		double A=9.5;
		Random r = new Random();
        for (int i =0;i<100;i++){
            probability = r.nextDouble();
			Plevy = r.nextDouble();
			// System.out.println("probability"+probability);
			// System.out.println("sumOfNumerator"+sumOfNumerator);
			// System.out.println("probability * sumOfNumerator"+probability * sumOfNumerator);
			// System.out.println("Plevy"+Plevy);
			// if (Plevy >= Pthreshold) {
			// 	Snew = (1 / A) * ((1 - Pthreshold) / (1 - Plevy));
			// 	if (Snew < 1) {
			// 		Snew = 1;
			// 	}
			// 	newprobability = 1 - (1 / Snew) * (1 - probability);
			// 	//System.out.println("オン");
			// } else {
			// 	newprobability = probability;
			// }

			newprobability = probability;
			System.out.println(newprobability);
		}
    }
}
