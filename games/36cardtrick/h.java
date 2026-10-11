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
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            jf.field_l = param2;
            try {
              if (param1 <= 34) {
                h.a(81, 58);
              }
              var3 = param0.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (param2.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              vh.a(param0, "document.cookie=\"" + var5Lifetime4 + "\"", -12300);
            } catch (Throwable throwable) {
            }
            tj.a(true, param0);
          } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "h.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
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
        try {
          wd.field_e.f();
          if (param0 != -84) {
            field_F = -57;
          }
          cb.field_g.f();
          bi.field_d = bi.field_d - 1;
          if (bi.field_d == 0) {
            bi.field_d = 200;
            var1 = (gi) (aj.field_s.a((byte) 74));
            while (var1 != null) {
              if (!var1.field_i.b(125)) {
                var1.c(84);
              }
              var1 = (gi) (aj.field_s.b((byte) -92));
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "h.HA(" + param0 + ')');
        }
    }

    final int a(byte param0, int param1) {
        if (param1 < 0 ||
          this.field_H.a((byte) 109) <= param1) {
          return -1;
        }
        if (param0 != -63) {
          field_F = 122;
        }
        return this.field_H.c(param1, 102);
    }

    final int a(boolean param0) {
        if (!param0) {
          field_F = -122;
        }
        return this.field_H.a((byte) 123);
    }

    final static kc[] b(int param0, int param1, int param2, int param3, int param4) {
        kc[] var6 = new kc[9];
        kc[] var5 = var6;
        kc dupTemp$0 = te.a(param0, -127, param1);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        kc dupTemp$1 = te.a(param0, -126, param4);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 != 0) {
          var6[4] = te.a(64, -126, param3);
        }
        if (param2 != 15762) {
          return (kc[]) null;
        }
        return var5;
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Main.field_T;
        try {
          if (!super.a(param0, param1, param2, -96, param4, param5, param6)) {
            if (param3 <= -14) {
              return false;
            }
            return true;
          }
          var8_int = -this.field_K - param0 + param2;
          var9 = this.field_h - 2 * this.field_K;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_G * var8_int / var9;
          if (param5 != 1) {
            if (param5 != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_H.a((byte) 99); var12++) {
              var13 = this.field_H.c(var12, -94) - var8_int;
              var13 = var13 * var13;
              if (var10 > var13) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (var11 >= 0) {
              this.field_H.e(0, var11);
            }
          } else {
            this.field_H.a(var8_int, 1);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("h.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(',').append(param6).append(')').toString());
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
        return this.field_G;
    }

    final static void a(int param0, int param1) {
        qb.field_f = 1000000000L / (long)param1;
        if (param0 != -17685) {
          h.a(-3, 103);
        }
    }

    static {
        field_I = new fe(0);
        field_E = new boolean[]{false, false, false, false, false, true, true, true, true, true, true};
    }
}
