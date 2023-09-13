package pl.globallogic.intermediate.zad28;

public class paintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; // Invalid value check
        }

        double wallArea = width * height;
        int bucketsNeeded = (int) Math.ceil(wallArea / areaPerBucket);

        return bucketsNeeded - extraBuckets;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // Output: 1 (1 bucket needed)
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Output: 2 (2 buckets needed)
        System.out.println(getBucketCount(3.4, 2.1, 1.5, -2)); // Output: -1 (invalid value)
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // Output: -1 (invalid value)
    }

}
