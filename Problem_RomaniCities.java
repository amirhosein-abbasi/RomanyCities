package romani_cities;

import java.util.Vector;

public class Problem_RomaniCities {
	
	
	public State initial_state(){
		State init_city = new State () ;
		init_city.state = "arad" ;
		return init_city;
	}
	
	
	public Vector<Action> actions (State city){
		Vector<Action> list = new Vector<Action>();
		
		if (city.state.equalsIgnoreCase("arad")){
			
		Action action1 = new Action() ; 
		action1.go="zerind" ;
		action1.cost=75 ;
		list.add(action1) ;
		
		Action action2 = new Action() ; 
		action2.go="timisoara" ;
		action2.cost=118 ;
		list.add(action2) ;
		
		Action action3 = new Action() ; 
		action3.go="sibiu" ;
		action3.cost=140 ;
		list.add(action3) ;
		return list;
		}
		else if (city.state.equalsIgnoreCase("oradea")){
			Action action1 = new Action() ; 
			action1.go="zerind" ;
			action1.cost=71 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="sibiu" ;
			action2.cost=151 ;
			list.add(action2) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("zerind")){
			Action action1 = new Action() ; 
			action1.go="oradea" ;
			action1.cost=71 ;
			list.add(action1) ;
			Action action2 = new Action() ; 
			action2.go="arad" ;
			action2.cost=75 ;
			list.add(action2) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("sibiu")){
			Action action1 = new Action() ; 
			action1.go="oradea" ;
			action1.cost=151 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="arad" ;
			action2.cost=140 ;
			list.add(action2) ;
			
			Action action3 = new Action() ; 
			action3.go="rimnicu vilcea" ;
			action3.cost=80 ;
			list.add(action3) ;
			
			Action action4 = new Action() ; 
			action4.go="fagaras" ;
			action4.cost=99 ;
			list.add(action4) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("timisoara")){
			Action action1 = new Action() ; 
			action1.go="arad" ;
			action1.cost=118 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="lugoj" ;
			action2.cost=111 ;
			list.add(action2) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("lugoj")){
			Action action1 = new Action() ; 
			action1.go="timisoara" ;
			action1.cost=111 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="mehadia" ;
			action2.cost=70 ;
			list.add(action2) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("mehadia")){
			Action action1 = new Action() ; 
			action1.go="lugoj" ;
			action1.cost=70 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="dobreta" ;
			action2.cost=75 ;
			list.add(action2) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("dobreta")){
			Action action1 = new Action() ; 
			action1.go="mehadia" ;
			action1.cost=75 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="craiova" ;
			action2.cost=120 ;
			list.add(action2) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("craiova")){
			
		Action action1 = new Action() ; 
		action1.go="dobreta" ;
		action1.cost=120 ;
		list.add(action1) ;
		
		Action action2 = new Action() ; 
		action2.go="pitesti" ;
		action2.cost=138 ;
		list.add(action2) ;
		
		Action action3 = new Action() ; 
		action3.go="rimnicu vilcea" ;
		action3.cost=146 ;
		list.add(action3) ;
		return list;
		}
		else if (city.state.equalsIgnoreCase("rimnicu vilcea")){
			
			Action action1 = new Action() ; 
			action1.go="pitesti" ;
			action1.cost=97 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="craiova" ;
			action2.cost=146 ;
			list.add(action2) ;
			
			Action action3 = new Action() ; 
			action3.go="sibiu" ;
			action3.cost=80 ;
			list.add(action3) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("pitesti")){
			
			Action action1 = new Action() ; 
			action1.go="rimnicu vilcea" ;
			action1.cost=97 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="craiova" ;
			action2.cost=138 ;
			list.add(action2) ;
			
			Action action3 = new Action() ; 
			action3.go="bucharest" ;
			action3.cost=101 ;
			list.add(action3) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("fagaras")){
			Action action1 = new Action() ; 
			action1.go="sibiu" ;
			action1.cost=99 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="bucharest" ;
			action2.cost=211 ;
			list.add(action2) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("bucharest")){
			Action action1 = new Action() ; 
			action1.go="pitesti" ;
			action1.cost=101 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="fagaras" ;
			action2.cost=211 ;
			list.add(action2) ;
			
			Action action3 = new Action() ; 
			action3.go="giurgiu" ;
			action3.cost=90 ;
			list.add(action3) ;
			
			Action action4 = new Action() ; 
			action4.go="urziceni" ;
			action4.cost=85 ;
			list.add(action4) ;
			return list;
			}
		else if (city.state.equalsIgnoreCase("giurgiu")){
			
			Action action1 = new Action() ; 
			action1.go="bucharest" ;
			action1.cost=90 ;
			list.add(action1) ;
			
			return list;
			}
	else if (city.state.equalsIgnoreCase("urziceni")){
			
			Action action1 = new Action() ; 
			action1.go="bucharest" ;
			action1.cost=85 ;
			list.add(action1) ;
			
			Action action2 = new Action() ; 
			action2.go="hirsova" ;
			action2.cost=98 ;
			list.add(action2) ;
			
			Action action3 = new Action() ; 
			action3.go="vaslui" ;
			action3.cost=142 ;
			list.add(action3) ;
			return list;
			}
	else if (city.state.equalsIgnoreCase("hirsova")){
		
		Action action1 = new Action() ; 
		action1.go="urziceni" ;
		action1.cost=98 ;
		list.add(action1) ;
		
		Action action2 = new Action() ; 
		action2.go="eforie" ;
		action2.cost=86 ;
		list.add(action2) ;
	
		return list;
		
		}
	else if (city.state.equalsIgnoreCase("eforie")){
		
		Action action1 = new Action() ; 
		action1.go="hirsova" ;
		action1.cost=86 ;
		list.add(action1) ;
	
		return list;

		}
	else if (city.state.equalsIgnoreCase("vaslui")){
		
		Action action1 = new Action() ; 
		action1.go="urziceni" ;
		action1.cost=142 ;
		list.add(action1) ;
		
		Action action2 = new Action() ; 
		action2.go="lasi" ;
		action2.cost=92 ;
		list.add(action2) ;
	
		return list;
		
		}
	else if (city.state.equalsIgnoreCase("lasi")){
		
		Action action1 = new Action() ; 
		action1.go="vaslui" ;
		action1.cost=92 ;
		list.add(action1) ;
		
		Action action2 = new Action() ; 
		action2.go="neamt" ;
		action2.cost=87 ;
		list.add(action2) ;
	
		return list;
		
		}
	else if (city.state.equalsIgnoreCase("neamt")){
		
		Action action1 = new Action() ; 
		action1.go="lasi" ;
		action1.cost=87 ;
		list.add(action1) ;
	
		return list;
		}
		else
			return null ;
	}
	
	
	public State result (State city , Action action){
		
		State action_destination_city = new State() ;
		action_destination_city.state=action.go ;
		return action_destination_city ;
		}
		
	public boolean goal_test(State city){
		
		if (city.state.equalsIgnoreCase("vaslui"))
			return true ;
		else
		return false;	
	}
	public int action_cost(State city , Action action){
		return action.cost ;
	}
	public int path_cost (State city ,  Action action){
	return city.pathCost+action.cost ;
	}
	public int heuristic_cost(State city){
		if(city.state.equalsIgnoreCase("Arad"))
			return 710 ;
		else if(city.state.equalsIgnoreCase("Zerind"))
			return  634 ;
		else if(city.state.equalsIgnoreCase("Oradea"))
			return  573 ;
		else if(city.state.equalsIgnoreCase("Timisoara"))
			return  677 ;
		else if(city.state.equalsIgnoreCase("Sibiu"))
			return  408 ;
		else if(city.state.equalsIgnoreCase("Fagaras"))
			return  330 ;
		else if(city.state.equalsIgnoreCase("Lugoj"))
			return  636 ;
		else if(city.state.equalsIgnoreCase("Mehadia"))
			return  720 ;
		else if(city.state.equalsIgnoreCase("Dobreta"))
			return  669 ;
		else if(city.state.equalsIgnoreCase("Craiova"))
			return  561 ;
		else if(city.state.equalsIgnoreCase("rimnicu vilcea"))
			return  507 ;
		else if(city.state.equalsIgnoreCase("Pitesti"))
			return  447 ;
		else if(city.state.equalsIgnoreCase("Bucharest"))
			return  290 ;
		else if(city.state.equalsIgnoreCase("Giurgiu"))
			return  388 ;
		else if(city.state.equalsIgnoreCase("Urziceni"))
			return  267 ;
		else if(city.state.equalsIgnoreCase("Hirsova"))
			return  283 ;
		else if(city.state.equalsIgnoreCase("Eforie"))
			return  389 ;
		else if(city.state.equalsIgnoreCase("lasi"))
			return  66 ;
		else if(city.state.equalsIgnoreCase("Neamt"))
			return  133 ;
		else 
			return 0 ;
	}

	
}
