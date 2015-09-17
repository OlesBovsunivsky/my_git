package myHashMap;

import myHashMap.UnitMapTest;

import java.util.HashMap;


public class RunUnitHashMapTest {


    public static void main(String[] args) {
        UnitMapTest unitMapTest = new UnitMapTest(new HashMap<Integer, Object>());
        unitMapTest.runAll();
    }
}
