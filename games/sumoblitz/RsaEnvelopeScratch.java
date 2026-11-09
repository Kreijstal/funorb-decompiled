/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RsaEnvelopeScratch {
    static PacketBuffer rsaBuffer;
    static FontMetrics field_a;
    static int field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        rsaBuffer = null;
        if (param0 != 1284) {
          return;
        }
        field_a = null;
    }

    static {
        field_z = "sv.A(";
        field_b = 0;
    }
}
