/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ov {
    int field_h;
    static String field_g;
    int[] field_c;
    java.awt.Image field_f;
    static ts field_i;
    static int[] field_a;
    static int[] field_e;
    static String field_d;
    int field_b;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        field_g = null;
        field_i = null;
    }

    final static int a(int param0, int param1) {
        if (param0 <= -34) {
          if (param1 >= 0) {
            if (param1 <= 0) {
              return param1;
            } else {
              return 1;
            }
          } else {
            return -1;
          }
        } else {
          return 14;
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        lc.field_A = false;
        t.field_s = null;
        if (!pg.field_a) {
          var1 = jk.field_c;
          if (var1 > 0) {
            if (1 != var1) {
              t.field_s = ic.a(ph.field_d, new String[1], (byte) -128);
              t.field_s = uo.a(false, new CharSequence[3]);
              hc.field_c.n(-7);
              od.a(5178);
              return;
            } else {
              t.field_s = kq.field_O;
              t.field_s = uo.a(false, new CharSequence[3]);
              hc.field_c.n(-7);
              od.a(5178);
              return;
            }
          } else {
            hc.field_c.n(-7);
            od.a(5178);
            return;
          }
        } else {
          hc.field_c.e(false);
          return;
        }
    }

    final static bj a(int param0, String param1) {
        RuntimeException var2 = null;
        bj stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bj stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!ut.field_o.a(true)) {
                break L1;
              } else {
                if (!param1.equals((Object) (Object) ut.field_o.b(66))) {
                  ut.field_o = aj.a(false, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 1) {
                break L2;
              } else {
                field_d = null;
                break L2;
              }
            }
            stackOut_6_0 = ut.field_o;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("ov.K(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0) {
        lk.a(((ov) this).field_c, ((ov) this).field_h, ((ov) this).field_b);
        if (param0 != -1) {
            Object var3 = null;
            bj discarded$0 = ov.a(111, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Invalid password.";
        field_d = "Quit";
        field_e = new int[256];
        field_i = new ts(1, 2, 2, 0);
    }
}
