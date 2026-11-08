/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static boolean field_d;
    static ClientProtocolStage field_c;
    static VerticalScrollbar field_b;
    static int field_a;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 > -41) {
          uk.releaseStatics((byte) 113);
        }
    }

    static {
        field_z = "uk.A(";
        field_c = new ClientProtocolStage();
    }
}
