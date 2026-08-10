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
        if (param0 >= -61) {
            field_d = (String) null;
        }
        field_g = null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    final static void a(jh param0, boolean param1, k param2, boolean param3) {
        jh stackIn_6_0 = null;
        jh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jh stackIn_9_0 = null;
        jh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jh stackIn_12_0 = null;
        jh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        jh stackIn_16_0 = null;
        jh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        jh stackIn_19_0 = null;
        jh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        jh stackIn_22_0 = null;
        jh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
              stackIn_6_0 = (jh) (param0);

              if (0 == (var4_int & 128)) {
                stackIn_7_0 = (jh) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (jh) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Mb = stackIn_7_1 != 0;
              stackIn_9_0 = (jh) (param0);

              if ((var4_int & 64) == 0) {
                stackIn_10_0 = (jh) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = (jh) ((Object) stackIn_9_0);
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_Fb = stackIn_10_1 != 0;
              stackIn_12_0 = (jh) (param0);

              if (-1 == (32 & var4_int ^ -1)) {
                stackIn_13_0 = (jh) ((Object) stackIn_12_0);
                stackIn_13_1 = 0;
                break L4;
              } else {
                stackIn_13_0 = (jh) ((Object) stackIn_12_0);
                stackIn_13_1 = 1;
                break L4;
              }
            }
            L5: {
              L6: {
                stackIn_13_0.field_dc = stackIn_13_1 != 0;
                stackIn_16_0 = (jh) (param0);

                if (!param0.field_Mb) {
                  break L6;
                } else {
                  stackIn_16_0 = (jh) ((Object) stackIn_16_0);

                  if (param0.field_cc >= param0.field_mc) {
                    break L6;
                  } else {
                    stackIn_17_0 = (jh) ((Object) stackIn_16_0);
                    stackIn_17_1 = 1;
                    break L5;
                  }
                }
              }
              stackIn_17_0 = (jh) ((Object) stackIn_16_0);
              stackIn_17_1 = 0;
              break L5;
            }
            L7: {
              stackIn_17_0.field_Ob = stackIn_17_1 != 0;
              stackIn_19_0 = (jh) (param0);

              if ((var4_int & 8) == 0) {
                stackIn_20_0 = (jh) ((Object) stackIn_19_0);
                stackIn_20_1 = 0;
                break L7;
              } else {
                stackIn_20_0 = (jh) ((Object) stackIn_19_0);
                stackIn_20_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_20_0.field_Wb = stackIn_20_1 != 0;
              stackIn_22_0 = (jh) (param0);

              if ((16 & var4_int) == 0) {
                stackIn_23_0 = (jh) ((Object) stackIn_22_0);
                stackIn_23_1 = 1;
                break L8;
              } else {
                stackIn_23_0 = (jh) ((Object) stackIn_22_0);
                stackIn_23_1 = 2;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_fc = stackIn_23_1;
              if (-1 == (4 & var4_int ^ -1)) {
                stackIn_26_0 = 0;
                break L9;
              } else {
                stackIn_26_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_26_0;
              if (!param3) {
                break L10;
              } else {
                field_d = (String) null;
                break L10;
              }
            }
            L11: {
              param2.a(0, -6351, param0.field_Zb.length, param0.field_Zb);
              if ((var4_int & 2) == 0) {
                stackIn_31_0 = 0;
                break L11;
              } else {
                stackIn_31_0 = 1;
                break L11;
              }
            }
            L12: {
              var6 = stackIn_31_0;
              param0.field_Ub = param2.d((byte) 69);
              param0.field_qc = bl.a((byte) 108) - (long)param2.i(-1478490344);
              if (var5 == 0) {
                param0.field_Sb = -1;
                break L12;
              } else {
                param0.field_Sb = param2.i(-1478490344);
                break L12;
              }
            }
            L13: {
              param0.field_nc = param2.a((byte) -30);
              var7 = param2.field_j;
              param0.field_Nb = param2.f((byte) -74);
              if (var6 == 0) {
                param0.field_bc = null;
                break L13;
              } else {
                param0.field_bc = new String[param0.field_cc];
                param2.field_j = var7;
                var8 = 0;
                L14: while (true) {
                  if (var8 >= param0.field_cc) {
                    break L13;
                  } else {
                    param0.field_bc[var8] = param2.f((byte) -91);
                    var8++;
                    continue L14;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var4);

            stackIn_42_1 = new StringBuilder().append("dl.H(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L15;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L16;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L16;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_43_0), stackIn_46_2 + ',' + param3 + ')');
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
            if (param0 >= -18) {
                field_d = (String) null;
            }
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
            throw fa.a((Throwable) ((Object) runtimeException), "dl.J(" + param0 + ')');
        }
    }

    final static Boolean c(byte param0) {
        Boolean var1 = dd.field_d;
        dd.field_d = null;
        int var2 = -94 % ((-29 - param0) / 60);
        return var1;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 < 77) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_f);
    }

    static {
        field_d = "Two zombies lurch better than one.";
        field_g = "Type your age in years";
    }
}
