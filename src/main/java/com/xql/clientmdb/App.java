package com.xql.clientmdb;

public class App {
    public static void main(String[] args) {
        String baseUrl = "http://localhost:8080";
        // String baseUrl = "http://api001.multidb.net:8080";

        // List of virtual schemas
        String url = baseUrl + "/api/v1/schemas";
        ListSchemas listSchemas = new ListSchemas();
        listSchemas.setUrl(url);
        listSchemas.getSchemas();
        System.out.println();

        // List of database sources
        url = baseUrl + "/api/v1/dbconns";
        ListDbconns listDbconns = new ListDbconns();
        listDbconns.setUrl(url);
        listDbconns.getDbconns();
        System.out.println();

        RemoveDvschema removeDvschema = new RemoveDvschema();
        removeDvschema.setBaseUrl(baseUrl);

        // incorrect input
        // 1. remove a virtual schema: dvsname is NULL.
        System.out.println("1. remove a virtual schema: dvsname is NULL.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname(null);

        removeDvschema.removeDvschema();
        System.out.println();

        // incorrect input
        // 2. remove a virtual schema: dvsname is an empty string.
        System.out.println("2. remove a virtual schema: dvsname is an empty string.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("");

        removeDvschema.removeDvschema();
        System.out.println();

        // incorrect input
        // 3. remove a virtual schema: dvsname is a blank string.
        System.out.println("3. remove a virtual schema: dvsname is a blank string.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("     ");

        removeDvschema.removeDvschema();
        System.out.println();

        // incorrect input
        // 4. remove a virtual schema: dvsname is a blank string.
        System.out.println("4. remove a virtual schema: dvsname is a blank string.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("null");

        removeDvschema.removeDvschema();
        System.out.println();

        // incorrect input
        // 5. remove a virtual schema: dvsname contains a space.
        System.out.println("5. remove a virtual schema: dvsname contains a space.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("north wind_a");

        removeDvschema.removeDvschema();
        System.out.println();

        // incorrect input
        // 6. remove a virtual schema: dvsname contains a special character.
        System.out.println("6. remove a virtual schema: dvsname contains a special character.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("northwind_a#x");

        removeDvschema.removeDvschema();
        System.out.println();

        // incorrect input
        // 7. remove a virtual schema: dvsname does not exist.
        System.out.println("7. remove a virtual schema: dvsname does not exist.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("northwind_ab");

        removeDvschema.removeDvschema();
        System.out.println();

        // correct input
        // 8. remove a virtual schema: northwind_a
        System.out.println("8. remove a virtual schema: northwind_a");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("northwind_a");

        removeDvschema.removeDvschema();
        System.out.println();

        // incorrect input
        // 9. remove a virtual schema: northwind_a does not exist.
        System.out.println("9. remove a virtual schema: northwind_a does not exist.");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("northwind_a");

        removeDvschema.removeDvschema();
        System.out.println();

        // correct input
        // 10. remove a virtual schema: northwind_b
        System.out.println("10. remove a virtual schema: northwind_b");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("northwind_b");

        removeDvschema.removeDvschema();
        System.out.println();

        // correct input
        // 11. remove a virtual schema: northwind_c
        System.out.println("11. remove a virtual schema: northwind_c");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("northwind_c");

        removeDvschema.removeDvschema();
        System.out.println();

        // correct input
        // 12. remove a virtual schema: northwind
        System.out.println("12. remove a virtual schema: northwind");
        url = baseUrl + "/api/v1/rmschema/";
        removeDvschema.setUrl(url);
        removeDvschema.setDvsname("northwind");

        removeDvschema.removeDvschema();
        System.out.println();

        url = baseUrl + "/api/v1/schemas";
        listSchemas.setUrl(url);
        listSchemas.getSchemas();
        System.out.println();

        url = baseUrl + "/api/v1/dbconns";
        listDbconns.setUrl(url);
        listDbconns.getDbconns();
        System.out.println();

    }
}
