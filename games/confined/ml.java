/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static ve field_a;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -1) {
          field_a = (ve) null;
        }
    }

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_10_0 = null;
          Object stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Confined.field_J ? 1 : 0;
          try {
            try {
              var3 = (String) (kf.a(122, "getcookies", param2));
              var4 = ij.a(param1 ^ 79, ';', var3);
              if (param1 != 79) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_10_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_10_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_15_0 = null;
            return (String) (stackIn_15_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var3_ref2;
            stackIn_18_1 = new StringBuilder().append("ml.B(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Please check if address is correct";
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_a = new ve();
    }
}
