/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mj {
    static r field_b;
    static String field_a;
    static er[] field_c;

    final static void a(int param0, u[] param1, r param2, String[][] param3, byte[] param4, int param5, er[][] param6, String[] param7, er[][] param8, r param9, int[] param10, byte[] param11, String[][] param12, String[] param13, boolean param14, String[] param15, int[] param16, int param17, int param18, r param19) {
        if (param17 != -23161) {
            Object var21 = null;
            mj.a(-31, 4, 18, -94, (int[]) null, (byte) 4, 49);
        }
        t.a(param1, param16, param19, param9, false);
        bs.a(param9, -52);
        ha.a(param0, param6, param5, param12, param8, param7, param15, param18, param3, param17 + 23161, param10, param13, param4, param11, param9);
        ti.a(param14, param9, 4, param2);
        sq.a((byte) 13);
        ne.c(false);
        gl.a(26780);
    }

    final static String a(int param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        var12 = new char[param3];
        var11 = var12;
        var10 = var11;
        var4 = var10;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param3) {
            var6 = -75 / ((-72 - param0) / 34);
            return new String(var12, 0, var5);
          } else {
            var7 = param1[var6 + param2] & 255;
            if (var7 != 0) {
              L1: {
                if (var7 < 128) {
                  break L1;
                } else {
                  if ((var7 ^ -1) > -161) {
                    L2: {
                      var8 = fa.field_o[var7 - 128];
                      if (var8 != 0) {
                        break L2;
                      } else {
                        var8 = 63;
                        break L2;
                      }
                    }
                    var7 = var8;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var5++;
              var10[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var4 = 0;
        if (param0 >= -101) {
            mj.a((byte) -110);
        }
        if (!((param2 ^ -1) < -1)) {
            throw new IllegalArgumentException();
        }
        if (!(!ko.b((byte) -75, param2))) {
            return (int)(((long)param1.nextInt() & 4294967295L) * (long)param2 >> 1410607200);
        }
        int var3 = -2147483648 + -(int)(4294967296L % (long)param2);
        while (true) {
            var4 = param1.nextInt();
            if (var4 < var3) {
                break;
            }
        }
        return rg.a(57, var4, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, byte param5, int param6) {
        int var7 = oo.field_j[param2];
        int var8 = oo.field_h[param2];
        int var9 = oo.field_j[param3];
        int var10 = oo.field_h[param3];
        int var11 = (var7 >> -694455839) * (var9 >> -67462463) >> -1207684850;
        int var12 = (var9 >> -1852326815) * (var8 >> -917395743) >> -2111330578;
        if (param5 >= -13) {
            field_b = null;
        }
        int var13 = (var10 >> 491243489) * (var7 >> 115405761) >> 774638190;
        param4[9] = var12;
        param4[4] = 0;
        param4[1] = param6;
        param4[0] = param0;
        param4[10] = -var7;
        param4[6] = var11;
        param4[8] = var13;
        param4[7] = var8;
        param4[3] = var10;
        param4[2] = param1;
        int var14 = (var8 >> -1063648607) * (var10 >> 299347329) >> -1868061234;
        param4[5] = -var9;
        param4[11] = var14;
    }

    public static void a(int param0) {
        if (param0 != 18641) {
            field_c = null;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0) {
        ui.field_g = 0;
        if (param0 != 4) {
            Object var2 = null;
            String discarded$0 = mj.a(31, (byte[]) null, -75, 56);
        }
        il.field_a = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<col=DE9200>total score:</col> <%0>";
    }
}
