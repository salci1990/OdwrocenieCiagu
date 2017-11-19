public class Odwrocenie {

        public static void main(String[] args){

            String przed = "Bartek";
            String po = new StringBuffer(przed).reverse().toString();
            System.out.println("Ciąg znaków przed zamianą: " + przed);
            System.out.println("Ciąg znaków po zamianie: " + po);

        }
    }

