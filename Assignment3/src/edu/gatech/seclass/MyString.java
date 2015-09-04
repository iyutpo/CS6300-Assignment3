package edu.gatech.seclass;

public class MyString implements MyStringInterface{
	
	
	public String s;
	
	public MyString(){
		
		s="";
	}

	@Override
	public void setString(String string) {
		s=string;
		
	}

	@Override
	public String getString() {
		
		return s;
	}

	@Override
	public String getConsonants() {
		
		int size = s.length();
		for(int i = 0; i<size; i++){
			char letter = s.charAt(i);
			
			if(letter != 'a' && letter != 'e'&& letter != 'i'&& letter != 'o'&& letter != 'u'){
				
				System.out.println(letter);
			}
			
		}
		return null;
	
	}

	@Override
	public int numberOfConsonants() {
		
		int size = s.length();
		int count = 0;
		for(int i = 0; i<size; i++){
			char letter = s.charAt(i);
			
			if(letter != 'a' && letter != 'e'&& letter != 'i'&& letter != 'o'&& letter != 'u'){
				
				count++;
			}
		
		}
		
		return count;
	}

	@Override
	public char getCharacter(int position) throws IllegalArgumentException,
			IllegalIndexException {
		
		int size = s.length();
		char[] myCharArray = new char[size];
		char letter;
		char answer = '\0';
		for(int i = 0; i<size; i++){
			letter = s.charAt(i);
			myCharArray[i]=letter;
			
			answer = myCharArray[position];
		}
		
		return answer;
	}

	@Override
	public void flipCaseInSubstring(int startPosition, int endPosition)
			throws IllegalArgumentException, IllegalIndexException {
		
		int size = s.length();
		char[] myCharArray = new char[size];
		char[] diffChar = new char[size];
		char letter;
		char letter2;
		 char answer = '\0';
		for (int i = 0; i < size; i++) {
			letter = s.charAt(i);
			myCharArray[i] = letter;
		}
		while (startPosition <= endPosition) {

			for (int i = 0; i < size; i++) {
				letter2 = myCharArray[startPosition];

				if (Character.isUpperCase(letter2) == true) {

					diffChar[i] = Character.toLowerCase(letter2);

				} else if (Character.isLowerCase(letter2) == true) {

					diffChar[i] = Character.toUpperCase(letter2);

				}

				 answer = diffChar[i];

			}

			startPosition++;
			System.out.println(answer);

		}
		

	}

}
