package com.deef;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
public static void main(String[] args) {
		Map<String,Details> m = new LinkedHashMap<String,Details>();
	Details d = new Details();
	d.setEmpId(10);
	d.setEmpName("jelsi");
	Details d2 = new Details();
		d2.setEmpId(20);
		d2.setEmpName("juno");
		m.put("details1", d);
		m.put("details2", d2);
		
		Set<Entry<String, Details>> entrySet = m.entrySet();
        for (Entry<String, Details> entry : entrySet) {
        	System.out.println(entry.getKey());
			System.out.println(entry.getValue().getEmpId());
			System.out.println(entry.getValue().getEmpName());
			sysoutgit
		}
	
	
	
	
	
	
}

	
	
}
