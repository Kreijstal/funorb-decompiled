/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends cn {
    private int field_t;
    static ta field_s;
    static String field_w;
    private bd[] field_u;
    private int field_y;
    private int field_A;
    static int[] field_z;
    static vl field_B;
    static int[] field_v;
    static String field_x;

    public ke() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
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
              if (!param3.field_u) {
                if (param3.g(param2 + -24445)) {
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
              if (!(param3 instanceof ph)) {
                break L2;
              } else {
                param4 = param4 & ((ph) (Object) param3).field_D;
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int == 0) {
                  stackOut_12_0 = ((ke) this).field_y;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((ke) this).field_A;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = ((ke) this).field_t;
                stackIn_13_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (!param4) {
                stackOut_15_0 = 7105644;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 16777215;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_16_0;
              if (param2 == 15430) {
                break L5;
              } else {
                field_x = null;
                break L5;
              }
            }
            km.a(param0 - -param3.field_m + (-((ke) this).field_u[0].field_r + param3.field_x >> 1), param3.field_v + param1, param3.field_s, ((ke) this).field_u, var7, param2 ^ 15415);
            int discarded$1 = ((ke) this).field_g.a(param3.field_n, param1 + param3.field_v, -2 + (param0 + param3.field_m), param3.field_s, param3.field_x, var8, -1, 1, 1, ((ke) this).field_g.field_y);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ke.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
    }

    private ke(int param0, int param1, int param2) {
        ((ke) this).field_t = param2;
        ((ke) this).field_u = km.field_y;
        ((ke) this).field_A = param1;
        ((ke) this).field_y = param0;
        ((ke) this).field_g = pe.field_eb;
    }

    public static void b(boolean param0) {
        field_B = null;
        field_w = null;
        field_s = null;
        field_v = null;
        field_x = null;
        field_z = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[128];
        field_w = "Night is falling. I'd better hurry.";
        field_B = new vl();
        field_v = new int[8192];
        field_x = "Type your password again to make sure it's correct";
    }
}
