/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static String field_a;

    public static void a(byte param0) {
        if (param0 >= -36) {
          ma.a(1.5420202648877515, 77);
        }
        field_a = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_18_0 = false;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref2 = null;
          int var5Lifetime1;
          var7 = fleas.field_A ? 1 : 0;
          try {
            if (qj.field_G) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (eb.a("getcookies", param1, -250));
              var4 = m.a(';', 119, var3);
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
              var5Lifetime1 = 127 / ((-23 - param0) / 36);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = decompiledCaughtException;
            }
            stackIn_18_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_18_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2_ref;
            stackIn_21_1 = new StringBuilder().append("ma.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static double a(double param0, int param1) {
        if (param1 <= 54) {
          ma.a(-0.36173003999453074, 40);
        }
        return tg.field_b[65535 & (int)(param0 * 32768.0 / 3.141592653589793)];
    }

    static {
    }
}
