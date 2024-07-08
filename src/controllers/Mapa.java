package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String, Integer> mapita=new HashMap<>();
        mapita.put("Manzana", 20);
        mapita.put("Pera", 20);
        mapita.put("Mandarina", 20);
        mapita.put("Mandarina", 21);

        System.out.println(mapita);
        mapita.remove("Pera");

        System.out.println("Existe mandarina: " + mapita.containsKey("Mandarina"));
        System.out.println("Existe pera: " + mapita.containsKey("Pera"));

        int valorManzana = mapita.get("Manzana");
        System.out.println("El valor de Manzana es: " + valorManzana);

        System.out.println(mapita.size());
        System.out.println("Esta vacio:"+ mapita.isEmpty());

        System.out.println("\n Claves del mapa");
        for (String clave : mapita.keySet()) {
            System.out.println("---> " + clave);
        }
        for (Integer value : mapita.values()) {
            System.out.println("---> " + value);
        }
        mapita.replaceAll((k,v) -> v*2);
        System.out.println(mapita);

        mapita.clear();
        System.out.println(mapita);
    }
}
