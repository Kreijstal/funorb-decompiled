/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class h extends hl {
    int field_J;
    private fl field_H;
    private int field_G;
    int field_K;
    static fe field_I;
    static int field_F;
    static boolean[] field_E;

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            jf.field_l = param2;
            try {
                if (param1 <= 34) {
                    h.a(81, 58);
                }
                var3 = param0.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (-1 == (param2.length() ^ -1)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                vh.a(param0, "document.cookie=\"" + var5 + "\"", -12300);
            } catch (Throwable throwable) {
            }
            tj.a(true, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, long param1) {
        sj.field_b.setTime(new Date(param1));
        int var3 = sj.field_b.get(7);
        int var4 = sj.field_b.get(5);
        int var5 = sj.field_b.get(2);
        if (param0 > -8) {
            return (String) null;
        }
        int var6 = sj.field_b.get(1);
        int var7 = sj.field_b.get(11);
        int var8 = sj.field_b.get(12);
        int var9 = sj.field_b.get(13);
        return qf.field_I[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + nf.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static void e(byte param0) {
        gi var1 = null;
        int var2 = Main.field_T;
        wd.field_e.f();
        if (param0 != -84) {
            field_F = -57;
        }
        cb.field_g.f();
        bi.field_d = bi.field_d - 1;
        if (bi.field_d == 0) {
            bi.field_d = 200;
            var1 = (gi) aj.field_s.a((byte) 74);
            while (var1 != null) {
                if (!((gi) var1).field_i.b(125)) {
                    var1.c(84);
                }
                var1 = (gi) aj.field_s.b((byte) -92);
            }
        }
    }

    final int a(byte param0, int param1) {
        L0: {
          if ((param1 ^ -1) > -1) {
            break L0;
          } else {
            if (((h) this).field_H.a((byte) 109) > param1) {
              L1: {
                if (param0 == -63) {
                  break L1;
                } else {
                  field_F = 122;
                  break L1;
                }
              }
              return ((h) this).field_H.c(param1, 102);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final int a(boolean param0) {
        if (!param0) {
            field_F = -122;
        }
        return ((h) this).field_H.a((byte) 123);
    }

    final static kc[] b(int param0, int param1, int param2, int param3, int param4) {
        kc[] var6 = new kc[9];
        kc[] var5 = var6;
        var6[6] = te.a(param0, -127, param1);
        var5[3] = te.a(param0, -127, param1);
        var5[2] = te.a(param0, -127, param1);
        var5[1] = te.a(param0, -127, param1);
        var5[0] = te.a(param0, -127, param1);
        var6[8] = te.a(param0, -126, param4);
        var5[7] = te.a(param0, -126, param4);
        var5[5] = te.a(param0, -126, param4);
        if (-1 != (param3 ^ -1)) {
            var6[4] = te.a(64, -126, param3);
        }
        if (param2 != 15762) {
            return (kc[]) null;
        }
        return var5;
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Main.field_T;
        if (!this.a(param0, param1, param2, -96, param4, param5, param6)) {
          if (param3 <= -14) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            var8 = -((h) this).field_K + -param0 + param2;
            var9 = ((h) this).field_h + -(2 * ((h) this).field_K);
            if (var8 <= var9) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if ((var8 ^ -1) <= -1) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          L2: {
            var8 = ((h) this).field_G * var8 / var9;
            if (param5 != 1) {
              if ((param5 ^ -1) == -3) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((h) this).field_H.a((byte) 99)) {
                    if ((var11 ^ -1) > -1) {
                      break L2;
                    } else {
                      ((h) this).field_H.e(0, var11);
                      break L2;
                    }
                  } else {
                    var13 = ((h) this).field_H.c(var12, -94) + -var8;
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var10 = var13;
                      var11 = var12;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((h) this).field_H.a(var8, 1);
              break L2;
            }
          }
          return true;
        }
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 != -26526) {
            field_I = (fe) null;
        }
        field_I = null;
    }

    private h() throws Throwable {
        throw new Error();
    }

    final int f(byte param0) {
        if (param0 >= -31) {
            h.a(53, -35);
        }
        return ((h) this).field_G;
    }

    final static void a(int param0, int param1) {
        qb.field_f = 1000000000L / (long)param1;
        if (param0 != -17685) {
            h.a(-3, 103);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new fe(0);
        field_E = new boolean[]{false, false, false, false, false, true, true, true, true, true, true};
    }
}
