/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends hq {
    static String field_v;
    static int[] field_w;
    private int field_s;
    static ja field_t;
    private ja[] field_A;
    static int[][] field_u;
    static int[] field_x;
    static String field_z;
    private int field_C;
    private int field_y;

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
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
        int stackOut_11_0 = 0;
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
              if (param2 == -15112) {
                break L1;
              } else {
                ((oq) this).field_s = 28;
                break L1;
              }
            }
            L2: {
              if (!param4.field_l) {
                if (param4.c(124)) {
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
              if (!(param4 instanceof gn)) {
                break L3;
              } else {
                param0 = param0 & ((gn) (Object) param4).field_F;
                break L3;
              }
            }
            L4: {
              if (param0) {
                if (var6_int == 0) {
                  stackOut_14_0 = ((oq) this).field_s;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ((oq) this).field_C;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              } else {
                stackOut_11_0 = ((oq) this).field_y;
                stackIn_15_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_15_0;
              if (!param0) {
                stackOut_17_0 = 7105644;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = 16777215;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            var8 = stackIn_18_0;
            jm.a(var7, true, param3 + param4.field_y, ((oq) this).field_A, (-((oq) this).field_A[0].field_u + param4.field_w >> 1) + (param4.field_i + param1), param4.field_n);
            int discarded$1 = ((oq) this).field_j.a(param4.field_j, param3 - -param4.field_y, param4.field_i + (param1 + -2), param4.field_n, param4.field_w, var8, -1, 1, 1, ((oq) this).field_j.field_C);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("oq.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static void c(byte param0) {
        if (qj.field_p) {
          se.field_E = 0;
          qj.field_p = false;
          io.field_g = false;
          if (param0 >= 117) {
            return;
          } else {
            oq.c((byte) -11);
            return;
          }
        } else {
          qj.field_p = true;
          if (!pp.field_n) {
            if (param0 < 117) {
              oq.c((byte) -11);
              return;
            } else {
              return;
            }
          } else {
            ah.a((byte) -86, 21);
            if (param0 >= 117) {
              return;
            } else {
              oq.c((byte) -11);
              return;
            }
          }
        }
    }

    public oq() {
        this(2188450, 2591221, 9543);
    }

    private oq(int param0, int param1, int param2) {
        ((oq) this).field_C = param1;
        ((oq) this).field_j = ci.field_d;
        ((oq) this).field_s = param0;
        ((oq) this).field_y = param2;
        ((oq) this).field_A = ui.field_k;
    }

    public static void d(byte param0) {
        int var1 = 0;
        field_z = null;
        field_v = null;
        field_u = null;
        field_x = null;
        field_t = null;
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Go Back";
        field_z = "This password contains your email address, and would be easy to guess";
    }
}
