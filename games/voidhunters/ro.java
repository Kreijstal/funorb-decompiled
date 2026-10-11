/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    static volatile int field_a;
    static int field_c;
    static String field_b;

    final static String a(String param0, int param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          java.applet.Applet var8 = null;
          String var9 = null;
          String stackIn_8_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          var7 = VoidHunters.field_G;
          try {
            try {
              if (param1 < 72) {
                var8 = (java.applet.Applet) null;
                ro.a((String) null, 114, (java.applet.Applet) null);
              }
              var9 = (String) (ia.a(param2, "getcookies", 12348));
              var4 = up.a((byte) -67, ';', var9);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_8_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref;
            stackIn_16_1 = new StringBuilder().append("ro.A(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 121 / ((param0 - 44) / 55);
    }

    static {
        field_a = 0;
        field_b = "Error";
    }
}
