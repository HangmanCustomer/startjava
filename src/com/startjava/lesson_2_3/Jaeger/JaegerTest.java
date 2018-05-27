package com.startjava.lesson_2_3.jaeger;
public class JaegerTest{
	public static void main(String[] args) {
		Jaeger jaegerScrapper = new Jaeger();
		jaegerScrapper.setName("Scrapper");
		jaegerScrapper.setHeight(39);
		jaegerScrapper.setWeapons("Smoke Grenades\nWelding Torch");
		jaegerScrapper.setStatus("Destroyed");

		System.out.println(jaegerScrapper.getName());
		System.out.println(jaegerScrapper.getHeight());
		System.out.println(jaegerScrapper.getWeapons());
		System.out.println(jaegerScrapper.getStatus());

		Jaeger jaegerRonin = new Jaeger();
		jaegerRonin.setName("Tactic Ronin");
		jaegerRonin.setHeight(244);
		jaegerRonin.setWeapons("Fangblades");
		jaegerRonin.setStatus("Destroyed");

		System.out.println("-----------||---------");
		
		System.out.println(jaegerRonin.getName());
		System.out.println(jaegerRonin.getHeight());
		System.out.println(jaegerRonin.getWeapons());
		System.out.println(jaegerRonin.getStatus());

	}
}