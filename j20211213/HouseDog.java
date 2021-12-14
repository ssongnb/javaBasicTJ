package j20211213;
//java에서는 다중상속 허용되지 않음 - java만의 특징
//부모와, 할아버지 것 까지 사용가능.
//****상속부분 중요

public class HouseDog extends Dog{

    public HouseDog(String name){
        this.setName(name);
    }

    public HouseDog(int type){
        if(type == 1){
            this.setName("york");
            }
            else if(type == 2){
            this.setName("yooki");    
            
        }
    }

    public void sleep(){
        System.out.println(this.name+" zzz in house");
    }//인수가 없이 실행했을때는 이곳에서 떨어져 실행

    public void sleep(int hour){
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }//메세지 다르고 sleep의 이름이 같고 ,
    //인수가있을 경우 이곳에 떨어져 실행
    
    public static void main(String[] args) {
        HouseDog houseDog1 = new HouseDog("Happy");//문자열로 생성자 호출
        System.out.println(houseDog1.name);

        HouseDog houseDog2 = new HouseDog(1);//숫자로 생성자 호출

        System.out.println(houseDog2.name);


        //houseDog.setName("happy");
        //객체를 썼을때 생성자가 호출 되로록, 
        //houseDog.sleep();
        //houseDog.sleep(3);

    }
}
