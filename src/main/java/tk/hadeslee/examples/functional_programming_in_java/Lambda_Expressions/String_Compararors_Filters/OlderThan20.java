package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters;

import static tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters.Compare.people;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: OlderThan20
 * Date: 2015-11-03
 * Time: 오전 10:13
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OlderThan20 {

    public static void main(String[] args) {
        List<Person> olderThan20 = new ArrayList<>();
        people.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(person -> olderThan20.add(person));
        System.out.println("People older than 20: " + olderThan20);

    }


}
