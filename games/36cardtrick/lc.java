/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static uf[] field_a;
    static long field_b;

    public static void b(int param0) {
        if (param0 <= 75) {
            boolean discarded$0 = lc.a((byte) -52);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        e.a((byte) 112);
        gh.a(param0, 31888);
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -73) {
          L0: {
            lc.b(-42);
            if ((h.field_F ^ -1) >= -251) {
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
            if ((h.field_F ^ -1) >= -251) {
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

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        var2 = param1.charAt(0);
        if (param0 == -33) {
          var3 = 1;
          L0: while (true) {
            if (param1.length() > var3) {
              if (var2 != param1.charAt(var3)) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, vg param2, int param3, vg param4, int param5) {
        e.field_i = param5;
        a.field_o = param3;
        if (param1 != 4) {
            return;
        }
        tc.field_b = param0;
        ie.field_m = param2;
        wd.field_b = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new uf[3];
    }
}
