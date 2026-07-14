/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static gb field_e;
    static int[][] field_h;
    static ei[] field_c;
    static String[] field_d;
    static ck[][] field_b;
    static String field_g;
    static wg field_f;
    static String field_a;

    final static void a(int param0, ck param1, String param2) {
        lb.field_h = param1;
        n.field_b = param2;
        if (param0 != 200) {
            field_f = null;
        }
    }

    final static void c(int param0) {
        if (param0 < 34) {
            field_h = null;
            dj.a(wd.field_c, 22);
            return;
        }
        dj.a(wd.field_c, 22);
    }

    public static void b(int param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 < 74) {
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          field_e = null;
          field_h = null;
          return;
        }
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 != 4) {
          return -114L;
        } else {
          L0: {
            var1 = System.currentTimeMillis();
            if (jf.field_d > var1) {
              pm.field_e = pm.field_e + (-var1 + jf.field_d);
              break L0;
            } else {
              break L0;
            }
          }
          jf.field_d = var1;
          return pm.field_e + var1;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -14 % ((param0 - 36) / 56);
        return 200 * (-1 + param1) * param1;
    }

    final static boolean a(String param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -118) {
          L0: {
            field_b = null;
            if (g.a(-3805, param0) == null) {
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
            if (g.a(-3805, param0) == null) {
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

    final static ta a(int param0, String param1) {
        L0: {
          if (!jj.field_f.a(91)) {
            break L0;
          } else {
            if (!param1.equals((Object) (Object) jj.field_f.b((byte) 86))) {
              jj.field_f = ui.a(0, param1);
              break L0;
            } else {
              if (param0 <= 96) {
                return null;
              } else {
                return jj.field_f;
              }
            }
          }
        }
        if (param0 <= 96) {
          return null;
        } else {
          return jj.field_f;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_g = "Offer unrated rematch";
        field_b = new ck[6][4];
        field_c = new ei[8];
        field_f = new wg();
        field_a = "Open";
    }
}
