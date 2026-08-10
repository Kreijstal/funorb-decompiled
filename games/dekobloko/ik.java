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
        try {
            lb.field_h = param1;
            n.field_b = param2;
            if (param0 != 200) {
                field_f = (wg) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ik.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        if (param0 < 34) {
            field_h = (int[][]) null;
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
          field_b = (ck[][]) null;
          field_e = null;
          field_h = (int[][]) null;
          return;
        }
    }

    final synchronized static long a(int param0) {
        long var1;
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
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -118) {
                break L1;
              } else {
                field_b = (ck[][]) null;
                break L1;
              }
            }
            L2: {
              if (g.a(-3805, param0) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ik.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static ta a(int param0, String param1) {
        RuntimeException var2 = null;
        ta stackIn_6_0 = null;
        ta stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!jj.field_f.a(91)) {
                break L1;
              } else {
                if (!param1.equals(jj.field_f.b((byte) 86))) {
                  jj.field_f = ui.a(0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 > 96) {
              stackIn_8_0 = jj.field_f;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_6_0 = (ta) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("ik.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_g = "Offer unrated rematch";
        field_b = new ck[6][4];
        field_c = new ei[8];
        field_f = new wg();
        field_a = "Open";
    }
}
