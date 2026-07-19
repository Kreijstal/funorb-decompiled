/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    static Calendar field_a;
    static hd field_b;

    final static void b(int param0) {
        ee.b((byte) -25);
        aq.c((byte) -125);
        if (param0 != -23217) {
            field_a = (Calendar) null;
        }
    }

    final static ut a(boolean param0, int param1, byte param2) {
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kg[] var10 = null;
        int[] var12 = null;
        ut var13 = null;
        kg[] var14 = null;
        int[] var15 = null;
        ut var16 = null;
        kg[] var17 = null;
        kg[][] stackIn_2_0 = null;
        kg[][] stackIn_3_0 = null;
        kg[][] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kg[][] stackIn_9_0 = null;
        kg[][] stackIn_10_0 = null;
        kg[][] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        kg[][] stackOut_8_0 = null;
        kg[][] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        kg[][] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kg[][] stackOut_1_0 = null;
        kg[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        kg[][] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var9 = Kickabout.field_G;
        if (param2 <= 94) {
          L0: {
            oa.b(-53);
            stackOut_8_0 = ph.field_e;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (param0) {
              stackOut_10_0 = (kg[][]) ((Object) stackIn_10_0);
              stackOut_10_1 = 1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L0;
            } else {
              stackOut_9_0 = (kg[][]) ((Object) stackIn_9_0);
              stackOut_9_1 = 3;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L0;
            }
          }
          var10 = stackIn_11_0[stackIn_11_1];
          var14 = var10;
          var4 = var10[0].field_a;
          var12 = new int[]{var10[0].field_i, var10[1].field_i, var10[2].field_i};
          var13 = new ut(var12[1] * param1 + var12[0] + var12[2], var4);
          iw.a(-122, var13);
          var7 = 0;
          var10[0].a(var7, 0);
          var7 = var7 + var12[0];
          var8 = 0;
          L1: while (true) {
            if (param1 <= var8) {
              var14[2].a(var7, 0);
              ta.e(122);
              pd.a(var13, 20684);
              return var13;
            } else {
              var10[1].a(var7, 0);
              var7 = var7 + var12[1];
              var8++;
              continue L1;
            }
          }
        } else {
          L2: {
            stackOut_1_0 = ph.field_e;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param0) {
              stackOut_3_0 = (kg[][]) ((Object) stackIn_3_0);
              stackOut_3_1 = 1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = (kg[][]) ((Object) stackIn_2_0);
              stackOut_2_1 = 3;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          var10 = stackIn_4_0[stackIn_4_1];
          var17 = var10;
          var4 = var10[0].field_a;
          var15 = new int[]{var10[0].field_i, var10[1].field_i, var10[2].field_i};
          var16 = new ut(var15[1] * param1 + var15[0] + var15[2], var4);
          iw.a(-122, var16);
          var7 = 0;
          var10[0].a(var7, 0);
          var7 = var7 + var15[0];
          var8 = 0;
          L3: while (true) {
            if (param1 <= var8) {
              var17[2].a(var7, 0);
              ta.e(122);
              pd.a(var16, 20684);
              return var16;
            } else {
              var10[1].a(var7, 0);
              var7 = var7 + var15[1];
              var8++;
              continue L3;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, byte[] param5) {
        ml var10 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var10 = or.field_d;
            if (param0) {
                byte[] var9 = (byte[]) null;
                oa.a(true, 43, -115, false, -33, (byte[]) null);
            }
            var10.b(param1, (byte) 120);
            var10.field_n = var10.field_n + 1;
            var7 = var10.field_n;
            var10.a(124, 4);
            var10.a(104, param2);
            var8 = param4;
            if (!(!param3)) {
                var8 += 128;
            }
            var10.a(108, var8);
            var10.a(0, param5.length, 1991220144, param5);
            var10.c(62, -var7 + var10.field_n);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "oa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, hc param1) {
        try {
            if (param0) {
                field_a = (Calendar) null;
            }
            sn.field_g.insertElementAt(param1, 0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "oa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        wd.field_l.a(0, 0, (byte) -114);
        if (param0 > -98) {
            field_b = (hd) null;
        }
    }

    static {
        field_a = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
    }
}
