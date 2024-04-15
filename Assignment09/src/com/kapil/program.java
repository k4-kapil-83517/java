package com.kapil;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class program {

	public static void main(String[] args) {
		List<Student>studList=new LinkedList<>();
		studList.add(new Student(1,"kapil",80));
		studList.add(new Student(5,"piyush",88));
		studList.add(new Student(4,"balya",85));
		studList.add(new Student(2,"vicky",90));
	    studList.add(new Student(3,"rahul",75));
	    
	    System.out.println("Before sort");
	    for(Student s:studList)
	    	System.out.println(s);
	    
	    System.out.println("Before sort");
	    Collections.sort(studList);
	    for(Student s:studList)
	    	System.out.println(s);
	    
	    System.out.println("sorting on stud name");
	    class StuNameComparator implements Comparator<Student>	{

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.name.compareTo(o2.name);
				
			}
	    	
	    	
	    }
	    Comparator<Student>stuNameComparator =new StuNameComparator();
	    Collections.sort(studList,stuNameComparator);
	    
	    for(Student s:studList)
	    	System.out.println(s);
	    
	    Student stu=new Student();
	    stu.rollno=3;
	    if(studList.contains(stu)) {
	    	System.out.println("Student is exist");
	    }else {
	    	System.out.println("student is not exist");
	    }
	    
	    
	}

}
