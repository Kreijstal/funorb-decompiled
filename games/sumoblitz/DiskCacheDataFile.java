/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheDataFile {
    static String lowText;
    static BufferedCacheFile dataFile;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 <= 101) {
          return;
        }
        dataFile = null;
        lowText = null;
    }

    static {
        field_z = "bc.A(";
        lowText = "Low";
    }
}
