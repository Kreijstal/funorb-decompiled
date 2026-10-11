/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends java.awt.Canvas {
    static String[] field_c;
    private java.awt.Component field_b;
    static bu field_a;
    static String[] field_d;
    static int field_e;

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_b.update(param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "sa.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 < 106) {
          return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          String var10 = null;
          String stackIn_7_0 = null;
          String stackIn_13_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var9 = Kickabout.field_G;
          try {
            try {
              var10 = param0.getParameter("cookieprefix");
              var3 = var10 + "settings";
              var4 = (String) (mm.a(30858, "getcookies", param0));
              var5 = wr.a(var4, 2, ';');
              var6 = 0;
              var7 = 35 % ((param1 - 32) / 57);
              while (var6 < var5.length) {
                var8 = var5[var6].indexOf('=');
                if (var8 >= 0 &&
                  var5[var6].substring(0, var8).trim().equals(var3)) {
                  stackIn_7_0 = var5[var6].substring(var8 + 1).trim();
                  return stackIn_7_0;
                }
                var6++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (wk.field_b == null) {
              stackIn_15_0 = param0.getParameter("settings");
              return stackIn_15_0;
            }
            stackIn_13_0 = wk.field_b;
            return stackIn_13_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("sa.A(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    sa(java.awt.Component param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "sa.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"Press the spacebar to sprint.", "Press 'CTRL' to sprint."};
        tf discarded$0 = new tf();
        field_d = new String[]{"Modern", "Old School"};
    }
}
