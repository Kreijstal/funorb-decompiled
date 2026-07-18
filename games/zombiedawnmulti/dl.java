/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dl {
    int field_f;
    static ja field_c;
    String field_b;
    static l field_h;
    static cj field_a;
    static long field_e;
    static String field_g;
    static String field_d;

    abstract java.net.Socket b(int param0) throws IOException;

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    final static void a(jh param0, boolean param1, k param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jh stackIn_5_0 = null;
        jh stackIn_6_0 = null;
        jh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jh stackIn_8_0 = null;
        jh stackIn_9_0 = null;
        jh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jh stackIn_11_0 = null;
        jh stackIn_12_0 = null;
        jh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        jh stackIn_14_0 = null;
        jh stackIn_15_0 = null;
        jh stackIn_16_0 = null;
        jh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        jh stackIn_18_0 = null;
        jh stackIn_19_0 = null;
        jh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        jh stackIn_21_0 = null;
        jh stackIn_22_0 = null;
        jh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        jh stackOut_4_0 = null;
        jh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        jh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jh stackOut_7_0 = null;
        jh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        jh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jh stackOut_10_0 = null;
        jh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        jh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        jh stackOut_13_0 = null;
        jh stackOut_14_0 = null;
        jh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        jh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        jh stackOut_17_0 = null;
        jh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        jh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        jh stackOut_20_0 = null;
        jh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        jh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                param0.field_cc = param2.g(31365);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_mc = param2.g(31365);
              param0.field_Pb = param2.g(31365);
              var4_int = param2.g(31365);
              stackOut_4_0 = (jh) param0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 == (var4_int & 128)) {
                stackOut_6_0 = (jh) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = (jh) (Object) stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Mb = stackIn_7_1 != 0;
              stackOut_7_0 = (jh) param0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if ((var4_int & 64) == 0) {
                stackOut_9_0 = (jh) (Object) stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = (jh) (Object) stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_Fb = stackIn_10_1 != 0;
              stackOut_10_0 = (jh) param0;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if ((32 & var4_int) == 0) {
                stackOut_12_0 = (jh) (Object) stackIn_12_0;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = (jh) (Object) stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              L6: {
                stackIn_13_0.field_dc = stackIn_13_1 != 0;
                stackOut_13_0 = (jh) param0;
                stackIn_16_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (!param0.field_Mb) {
                  break L6;
                } else {
                  stackOut_14_0 = (jh) (Object) stackIn_14_0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (param0.field_cc >= param0.field_mc) {
                    break L6;
                  } else {
                    stackOut_15_0 = (jh) (Object) stackIn_15_0;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L5;
                  }
                }
              }
              stackOut_16_0 = (jh) (Object) stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L5;
            }
            L7: {
              stackIn_17_0.field_Ob = stackIn_17_1 != 0;
              stackOut_17_0 = (jh) param0;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if ((var4_int & 8) == 0) {
                stackOut_19_0 = (jh) (Object) stackIn_19_0;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L7;
              } else {
                stackOut_18_0 = (jh) (Object) stackIn_18_0;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L7;
              }
            }
            L8: {
              stackIn_20_0.field_Wb = stackIn_20_1 != 0;
              stackOut_20_0 = (jh) param0;
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if ((16 & var4_int) == 0) {
                stackOut_22_0 = (jh) (Object) stackIn_22_0;
                stackOut_22_1 = 1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L8;
              } else {
                stackOut_21_0 = (jh) (Object) stackIn_21_0;
                stackOut_21_1 = 2;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_fc = stackIn_23_1;
              if ((4 & var4_int) == 0) {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L9;
              } else {
                stackOut_24_0 = 1;
                stackIn_26_0 = stackOut_24_0;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_26_0;
              param2.a(0, -6351, param0.field_Zb.length, param0.field_Zb);
              if ((var4_int & 2) == 0) {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L10;
              } else {
                stackOut_27_0 = 1;
                stackIn_29_0 = stackOut_27_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_29_0;
              param0.field_Ub = param2.d((byte) 69);
              param0.field_qc = bl.a((byte) 108) - (long)param2.i(-1478490344);
              if (var5 == 0) {
                param0.field_Sb = -1;
                break L11;
              } else {
                param0.field_Sb = param2.i(-1478490344);
                break L11;
              }
            }
            L12: {
              param0.field_nc = param2.a((byte) -30);
              var7 = param2.field_j;
              param0.field_Nb = param2.f((byte) -74);
              if (var6 == 0) {
                param0.field_bc = null;
                break L12;
              } else {
                param0.field_bc = new String[param0.field_cc];
                param2.field_j = var7;
                var8 = 0;
                L13: while (true) {
                  if (var8 >= param0.field_cc) {
                    break L12;
                  } else {
                    param0.field_bc[var8] = param2.f((byte) -91);
                    var8++;
                    continue L13;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("dl.H(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L14;
            }
          }
          L15: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L15;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L15;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + false + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == field_h) {
            return;
        }
        try {
            g.c();
            pk.field_c = new ja(60, 60);
            pk.field_c.a();
            oo.d(30, 30, 28, 4521728);
            wi.field_g = new ja[8];
            for (var1_int = 0; var1_int < 8; var1_int++) {
                wi.field_g[var1_int] = new ja(22, 22);
                wi.field_g[var1_int].a();
                oo.d(11, 11, var1_int - -2, 5622784);
                oo.d(11, 11, var1_int, 65793);
            }
            g.b();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "dl.J(" + -91 + ')');
        }
    }

    final static Boolean c(byte param0) {
        Boolean var1 = dd.field_d;
        dd.field_d = null;
        int var2 = 0;
        return var1;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 < 77) {
            return null;
        }
        return new java.net.Socket(((dl) this).field_b, ((dl) this).field_f);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Two zombies lurch better than one.";
        field_g = "Type your age in years";
    }
}
