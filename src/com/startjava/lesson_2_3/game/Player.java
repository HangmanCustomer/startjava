package com.startjava.lesson_2_3.game;
public class Player{
	private String name = "";
	private int userNum;
	private boolean win;
	private int[] answers = new int[9];

	public void setName(String name){
		this.name = name;
	}

	public void setUserNum(int userNum){
		this.userNum = userNum;
	}

	public String getName(){
		return name;
	}

	public int getUserNum(){return userNum;	}

	public void setWin(boolean win){
		this.win = win;
	}
	public boolean getWin(){
		return win;
	}

	public void setAnswers(int index, int value){ answers[index] = value; }

	public int getAnswers(int index){ return answers[index]; }

	public int getAnswersLength(){ return answers.length; }
	}
