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
          we var2 = (we) null;
          rd.a(-60, (we) null);
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          while (true) {
            param0--;
            if (param0 < 0) {
              if (param2 <= -92) {
                return;
              }
              rd.a(true, 41, true);
              return;
            }
            var17 = param3;
            var10 = var17;
            var11 = param1;
            var12 = param8;
            var13 = param4;
            var14 = param7;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = (cm.a(33423531, var13) >> 9) + cm.a(var12 >> 1, 16711680) + cm.a(255, var14 >> 17) + var15;
            param1++;
            param7 = param7 + param6;
            param4 = param4 + param9;
            param8 = param8 + param5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("rd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          java.applet.Applet var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            jp.field_c = param0;
            try {
              if (param1 <= 124) {
                var6 = (java.applet.Applet) null;
                rd.a((String) null, -73, (java.applet.Applet) null);
              }
              var7 = param2.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (param0.length() == 0) {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var8 + "; Expires=" + po.a(10, hm.a(64) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              cq.a(param2, (byte) -121, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            ib.a(param2, false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("rd.A(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 == -17130) {
          vn.a(param1 ^ 17146, param0, param2, (String) null);
          return;
        }
        field_l = (byte[]) null;
        vn.a(param1 ^ 17146, param0, param2, (String) null);
    }

    final static boolean a(int param0, boolean param1) {
        try {
          if (param1) {
            field_l = (byte[]) null;
          }
          if (!(param0 > vi.field_o.field_m)) {
            return true;
          }
          if (null == sh.field_e) {
            return false;
          }
          int var2_int = sh.field_e.a(-70);
          if (var2_int > 0) {
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
            if (var2_int >= 0 &&
              no.d(8) <= 30000L) {
              return false;
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
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          if (param0 > -111) {
            rd.a(-27);
          }
          aj.field_n = param1.a((byte) -121) << 5;
          var2_int = param1.f(255);
          bq.field_c = (7 & var2_int) << 18;
          aj.field_n = aj.field_n + (var2_int >> 3);
          bq.field_c = bq.field_c + (param1.a((byte) 47) << 2);
          var2_intLifetime1 = param1.f(255);
          bq.field_c = bq.field_c + (var2_intLifetime1 >> 6);
          of.field_g = var2_intLifetime1 << 15 & 2064384;
          of.field_g = of.field_g + (param1.f(255) << 7);
          var2_intLifetime2 = param1.f(255);
          of.field_b = var2_intLifetime2 << 16 & 65536;
          of.field_g = of.field_g + (var2_intLifetime2 >> 1);
          of.field_b = of.field_b + param1.a((byte) 96);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rd() {
    }

    static {
    }
}
