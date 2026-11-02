/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static di field_b;
    static String serviceunavailable;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 62) {
          fh.a(-19, (byte) -76);
          serviceunavailable = null;
          return;
        }
        serviceunavailable = null;
    }

    final static di a(int param0, byte param1) {
        if (param1 == 103) {
          return ji.a(1, true, (byte) -56, param0, false, false);
        }
        fh.a((byte) 116);
        return ji.a(1, true, (byte) -56, param0, false, false);
    }

    static {
        serviceunavailable = "Service unavailable";
    }
}
