import java.util.*;
import java.lang.*;
import java.io.*;

public class LeagueTable {

	public static void main(String args[]) {
		ArrayList<TeamScore> teams = new ArrayList<TeamScore>();

		Scanner s = new Scanner(System.in);
 		boolean end = false;   // set to true if input has "end" as the first word
		while (!end && s.hasNext()) {
			// read in input, create TeamScore for each line, and add to teams.
                        //  Or if the input is "end", end input processing
			String input = s.nextLine();
			if (input.equals("end"))
			{
				end = true;
			}
			else
			{
				String[] list = input.split(" ");
				TeamScore temp = new TeamScore(list[0], Integer.parseInt(list[1]), Integer.parseInt(list[2]));
				teams.add(temp);
			}
		}
		// sort teams in prescribed order for Standings Table
                //      by implementing an approriate comparator
		Collections.sort(teams, new TeamComparator());
		// print the names of the teams in order of the Standings Table
                //      by iterating through the sorted list
		for (TeamScore i: teams)
		{
			System.out.println(i.getName());
		}
	}
}

class TeamScore {
	// Has Name (String), Points, Goals - all ints
	private String name;
	private int points;
	private int goals;
	TeamScore(String name, int points, int goals)
	{
		this.name = name;
		this.points = points;
		this.goals = goals;
	}
	public String getName()
	{
		return this.name;
	}
	public int getPoints()
	{
		return this.points;
	}
	public int getGoals()
	{
		return this.goals;
	}
	// add constructor that takes all the above


}

class TeamComparator implements Comparator< TeamScore > {
  // implements the comparator that provides the ordering required for the standings table
	public int compare(TeamScore b, TeamScore a)
	{
		if (a.getPoints() != b.getPoints())
		{
			return a.getPoints() - b.getPoints();
		}

		else if (a.getPoints() == b.getPoints() && a.getGoals() != b.getGoals())
		{
			return a.getGoals() - b.getGoals();
		}

		else if (a.getPoints() == b.getPoints() && a.getGoals() == b.getGoals())
		{
			return a.getName().compareTo(b.getName());
		}
		return 0;
	}

}
