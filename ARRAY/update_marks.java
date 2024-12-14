public class update_marks {

    public static void update(int marks[], int NonChangeble){
        NonChangeble = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;     // it will update the value with the help of call by refrence.
        }
    }
    public static void main(String[] args) {
        int NonChangeble = 10;
        int marks[] = {34,45,56};
        update(marks, NonChangeble);

        // print our marks
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+ " ");
        }
        System.out.println(NonChangeble);

    }
}
