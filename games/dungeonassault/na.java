/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hh {
    static ji field_D;
    static cn field_A;
    static cc field_y;
    private int field_F;
    private cn[] field_x;
    private int field_z;
    static tf field_w;
    private int field_E;
    static cn[] field_C;
    static int[] field_G;

    public static void c(int param0) {
        field_A = null;
        if (param0 >= -26) {
            return;
        }
        field_C = null;
        field_G = null;
        field_D = null;
        field_w = null;
        field_y = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        hd.a(param1 ^ 2599413, param2, (String) null, param0);
        if (param1 != 2591221) {
            field_A = null;
        }
    }

    public na() {
        this(2188450, 2591221, 9543);
    }

    private na(int param0, int param1, int param2) {
        ((na) this).field_x = field_C;
        ((na) this).field_E = param2;
        ((na) this).field_F = param1;
        ((na) this).field_z = param0;
        ((na) this).field_u = hc.field_f;
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
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
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
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
              if (!param1.field_u) {
                if (param1.a((byte) 75)) {
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
              if (param1 instanceof ck) {
                param4 = param4 & ((ck) (Object) param1).field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int != 0) {
                  stackOut_13_0 = ((na) this).field_F;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = ((na) this).field_z;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              } else {
                stackOut_10_0 = ((na) this).field_E;
                stackIn_14_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_14_0;
              ad.a(param1.field_x, param3 + param1.field_v - -(-((na) this).field_x[0].field_G + param1.field_s >> 1), param2 - -param1.field_q, (byte) -2, var7, ((na) this).field_x);
              if (!param4) {
                stackOut_16_0 = 7105644;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 16777215;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_17_0;
              if (param0 == 34) {
                break L5;
              } else {
                na.c(123);
                break L5;
              }
            }
            int discarded$1 = ((na) this).field_u.a(param1.field_w, param2 + param1.field_q, param3 - (-param1.field_v + 2), param1.field_x, param1.field_s, var8, -1, 1, 1, ((na) this).field_u.field_H);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("na.B(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[]{28, 234, 513, 709, 950, 1046, 1325, 1430, 1693};
    }
}
