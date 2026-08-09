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
        int var3_int = 0;
        int var4 = 0;
        pe var5 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var3_int = param0.field_tb - param1.field_tb;
              if (param2 <= -66) {
                break L1;
              } else {
                var5 = (pe) null;
                vl.a((pe) null, (pe) null, 95);
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
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("vl.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ')');
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
