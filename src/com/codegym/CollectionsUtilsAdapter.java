package com.codegym;

import com.sun.org.apache.xml.internal.utils.ListingErrorHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionsUtilsAdapter {
    public void findMax(List<Integer> integers){
        CollectionUtils collectionUtils = new CollectionUtils();
        collectionUtils.findMax(integers);
    }
}
