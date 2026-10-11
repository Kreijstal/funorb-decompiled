/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static fn[] field_e;
    static int field_d;
    static bn field_a;
    static int field_b;
    static String field_c;

    final static boolean a(int param0) {
        java.applet.Applet var2;
        boolean stackIn_6_0 = false;
        if (param0 > -40) {
          var2 = (java.applet.Applet) null;
          m.a((java.applet.Applet) null, (byte) 61);
        }
        stackIn_6_0 = (null != lj.field_a) && (tb.field_f.a((byte) -121));
        return stackIn_6_0;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_3_0 = null;
          String stackIn_10_0 = null;
          String stackIn_17_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Chess.field_G;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (u.a(true, "getcookies", param0));
              if (param1 != 87) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var5 = gl.a((byte) -118, ';', var4);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_10_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_10_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (wg.field_p == null) {
              return param0.getParameter("settings");
            }
            stackIn_17_0 = wg.field_p;
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("m.C(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_a = (bn) null;
        }
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        dc var4 = null;
        pa var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Chess.field_G;
        try {
          if (param1 != 0) {
            field_a = (bn) null;
          }
          var4 = (dc) (fa.field_j.g(param1 - 18110));
          while (var4 != null) {
            bh.a(var4, (byte) 46, param0);
            var4 = (dc) (fa.field_j.a((byte) -92));
          }
          var5 = (pa) (ve.field_Nb.g(param1 ^ -18110));
          while (var5 != null) {
            ri.a(param1 - 1281, var5, param0);
            var5 = (pa) (ve.field_Nb.a((byte) -111));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "m.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Please wait...";
    }
}
