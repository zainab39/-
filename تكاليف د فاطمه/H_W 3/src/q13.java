//What is the difference between a shallow equality test and a deep equality
//        test between two Java arrays, A and B,
//        if they are one-dimensional arrays of type int? What
//        if the arrays are two-dimensional arrays of type int?
//
//        int[] A = {1, 2, 3};
//        int[] B = {1, 2, 3};
//        boolean shallowEquality = (A == B); // Returns false
//
//
//        int[] A = {1, 2, 3};
//        int[] B = {1, 2, 3};
//        boolean deepEquality = Arrays.equals(A, B); // Returns true