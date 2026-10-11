/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    private cr field_b;
    static ts field_a;

    final void a(int param0) {
        if (null != this.field_b) {
          this.field_b.b(param0 + 12002);
          if (param0 != -1) {
            field_a = (ts) null;
            return;
          }
          return;
        }
        if (param0 == -1) {
          return;
        }
        field_a = (ts) null;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 6) {
          field_a = (ts) null;
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (rq.field_d) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (tw.a(param1, 116, "getcookies"));
              var4 = cn.a((char)param0, var3, -27224);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("lm.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    lm(boolean param0) {
    }

    static {
        field_a = new ts(6, 0, 4, 2);
    }
}
