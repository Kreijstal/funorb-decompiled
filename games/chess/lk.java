/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int[] field_c;
    static int field_e;
    static String field_b;
    static java.awt.Frame field_a;
    static String field_f;
    static String field_d;

    final static void a(java.math.BigInteger param0, p param1, p param2, int param3, java.math.BigInteger param4) {
        if (param3 <= 53) {
            return;
        }
        ni.a(0, param1.field_l, param0, param2, -21105, param4, param1.field_o);
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            lk.a((java.math.BigInteger) null, (p) null, (p) null, 110, (java.math.BigInteger) null);
        }
    }

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        var5 = Chess.field_G;
        g.field_a = kn.field_D;
        if (param1 != param2) {
          if (100 <= param2) {
            if (-106 < param2) {
              lg.field_a = sc.a(param3, param2, (byte) 90);
              return;
            } else {
              lg.field_a = a.a(args, param1 ^ -183);
              return;
            }
          } else {
            lg.field_a = sc.a(param3, param2, (byte) 90);
            return;
          }
        } else {
          L0: {
            stackOut_1_0 = 18621;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (-14 >= cn.field_f) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          lg.field_a = cf.b(stackIn_4_0, stackIn_4_1 != 0);
          return;
        }
    }

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 >= 77) {
          if (null == pi.field_d) {
            if (!ve.k(-105)) {
              if (null == pj.field_h) {
                if (jj.b(7)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_e = 0;
        field_b = "The account name you use to access RuneScape and other Jagex.com games";
        field_f = "Show lobby chat from my friends";
        field_d = "Try again";
    }
}
