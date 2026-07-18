/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends lf {
    static t field_o;
    uh field_r;
    static t field_n;
    private int[] field_p;
    static String field_q;

    final int a() {
        return 0;
    }

    final lf b() {
        return null;
    }

    public static void b(int param0) {
        field_n = null;
        field_q = null;
        field_o = null;
    }

    final lf c() {
        return (lf) (Object) ((kk) this).field_r;
    }

    final int d() {
        return 255 * on.field_c / 160;
    }

    final void a(int param0) {
        ((kk) this).field_r.a(param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (!pi.field_r) {
                stackOut_3_0 = param2;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param2 << 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = stackIn_4_0;
                if (((kk) this).field_p == null) {
                  break L3;
                } else {
                  if (var4_int <= ((kk) this).field_p.length) {
                    dk.a(((kk) this).field_p, 0, var4_int);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((kk) this).field_p = new int[var4_int];
              break L2;
            }
            L4: {
              ((kk) this).field_r.b(((kk) this).field_p, 0, param2);
              if (!pi.field_r) {
                break L4;
              } else {
                param1 = param1 << 1;
                break L4;
              }
            }
            var5 = 0;
            L5: while (true) {
              if (var4_int <= var5) {
                break L0;
              } else {
                int incrementValue$2 = param1;
                param1++;
                int incrementValue$3 = var5;
                var5++;
                param0[incrementValue$2] = param0[incrementValue$2] + on.field_c * ((kk) this).field_p[incrementValue$3] / 160;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("kk.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    kk() {
        ((kk) this).field_r = new uh();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Click to skip this page";
    }
}
