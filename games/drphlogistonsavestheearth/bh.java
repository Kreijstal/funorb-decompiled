/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bh {
    static String field_d;
    static he[] field_b;
    static nh[] field_c;
    static int field_a;
    static he[] field_e;

    final static void a(byte param0) {
        L0: {
          if (null != ol.field_a) {
            ol.field_a.d(true);
            break L0;
          } else {
            break L0;
          }
        }
        dd.field_g = new ah();
        fb.field_e.a(33, (vg) (Object) dd.field_g);
        if (param0 >= -11) {
          bh.a((byte) 18);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 50) {
            return;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    abstract byte[] c(int param0);

    final static void b(int param0) {
        int var1 = -57 % ((param0 - -21) / 51);
        e.e(-20480);
    }

    abstract void a(byte[] param0, byte param1);

    final static boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -92) {
          L0: {
            field_d = null;
            if (hg.field_ub != lc.field_h) {
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
            if (hg.field_ub != lc.field_h) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
    }
}
