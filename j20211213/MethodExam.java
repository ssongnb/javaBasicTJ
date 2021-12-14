package j20211213;

public class MethodExam {
        //1. input과 ouput이 모두 있는 메서드(일반적인 형태)
        public int sum(int a, int b){
            return a+b;
        }

        //2. input과 ouput이 모두 없는 메서드
        public void noino(){
            System.out.println("no input no ouput");
        }

        //3. input만 있는 메서드
        public void onlyInput(String a){
            System.out.println(a);
        }
        //4. ouput만 있는 메서드
        public String onlyOuput(){
            return "hi";
        }
            
        //*리턴의 다른 사용법
        public void sayNick(String nick){
            if("fool".equals(nick)){
                return;//return으로 가면 그냥 끝난다. 
            }
            System.err.println("my nick name is "+nick);
        }
        public static void main(String[] args) {
            MethodExam inandout = new MethodExam();
            // System.out.println(inandout.sum(3,4));
            // inandout.noino();//아무것도 없기에 System.out.println없이 불러냄, 돌아오는 것은 없지만 
            //                 //출력하는 syso로인해 그대로 
            // inandout.onlyInput("Hellod World");
            // System.out.println(inandout.onlyOuput());
            inandout.sayNick("fool");
            inandout.sayNick("austin");


        
    }
}
