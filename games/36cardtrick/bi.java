/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static boolean field_c;
    static le field_b;
    static int field_a;
    static int field_d;

    final static String a(byte param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_7_0 = null;
          String stackIn_13_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          int var2_int = 0;
          RuntimeException var2_ref = null;
          var8 = Main.field_T;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (vh.a("getcookies", -12151, param1));
              var5 = rh.a(';', var4, -100);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_7_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            var2_int = 30 % ((36 - param0) / 48);
            if (null == ni.field_a) {
              stackIn_15_0 = param1.getParameter("settings");
              return stackIn_15_0;
            }
            stackIn_13_0 = ni.field_a;
            return stackIn_13_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("bi.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 16) {
            field_a = 92;
          }
          stackIn_3_0 = nc.a(false, param0, (byte) 112);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bi.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 < 94) {
          field_d = -78;
        }
        field_b = null;
    }

    static {
        field_d = 200;
    }
}
