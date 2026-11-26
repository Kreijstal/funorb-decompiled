/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static PcmStreamMixer field_a;
    static String field_b;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 26) {
          cb.clearStaticReferences((byte) -2);
        }
    }

    static {
        field_z = "cb.A(";
        field_b = null;
    }
}
