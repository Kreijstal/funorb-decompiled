/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wa {
    static kn field_c;
    static long field_h;
    static int field_i;
    static ak field_g;
    static ak field_f;
    static String field_a;
    static String field_e;
    static long field_b;
    static String field_d;

    final static tf[] c() {
        tf[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        var1 = new tf[im.field_Qb];
        var2 = 0;
        L0: while (true) {
          if (im.field_Qb <= var2) {
            int discarded$1 = 140;
            re.b();
            return var1;
          } else {
            var3 = ge.field_c[var2] * gf.field_g[var2];
            var21 = wo.field_f[var2];
            if (rl.field_m[var2]) {
              var23 = gd.field_k[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (tf) (Object) new sa(tj.field_y, jb.field_a, fa.field_b[var2], e.field_b[var2], gf.field_g[var2], ge.field_c[var2], var24);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = bq.a(fl.field_g[cm.a(255, (int) var21[var7])], cm.a(var23[var7] << 24, -16777216));
                  var7++;
                  continue L1;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L2: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new tf(tj.field_y, jb.field_a, fa.field_b[var2], e.field_b[var2], gf.field_g[var2], ge.field_c[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = fl.field_g[cm.a(255, (int) var21[var6_int])];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = 0;
        L0: {
          var17 = Pixelate.field_H ? 1 : 0;
          var16 = 29;
          if (param5 >= param1) {
            if (param0 <= param5) {
              if (param0 <= param1) {
                hc.a(param9, param5, param8, param15, -94333456, param13, param7, param14, param6, param12, param0, t.field_k, param10, param1, param2, param3, param4);
                break L0;
              } else {
                hc.a(param9, param5, param2, param3, -94333456, param7, param13, param14, param12, param6, param1, t.field_k, param10, param0, param8, param15, param4);
                break L0;
              }
            } else {
              hc.a(param12, param0, param2, param4, -94333456, param7, param14, param13, param9, param6, param1, t.field_k, param8, param5, param10, param15, param3);
              break L0;
            }
          } else {
            if (param1 < param0) {
              hc.a(param12, param0, param10, param15, -94333456, param14, param7, param13, param6, param9, param5, t.field_k, param8, param1, param2, param4, param3);
              break L0;
            } else {
              if (param0 > param5) {
                hc.a(param6, param1, param10, param3, -94333456, param14, param13, param7, param12, param9, param5, t.field_k, param2, param0, param8, param4, param15);
                break L0;
              } else {
                hc.a(param6, param1, param8, param4, -94333456, param13, param14, param7, param9, param12, param0, t.field_k, param2, param5, param10, param3, param15);
                break L0;
              }
            }
          }
        }
    }

    public static void a() {
        field_e = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static int b(int param0) {
        if (param0 > -64) {
            return -14;
        }
        return 1900 + new Date().getYear();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 360;
        field_e = "Bouncedown!";
        field_d = "Won";
        field_b = 20000000L;
    }
}
