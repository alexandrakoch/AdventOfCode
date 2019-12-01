package Day1;

public class MainPart1 {

    public static void main(String[] args) {
        double workingDouble;
        int sum = 0;
        SingleLineReader reader = new SingleLineReader();
        String[] workingArray = reader.singleWidthRead("");
        for (String s : workingArray) {
            workingDouble = Double.parseDouble(s);
            workingDouble = workingDouble / 3;
            workingDouble = Math.floor(workingDouble);
            workingDouble -= 2;
            sum += (int) workingDouble;
        }

        System.out.println(sum);

    }
}
