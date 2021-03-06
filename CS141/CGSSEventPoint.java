import java.util.Scanner;
public class CGSSEventPoint
{
    public static void main(String[] args)
    {
	Scanner kb = new Scanner(System.in);
	System.out.print("Current Event Item: ");
	double currentEventItem = kb.nextDouble();
	System.out.print("Current Event Point: ");
	double currentEventPt = kb.nextDouble();
	System.out.print("Goal Point: ");
	double GoalPt = kb.nextDouble();
	int Stamina = 0;
	StaminaCalculation(currentEventItem, currentEventPt, GoalPt, Stamina);
    }

    public static void StaminaCalculation(double CEI, double CEPT, double GPT, int S)
    {
	double PtNeed = GPT - CEPT;
	double SPtGain = 53;
	double EventPtGain = 320;
	// 53x + 53x/150*320 = ptneed;
	double Song = ((PtNeed*150)-(CEI*320))/((53*320)+(53*150));
	S = (int)(Math.rint(Song)) * 19;
	System.out.println("Songs Need = " + (int)(Math.rint(Song)));
	System.out.println("Stamina Need = " + S);
   }

}