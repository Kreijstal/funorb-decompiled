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
            field_u = null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.field_t) {
                if (param1.e(1023)) {
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
              if (!(param1 instanceof hf)) {
                break L2;
              } else {
                param4 = param4 & ((hf) (Object) param1).field_z;
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int != 0) {
                  stackOut_12_0 = ((ff) this).field_v;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((ff) this).field_x;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = ((ff) this).field_w;
                stackIn_13_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              pj.a(param1.field_s + param0, var7, 447, param1.field_v + param3 - -(param1.field_q - ((ff) this).field_t[0].field_o >> 1), param1.field_p, ((ff) this).field_t);
              if (param4) {
                stackOut_15_0 = 16777215;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 7105644;
                stackIn_16_0 = stackOut_14_0;
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
            int discarded$1 = ((ff) this).field_l.a(param1.field_w, param1.field_s + param0, -2 + (param1.field_v + param3), param1.field_p, param1.field_q, var8, -1, 1, 1, ((ff) this).field_l.field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ff.A(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private ff(int param0, int param1, int param2) {
        ((ff) this).field_w = param2;
        ((ff) this).field_x = param0;
        ((ff) this).field_v = param1;
        ((ff) this).field_l = qia.field_a;
        ((ff) this).field_t = sl.field_k;
    }

    public ff() {
        this(2188450, 2591221, 9543);
    }

    static {
    }
}
