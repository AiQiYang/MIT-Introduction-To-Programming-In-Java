class Marathon {
    // A function to find the fastest people, then return the index of people
    public static int findFastest (String[] name, int[] times) {
        int timeSize = times.length;
        int nameSize = name.length;

        // Check the length of name is equal to the length of times
        if (timeSize != nameSize) {
            System.out.println("error");
            return -1;
        }

        // Find the lowest value in times
        int lowest = times[0];
        int lowestIndex = 0;
        for (int i = 1; i < timeSize; i++) {
            if (times[i] < lowest) {
                lowest = times[i];
                lowestIndex = i;
            }
        }

        return lowestIndex;
    }

    // A function to find the second best people
    public static int findSecond (String[] name, int[] times) {
        int timeSize = times.length;
        int nameSize = name.length;

        // Check the length of name is equal to the length of times
        if (timeSize != nameSize) {
            System.out.println("error");
            return -1;
        }

        // Find the second-best value in times
        int lowest = Integer.MAX_VALUE;
        int lowestIndex = 0;
        int second = Integer.MAX_VALUE;
        int secondIndex = 0;
        for (int i = 0; i < timeSize; i++) {
            if (times[i] < lowest) {
                second = lowest;
                secondIndex = lowestIndex;
                lowest = times[i];
                lowestIndex = i;
            }
            if (times[i] < second && times[i] != lowest) {
                second = times[i];
                secondIndex = i;
            }
        }

        return secondIndex;
    }

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        int fastestIndex = findFastest(names, times);
        // Make sure the size of names and times are same
        if (fastestIndex != -1) {
            System.out.println("The fastest runner is " + names[fastestIndex] + ", His/Her time taken is " + times[fastestIndex]);
        }

        int secondIndex = findSecond(names, times);
        // Make sure the size of names and times are same
        if (secondIndex != -1) {
            System.out.println("The second-best runner is " + names[secondIndex] + ", His/Her time taken is " + times[secondIndex]);
        }

    }
} 