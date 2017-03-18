/*
 * Elina Kuzmina    
 * 3 IT
 * Java seminars nr.2
 */
package javasem02;
import java.util.Random;
import java.util.ArrayList;
/**
 * @author Elina Kuzmina
 */
public class JavaSem02 {

        static String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt","Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda","Aaron", "Kate" };
        static int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };  
        //6
        static byte[] byteArray = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
					32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
	
        static ArrayList<Marathonist> marathonists = new ArrayList<Marathonist>();
        
    public static void main(String[] args) {
              String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt","Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda","Aaron", "Kate" };
              int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };  
        
                createMarathonists(names, times);
		printMarathonists(names, times);
		
		//Exercise 1
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		//3
		double[] myArray = generateArray(10, 1.0, 15.0);
		//4
		double[][] generatedMatrix = new double[10][];
		//5
		double[] coins = coinFlip(10);
		//7
		String pascalTriangle = " ";
		//8*
		String inputEquation = "1 - 3 * 18 / 4 + 2";
                double result = 0.0;
		
                //Exercise 1
		finalPosition = positionCalc(gravity, initialVelocity, initialPosition, fallingTime);
		System.out.println("Pos in "+fallingTime+" sec :"+finalPosition);
                
		//Exercise 2 
		System.out.println("---- Exercise 2 ----");
                System.out.println("Factorial of 5 = "+factorialForLoop(5));
                System.out.println("FacRec of 5 = "+factorialRecursive(5));
                
		System.out.println("---- Exercise 3 ----");
		System.out.println("newArray: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("---- Exercise 4 ----");
		generatedMatrix = generateMatrix(5);
		System.out.println("\nIzgust 1 rindas 5 kolonnas elementu: "+getProduct(generatedMatrix, 0, 4));
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(2));
		
		System.out.println("---- Exercise 5 ----");
		System.out.println("heads: " + coins[0]);
		System.out.println("tails: " + coins[1]);
		System.out.println("Ratio of heads: " + coins[2]);
		
		
		
		//Exercise 6
		System.out.println("---- Exercise 6 ----");
		System.out.println(JavaSem02.getTextFromBytes(byteArray));
		
		//Exercise 7
		System.out.println("---- Exercise 7 ----");
		pascalTriangle = pascalsTriangle(6);
		System.out.println(pascalTriangle);
		
		//Exercise 8*
		System.out.println("---- Exercise 8* ----");
                result = executeStringEquation(inputEquation);
//		JavaSem02.executeStringEquation(inputEquation);
                System.out.println("Result in main: "+result);

                //Exercise 9*
                System.out.println("---- Exercise 9* ----");
    }
    
    
    public static double calculate(int num1, int num2) {
		return (num1-num2)/3;
	}
	
    // Exercise 2
	static int factorialForLoop(int N) {
		int factorial =  1;
		for(int i = 1; i <= N; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	static int factorialRecursive(int N) {
		return factorialForLoop(N);
	}
	
	
	
	static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime) {
		double position = 0.0;
		position = (0.5 * gravity * Math.pow(fallingTime, 2)) + (initialVelocity * fallingTime) + initialPosition;
		return position;
	}
	
        
        
	static void printMarathonists(String[] _names, int[] _times) {
		
		if(_names.length == _times.length) {
			for(int i = 0; i < _times.length; i++) {
				System.out.println(_names[i] + " " + _times[i]);
			}
		}
	}
	
	static void createMarathonists(String[] _names, int[] _times) {
		if(_names.length == _times.length) {
                    
			for(int i = 0; i < _times.length; i++) {
                            
                            Marathonist _marathonist = new Marathonist(_names[i], _times[i]);
                            marathonists.add(_marathonist);
                            
			}	
                }
	}
	
	//Exercise 3
	static double[] generateArray(int N, double lower, double upper) {
				double[] newArray = new double[N];
				Random random =  new Random();
				if(upper > lower) {
					for(int i = 0; i < N; i++) {
						newArray[i] = lower + (random.nextDouble() * (upper - lower));
					}
					return newArray;
				} else {
					return newArray;
				}
				
			}
			
	static double getMean(double[] array) {
				double summ = 0;
				for(int i = 0; i< array.length; i++) {
					summ += array[i];
				}
				return summ / array.length;
			}
			
	static double getMin(double[] array) {
				double min = 0;
				for(int i = 0; i < array.length; i++){
					if(array[i] < array[i + 1]) {
						min = array[i];
					} else {
						min = array[i + 1];
					}
				}
				return min;	
			}
			
	static double getMax(double[] array) {
				double max = 0;
				for(int i = 0; i < array.length; i++){
					if(array[i] > array[i + 1]) {
						max = array[i];
					} else {
						max = array[i + 1];
					}
				}
				return max;	
			}
	//Bubble sort
	static double[] arraySort(double[] array) {
				for (int i = 0; i < array.length; i++) {
					double tmp;
					if (array[i - 1] > array[i]) {
						tmp = array[i - 1];
						array[i - 1] = array[i];
						array[i] = tmp;
					}
				}
				return array;
			}
	//Exercise 4
	static double[][] generateMatrix(int N) {
				double[][] newArray = new double[N][N];
				Random rnd = new Random();
				System.out.println("Generated matrix: ");
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						newArray[i][j] = rnd.nextInt(50);
						System.out.print(newArray[i][j]+" ");
					}
					System.out.println("\n");
				}
				return newArray;
			}
			
	static double getProduct(double[][] matrix, int i, int j) {
            double result = 0.0;
            for (int k = 0; k < matrix.length; k++) {
                for (int l = 0; l < matrix.length; l++) {
                    if(k == i && l == j) {
                        result = matrix[k][l];
                    }
                }
            }
            return result;
	}

	
	//Exercise 5
	static double[] coinFlip(int N) {
				
            Random rnd = new Random();
            int flip;
            double[] flipArray = new double[3];
            for (int i = 0; i < N; i++) {
                flip = rnd.nextInt(2);
                if(flip==1) {
                flipArray[0] = flipArray[0] + 1;
                } else {
                    flipArray[1] = flipArray[1] + 1;
                }
            }
				
            flipArray[2] = flipArray[0] / flipArray[1];
				
            return flipArray;
	}
			
	//Part 2
			static int[] rollDice(int N) {
                            System.out.println("Roll Dice");
				int[] roll = new int[N];
				for (int i = 0; i < N; i++) {
					roll[i] = (int)(Math.random()*6+1);
					
//					int RollValue = rand.nextInt(6)+1; //lekcijas variants (1 lidz 6)
				}
				return roll;
			}
	//Part 3
	//Roll until both dices are 6, output the number of tries.
			static int roll2Dices() {
                            System.out.println("Roll 2 Dices");
				int tries = 0;
				int dice1 = 0;
				int dice2 = 0;
				do {
					dice1 = (int)(Math.random()*6+1);
					dice2 = (int)(Math.random()*6+1);
					tries++;
				} while (dice1 == 6 && dice2 == 6);
				return tries;
			}
	//Exercise 6
			static String getTextFromBytes(byte[] array) {
				char[] newCharArray = new char[array.length];
				String text = "testText";
				for (int i = 0; i < array.length; i++) {
					newCharArray[i] = (char)byteArray[i];
//				System.out.print(newCharArray[i]+" ");
				}
				text = String.valueOf(newCharArray);
				return text;
				
			}
	//Exercise7
			static String pascalsTriangle(int level){
			
                        
                            
                        String result = "[";
			int n = level;
			int r = n + 1;
                        int tempResult;
			
			for (int i = 0; i <= r; i++) {
                            
                                tempResult = (factorialForLoop(n))/((factorialForLoop(i))*(factorialForLoop(n-i)));    
                                
                                    if(i != r ){
                                            
                                            if(i == r - 1) {
                                                result += tempResult+" ";
                                            } else {
                                                result += tempResult+", ";
                                            }
                                    } 
                                    else {
                                            result += "]";
                                    }
                            
                        }
			return result;
				
}
			
	// Exercise 8*
			static double executeStringEquation(String inputEquation) {
				double result = 0.0;
                                int e = 0;
                                int nexte = 0;
                                String tempNum = "";
				
                                String newEquation = new String();
                                for(int i=0;i<inputEquation.length();i++) {
                                            if(inputEquation.charAt(i) == 32){

                                            }
                                            else
                                            {
                                                newEquation = newEquation + inputEquation.charAt(i);
                                            }
                                        }
                                        System.out.println("Ar iznemtiam atstarpem: "+newEquation);
				char[] charEquation = new char[newEquation.length()];
                                charEquation = newEquation.toCharArray();
                                int[] numbers = new int[newEquation.length()/2 + newEquation.length()%2];
                                char[] operators = new char[newEquation.length() - numbers.length - 1];
                                
                                System.out.println("charEquation.length(): "+(charEquation.length));
                                System.out.println("number.length: "+numbers.length+" operators.length:"+operators.length);
//                                System.out.println(inputEquation);
                                System.out.println(charEquation);
                                
				for (int i = 0; i <= numbers.length; i++) {
//					System.out.print(charEquation[i]);
//                                      System.out.println(i%2);
                                        e = Character.getNumericValue(charEquation[i]);
                                        nexte = Character.getNumericValue(charEquation[i+1]);
                                        System.out.println(e);
                                        
                                            if(e != -1 && nexte != -1) {
    //                                            System.out.println(e);
                                                tempNum = Integer.toString(e) + Integer.toString(nexte);
                                                e = Integer.parseInt(tempNum);
                                                System.out.println("string to int: " + e);
                                                numbers[i] = e;

                                            } else if (e != -1) {
                                                numbers[i] = e;
                                            } else {
                                                
                                            }			
                                }
                                System.out.println("\n");
                                System.out.println("numbers: ");
                                for (int i = 0; i < numbers.length; i++) {
                                    System.out.println(numbers[i]);
                                }
//                                System.out.println("operators: ");
//                                for (int i = 0; i < operators.length; i++) {
//                                    System.out.println(operators[i]);
//                                }
                                for (int i = 0; i < numbers.length + operators.length; i++){
                                    switch (operators[i]){
                                        case '+' :
                                            result = result + numbers[i] + numbers[i+1];
                                            break;
                                        case '-':
                                            result= result +numbers[i] - numbers[i+1];
                                            break;
                                        case '/' :
                                            result= result +numbers[i] / numbers[i+1];
                                            break;
                                        case '*':
                                            result= result +numbers[i] * numbers[i+1];
                                            break;

                                    }
                                }
				return result;
			}
}

class Marathonist
	{
		private String name;
		private int time;
		
		public Marathonist(String name, int time) {
			this.name = name;
			this.time = time;
		}
		protected String getName() {
			return name;
		}

		protected void setName(String name) {
			this.name = name;
		}

		protected int getTime() {
			return time;
		}

		protected void setTime(int time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "Marathonist [name=" + name + ", time=" + time + "]";
		}
	}