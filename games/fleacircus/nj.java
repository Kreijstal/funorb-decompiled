/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nj {
    private int field_f;
    private ji[] field_e;
    static dd field_b;
    private int field_c;
    static String field_d;
    private int field_g;
    static od field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        int var1 = 29 / ((-60 - param0) / 36);
        field_a = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        for (var2 = this.field_e.length - 1; 0 <= var2; var2--) {
          if (null != this.field_e[var2]) {
            this.field_e[var2].b(true);
          }
        }
        if (param0 < -24) {
          return;
        }
        this.field_e = (ji[]) null;
    }

    final static java.net.URL a(byte param0, int param1, String param2, java.net.URL param3, String param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_42_0 = null;
          java.net.URL stackIn_44_0 = null;
          RuntimeException stackIn_47_0 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          StringBuilder stackIn_53_1 = null;
          String stackIn_54_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = fleas.field_A ? 1 : 0;
          try {
            var5 = param3.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if (var7_int >= 0) {
                  if (param1 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime2 >= 0) {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime3 >= 0) {
                  if (param4 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                    continue;
                  }
                  var6 = var7_intLifetime3;
                  continue;
                }
              }
              break;
            }
            if (param0 != 53) {
              field_b = (dd) null;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (0 < param1) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param1));
            }
            if (param2 != null &&
              param2.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param2);
            }
            if (param4 != null &&
              param4.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param4);
            }
            if (var5.length() <= var6) {
              discarded$7 = var7.append('/');
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_42_0 = new java.net.URL(param3, var7.toString());
              return stackIn_42_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_44_0 = (java.net.URL) (param3);
              return stackIn_44_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("nj.D(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
            if (param3 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
            if (param4 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = fleas.field_A ? 1 : 0;
        try {
          if (gb.field_l > param3) {
            param2 = param2 - (gb.field_l - param3);
            param3 = gb.field_l;
          }
          if (param2 + param3 > gb.field_h) {
            param2 = gb.field_h - param3;
          }
          if (param0 < gb.field_b) {
            param4 = param4 - (-param0 + gb.field_b);
            param0 = gb.field_b;
          }
          if (gb.field_i < param4 + param0) {
            param4 = -param0 + gb.field_i;
          }
          if (0 < param2 &&
            0 < param4) {
            var6_int = param0 * gb.field_d + param3;
            var7 = gb.field_d - param2;
            if (param5 != 1067) {
              nj.a((byte) 101);
            }
            for (param0 = -param4; 0 > param0; param0++) {
              for (param3 = -param2; 0 > param3; param3++) {
                var8 = gb.field_a[var6_int];
                if (param1 < ((65280 & var8) >> 8) &&
                  (var8 >> 8 & 255) >= (16711680 & var8) >> 16) {
                  var9 = -60 + (510 & var8 >> 15);
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = (var10 >> 1) - (var10 >> 5) & 65280;
                  var11 = (255 & var8) >> 3;
                  gb.field_a[var6_int] = ne.a(ne.a(var9 << 16, var10), var11);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var6), "nj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    nj(int param0, int param1, int param2, int param3, int[] param4) {
        int var6_int = 0;
        try {
          this.field_c = param0 + db.a((byte) -115, na.field_c, param2);
          this.field_f = param1 + db.a((byte) -115, na.field_c, param3);
          this.field_e = new ji[50 + db.a((byte) -115, na.field_c, 5)];
          for (var6_int = this.field_e.length - 1; var6_int >= 0; var6_int--) {
            this.field_e[var6_int] = new ji(this.field_c, this.field_f, db.a((byte) -115, na.field_c, 1024), param4);
          }
          this.field_g = db.a((byte) -115, na.field_c, 3) + 2;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "nj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 == -9340) {
          if (gf.field_d <= 32) {
            ia.a(true, 0);
          } else {
            var1 = gf.field_d % 32;
            if (0 == var1) {
              var1 = 32;
            }
            ia.a(true, gf.field_d - var1);
          }
          return;
        }
        nj.a(-16);
        if (gf.field_d <= 32) {
          ia.a(true, 0);
        } else {
          var1Lifetime1 = gf.field_d % 32;
          if (0 == var1Lifetime1) {
            var1Lifetime1 = 32;
          }
          ia.a(true, gf.field_d - var1Lifetime1);
        }
    }

    final boolean b(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 1;
        var3 = 122 % ((param0 - 3) / 55);
        for (var4 = -1 + this.field_e.length; var4 >= 0; var4--) {
          if (null != this.field_e[var4]) {
            this.field_e[var4].a(this.field_g, (byte) -128);
            var2 = var2 != 0 & this.field_e[var4].a(true) ? 1 : 0;
          }
        }
        return var2 != 0;
    }

    static {
        field_b = new dd(540, 140);
        field_d = "Next level";
    }
}
