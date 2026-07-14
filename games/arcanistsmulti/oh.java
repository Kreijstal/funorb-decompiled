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
        if (param0 != -791) {
          field_r = null;
          field_h = null;
          field_r = null;
          return;
        } else {
          field_h = null;
          field_r = null;
          return;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (param0 < 114) {
          return 99;
        } else {
          L0: {
            if (param1 == 0) {
              var2 = on.field_h;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param1 == 1) {
              var2 = ra.field_m;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((param1 ^ -1) != -3) {
              break L2;
            } else {
              var2 = hd.field_b;
              break L2;
            }
          }
          return var2;
        }
    }

    oh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Show all lobby chat";
        field_i = false;
    }
}
