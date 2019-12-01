package Day1;

public class MainPart2 {

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
            boolean fuelReqPositive = true;
            do {
                workingDouble = workingDouble / 3;
                workingDouble = Math.floor(workingDouble);
                workingDouble -= 2;
                if (workingDouble <= 0) {
                    fuelReqPositive = false;
                }
                else {
                    sum += (int) workingDouble;
                }
            }while(fuelReqPositive);
        }

        System.out.println(sum);

    }
}
