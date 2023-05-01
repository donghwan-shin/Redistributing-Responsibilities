package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // compute the intersection of two sets
        Set<String> intersectionSet = new HashSet<>();
        for (String s : set1) {
            if (set2.contains(s)) {
                intersectionSet.add(s);
            }
        }

        // compute the union of two sets
        Set<String> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);

        return (double) intersectionSet.size() / unionSet.size();
    }

}