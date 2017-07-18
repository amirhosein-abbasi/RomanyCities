package romani_cities;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;



public class Algorithms {

	
	public static void BFS_tree(Problem_RomaniCities problem) {
		
		int node_visited=0 ;
		int node_extended=0 ;
		int max_memory_used=0 ;
		int memory_using=0 ;
		int path_cost = 0 ;
		
		State initialState=problem.initial_state() ;
		Queue<State> queue = new LinkedList<State>() ;
		queue.add(initialState) ;
		memory_using++ ;
		
		Vector<State> path = new Vector<State>() ;
		
		while(!queue.isEmpty()){
		
			State currentState = queue.remove() ;
			 memory_using-- ;
			System.out.println(currentState.state);
			
			
			if(problem.goal_test(currentState))
			{
			
				System.out.println("path is :");
				for(State u : queue)
				System.out.println(u.state);
				
				System.out.println("the number of node visited is : "+node_visited);
				
				
				System.out.println("the number of node extended is : "+node_extended);
				
				
				System.out.println("The maximum of memory used is : "+max_memory_used);
				
				
				return ;
			}
			
			Vector<Action> actions = new Vector<Action>() ;
			actions=problem.actions(currentState) ;
			
			for(Action act :actions){	
			  queue.add(problem.result(currentState,act)) ;
			  memory_using++ ;
			  node_visited++ ;
			}
			if (memory_using>max_memory_used)
			{
				max_memory_used = memory_using ;
			}
			node_extended++ ;
			
		}
		
		
	}
	
	public static void DFS_limited(int limit ,Problem_RomaniCities problem) {
		
		int node_visited=0 ;
		int node_extended=0 ;
		
		int max_memory_used=0 ;
		int memory_using=0 ;
		int path_cost = 0 ;
		int depth  ; 
		int depthLimit=limit  ;
		
		Stack<State> stack=new Stack() ;
		Stack<State> path_stack=new Stack() ;
		State currentState=null ;
		Vector<Action> acts = new Vector<Action>() ;
		
		State initialState=problem.initial_state() ;
		stack.add(initialState) ;
		path_stack.add(initialState) ;
		memory_using++ ;
		initialState.visited=true ;
		depth=0 ;
		
		
		while(!stack.isEmpty()) {
			if(depth<= depthLimit){
					currentState = (State) stack.pop() ;
					memory_using-- ;
					System.out.println(currentState.state);
					
					for(Action act: problem.actions(path_stack.peek())){
							if(act.go.equalsIgnoreCase(currentState.state))
							{
								path_cost=path_cost+problem.action_cost(currentState, act) ;
							}
							
					}
					path_stack.add(currentState) ;
					memory_using++ ;
					currentState.visited=true ;
					if(problem.goal_test(currentState))
					{
						System.err.println("path cost is : "+path_cost);
						System.err.println("node visited is : "+node_visited);
						System.err.println("node extende is : "+node_extended);
						System.err.println("max memory used is "+max_memory_used);
						return ;
					}
					acts =problem.actions(currentState) ;
					depth++ ;
				for(Action act : acts){
						if(problem.result(currentState,act).visited!=true && problem.result(currentState,act)!=null )
						{
								problem.result(currentState,act).parentNode=currentState.state ;
								stack.add(problem.result(currentState,act)) ;
								memory_using++ ;
								node_visited++ ;
								problem.result(currentState,act).visited=true ;
						}
					}
					node_extended++ ;
						}
			else{
				System.err.println("Not Found in depth limit");
				return ;
//				boolean justhaveparent=true ;
//				
//				for(Action x : problem.actions(currentState.parentNode)){
//					if(problem.result(currentState, x)==stack.peek())
//					{
//						justhaveparent=false ;
//						continue ;
//					}
//					if(justhaveparent==true){
//						stack.add(currentState.parentNode) ;
//					}
				}
			if(memory_using>max_memory_used)
				max_memory_used=memory_using ;
			}
		}
	
	public void A_star(Problem_RomaniCities problem) {
		
		int node_visited=0 ;
		int node_extended=0 ;
		
		int max_memory_used=0 ;
		int memory_using=0 ;
		
		int path_cost = 0 ;
		int totalCost=0 ;
		int stepCost=0 ;
		
		Stack<State> pathStack=new Stack<State>() ;
		State currentState=new State() ;
		
		
		State initialState=problem.initial_state() ;
		currentState=initialState ;
		pathStack.add(initialState);
		memory_using++ ;
		
		while(!problem.goal_test(currentState)){
			currentState=pathStack.pop() ;
			memory_using-- ;
			System.out.println(currentState.state);
			currentState.visited=true ;
			
			Vector<Action> actions=new Vector<Action>() ;
			actions=problem.actions(currentState) ;
			totalCost=Integer.MAX_VALUE ;
			State selectedCity = null ;
			int selectedCityStepCost=0 ;
			
			for(Action act : actions){
				int pathToSelected=0 ;
				int heuristic_action=problem.heuristic_cost(problem.result(currentState, act)) ;
				pathToSelected=path_cost+problem.action_cost(currentState, act) ;
				if(pathToSelected+ heuristic_action < totalCost && problem.result(currentState, act).visited!=true ){
					totalCost = pathToSelected+ heuristic_action ;
					selectedCity=problem.result(currentState, act) ;
					selectedCityStepCost=problem.action_cost(currentState, act) ;
				}
				node_visited++ ;
			}
			node_extended++ ;
			pathStack.add(selectedCity) ;
			memory_using++ ;
			currentState=selectedCity ;
			path_cost=path_cost + selectedCityStepCost ;
			if(memory_using>max_memory_used)
				max_memory_used=memory_using ;
		}
		if(memory_using>max_memory_used)
			max_memory_used=memory_using ;
		currentState=pathStack.pop() ;
		
		System.out.println(currentState.state);
		currentState.visited=true ;
		System.out.println("The Total Path Cost Is : "+path_cost);
		System.out.println("The Number Of Node Visited Is : "+node_visited);
		System.out.println("The Number Of Node Extended Is : "+node_extended);
		System.out.println("The Maximum Memory Used By Nodes Is : "+max_memory_used);
		
	}
	
}
