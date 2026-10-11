/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends pg {
    og[] field_n;
    int[] field_p;
    og[] field_g;
    static String field_q;
    int field_m;
    int[] field_o;
    int field_s;
    static hb field_r;
    static boolean field_i;
    static lb field_k;
    int[] field_j;
    byte[][][] field_l;
    static kc field_h;

    public static void a(int param0) {
        field_k = null;
        field_q = null;
        if (param0 == -791) {
          field_h = null;
          field_r = null;
          return;
        }
        field_r = (hb) null;
        field_h = null;
        field_r = null;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 >= 114) {
          if (param1 == 0) {
            var2 = on.field_h;
          }
          if (param1 == 1) {
            var2 = ra.field_m;
          }
          if (param1 == 2) {
            var2 = hd.field_b;
          }
          return var2;
        }
        return 99;
    }

    oh() {
    }

    static {
        field_q = "Show all lobby chat";
        field_i = false;
    }
}
