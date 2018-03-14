package com.gmail.jackkobec.java.core.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Jack <J@ck>
 * https://stackoverflow.com/questions/49288767/get-list-from-array-list
 */

/**
 i have these values and now i have lists of items but i need to get lists of categories that ServiceKind = 1
 */
public class ListOfCategoriesByCondition {
    public static void main(String[] args) {
        Item[] itemModelList = new Item[]{};
        List<List<Category>> categoriesByCondition = Arrays.stream(itemModelList)
                .map(item ->
                        Arrays.stream(item.categories).filter(category -> category.ServiceKind == 1).collect(Collectors.toList())
                ).collect(Collectors.toList());
    }
}

//Example model
class Item {
    public Category[] categories;
}

class Category {
    public int ServiceKind;
}
