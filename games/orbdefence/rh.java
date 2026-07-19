/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_d;
    static String field_a;
    static int[] field_c;
    static int[] field_e;
    static hj field_b;

    final static void a(byte param0, int param1, boolean param2) {
        int var3 = 0;
        var3 = 99 / ((param0 - 75) / 33);
        te.field_O = 0;
        kk.field_S = param1;
        if ((kk.field_S ^ -1) <= -1) {
          nc.field_cb[kk.field_S].a(param2, (byte) 53);
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 20) {
          rh.a((byte) -94);
          field_b = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    static {
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_a = "Cost";
        field_e = new int[4];
    }
}
