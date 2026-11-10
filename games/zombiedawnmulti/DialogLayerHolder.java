/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogLayerHolder {
    static DialogLayer field_a;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 < 95) {
          DialogLayerHolder.releaseStatics((byte) -95);
        }
    }

    static {
        field_z = "nb.A(";
    }
}
