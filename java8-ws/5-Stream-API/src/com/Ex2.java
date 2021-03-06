package com;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Dish;
import static java.util.Comparator.comparing;
import java.time.LocalDate;

public class Ex2 {
	public static void main(String[] args) {
		
		// JDK 1.8
		
		// get low calorie dish names in asc
		
		
		List<Dish> menu=Dish.menu;
		
		//menu
		//.stream()
		//.filter(dish->dish.getCalories()<400)
		//.sorted((o1,o2)->Integer.compare(o1.getCalories(), o2.getCalories()))
		//.map(dish->dish.getName())
		//.forEach(System.out::println);
		
		//menu
		//.stream()
		//.filter(dish->dish.getCalories()<400)
		//.sorted(comparing(Dish::getCalories))
		//.map(Dish::getName)
		//.forEach(System.out::println);
		
		
		
		
		/*
		List<String> dietMenu=menu
		.stream()
		.parallel()
		.filter(dish->dish.getCalories()<400)
		.sorted(comparing(Dish::getCalories))
		.map(Dish::getName)
		.collect(Collectors.toList());
		
		System.out.println(dietMenu);
		
		*/
		
		List<Dish> filteredMenu= menu
		.stream()
		.filter(Dish::isVegettarian)
		//.map(Dish::getName)
		//.limit(3)
		//.forEach(System.out::println);
		.collect(Collectors.toList());
		
	//	System.out.println(menu);
	//	System.out.println(filteredMenu);
		
		
		// sum
		
		List<Dish> totalCalaries=Dish.menu;
		
		int sum=totalCalaries
		.stream()
		.filter(Dish::isVegettarian)
		.map(dish->dish.getCalories())
		//.reduce(0,(a,b)->a+b);
		.collect(Collectors.summingInt(Integer::intValue));
		
		System.out.println(sum);
		
		
		int x=totalCalaries
		.stream()
		.mapToInt(dish->dish.getCalories())
		.sum();
		
		System.out.println(x);
		
		
		
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate d1=LocalDate.of(2021, 01, 21);
		//date.of(2021, 01, 23);
		System.out.println(d1);
		
		
		
		
		
		
		
		
		
	}

}
