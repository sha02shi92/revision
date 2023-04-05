package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicate {
	
	public static void main(String[] args) {
		
		List<employee> emp=new ArrayList<>();
		
		emp.add(new employee("E401","shashank","etc",30));
		emp.add(new employee("E402","bharti","etc",28));
		emp.add(new employee("E403","shashank","etc",30));
		emp.add(new employee("E404","bharti","etc",30));
		emp.add(new employee("E405","golu","IT",30));
		
		Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(employee:: getName,Collectors.counting()));
		System.out.println(collect);
		
	}

}
