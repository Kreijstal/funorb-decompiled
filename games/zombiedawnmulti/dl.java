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
            field_d = null;
        }
        field_g = null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    final static void a(jh param0, boolean param1, k param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jh stackIn_4_0 = null;
        jh stackIn_5_0 = null;
        jh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jh stackIn_7_0 = null;
        jh stackIn_8_0 = null;
        jh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        jh stackIn_10_0 = null;
        jh stackIn_11_0 = null;
        jh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        jh stackIn_13_0 = null;
        jh stackIn_14_0 = null;
        jh stackIn_15_0 = null;
        jh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        jh stackIn_17_0 = null;
        jh stackIn_18_0 = null;
        jh stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        jh stackIn_20_0 = null;
        jh stackIn_21_0 = null;
        jh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        jh stackOut_3_0 = null;
        jh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        jh stackOut_6_0 = null;
        jh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        jh stackOut_9_0 = null;
        jh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        jh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        jh stackOut_12_0 = null;
        jh stackOut_13_0 = null;
        jh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        jh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        jh stackOut_16_0 = null;
        jh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        jh stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        jh stackOut_19_0 = null;
        jh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        jh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1) {
            param0.field_cc = param2.g(31365);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          param0.field_mc = param2.g(31365);
          param0.field_Pb = param2.g(31365);
          var4 = param2.g(31365);
          stackOut_3_0 = (jh) param0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 == (var4 & 128)) {
            stackOut_5_0 = (jh) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (jh) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackIn_6_0.field_Mb = stackIn_6_1 != 0;
          stackOut_6_0 = (jh) param0;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if ((var4 & 64) == 0) {
            stackOut_8_0 = (jh) (Object) stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = (jh) (Object) stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          stackIn_9_0.field_Fb = stackIn_9_1 != 0;
          stackOut_9_0 = (jh) param0;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (-1 == (32 & var4 ^ -1)) {
            stackOut_11_0 = (jh) (Object) stackIn_11_0;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = (jh) (Object) stackIn_10_0;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          L5: {
            stackIn_12_0.field_dc = stackIn_12_1 != 0;
            stackOut_12_0 = (jh) param0;
            stackIn_15_0 = stackOut_12_0;
            stackIn_13_0 = stackOut_12_0;
            if (!param0.field_Mb) {
              break L5;
            } else {
              stackOut_13_0 = (jh) (Object) stackIn_13_0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (param0.field_cc >= param0.field_mc) {
                break L5;
              } else {
                stackOut_14_0 = (jh) (Object) stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L4;
              }
            }
          }
          stackOut_15_0 = (jh) (Object) stackIn_15_0;
          stackOut_15_1 = 0;
          stackIn_16_0 = stackOut_15_0;
          stackIn_16_1 = stackOut_15_1;
          break L4;
        }
        L6: {
          stackIn_16_0.field_Ob = stackIn_16_1 != 0;
          stackOut_16_0 = (jh) param0;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if ((var4 & 8) == 0) {
            stackOut_18_0 = (jh) (Object) stackIn_18_0;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L6;
          } else {
            stackOut_17_0 = (jh) (Object) stackIn_17_0;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L6;
          }
        }
        L7: {
          stackIn_19_0.field_Wb = stackIn_19_1 != 0;
          stackOut_19_0 = (jh) param0;
          stackIn_21_0 = stackOut_19_0;
          stackIn_20_0 = stackOut_19_0;
          if ((16 & var4) == 0) {
            stackOut_21_0 = (jh) (Object) stackIn_21_0;
            stackOut_21_1 = 1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            break L7;
          } else {
            stackOut_20_0 = (jh) (Object) stackIn_20_0;
            stackOut_20_1 = 2;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            break L7;
          }
        }
        L8: {
          stackIn_22_0.field_fc = stackIn_22_1;
          if (-1 == (4 & var4 ^ -1)) {
            stackOut_24_0 = 0;
            stackIn_25_0 = stackOut_24_0;
            break L8;
          } else {
            stackOut_23_0 = 1;
            stackIn_25_0 = stackOut_23_0;
            break L8;
          }
        }
        L9: {
          var5 = stackIn_25_0;
          if (!param3) {
            break L9;
          } else {
            field_d = null;
            break L9;
          }
        }
        L10: {
          param2.a(0, -6351, param0.field_Zb.length, param0.field_Zb);
          if ((var4 & 2) == 0) {
            stackOut_29_0 = 0;
            stackIn_30_0 = stackOut_29_0;
            break L10;
          } else {
            stackOut_28_0 = 1;
            stackIn_30_0 = stackOut_28_0;
            break L10;
          }
        }
        L11: {
          var6 = stackIn_30_0;
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
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == field_h) {
            return;
        }
        g.c();
        if (param0 >= -18) {
            field_d = null;
        }
        pk.field_c = new ja(60, 60);
        pk.field_c.a();
        oo.d(30, 30, 28, 4521728);
        wi.field_g = new ja[8];
        for (var1 = 0; var1 < 8; var1++) {
            wi.field_g[var1] = new ja(22, 22);
            wi.field_g[var1].a();
            oo.d(11, 11, var1 - -2, 5622784);
            oo.d(11, 11, var1, 65793);
        }
        g.b();
    }

    final static Boolean c(byte param0) {
        Boolean var1 = dd.field_d;
        dd.field_d = null;
        int var2 = -94 % ((-29 - param0) / 60);
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
