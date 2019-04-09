package practice.newpackage;

/**
 *
 * @author Nayeem
 */
public class SubString {

    static String array = "BARGUNA\n"
            + "\n"
            + "BARISAL\n"
            + "\n"
            + "BHOLA\n"
            + "\n"
            + "JHALOKATI\n"
            + "\n"
            + "PATUAKHALI\n"
            + "\n"
            + "PIROJPUR \n"
            + "\n"
            + "BANDARBAN\n"
            + "\n"
            + "BRAHMANBARIA\n"
            + "\n"
            + "CHANDPUR\n"
            + "\n"
            + "CHITTAGONG\n"
            + "\n"
            + "COMILLA\n"
            + "\n"
            + "COX\'S BAZAR\n"
            + "\n"
            + "FENI\n"
            + "\n"
            + "KHAGRACHHARI\n"
            + "\n"
            + "LAKSHMIPUR\n"
            + "\n"
            + "NOAKHALI\n"
            + "\n"
            + "RANGAMATI \n"
            + "\n"
            + "DHAKA\n"
            + "\n"
            + "FARIDPUR\n"
            + "\n"
            + "GAZIPUR\n"
            + "\n"
            + "GOPALGANJ\n"
            + "\n"
            + "JAMALPUR\n"
            + "\n"
            + "KISHOREGONJ\n"
            + "\n"
            + "MADARIPUR\n"
            + "\n"
            + "MANIKGANJ\n"
            + "\n"
            + "MUNSHIGANJ\n"
            + "\n"
            + "MYMENSINGH\n"
            + "\n"
            + "NARAYANGANJ\n"
            + "\n"
            + "NARSINGDI\n"
            + "\n"
            + "NETRAKONA\n"
            + "\n"
            + "RAJBARI\n"
            + "\n"
            + "SHARIATPUR\n"
            + "\n"
            + "SHERPUR\n"
            + "\n"
            + "TANGAIL\n"
            + "\n"
            + "BAGERHAT\n"
            + "\n"
            + "CHUADANGA\n"
            + "\n"
            + "JESSORE\n"
            + "\n"
            + "JHENAIDAH\n"
            + "\n"
            + "KHULNA\n"
            + "\n"
            + "KUSHTIA\n"
            + "\n"
            + "MAGURA\n"
            + "\n"
            + "MEHERPUR\n"
            + "\n"
            + "NARAIL\n"
            + "\n"
            + "SATKHIRA\n"
            + "\n"
            + "BOGRA\n"
            + "\n"
            + "CHAPAINABABGANJ\n"
            + "\n"
            + "JOYPURHAT\n"
            + "\n"
            + "PABNA\n"
            + "\n"
            + "NAOGAON\n"
            + "\n"
            + "NATORE\n"
            + "\n"
            + "RAJSHAHI\n"
            + "\n"
            + "SIRAJGANJ\n"
            + "\n"
            + "DINAJPUR\n"
            + "\n"
            + "GAIBANDHA\n"
            + "\n"
            + "KURIGRAM\n"
            + "\n"
            + "LALMONIRHAT\n"
            + "\n"
            + "NILPHAMARI\n"
            + "\n"
            + "PANCHAGARH\n"
            + "\n"
            + "RANGPUR\n"
            + "\n"
            + "THAKURGAON\n"
            + "\n"
            + "HABIGANJ\n"
            + "\n"
            + "MAULVIBAZAR\n"
            + "\n"
            + "SUNAMGANJ\n"
            + "\n"
            + "SYLHET";

    public static void main(String... args) {

        String b[] = array.split("\n");
        String c = array.replace("\n", "<item>\n");
        String d[] = c.split("\n");
        String e[] = new String[d.length];

//        for(int i = 0; i<d.length; i++){
//           // System.out.println(i+". "+b[i]);
//            System.out.println(i+". "+d[i]);
//        }
        for (int i = 0; i < d.length; i++) {
            e[i] = "<item>" + b[i] + "</item>";
            System.out.println(e[i]);
        }
        
        String f = e.toString();

         System.out.println(f);
    }

}
