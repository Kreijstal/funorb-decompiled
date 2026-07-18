/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static String field_a;
    static int[][][][][] field_c;
    static long field_b;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 31349) {
            field_a = null;
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (eq.a(false)) {
            jd.a(13, param3, 14686, 15);
            if (wi.field_v != null) {
                if (wi.field_v.a(param3, -2, 0, 11, 13)) {
                    param3 = false;
                    da.b(98);
                }
            }
            lc.a(44, 13, param3);
            dn.a(param3, 14, true);
            param3 = false;
        }
        return param3;
    }

    final static void a(boolean param0, int param1) {
        hl.field_e = kd.a(25, 0, true, false, 11, 128);
        am.field_h = kd.a(50, 25, true, false, 11, 128);
        hq.field_e = kd.a(75, 50, false, false, 11, 128);
        ub.field_G = kd.a(100, 75, false, false, 11, 128);
    }

    final static boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 64) {
          if (null == fb.field_J) {
            if (kd.field_s) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          boolean discarded$5 = in.a((byte) 24);
          if (null != fb.field_J) {
            return true;
          } else {
            L0: {
              if (!kd.field_s) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "No";
    }
}
