/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends li {
    int field_r;
    static int[] field_t;
    static String field_o;
    int field_n;
    static cr field_s;
    static String field_p;
    static byte[] field_q;

    fd(int param0, int param1) {
        ((fd) this).field_n = param1;
        ((fd) this).field_r = param0;
    }

    public static void a(int param0) {
        field_t = null;
        field_o = null;
        field_s = null;
        if (param0 != -16836) {
          field_t = null;
          field_q = null;
          field_p = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Just play";
        field_t = new int[8192];
        field_q = new byte[]{(byte) 0, (byte) 0, (byte) 0};
    }
}
