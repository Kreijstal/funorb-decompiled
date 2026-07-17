/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends hd {
    static int field_w;
    private hl[] field_u;
    private int field_q;
    private int field_t;
    static hl field_r;
    static hl[] field_v;
    private int field_s;

    public static void b(int param0) {
        field_r = null;
        field_v = null;
    }

    public gb() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (!param4.field_h) {
                if (param4.d(true)) {
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
              if (param4 instanceof dk) {
                param1 = param1 & ((dk) (Object) param4).field_u;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param1) {
                stackOut_13_0 = ((gb) this).field_q;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackOut_12_0 = ((gb) this).field_t;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((gb) this).field_s;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_14_0;
              mc.a(100, ((gb) this).field_u, param4.field_i, param0 - -param4.field_s, var7, param4.field_j + (param3 + (-((gb) this).field_u[0].field_q + param4.field_f >> 1)));
              if (param1) {
                stackOut_16_0 = 16777215;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 7105644;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            var8 = stackIn_17_0;
            int discarded$1 = ((gb) this).field_f.a(param4.field_k, param4.field_s + param0, param4.field_j + (param3 + -2), param4.field_i, param4.field_f, var8, -1, 1, 1, ((gb) this).field_f.field_p);
            var9 = -4 / ((2 - param2) / 54);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("gb.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    private gb(int param0, int param1, int param2) {
        ((gb) this).field_t = param0;
        ((gb) this).field_f = tk.field_a;
        ((gb) this).field_s = param1;
        ((gb) this).field_u = t.field_r;
        ((gb) this).field_q = param2;
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        if (param1 > -75) {
          field_w = -26;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        } else {
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
    }

    static {
    }
}
