/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hn {
    static int field_b;
    static re field_c;
    static double field_a;

    public static void b(int param0) {
        if (param0 != 11) {
            hn.a(-88);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static String a(long param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        aq.field_b.setTime(new Date(param0));
        var3 = aq.field_b.get(7);
        var4 = aq.field_b.get(5);
        var5 = aq.field_b.get(2);
        var6 = aq.field_b.get(1);
        var7 = aq.field_b.get(11);
        var8 = aq.field_b.get(12);
        var9 = aq.field_b.get(13);
        if (param1) {
          field_c = null;
          return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + df.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + df.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final static wl a(di param0, String param1, String param2, int param3, di param4) {
        int var5 = 0;
        int var6 = 0;
        if (param3 != -25154) {
          return null;
        } else {
          var5 = param4.b(param1, -1);
          var6 = param4.a(var5, 0, param2);
          return cn.a(param4, var6, var5, param0, param3 ^ -890);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = Pool.field_O;
        if (param0 == -3143) {
          var1 = 0;
          var2 = -7 + qh.field_l * qh.field_f;
          L0: while (true) {
            if (var1 >= var2) {
              var2 += 7;
              L1: while (true) {
                if (var2 > var1) {
                  int incrementValue$19 = var1;
                  var1++;
                  qh.field_d[incrementValue$19] = -1;
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              int incrementValue$20 = var1;
              var1++;
              qh.field_d[incrementValue$20] = -1;
              int incrementValue$21 = var1;
              var1++;
              qh.field_d[incrementValue$21] = -1;
              int incrementValue$22 = var1;
              var1++;
              qh.field_d[incrementValue$22] = -1;
              int incrementValue$23 = var1;
              var1++;
              qh.field_d[incrementValue$23] = -1;
              int incrementValue$24 = var1;
              var1++;
              qh.field_d[incrementValue$24] = -1;
              int incrementValue$25 = var1;
              var1++;
              qh.field_d[incrementValue$25] = -1;
              int incrementValue$26 = var1;
              var1++;
              qh.field_d[incrementValue$26] = -1;
              int incrementValue$27 = var1;
              var1++;
              qh.field_d[incrementValue$27] = -1;
              continue L0;
            }
          }
        } else {
          var4 = null;
          wl discarded$28 = hn.a((di) null, (String) null, (String) null, 35, (di) null);
          var1 = 0;
          var2 = -7 + qh.field_l * qh.field_f;
          L2: while (true) {
            if (var1 >= var2) {
              var2 += 7;
              L3: while (true) {
                if (var2 > var1) {
                  int incrementValue$29 = var1;
                  var1++;
                  qh.field_d[incrementValue$29] = -1;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              int incrementValue$30 = var1;
              var1++;
              qh.field_d[incrementValue$30] = -1;
              int incrementValue$31 = var1;
              var1++;
              qh.field_d[incrementValue$31] = -1;
              int incrementValue$32 = var1;
              var1++;
              qh.field_d[incrementValue$32] = -1;
              int incrementValue$33 = var1;
              var1++;
              qh.field_d[incrementValue$33] = -1;
              int incrementValue$34 = var1;
              var1++;
              qh.field_d[incrementValue$34] = -1;
              int incrementValue$35 = var1;
              var1++;
              qh.field_d[incrementValue$35] = -1;
              int incrementValue$36 = var1;
              var1++;
              qh.field_d[incrementValue$36] = -1;
              int incrementValue$37 = var1;
              var1++;
              qh.field_d[incrementValue$37] = -1;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_b = 0;
        field_a = 0.0;
    }
}
