/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends hg {
    int[] field_h;
    boolean field_g;
    static String field_i;
    int field_j;

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          RuntimeException var3_ref = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_6_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref2 = null;
          var7 = EscapeVector.field_A;
          try {
            try {
              var3 = (String) (sd.a(param2, "getcookies", -29155));
              var4 = bb.a(-128, var3, ';');
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_6_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_6_0;
                }
              }
              if (param0 <= 78) {
                field_i = (String) null;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref2 = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref;
            stackIn_16_1 = new StringBuilder().append("dc.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 > -5) {
          return -127;
        }
        int var3 = param2 / param1;
        if (param2 % param1 == 0) {
          return var3;
        }
        var3++;
        return var3;
    }

    final static void a(byte param0, String param1, int param2, int param3) {
        try {
          fh.field_g.b(param1, param2 - 1, -1 + param3, 0, -1, 64);
          if (param0 < 19) {
            field_i = (String) null;
          }
          fh.field_g.b(param1, 1 + param2, -1 + param3, 0, -1, 64);
          fh.field_g.b(param1, param2 - 1, 1 + param3, 0, -1, 64);
          fh.field_g.b(param1, 1 + param2, 1 + param3, 0, -1, 64);
          fh.field_g.c(param1, param2, param3, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 == 64) {
          return param3 * (-param2 + param0) / param1 + param2;
        }
        field_i = (String) null;
        return param3 * (-param2 + param0) / param1 + param2;
    }

    dc() {
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
          dc.a(true);
        }
    }

    static {
        field_i = "RIGHT ARROW";
    }
}
