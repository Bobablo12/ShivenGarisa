package summer;

public class Classes { // class declaration
    private String place; // instance variables
    private int quantity;
    private double price;

    public Classes(String place, int quantity, double price) { // constructor
        this.place = place;
        this.quantity = quantity;
        this.price = price;
    }

    public String getLast() { //method
        String[] words = place.split(" ");
        if (words.length > 1) {
            return words[words.length - 1];
        } else {
            return getHalf();
        }
    }

    private String getHalf() {
        int halfIndex = place.length() / 2;
        return place.substring(halfIndex);
    }

    public double getTotalPrice() {
        double totalPrice = price * quantity;
        double tax = totalPrice * 0.08;
        return totalPrice + tax;
    }

    public void printItemInfo() {
        System.out.println("Place: " + place);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Last Word of Place: " + getLast());
        System.out.println("Total Price (including tax): $" + getTotalPrice());
    }

    public static double salePrice(int percentage) {
        Classes c = new Classes("Supermarket", 1, 10.0);
        double totalPrice = c.getTotalPrice();
        double salePrice = totalPrice - (totalPrice * percentage / 100);
        return salePrice;
    }

    public static void main(String args[]) {
        Classes c = new Classes("Supermarket", 5, 2.99);
        c.printItemInfo();
        System.out.println(c.getLast());
        System.out.println(salePrice(78));
    }
}