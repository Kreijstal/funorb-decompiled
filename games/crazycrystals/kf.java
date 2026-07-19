/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static mk field_b;
    static int field_c;
    static int[] field_d;
    static int[] field_a;
    static int[] field_e;
    static boolean field_g;
    static ol field_h;
    static String field_f;

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
        if (param0 != -1) {
            field_c = 102;
        }
        field_d = null;
        field_f = null;
    }

    final static boolean b(int param0) {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -84 / ((-37 - param0) / 38);
            if (hp.field_s < 10) {
              break L1;
            } else {
              if ((eq.field_j ^ -1) > -14) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    static {
        int var0 = 0;
        field_b = new mk();
        field_g = false;
        field_e = new int[17];
        for (var0 = 0; (var0 ^ -1) > -18; var0++) {
            field_e[var0] = -1;
        }
        field_e[16] = 0;
        field_f = null;
    }
}
