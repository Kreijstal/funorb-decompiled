/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends fa {
    static boolean field_q;
    static int field_n;
    static String field_l;
    static String[][] field_m;
    static int field_p;
    static String field_k;
    pp field_o;

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_9_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Pixelate.field_H ? 1 : 0;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              if (param1 != -85) {
                ln.a(122);
              }
              var4 = (String) (cq.a("getcookies", (byte) -43, param0));
              var5 = dd.a(var4, (byte) -37, ';');
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (jp.field_c == null) {
              return param0.getParameter("settings");
            }
            stackIn_16_0 = jp.field_c;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("ln.D(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_m = (String[][]) null;
        if (param0 != -113) {
          field_m = (String[][]) null;
        }
        field_l = null;
        field_k = null;
    }

    ln(int param0) {
        this.field_o = pp.a(pg.field_f[param0], 100, ci.field_m[param0]);
        mn.a(-21317, this.field_o);
    }

    final static void a(int param0) {
        if (param0 <= 11) {
          return;
        }
        if (null == ib.field_f) {
          return;
        }
        pf.a(ib.field_f, 0);
        ib.field_f.a(6511, mc.field_k);
        ib.field_f = null;
        if (vh.field_c != null) {
          vh.field_c.b(-101);
        }
        ec.field_u.requestFocus();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = Pixelate.field_H ? 1 : 0;
        if (param6 != 100) {
          field_k = (String) null;
        }
        if (param1 <= param3) {
          if (param3 >= param4) {
            if (param1 >= param4) {
              cn.a(param2, param1, param3, param5, param7, t.field_k, false, param0, param4);
            } else {
              cn.a(param0, param4, param3, param5, param7, t.field_k, false, param2, param1);
            }
          } else {
            cn.a(param7, param3, param4, param5, param0, t.field_k, false, param2, param1);
          }
        } else {
          if (param4 <= param1) {
            if (param4 <= param3) {
              cn.a(param7, param3, param1, param5, param2, t.field_k, false, param0, param4);
            } else {
              cn.a(param0, param4, param1, param5, param2, t.field_k, false, param7, param3);
            }
          } else {
            cn.a(param2, param1, param4, param5, param0, t.field_k, false, param7, param3);
          }
        }
    }

    static {
        field_q = true;
        field_l = "No options available";
        field_k = "Members";
        field_p = 0;
    }
}
