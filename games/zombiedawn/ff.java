/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static int field_b;
    static int field_a;
    static byte[][] field_c;

    final static String a(byte param0) {
        if (param0 != -12) {
          return (String) null;
        }
        return gk.field_F;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          int var7 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          int var8 = 0;
          int var9 = 0;
          String var10 = null;
          String stackIn_6_0 = null;
          String stackIn_12_0 = null;
          String stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var9 = ZombieDawn.field_J;
          try {
            try {
              var10 = param0.getParameter("cookieprefix");
              var3 = var10 + "settings";
              var4 = (String) (qe.a(param0, "getcookies", -102));
              var5 = de.a(';', var4, -125);
              var6 = 30 / ((param1 + 23) / 59);
              for (var7 = 0; var5.length > var7; var7++) {
                var8 = var5[var7].indexOf('=');
                if (0 <= var8 &&
                  var5[var7].substring(0, var8).trim().equals(var3)) {
                  stackIn_6_0 = var5[var7].substring(var8 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (nj.field_X == null) {
              stackIn_14_0 = param0.getParameter("settings");
              return stackIn_14_0;
            }
            stackIn_12_0 = nj.field_X;
            return stackIn_12_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref;
            stackIn_17_1 = new StringBuilder().append("ff.C(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = (byte[][]) null;
        if (param0 != -1) {
          field_b = -98;
        }
    }

    static {
        field_c = new byte[1000][];
    }
}
