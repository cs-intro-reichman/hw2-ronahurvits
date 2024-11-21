// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String capLetters = "AEFHILMNORSX";
                int linesNum = Integer.parseInt(args[1]);
                String capInput = "";
                for (int i = 0; i < args[0].length(); i++) {
                        char c = args[0].charAt(i); 
                        if (c >= 'a' && c <= 'z'){
                                c-=32;
                        }
                        capInput += c;}
                for (int i = 0; i < capInput.length(); i++){
                        for (int inTmp = 0; inTmp < capLetters.length(); inTmp++){
                                if (capInput.charAt(i) == capLetters.charAt(inTmp)) 
                                {System.out.println("Give me an " + capLetters.charAt(inTmp) + ": " + capLetters.charAt(inTmp) + "!");
                                break;}
                                else if (inTmp == capLetters.length()-1) System.out.println("Give me a  " + capInput.charAt(i) + ": " + capInput.charAt(i) + ("!"));
                                }
                        }
                System.out.println("What does that spell?");
                for (int i = 0; i < linesNum; i++){
                        System.out.println(capInput+"!!!");
                }
                }
                }
        

