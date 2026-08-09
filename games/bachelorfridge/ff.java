/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends gha {
    static ee field_u;
    private int field_x;
    private int field_v;
    private int field_w;
    private kv[] field_t;

    public static void c(int param0) {
        if (param0 != 16777215) {
            field_u = (ee) null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param1.field_t) {
                if (param1.e(1023)) {
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
              if (!(param1 instanceof hf)) {
                break L2;
              } else {
                param4 = param4 & ((hf) ((Object) param1)).field_z;
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int != 0) {
                  stackIn_13_0 = this.field_v;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_x;
                  break L3;
                }
              } else {
                stackIn_13_0 = this.field_w;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              pj.a(param1.field_s + param0, var7, 447, param1.field_v + param3 - -(param1.field_q - this.field_t[0].field_o >> 1402526785), param1.field_p, this.field_t);
              if (param4) {
                stackIn_16_0 = 16777215;
                break L4;
              } else {
                stackIn_16_0 = 7105644;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_16_0;
              if (param2 == 32679) {
                break L5;
              } else {
                ff.c(122);
                break L5;
              }
            }
            this.field_l.a(param1.field_w, param1.field_s + param0, -2 + (param1.field_v + param3), param1.field_p, param1.field_q, var8, -1, 1, 1, this.field_l.field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("ff.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private ff(int param0, int param1, int param2) {
        this.field_w = param2;
        this.field_x = param0;
        this.field_v = param1;
        this.field_l = qia.field_a;
        this.field_t = sl.field_k;
    }

    public ff() {
        this(2188450, 2591221, 9543);
    }

    static {
    }
}
