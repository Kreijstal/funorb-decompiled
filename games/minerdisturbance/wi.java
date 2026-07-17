/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends eg {
    private int field_y;
    private int field_B;
    static boolean field_C;
    static String[][] field_u;
    static int field_w;
    static String[][] field_x;
    private ea[] field_E;
    private int field_D;
    static ae field_s;
    static int field_t;
    static we field_A;
    static rc field_v;
    static String field_z;

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
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
              if (param0 == 12088) {
                break L1;
              } else {
                field_w = -30;
                break L1;
              }
            }
            L2: {
              if (!param2.field_x) {
                if (param2.k(38)) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (!(param2 instanceof hc)) {
                break L3;
              } else {
                param4 = param4 & ((hc) (Object) param2).field_E;
                break L3;
              }
            }
            L4: {
              if (!param4) {
                stackOut_14_0 = ((wi) this).field_D;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                if (var6_int != 0) {
                  stackOut_13_0 = ((wi) this).field_B;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = ((wi) this).field_y;
                  stackIn_15_0 = stackOut_12_0;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_15_0;
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
            pk.a(param1 - -param2.field_u, ((wi) this).field_E, var7, false, param3 + param2.field_t - -(param2.field_q + -((wi) this).field_E[0].field_A >> 1), param2.field_v);
            int discarded$1 = ((wi) this).field_k.a(param2.field_s, param2.field_u + param1, param3 - -param2.field_t - 2, param2.field_v, param2.field_q, var8, -1, 1, 1, ((wi) this).field_k.field_I);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("wi.B(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public wi() {
        this(2188450, 2591221, 9543);
    }

    public static void a(byte param0) {
        field_x = null;
        field_z = null;
        field_v = null;
        field_A = null;
        field_s = null;
        field_u = null;
        int var1 = 1;
    }

    private wi(int param0, int param1, int param2) {
        ((wi) this).field_D = param2;
        ((wi) this).field_E = r.field_a;
        ((wi) this).field_k = cn.field_g;
        ((wi) this).field_y = param0;
        ((wi) this).field_B = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[][]{new String[1]};
        field_t = 2;
        field_x = new String[][]{new String[1]};
        field_w = 0;
        field_z = "Ranking: Frozen Fodder";
        field_s = new ae();
    }
}
