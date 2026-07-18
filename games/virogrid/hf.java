/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends aj {
    private int field_u;
    private int field_B;
    private mg[] field_x;
    private int field_y;
    static java.awt.Color field_v;
    static int field_C;
    static int[] field_D;
    static int[] field_A;
    static sh field_w;
    static int[] field_z;

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
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
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
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
              if (!param1.field_p) {
                if (param1.f(true)) {
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
              if (param1 instanceof tg) {
                param2 = param2 & ((tg) (Object) param1).field_C;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param2) {
                stackOut_13_0 = ((hf) this).field_u;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackOut_12_0 = ((hf) this).field_B;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((hf) this).field_y;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            var7 = stackIn_14_0;
            if (param4 == -23294) {
              L4: {
                if (param2) {
                  stackOut_18_0 = 16777215;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                } else {
                  stackOut_17_0 = 7105644;
                  stackIn_19_0 = stackOut_17_0;
                  break L4;
                }
              }
              var8 = stackIn_19_0;
              kd.a(((hf) this).field_x, param1.field_u + param3 + (param1.field_m + -((hf) this).field_x[0].field_z >> 1), false, param1.field_g, param1.field_l + param0, var7);
              int discarded$1 = ((hf) this).field_i.a(param1.field_n, param0 - -param1.field_l, param3 + param1.field_u - 2, param1.field_g, param1.field_m, var8, -1, 1, 1, ((hf) this).field_i.field_H);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("hf.E(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_w = null;
        field_A = null;
        if (param0 >= -79) {
            return;
        }
        field_v = null;
        field_z = null;
        field_D = null;
    }

    private hf(int param0, int param1, int param2) {
        ((hf) this).field_u = param2;
        ((hf) this).field_x = td.field_g;
        ((hf) this).field_B = param0;
        ((hf) this).field_y = param1;
        ((hf) this).field_i = on.field_b;
    }

    public hf() {
        this(2188450, 2591221, 9543);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new java.awt.Color(10040319);
        field_A = new int[8192];
        field_z = new int[8192];
    }
}
