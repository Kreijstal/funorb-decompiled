/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ncb {
    static int[][] field_a;
    static int field_b;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        field_a = (int[][]) null;
        if (param0 != 500) {
          ncb.clearSharedReferences(-91);
        }
    }

    static {
        field_z = "ncb.A(";
        field_b = 500;
    }
}
