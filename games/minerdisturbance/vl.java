/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends em {
    int field_H;
    static ea field_E;
    static String field_I;
    uh field_D;
    byte[] field_F;
    static volatile int field_G;

    final byte[] c(byte param0) {
        if (this.field_C) {
            throw new RuntimeException();
        }
        if (param0 != -115) {
            return (byte[]) null;
        }
        return this.field_F;
    }

    final static boolean a(pe param0, pe param1, int param2) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        pe var5 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var3_int = param0.field_tb - param1.field_tb;
              if (param2 <= -66) {
                break L1;
              } else {
                var5 = (pe) null;
                discarded$2 = vl.a((pe) null, (pe) null, 95);
                break L1;
              }
            }
            L2: {
              if (param0.field_nb == bd.field_j) {
                var3_int -= 200;
                break L2;
              } else {
                if (param0.field_nb == null) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (bd.field_j != param1.field_nb) {
                if (null == param1.field_nb) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (-1 <= (var3_int ^ -1)) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("vl.F(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void h(int param0) {
        gd.field_B = false;
        wc.field_b = false;
        oj.a(param0, 3);
        ic.field_l = mc.field_t;
        bd.field_h = mc.field_t;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            return;
        }
        nm.field_e = param4;
        vd.field_z = param0;
        he.field_a = param1;
        nk.field_u = param3;
    }

    vl() {
    }

    final int f(int param0) {
        if (param0 != 100) {
            field_G = -118;
            if (!(!this.field_C)) {
                return 0;
            }
            return 100;
        }
        if (!(!this.field_C)) {
            return 0;
        }
        return 100;
    }

    public static void i(int param0) {
        field_I = null;
        field_E = null;
        int var1 = -60 / ((52 - param0) / 61);
    }

    static {
        field_I = "Use this alternative as your account name";
        field_G = 0;
    }
}
