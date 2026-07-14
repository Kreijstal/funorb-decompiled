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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          if (!param1.field_g) {
            if (param1.e(1)) {
              L1: {
                var6 = 1;
                if (!(param1 instanceof wd)) {
                  break L1;
                } else {
                  param3 = param3 & ((wd) (Object) param1).field_y;
                  break L1;
                }
              }
              L2: {
                if (param3) {
                  if (var6 != 0) {
                    stackOut_10_0 = ((jh) this).field_v;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((jh) this).field_w;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                } else {
                  stackOut_7_0 = ((jh) this).field_q;
                  stackIn_11_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_11_0;
                th.a(var7, (byte) 99, param1.field_i + param0 - -(-((jh) this).field_u[0].field_o + param1.field_m >> 767564065), ((jh) this).field_u, param4 - -param1.field_r, param1.field_k);
                var9 = 113 / ((-60 - param2) / 56);
                if (param3) {
                  stackOut_13_0 = 16777215;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = 7105644;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var8 = stackIn_14_0;
              int discarded$2 = ((jh) this).field_b.a(param1.field_h, param1.field_r + param4, -2 + (param0 + param1.field_i), param1.field_k, param1.field_m, var8, -1, 1, 1, ((jh) this).field_b.field_s);
              return;
            } else {
              stackOut_3_0 = 0;
              stackIn_16_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_16_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_16_0;
          if (!(param1 instanceof wd)) {
            break L4;
          } else {
            param3 = param3 & ((wd) (Object) param1).field_y;
            break L4;
          }
        }
        L5: {
          if (param3) {
            if (var6 != 0) {
              stackOut_22_0 = ((jh) this).field_v;
              stackIn_23_0 = stackOut_22_0;
              break L5;
            } else {
              stackOut_21_0 = ((jh) this).field_w;
              stackIn_23_0 = stackOut_21_0;
              break L5;
            }
          } else {
            stackOut_19_0 = ((jh) this).field_q;
            stackIn_23_0 = stackOut_19_0;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_23_0;
          th.a(var7, (byte) 99, param1.field_i + param0 - -(-((jh) this).field_u[0].field_o + param1.field_m >> 767564065), ((jh) this).field_u, param4 - -param1.field_r, param1.field_k);
          var9 = 113 / ((-60 - param2) / 56);
          if (param3) {
            stackOut_25_0 = 16777215;
            stackIn_26_0 = stackOut_25_0;
            break L6;
          } else {
            stackOut_24_0 = 7105644;
            stackIn_26_0 = stackOut_24_0;
            break L6;
          }
        }
        var8 = stackIn_26_0;
        int discarded$3 = ((jh) this).field_b.a(param1.field_h, param1.field_r + param4, -2 + (param0 + param1.field_i), param1.field_k, param1.field_m, var8, -1, 1, 1, ((jh) this).field_b.field_s);
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
