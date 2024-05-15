public class Refrigerator {
    private boolean hasWorkToDo;

    // 기본 생성자
    public Refrigerator() {
        this.hasWorkToDo = false;
    }

    // 인자를 받는 생성자
    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}
