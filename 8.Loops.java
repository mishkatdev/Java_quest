public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
    System.out.println(i);
    }
    
    int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}


do {
    System.out.println(i);
    i++;
} while (i <= 5);

for (int k = 1; k <= 5; k++) {

    if (i == 3)
        break;

    System.out.println(i);
}

for (int j = 1; j <= 5; j++) {

    if (i == 3)
        continue;

    System.out.println(i);
}

    }
}