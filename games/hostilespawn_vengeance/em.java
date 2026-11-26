/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static int field_c;
    static PcmSample[] field_a;
    static String field_b;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        if (param0 != 126) {
          em.clearStaticReferences((byte) 76);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_z = "em.A(";
        field_c = 0;
        field_a = new PcmSample[28];
        field_b = "Continue";
    }
}
