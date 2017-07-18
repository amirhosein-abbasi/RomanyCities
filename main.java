package romani_cities;

public class main {
	public static void main(String[] args) {
		
		Algorithms algorithms=new Algorithms() ;
		Problem_RomaniCities problem=new Problem_RomaniCities() ;

			//algorithms.DFS_limited(8, problem);
			//algorithms.BFS_tree(problem);
			algorithms.A_star(problem);
			
	}
}

