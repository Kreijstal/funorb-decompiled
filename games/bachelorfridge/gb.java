/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb extends bw {
    static String field_i;
    int field_g;
    int field_h;
    static String[] field_f;
    static String field_j;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        L0: {
          k.c(param3 + 3685);
          var12 = dg.field_e;
          var11 = var12;
          var10 = var11;
          var6 = var10;
          var7 = dg.field_i;
          var8 = dg.field_c;
          if (null == cea.field_i) {
            break L0;
          } else {
            if (null != hl.field_C) {
              L1: {
                param1 = param1 - (-hl.field_C.field_B + hl.field_C.field_u);
                var9 = hl.field_C.a(param5);
                var9 += 10;
                cea.field_i.b();
                if (-2 != (var9 & 1 ^ -1)) {
                  break L1;
                } else {
                  var9++;
                  break L1;
                }
              }
              L2: {
                dg.d();
                hl.field_C.c(param5, 5, 3 + hl.field_C.field_u, param3, -1);
                dg.a(var12, var7, var8);
                fk.d((byte) -121);
                if (param4) {
                  fw.a(param0, cea.field_i, var9, param2, true, oa.field_Bb, param1);
                  break L2;
                } else {
                  fn.a(param2, (byte) 11, var9, param0, param1, cea.field_i);
                  break L2;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = BachelorFridge.field_y;
        int var2 = param0 > 0 ? (param0 + 0 << -1060310808) / 255 : 0;
        int var3 = 137 * var2 >> 1495594056;
        ada.field_p.d(-var3, 0);
        gs.field_f.a(param1 ^ 16777213, -var3 + 137, false);
        if (!(!au.field_b)) {
            if (!bf.field_f) {
                var4 = 20;
                var5 = 20;
                var6 = var5 / 2;
                for (var7 = 0; -25 < (var7 ^ -1); var7++) {
                    var4 = var4 + (var6 + kla.a(var5, laa.field_n, param1 ^ -2130706433));
                    gs.field_c[var7] = var4;
                    vb.field_h[var7] = kla.a(120, laa.field_n, param1 + 2130706433) + 70;
                    wda.field_b[var7] = kla.a(120, laa.field_n, -2147483648) + 70;
                }
                bf.field_f = true;
            }
            for (var4 = 0; var4 < gs.field_c.length; var4++) {
                dg.f((wda.field_b[var4] * var3 >> -2126413687) + 362 + -var3 + 137, -(param0 * vb.field_h[var4] * param0 >> 449894609) + gs.field_c[var4], 30 + (param0 * wda.field_b[var4] >> -1140604212), 16777215, 128 <= param0 ? 256 - param0 >> 343066177 : param0 >> 1780706881);
            }
        }
        var4 = (var2 * 53 >> -1457176408) + 84;
        var5 = 6144 - -(1400 * param0 >> 650046760);
        var6 = via.a(4096 - var5 & 8191, (byte) 97);
        if (param1 != 16777215) {
            return;
        }
        var7 = ft.a(8191 & 4096 - var5, (byte) -128);
        lka.field_G = new int[]{-var4, 90, -42, var6, 0, -var7, 0, 65536, 0, var7, 0, var6};
        ni.field_l.a(mu.field_j, lka.field_G);
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 != -9372) {
            Object var2 = null;
            gb.a(47, -38, 38, -128, true, (String) null);
        }
        if (b.field_u > 32) {
            var1 = b.field_u % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            di.a(true, b.field_u - var1);
        } else {
            di.a(true, 0);
        }
    }

    private gb() throws Throwable {
        throw new Error();
    }

    public static void b(int param0) {
        if (param0 != -22615) {
            field_j = null;
        }
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        Object var7 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var7 = null;
            gb.a(-60, 62, -68, 126, true, (String) null);
            break L0;
          }
        }
        L1: {
          if (eo.field_l > param4) {
            qn.a(param4, param1, param3, param2, 69, param5);
            break L1;
          } else {
            if (param1 > pw.field_x) {
              qn.a(param4, param1, param3, param2, 69, param5);
              break L1;
            } else {
              if (param3 < an.field_q) {
                qn.a(param4, param1, param3, param2, 69, param5);
                break L1;
              } else {
                if (param5 > ha.field_n) {
                  qn.a(param4, param1, param3, param2, 69, param5);
                  break L1;
                } else {
                  hka.a(param4, -1, param5, param3, param1, param2);
                  break L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Raised!";
        field_f = new String[]{"idle", "walk", "jump", "sprint", "attack", "death", "react", "happy", "kick", "range"};
        field_j = "Players";
    }
}
