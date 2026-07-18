/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends ek {
    private int field_q;
    private int field_s;
    private int field_p;
    private kc[] field_r;

    public ki() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        if (param1 >= -86) {
          ki.a(118, (byte) 95, 42, -10);
          wg.field_a = param0;
          af.field_jb = param3;
          ca.field_b = param2;
          return;
        } else {
          wg.field_a = param0;
          af.field_jb = param3;
          ca.field_b = param2;
          return;
        }
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
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
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
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
              if (!param1.field_j) {
                if (param1.d(121)) {
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
              if (!(param1 instanceof hl)) {
                break L2;
              } else {
                param4 = param4 & ((hl) (Object) param1).field_B;
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackOut_12_0 = ((ki) this).field_s;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackOut_11_0 = ((ki) this).field_p;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = ((ki) this).field_q;
                  stackIn_13_0 = stackOut_10_0;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (param2 == 11447) {
                break L4;
              } else {
                var9 = null;
                ((ki) this).a(103, (lk) null, -110, -12, false);
                break L4;
              }
            }
            L5: {
              ge.a(param1.field_h, ((ki) this).field_r, var7, param1.field_o + param0, (-((ki) this).field_r[0].field_k + param1.field_q >> 1) + param3 + param1.field_i, (byte) -10);
              if (param4) {
                stackOut_17_0 = 16777215;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = 7105644;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            var8 = stackIn_18_0;
            int discarded$1 = ((ki) this).field_c.a(param1.field_r, param1.field_o + param0, -2 + (param3 - -param1.field_i), param1.field_h, param1.field_q, var8, -1, 1, 1, ((ki) this).field_c.field_s);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ki.C(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private ki(int param0, int param1, int param2) {
        ((ki) this).field_s = param2;
        ((ki) this).field_p = param0;
        ((ki) this).field_c = vd.field_p;
        ((ki) this).field_q = param1;
        ((ki) this).field_r = eg.field_c;
    }

    static {
    }
}
