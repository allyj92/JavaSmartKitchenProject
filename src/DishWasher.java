public class DishWasher {
    private boolean hasWorkToDo;

    // 기본 생성자
    public DishWasher() {
        this.hasWorkToDo = false;
    }

    // 인자를 받는 생성자
    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Do dishes");
            hasWorkToDo = false;
        }
    }
}
