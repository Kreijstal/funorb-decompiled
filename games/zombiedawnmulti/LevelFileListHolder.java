/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelFileListHolder {
    static boolean field_b;
    static String field_a;
    static LevelFileList field_d;
    static String field_c;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 == 23376) {
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
        LevelFileListHolder.releaseStatics(94);
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_z = "bn.A(";
        field_b = true;
        field_a = "Reject";
        field_c = "Unpacking graphics";
    }
}
