/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends jd {
    private int field_q;
    private tg[] field_u;
    static String field_t;
    private int field_w;
    static ie field_s;
    static byte[][] field_r;
    private int field_v;

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.field_g) {
                if (param1.e(1)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param1 instanceof wd)) {
                break L2;
              } else {
                param3 = param3 & ((wd) (Object) param1).field_y;
                break L2;
              }
            }
            L3: {
              if (param3) {
                if (var6_int != 0) {
                  stackOut_12_0 = ((jh) this).field_v;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((jh) this).field_w;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = ((jh) this).field_q;
                stackIn_13_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              th.a(var7, (byte) 99, param1.field_i + param0 - -(-((jh) this).field_u[0].field_o + param1.field_m >> 1), ((jh) this).field_u, param4 - -param1.field_r, param1.field_k);
              var9 = 113 / ((-60 - param2) / 56);
              if (param3) {
                stackOut_15_0 = 16777215;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 7105644;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            var8 = stackIn_16_0;
            int discarded$1 = ((jh) this).field_b.a(param1.field_h, param1.field_r + param4, -2 + (param0 + param1.field_i), param1.field_k, param1.field_m, var8, -1, 1, 1, ((jh) this).field_b.field_s);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("jh.B(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public jh() {
        this(2188450, 2591221, 9543);
    }

    public static void c(int param0) {
        field_s = null;
        field_r = null;
        if (param0 != -1) {
            return;
        }
        field_t = null;
    }

    final static boolean b(int param0) {
        if (param0 != 767564065) {
            jh.c(64);
            return pg.field_c;
        }
        return pg.field_c;
    }

    private jh(int param0, int param1, int param2) {
        ((jh) this).field_q = param2;
        ((jh) this).field_w = param0;
        ((jh) this).field_u = ih.field_T;
        ((jh) this).field_b = ne.field_v;
        ((jh) this).field_v = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Connection timed out. Please try using a different server.";
        field_r = new byte[250][];
    }
}
