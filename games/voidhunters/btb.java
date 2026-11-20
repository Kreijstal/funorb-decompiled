/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class btb {
    static ResourceArchive field_b;
    static BufferedFile[] field_d;
    static String field_c;
    static boolean field_a;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 94) {
          field_c = (String) null;
        }
    }

    static {
        field_z = "btb.A(";
        field_c = "<%0> cannot join; the game has started.";
        field_a = true;
    }
}
