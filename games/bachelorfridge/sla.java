/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sla {
    static PcmSampleStream field_a;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        if (param0 != 52) {
          sla.clearStaticReferences((byte) 101);
        }
    }

    static {
        field_z = "sla.A(";
    }
}
