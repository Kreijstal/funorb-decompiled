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
        if (param0 < 32) {
            field_r = null;
            field_v = null;
            return;
        }
        field_v = null;
    }

    public gb() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (!param4.field_h) {
            if (param4.d(true)) {
              L1: {
                var6 = 1;
                if (param4 instanceof dk) {
                  param1 = param1 & ((dk) (Object) param4).field_u;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param1) {
                  stackOut_11_0 = ((gb) this).field_q;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  if (var6 == 0) {
                    stackOut_10_0 = ((gb) this).field_t;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((gb) this).field_s;
                    stackIn_12_0 = stackOut_9_0;
                    break L2;
                  }
                }
              }
              L3: {
                var7 = stackIn_12_0;
                mc.a(100, ((gb) this).field_u, param4.field_i, param0 - -param4.field_s, var7, param4.field_j + (param3 + (-((gb) this).field_u[0].field_q + param4.field_f >> -1618721567)));
                if (param1) {
                  stackOut_14_0 = 16777215;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 7105644;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              var8 = stackIn_15_0;
              int discarded$2 = ((gb) this).field_f.a(param4.field_k, param4.field_s + param0, param4.field_j + (param3 + -2), param4.field_i, param4.field_f, var8, -1, 1, 1, ((gb) this).field_f.field_p);
              var9 = -4 / ((2 - param2) / 54);
              return;
            } else {
              stackOut_3_0 = 0;
              stackIn_17_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_17_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_17_0;
          if (param4 instanceof dk) {
            param1 = param1 & ((dk) (Object) param4).field_u;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!param1) {
            stackOut_24_0 = ((gb) this).field_q;
            stackIn_25_0 = stackOut_24_0;
            break L5;
          } else {
            if (var6 == 0) {
              stackOut_23_0 = ((gb) this).field_t;
              stackIn_25_0 = stackOut_23_0;
              break L5;
            } else {
              stackOut_22_0 = ((gb) this).field_s;
              stackIn_25_0 = stackOut_22_0;
              break L5;
            }
          }
        }
        L6: {
          var7 = stackIn_25_0;
          mc.a(100, ((gb) this).field_u, param4.field_i, param0 - -param4.field_s, var7, param4.field_j + (param3 + (-((gb) this).field_u[0].field_q + param4.field_f >> -1618721567)));
          if (param1) {
            stackOut_27_0 = 16777215;
            stackIn_28_0 = stackOut_27_0;
            break L6;
          } else {
            stackOut_26_0 = 7105644;
            stackIn_28_0 = stackOut_26_0;
            break L6;
          }
        }
        var8 = stackIn_28_0;
        int discarded$3 = ((gb) this).field_f.a(param4.field_k, param4.field_s + param0, param4.field_j + (param3 + -2), param4.field_i, param4.field_f, var8, -1, 1, 1, ((gb) this).field_f.field_p);
        var9 = -4 / ((2 - param2) / 54);
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
        param0 = param0 | param0 >>> -663783583;
        param0 = param0 | param0 >>> 2035328194;
        param0 = param0 | param0 >>> -1606424604;
        param0 = param0 | param0 >>> 105830984;
        if (param1 > -75) {
          field_w = -26;
          param0 = param0 | param0 >>> -1687372368;
          return param0 + 1;
        } else {
          param0 = param0 | param0 >>> -1687372368;
          return param0 + 1;
        }
    }

    static {
    }
}
