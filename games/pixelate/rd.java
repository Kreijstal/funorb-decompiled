/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rd extends fa {
    static byte[] field_l;
    int field_k;
    int field_m;

    public static void a(int param0) {
        field_l = null;
        if (param0 != -5778) {
            Object var2 = null;
            rd.a(-60, (we) null);
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = Pixelate.field_H ? 1 : 0;
        L0: while (true) {
          param0--;
          if ((param0 ^ -1) > -1) {
            if (param2 > -92) {
              rd.a(true, 41, true);
              return;
            } else {
              return;
            }
          } else {
            var17 = param3;
            var10 = var17;
            var11 = param1;
            var12 = param8;
            var13 = param4;
            var14 = param7;
            var15 = 8355711 & var17[var11] >> -1266137023;
            var10[var11] = (cm.a(33423531, var13) >> -849650903) + cm.a(var12 >> -51081631, 16711680) + cm.a(255, var14 >> 1692619057) + var15;
            param1++;
            param7 = param7 + param6;
            param4 = param4 + param9;
            param8 = param8 + param5;
            continue L0;
          }
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            jp.field_c = param0;
            try {
                if (param1 <= 124) {
                    Object var6 = null;
                    rd.a((String) null, -73, (java.applet.Applet) null);
                }
                var7 = param2.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (param0.length() != 0) {
                    var5 = var8 + "; Expires=" + po.a(10, hm.a(64) + 94608000000L) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                cq.a(param2, (byte) -121, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            ib.a(param2, false);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 != -17130) {
          field_l = null;
          vn.a(param1 ^ 17146, param0, param2, (String) null);
          return;
        } else {
          vn.a(param1 ^ 17146, param0, param2, (String) null);
          return;
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if (param1) {
                field_l = null;
            }
            if (!(param0 > vi.field_o.field_m)) {
                return true;
            }
            if (!(null != sh.field_e)) {
                return false;
            }
            int var2_int = sh.field_e.a(-70);
            if (!(-1 <= (var2_int ^ -1))) {
                if (!(-vi.field_o.field_m + param0 >= var2_int)) {
                    var2_int = param0 - vi.field_o.field_m;
                }
                sh.field_e.a(vi.field_o.field_k, vi.field_o.field_m, (byte) 119, var2_int);
                jc.field_c = hm.a(64);
                vi.field_o.field_m = vi.field_o.field_m + var2_int;
                if (param0 > vi.field_o.field_m) {
                    return false;
                }
                vi.field_o.field_m = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if ((var2_int ^ -1) <= -1) {
                    if (-30001L <= (no.d(8) ^ -1L)) {
                        return false;
                    }
                }
                na.a(true);
            } catch (IOException iOException) {
                na.a(true);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, we param1) {
        int var2 = 0;
        if (param0 > -111) {
          rd.a(-27);
          aj.field_n = param1.a((byte) -121) << -1285835675;
          var2 = param1.f(255);
          bq.field_c = (7 & var2) << 1560812594;
          aj.field_n = aj.field_n + (var2 >> 1522050531);
          bq.field_c = bq.field_c + (param1.a((byte) 47) << 275084706);
          var2 = param1.f(255);
          bq.field_c = bq.field_c + (var2 >> 1556254598);
          of.field_g = var2 << -1725730545 & 2064384;
          of.field_g = of.field_g + (param1.f(255) << 1310248615);
          var2 = param1.f(255);
          of.field_b = var2 << 291030928 & 65536;
          of.field_g = of.field_g + (var2 >> 2032339425);
          of.field_b = of.field_b + param1.a((byte) 96);
          return;
        } else {
          aj.field_n = param1.a((byte) -121) << -1285835675;
          var2 = param1.f(255);
          bq.field_c = (7 & var2) << 1560812594;
          aj.field_n = aj.field_n + (var2 >> 1522050531);
          bq.field_c = bq.field_c + (param1.a((byte) 47) << 275084706);
          var2 = param1.f(255);
          bq.field_c = bq.field_c + (var2 >> 1556254598);
          of.field_g = var2 << -1725730545 & 2064384;
          of.field_g = of.field_g + (param1.f(255) << 1310248615);
          var2 = param1.f(255);
          of.field_b = var2 << 291030928 & 65536;
          of.field_g = of.field_g + (var2 >> 2032339425);
          of.field_b = of.field_b + param1.a((byte) 96);
          return;
        }
    }

    rd() {
    }

    static {
    }
}
