/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mhb extends rqa {
    static ij field_o;

    final static caa a(int param0, caa param1, int[] param2) {
        caa var3 = new caa(0, 0, 0);
        var3.field_g = param1.field_g;
        var3.field_e = param1.field_e;
        int var4 = 50 / ((param0 - 20) / 62);
        var3.field_d = param1.field_d;
        var3.field_j = param1.field_j;
        var3.field_a = param1.field_a;
        var3.field_f = param1.field_f;
        var3.field_i = param2;
        var3.field_h = param1.field_h;
        return var3;
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != -2679) {
          L0: {
            mhb.e((byte) 84);
            if ((384 & param1) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((384 & param1) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void e(byte param0) {
        if (param0 != -127) {
            boolean discarded$0 = mhb.a(8, 67, -87);
            field_o = null;
            return;
        }
        field_o = null;
    }

    mhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(30, 62, param0[0].a(23));
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ij();
    }
}
