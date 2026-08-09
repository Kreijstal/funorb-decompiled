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
        int var4;
        int var7;
        int var8;
        int var9;
        kg[] var10;
        int[] var12;
        ut var13;
        kg[] var14;
        int[] var15;
        ut var16;
        kg[] var17;
        kg[][] stackIn_3_0 = null;
        kg[][] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kg[][] stackIn_10_0 = null;
        kg[][] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        var9 = Kickabout.field_G;
        if (param2 <= 94) {
          L0: {
            oa.b(-53);
            stackIn_10_0 = ph.field_e;

            if (param0) {
              stackIn_11_0 = (kg[][]) ((Object) stackIn_10_0);
              stackIn_11_1 = 1;
              break L0;
            } else {
              stackIn_11_0 = (kg[][]) ((Object) stackIn_10_0);
              stackIn_11_1 = 3;
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
            stackIn_3_0 = ph.field_e;

            if (param0) {
              stackIn_4_0 = (kg[][]) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L2;
            } else {
              stackIn_4_0 = (kg[][]) ((Object) stackIn_3_0);
              stackIn_4_1 = 3;
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
