/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class al extends mi implements bo, wi {
    static String field_i;
    static oi[] field_j;
    static String field_g;
    rd field_h;

    public final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return this.field_h.h(54);
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        String[] var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          for (var3 = 1; var3 < param0.length(); var3++) {
            if (~param0.charAt(var3) != ~var2_int) {
              return false;
            }
          }
          if (param1 < 123) {
            var5 = (String[]) null;
            al.a((String) null, -75, (String[]) null, -81);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("al.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var7 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          cb.field_c = rg.field_d;
          if (param3 != 100) {
            var6 = (String) null;
            al.a((String) null, -66, 0.017817853018641472f);
          }
          if (param1 != 255) {
            if (param1 >= 100 &&
              105 >= param1) {
              var4 = param2;
              nl.a(-22063, var4);
              de.field_ob = md.a(param2, 7655);
              return;
            }
            de.field_ob = lc.a(param1, param0, param3 ^ 29521);
          } else {
            stackIn_6_0 = -32;
            stackIn_7_1 = !(13 <= nf.field_d);
            de.field_ob = Virogrid.$cfr$intArgs$b$d65aded092bd(stackIn_6_0, stackIn_7_1);
            var7 = (String[]) null;
            nl.a(-22063, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("al.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final wl f(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wl stackIn_2_0 = null;
        wl stackIn_5_0 = null;
        wl stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        NumberFormatException var2 = null;
        try {
          var2_int = this.field_h.f(-2);
          var3 = this.field_h.g(param0 ^ 843083348);
          var4 = this.field_h.g(true);
          var5 = hn.c(false);
          if (var4 < 1890) {
            stackIn_2_0 = ee.field_c;
            return stackIn_2_0;
          }
          if (-3 + var5 < var4) {
            stackIn_5_0 = ee.field_c;
            return stackIn_5_0;
          }
          if (!th.a((byte) 127, var4, var2_int, var3)) {
            stackIn_9_0 = ee.field_c;
            return stackIn_9_0;
          }
          if (param0 != -843083384) {
            field_i = (String) null;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return ee.field_c;
        }
        return bm.field_i;
    }

    final static void a(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var6 = 22 % ((54 - param4) / 42);
          var5_int = 0;
          while (true) {
            if (var5_int >= da.field_g.length) {
              return;
            }
            param2 = da.field_g[var5_int];
            var7 = var5_int << 4;
            while (true) {
              incrementValue$0 = param2;
              param2--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var7;
              var7++;
              param3 = bf.field_m[incrementValue$1];
              dupTemp$2 = param0[param3];
              dupTemp$3 = param1[dupTemp$2];
              param1[dupTemp$2] = dupTemp$3 + 1;
              bf.field_m[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("al.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != oj.field_Ub && (0 > param1 ||
            kh.field_c == ug.field_a)) {
            if (gk.field_g.field_l == 0 &&
              (ud.field_a + 10000L) < hc.a(-9986)) {
              gk.field_g.g(param1, 8);
            }
            if (param0 != -1) {
              field_i = (String) null;
            }
            if (0 < gk.field_g.field_l) {
              try {
                oj.field_Ub.a(gk.field_g.field_g, param0 + 1, 0, gk.field_g.field_l);
                ud.field_a = hc.a(-9986);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                tn.a(false);
              }
              gk.field_g.field_l = 0;
            }
            return;
          }
          gk.field_g.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void i(int param0) {
        if (ae.field_g != null) {
          ae.field_g.d();
        }
        if (ac.field_c != null) {
          ac.field_c.d();
        }
        if (param0 != 100) {
          al.b(89, -96);
        }
    }

    public static void g(int param0) {
        if (param0 != -1) {
          al.i(-50);
        }
        field_i = null;
        field_j = null;
        field_g = null;
    }

    final static boolean h(int param0) {
        if (param0 < 25) {
          al.g(78);
        }
        if (!qc.field_h) {
          return false;
        }
        if (sd.field_e == 0) {
          return true;
        }
        return false;
    }

    public final void a(boolean param0, wa param1) {
        try {
          if (param0) {
            this.field_h = (rd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "al.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_h.f(-2);
          var3 = this.field_h.g(-39);
          var4 = this.field_h.g(true);
          var5 = hn.c(false);
          if (var4 >= 1890 &&
            var4 <= -3 + var5) {
            if (th.a((byte) -41, var4, var2_int, var3)) {
              return null;
            }
          } else {
            stackIn_4_0 = oi.a(new String[]{"1890", Integer.toString(var5 - 3)}, re.field_p, 2);
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        if (param0 >= -86) {
          field_g = (String) null;
        }
        return gf.field_C;
    }

    final static void a(String param0, int param1, float param2) {
        try {
          ne.field_g = param0;
          j.field_i = param2;
          if (param1 != 13) {
            al.g(-11);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "al.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(wa param0, int param1) {
        try {
          this.b(false);
          if (param1 != 13) {
            this.field_h = (rd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "al.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public al() {
    }

    static {
        field_j = new oi[12];
        field_i = "Private";
        field_g = "Open in popup window";
    }
}
