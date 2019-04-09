/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.newpackage;

import java.util.Arrays;

/**
 *
 * @author Nayeem
 */
public class SubSt {

    public static void main(String args[]) {
        String a = "<item>BARGUNA</item>\n"
                + "<item>BARISAL</item>\n"
                + "<item>BHOLA</item>\n"
                + "<item>JHALOKATI</item>\n"
                + "<item>PATUAKHALI</item>\n"
                + "<item>PIROJPUR </item>\n"
                + "<item>BANDARBAN</item>\n"
                + "<item>BRAHMANBARIA</item>\n"
                + "<item>CHANDPUR</item>\n"
                + "<item>CHITTAGONG</item>\n"
                + "<item>COMILLA</item>\n"
                + "<item>COX'S BAZAR</item>\n"
                + "<item>FENI</item>\n"
                + "<item>KHAGRACHHARI</item>\n"
                + "<item>LAKSHMIPUR</item>\n"
                + "<item>NOAKHALI</item>\n"
                + "<item>RANGAMATI </item>\n"
                + "<item>DHAKA</item>\n"
                + "<item>FARIDPUR</item>\n"
                + "<item>GAZIPUR</item>\n"
                + "<item>GOPALGANJ</item>\n"
                + "<item>JAMALPUR</item>\n"
                + "<item>KISHOREGONJ</item>\n"
                + "<item>MADARIPUR</item>\n"
                + "<item>MANIKGANJ</item>\n"
                + "<item>MUNSHIGANJ</item>\n"
                + "<item>MYMENSINGH</item>\n"
                + "<item>NARAYANGANJ</item>\n"
                + "<item>NARSINGDI</item>\n"
                + "<item>NETRAKONA</item>\n"
                + "<item>RAJBARI</item>\n"
                + "<item>SHARIATPUR</item>\n"
                + "<item>SHERPUR</item>\n"
                + "<item>TANGAIL</item>\n"
                + "<item>BAGERHAT</item>\n"
                + "<item>CHUADANGA</item>\n"
                + "<item>JESSORE</item>\n"
                + "<item>JHENAIDAH</item>\n"
                + "<item>KHULNA</item>\n"
                + "<item>KUSHTIA</item>\n"
                + "<item>MAGURA</item>\n"
                + "<item>MEHERPUR</item>\n"
                + "<item>NARAIL</item>\n"
                + "<item>SATKHIRA</item>\n"
                + "<item>BOGRA</item>\n"
                + "<item>CHAPAINABABGANJ</item>\n"
                + "<item>JOYPURHAT</item>\n"
                + "<item>PABNA</item>\n"
                + "<item>NAOGAON</item>\n"
                + "<item>NATORE</item>\n"
                + "<item>RAJSHAHI</item>\n"
                + "<item>SIRAJGANJ</item>\n"
                + "<item>DINAJPUR</item>\n"
                + "<item>GAIBANDHA</item>\n"
                + "<item>KURIGRAM</item>\n"
                + "<item>LALMONIRHAT</item>\n"
                + "<item>NILPHAMARI</item>\n"
                + "<item>PANCHAGARH</item>\n"
                + "<item>RANGPUR</item>\n"
                + "<item>THAKURGAON</item>\n"
                + "<item>HABIGANJ</item>\n"
                + "<item>MAULVIBAZAR</item>\n"
                + "<item>SUNAMGANJ</item>\n"
                + "<item>SYLHET</item>";

        char[] c = a.toCharArray();
        String b[] = a.split("\n");
        Arrays.sort(b);
      
        for (int i = 0; i < b.length; i++) {
            // System.out.println(i+". "+b[i]);
            //System.out.println(c[i]);
            System.out.println(b[i]);
        }

    }

}
