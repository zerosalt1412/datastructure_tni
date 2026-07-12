
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 10; i <= 19; i++) {
            numbers.add(i);
        }

        System.out.println("ข้อมูลเริ่มต้น : " + numbers);
        System.out.print("เพิ่มตัวเลข : ");
        numbers.add(sc.nextInt());
        System.out.print("ตำแหน่งที่ต้องการแทรก : ");
        int index = sc.nextInt();
        System.out.print("ค่าที่ต้องการแทรก : ");
        int value = sc.nextInt();
        numbers.add(index, value);
        System.out.print("ตำแหน่งที่ต้องการลบ : ");
        int delete = sc.nextInt();
        numbers.remove(delete);
        System.out.print("ตำแหน่งที่ต้องการแก้ไข : ");
        int update = sc.nextInt();
        System.out.print("ค่าใหม่ : ");
        int newValue = sc.nextInt();
        numbers.set(update, newValue);
        System.out.println("ผลลัพธ์สุดท้าย");
        System.out.println(numbers);

        
    }
}