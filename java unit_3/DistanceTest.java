class Distance {
    int feet, inches;

    Distance() { feet = 0; inches = 0; }

    Distance(int f, int i) {
        feet = f;
        inches = i;
        normalize();
    }

    private void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        } else if (inches < 0) {
            feet -= 1 + (-inches) / 12;
            inches = 12 + (inches % 12);
        }
    }

    Distance addDistance(Distance d) {
        return new Distance(this.feet + d.feet, this.inches + d.inches);
    }

    Distance subtractDistance(Distance d) {
        int totalInches1 = this.feet * 12 + this.inches;
        int totalInches2 = d.feet * 12 + d.inches;
        int diff = totalInches1 - totalInches2;
        return new Distance(diff / 12, diff % 12);
    }

    void display() {
        System.out.println(feet + " ft " + inches + " in");
    }
}

public class DistanceTest {
    public static void main(String[] args) {
        System.out.println("suraj gupta");
        Distance d1 = new Distance(5, 10);
        Distance d2 = new Distance(3, 8);
        Distance sum = d1.addDistance(d2);
        Distance diff = d1.subtractDistance(d2);
        System.out.print("Sum: "); sum.display();
        System.out.print("Diff: "); diff.display();
    }
}