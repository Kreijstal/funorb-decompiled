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
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            L1: {
              if (!param1.field_g) {
                if (param1.e(1)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param1 instanceof wd)) {
                break L2;
              } else {
                param3 = param3 & ((wd) ((Object) param1)).field_y;
                break L2;
              }
            }
            L3: {
              if (param3) {
                if (var6_int != 0) {
                  stackIn_13_0 = this.field_v;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_w;
                  break L3;
                }
              } else {
                stackIn_13_0 = this.field_q;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              th.a(var7, (byte) 99, param1.field_i + param0 - -(-this.field_u[0].field_o + param1.field_m >> 767564065), this.field_u, param4 - -param1.field_r, param1.field_k);
              var9 = 113 / ((-60 - param2) / 56);
              if (param3) {
                stackIn_16_0 = 16777215;
                break L4;
              } else {
                stackIn_16_0 = 7105644;
                break L4;
              }
            }
            var8 = stackIn_16_0;
            this.field_b.a(param1.field_h, param1.field_r + param4, -2 + (param0 + param1.field_i), param1.field_k, param1.field_m, var8, -1, 1, 1, this.field_b.field_s);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("jh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public jh() {
        this(2188450, 2591221, 9543);
    }

    public static void c(int param0) {
        field_s = null;
        field_r = (byte[][]) null;
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
        this.field_q = param2;
        this.field_w = param0;
        this.field_u = ih.field_T;
        this.field_b = ne.field_v;
        this.field_v = param1;
    }

    static {
        field_t = "Connection timed out. Please try using a different server.";
        field_r = new byte[250][];
    }
}
