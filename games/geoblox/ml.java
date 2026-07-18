/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends ff {
    static String field_u;
    static d field_s;
    static pf field_t;
    static int field_r;
    private int field_w;
    private int field_x;
    private int field_v;
    private dm[] field_y;

    public ml() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (!param4.field_l) {
                if (param4.e((byte) 54)) {
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
              if (param4 instanceof hk) {
                param3 = param3 & ((hk) (Object) param4).field_D;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 < -5) {
                break L3;
              } else {
                String discarded$3 = ml.c(-17);
                break L3;
              }
            }
            L4: {
              if (param3) {
                if (var6_int == 0) {
                  stackOut_15_0 = ((ml) this).field_w;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = ((ml) this).field_x;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              } else {
                stackOut_12_0 = ((ml) this).field_v;
                stackIn_16_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_16_0;
              int discarded$4 = -17154;
              jf.a(((ml) this).field_y, var7, param0 + param4.field_v, param4.field_r, (-((ml) this).field_y[0].field_o + param4.field_h >> 1) + (param2 + param4.field_m));
              if (param3) {
                stackOut_18_0 = 16777215;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 7105644;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            int discarded$5 = ((ml) this).field_n.a(param4.field_s, param4.field_v + param0, -2 + param2 - -param4.field_m, param4.field_r, param4.field_h, var8, -1, 1, 1, ((ml) this).field_n.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("ml.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 16777215) {
          ml.b(11);
          field_u = null;
          field_t = null;
          field_s = null;
          return;
        } else {
          field_u = null;
          field_t = null;
          field_s = null;
          return;
        }
    }

    private ml(int param0, int param1, int param2) {
        ((ml) this).field_n = hh.field_c;
        ((ml) this).field_w = param0;
        ((ml) this).field_v = param2;
        ((ml) this).field_x = param1;
        ((ml) this).field_y = vk.field_e;
    }

    final static String c(int param0) {
        String var1 = null;
        if (param0 != 7789) {
          return null;
        } else {
          L0: {
            var1 = "";
            if (null != field_t) {
              var1 = field_t.h(87);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var1.length() != 0) {
              break L1;
            } else {
              var1 = rc.d((byte) -53);
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = th.field_g;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Use this alternative as your account name";
    }
}
