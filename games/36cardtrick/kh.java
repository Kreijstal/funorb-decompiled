/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kh {
    static char[] field_f;
    int field_b;
    static int field_e;
    int[] field_h;
    static bk field_c;
    int field_d;
    java.awt.Image field_a;
    static int field_g;

    public static void b(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 192) {
            field_f = (char[]) null;
        }
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, byte param3);

    abstract void a(java.awt.Component param0, int param1, byte param2, int param3);

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = -73 / ((param0 - -36) / 39);
        param1 = param1 & 8191;
        if (-4097 < param1) {
          L0: {
            if (-2049 > param1) {
              stackOut_7_0 = ad.field_g[2048 + -param1];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -ad.field_g[-2048 + param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((param1 ^ -1) <= -6145) {
              stackOut_3_0 = ad.field_g[param1 + -6144];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -ad.field_g[6144 - param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(int param0) {
        if (param0 != 200) {
            return;
        }
        vj.a(((kh) this).field_h, ((kh) this).field_b, ((kh) this).field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
