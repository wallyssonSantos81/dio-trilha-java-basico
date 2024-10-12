package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print(" How many employee will be registered? ");
		int N = imput.nextInt();
		
		for(int i=0; i<N; i++){
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = imput.nextInt();
			System.out.print("Name: ");
			imput.nextLine();
			String name = imput.nextLine();
			System.out.print("Salary: ");
			Double salary = imput.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);		
		}
		System.out.print("Enter the Employee id that will have salary increase: ");
		int idsalary = imput.nextInt();	
		Integer pos = position(list, idsalary);
		if(pos == null){
			System.out.println(" this id does not exist! ");
		}
		else {
			System.out.print(" Enter the percentage: ");
			double percent = imput.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println(" List of employee: ");
		for(Employee emp : list) {
			System.out.println(emp);
		}
			
		imput.close();
		}
		public static Integer position(List<Employee> list, int id){
			for(int i=0; i<list.size(); i++){
				if(list.get(i).getId() == id){
					return i;
				}
			}
		return null;
		}
}
