/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends a {
    static int field_H;
    private int field_F;
    static pi[][] field_G;
    static int[] field_I;
    private int field_D;
    private int field_B;
    private ck[] field_C;

    public static void c(int param0) {
        if (param0 != 8) {
            field_I = (int[]) null;
            field_G = (pi[][]) null;
            field_I = null;
            return;
        }
        field_G = (pi[][]) null;
        field_I = null;
    }

    public fk() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int discarded$1 = 0;
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
              if (param3 < -60) {
                break L1;
              } else {
                fk.c(-101);
                break L1;
              }
            }
            L2: {
              if (!param4.field_q) {
                if (param4.a(true)) {
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
              if (!(param4 instanceof ek)) {
                break L3;
              } else {
                param0 = param0 & ((ek) ((Object) param4)).field_I;
                break L3;
              }
            }
            L4: {
              if (!param0) {
                stackOut_14_0 = this.field_F;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                if (var6_int != 0) {
                  stackOut_13_0 = this.field_B;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = this.field_D;
                  stackIn_15_0 = stackOut_12_0;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_15_0;
              if (param0) {
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
            rm.a(param2 - (-param4.field_D + -(param4.field_y - this.field_C[0].field_C >> 2089386273)), this.field_C, param4.field_u + param1, param4.field_t, var7, -121);
            discarded$1 = this.field_z.a(param4.field_E, param4.field_u + param1, -2 + (param4.field_D + param2), param4.field_t, param4.field_y, var8, -1, 1, 1, this.field_z.field_R);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("fk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    private fk(int param0, int param1, int param2) {
        this.field_D = param0;
        this.field_z = ec.field_p;
        this.field_C = rm.field_a;
        this.field_F = param2;
        this.field_B = param1;
    }

    static {
        field_G = new pi[8][];
        field_I = new int[2];
    }
}
