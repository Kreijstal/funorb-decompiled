/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CompletedStatusText {
    static String text;
    private static String field_z;

    public static void releaseStatics(int param0) {
        text = null;
        int var1 = 82 % ((29 - param0) / 57);
    }

    static {
        field_z = "iaa.A(";
        text = "Completed!";
    }
}
