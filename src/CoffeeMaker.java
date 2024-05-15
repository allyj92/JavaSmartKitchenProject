public class CoffeeMaker {
    private boolean hasWorkToDo;

    // 기본 생성자
    public CoffeeMaker() {
        this.hasWorkToDo = false;
    }

    // 인자를 받는 생성자
    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}