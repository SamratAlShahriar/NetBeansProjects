package com.gov.npi.lms.connection;

import com.gov.npi.lms.service.StudentService;

/**
 *
 * @author Samrat Al Shahriar
 */
public class Test {

    public static void main(String[] args) {
        // Connection conn = DbConnection.getConnection();

        DbConnection.getConnection();
        //

        /*
        // ps.save(p);

        //       System.out.println("size: "+ ps.getPersons().size());
        //   ps.delete(5);
        //   p.setId(3);
        //   ps.update(p);
        //split string from comma separated
        String animals = "dog, cat, bear, elephant, giraffe";
        if (animals.contains("dog")) {
            System.out.println("ok");
        }
        String[] animalsArray = animals.split(",");
        for (String s : animalsArray) {
            System.out.println("" + s);
        }
        
        Set<Country> clist = new HashSet<>();
        clist.add(new Country("Turkey"));
        clist.add(new Country("Irag"));
        clist.add(new Country("Iran"));
        clist.add(new Country("Pak"));
        CountryService cs = new CountryService();
        cs.saveList(clist);
         */
    }
}
