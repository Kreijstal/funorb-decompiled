/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterable {
    int field_d;
    static String field_b;
    br[] field_a;
    static boolean field_c;
    private br field_e;

    final br a(long param0, int param1) {
        br var4 = null;
        int var5 = 0;
        br var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = ((wh) this).field_a[(int)(param0 & (long)(-1 + ((wh) this).field_d))];
        ((wh) this).field_e = var4.field_d;
        var5 = -79 / ((param1 - -3) / 54);
        L0: while (true) {
          if (var4 != ((wh) this).field_e) {
            if (param0 != ((wh) this).field_e.field_e) {
              ((wh) this).field_e = ((wh) this).field_e.field_d;
              continue L0;
            } else {
              var6 = ((wh) this).field_e;
              ((wh) this).field_e = ((wh) this).field_e.field_d;
              return var6;
            }
          } else {
            ((wh) this).field_e = null;
            return null;
          }
        }
    }

    final void a(long param0, byte param1, br param2) {
        br var5 = null;
        L0: {
          if (null != param2.field_b) {
            param2.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((wh) this).field_a[(int)(param0 & (long)(((wh) this).field_d + -1))];
        param2.field_d = var5;
        param2.field_b = var5.field_b;
        param2.field_b.field_d = param2;
        param2.field_e = param0;
        if (param1 > 0) {
          ((wh) this).field_e = null;
          param2.field_d.field_b = param2;
          return;
        } else {
          param2.field_d.field_b = param2;
          return;
        }
    }

    final static fc a(byte[] param0, int param1) {
        int var2 = 0;
        Object var3 = null;
        if (param1 < -12) {
          var2 = ql.a(true, 0, param0);
          if (var2 != -4) {
            if (-5 != var2) {
              if (-6 != (var2 ^ -1)) {
                if (var2 != 6) {
                  return null;
                } else {
                  return gi.a(param0, -115);
                }
              } else {
                return jg.a(30270, param0);
              }
            } else {
              return nn.a(-99, param0);
            }
          } else {
            return ee.a(param0, true);
          }
        } else {
          var3 = null;
          fc discarded$2 = wh.a((byte[]) null, -96);
          var2 = ql.a(true, 0, param0);
          if (var2 != -4) {
            if (-5 != var2) {
              if (-6 != (var2 ^ -1)) {
                if (var2 != 6) {
                  return null;
                } else {
                  return gi.a(param0, -115);
                }
              } else {
                return jg.a(30270, param0);
              }
            } else {
              return nn.a(-99, param0);
            }
          } else {
            return ee.a(param0, true);
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new up((wh) this);
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            fc discarded$0 = wh.a((byte[]) null, -107);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, String param3, String param4) {
        ec.field_b.field_vb = param4;
        ec.field_b.field_wb = param3;
        ec.field_b.field_M = param1;
        ec.field_b.field_zb = ec.field_b.field_zb + ua.field_E.field_zb;
        ua.field_E.field_x = ua.field_E.field_x + ua.field_E.field_zb;
        if (param0 != 6) {
          return;
        } else {
          ua.field_E.field_zb = param2;
          ec.field_b.field_zb = ec.field_b.field_zb - ua.field_E.field_zb;
          ua.field_E.field_x = ua.field_E.field_x - ua.field_E.field_zb;
          return;
        }
    }

    final static ja a(int param0, double param1, int param2) {
        ja var5 = null;
        ja var6 = null;
        int var7 = 0;
        int var8 = 0;
        ja var9 = null;
        var9 = new ja(640, 75);
        var9.a();
        oo.a(0, 5, 640, 55, 16777215, 1);
        var5 = new ja(640, 75);
        var5.a();
        ff.field_r.b(sm.field_g[param2], 320, 65, 53248, 1);
        var6 = new ja(640, 75);
        var6.a();
        var7 = (int)(param1 * 640.0);
        if (param0 < 26) {
          return null;
        } else {
          var8 = (int)(75.0 * param1);
          var5.c((-var7 + 640) / 2, 0, var7, var8);
          var9.e(0, 0);
          var6.g(16777215);
          var6.g(16777215);
          var6.g(1);
          var6.g(1);
          dl.field_h.b((byte) 96);
          return var6;
        }
    }

    wh(int param0) {
        int var2 = 0;
        br var3 = null;
        ((wh) this).field_a = new br[param0];
        ((wh) this).field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new br();
            ((wh) this).field_a[var2] = new br();
            var3.field_d = var3;
            var3.field_b = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_b = "Miasma";
    }
}
