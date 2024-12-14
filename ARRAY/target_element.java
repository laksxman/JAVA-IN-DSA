public class target_element {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target_element = 40;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target_element){
                found = true;
                break;
            }
        }
        if(found == true){
            System.out.println("element is found: "+target_element);
        }
        else{
            System.out.println("element not found:");
        }
    }
}