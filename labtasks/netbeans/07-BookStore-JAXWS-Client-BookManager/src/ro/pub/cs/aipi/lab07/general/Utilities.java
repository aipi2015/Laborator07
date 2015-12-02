package ro.pub.cs.aipi.lab07.general;

import java.lang.reflect.Field;
import java.util.List;

import ro.pub.cs.aipi.lab07.businesslogic.PersistentEntity;

public class Utilities {

    public static void displayMenu() {
        System.out.println("BookManager");
        System.out.println("-----------");
        System.out.println("1 - getBooksList");
        System.out.println("2 - getBooksListWithStockpile");
        System.out.println("3 - quit");
        System.out.println("Enter your option: ");
    }

    public static <T> void displayResults(List<T> persistentEntityList, Class<? extends PersistentEntity> classType) {
        Field[] fields = classType.getDeclaredFields();
        for (Field field : fields) {
            System.out.format("%-" + Constants.FIELD_LENGTH + "." + Constants.FIELD_LENGTH + "s ", field.getName());
        }
        System.out.println();
        for (int index = 0; index < fields.length; index++) {
            for (int position = 0; position < Constants.FIELD_LENGTH; position++) {
                System.out.print("-");
            }
            System.out.print(" ");
        }
        System.out.println();
        try {
            for (T persistentEntity : persistentEntityList) {
                for (Field field : fields) {
                    field.setAccessible(true);
                    System.out.format("%-" + Constants.FIELD_LENGTH + "." + Constants.FIELD_LENGTH + "s ", field.get(persistentEntity));
                }
                System.out.println();
            }
        } catch (IllegalAccessException illegalAccessException) {
            System.out.println("An exception has occurred: " + illegalAccessException.getMessage());
            if (Constants.DEBUG) {
                illegalAccessException.printStackTrace();
            }
        }
    }

}
