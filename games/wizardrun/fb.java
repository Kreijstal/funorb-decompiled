/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static double field_b;
    static ql field_d;
    static String field_e;
    static String field_c;
    static ji field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 >= -95) {
          field_d = (ql) null;
        }
        field_e = null;
        field_a = null;
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
          String stackIn_9_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = wizardrun.field_H;
          try {
            try {
              if (param1 != 102) {
                fb.a(78);
              }
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (cl.a(param0, -3264, "getcookies"));
              var5 = tj.a(var4, -22710, ';');
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (pa.field_f == null) {
              return param0.getParameter("settings");
            }
            stackIn_16_0 = pa.field_f;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("fb.A(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_c = "Your email address is used to identify this account";
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
