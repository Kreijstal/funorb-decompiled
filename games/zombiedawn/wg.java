/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends le {
    static String field_o;
    static String field_l;
    int field_q;
    int field_i;
    int field_r;
    static int field_p;
    int field_h;
    int field_m;
    static int field_n;
    static byte[][][] field_j;
    int field_k;

    public static void a(int param0) {
        int var1 = 74 % ((-19 - param0) / 33);
        field_l = null;
        field_o = null;
        field_j = null;
    }

    final static v a(int param0, dj param1, int param2, int param3) {
        if (param2 == -28490) {
          if (!ph.a(param3, 31043, param0, param1)) {
            return null;
          } else {
            return fe.b(true);
          }
        } else {
          wg.a(-121);
          if (!ph.a(param3, 31043, param0, param1)) {
            return null;
          } else {
            return fe.b(true);
          }
        }
    }

    wg(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((wg) this).field_i = param0;
        ((wg) this).field_h = param5;
        ((wg) this).field_k = param3;
        ((wg) this).field_m = param4;
        ((wg) this).field_r = param1;
        ((wg) this).field_q = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "End of Free Game";
        field_l = "Sound: ";
    }
}
