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
            field_r = (hl) null;
            field_v = null;
            return;
        }
        field_v = null;
    }

    public gb() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            L1: {
              if (!param4.field_h) {
                if (param4.d(true)) {
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
              if (param4 instanceof dk) {
                param1 = param1 & ((dk) ((Object) param4)).field_u;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param1) {
                stackIn_14_0 = this.field_q;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackIn_14_0 = this.field_t;
                  break L3;
                } else {
                  stackIn_14_0 = this.field_s;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_14_0;
              mc.a(100, this.field_u, param4.field_i, param0 - -param4.field_s, var7, param4.field_j + (param3 + (-this.field_u[0].field_q + param4.field_f >> -1618721567)));
              if (param1) {
                stackIn_17_0 = 16777215;
                break L4;
              } else {
                stackIn_17_0 = 7105644;
                break L4;
              }
            }
            var8 = stackIn_17_0;
            this.field_f.a(param4.field_k, param4.field_s + param0, param4.field_j + (param3 + -2), param4.field_i, param4.field_f, var8, -1, 1, 1, this.field_f.field_p);
            var9 = -4 / ((2 - param2) / 54);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("gb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    private gb(int param0, int param1, int param2) {
        this.field_t = param0;
        this.field_f = tk.field_a;
        this.field_s = param1;
        this.field_u = t.field_r;
        this.field_q = param2;
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
