/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_c;
    static String field_b;
    static hd field_d;
    static String field_a;

    final static void a(boolean param0, int param1) {
        if (param1 < -126) {
          if (k.field_m != null) {
            k.field_m.a(73, param0);
          }
          return;
        }
        nj.a(108);
        if (k.field_m != null) {
          k.field_m.a(73, param0);
        }
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_6_0 = null;
          Object stackIn_11_0 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Kickabout.field_G;
          try {
            try {
              var3 = (String) (mm.a(param0 ^ 30858, "getcookies", param2));
              var4 = wr.a(var3, param0 ^ 2, ';');
              for (var5 = param0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_6_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_11_0 = null;
            return (String) (stackIn_11_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("nj.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param2 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (!(jh.field_Kb <= var1)) {
          in.field_b = in.field_b + (-var1 + jh.field_Kb);
        }
        int var3 = -67 / ((param0 + 10) / 32);
        jh.field_Kb = var1;
        return var1 + in.field_b;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -50) {
          return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 29079) {
          field_b = (String) null;
          if (param2 + (param1 + param0) <= on.field_f) {
            return param1 + param0;
          }
          if (-param2 + param0 < 0) {
            return on.field_f - param2;
          }
          return param0 - param2;
        }
        if (param2 + (param1 + param0) <= on.field_f) {
          return param1 + param0;
        }
        if (-param2 + param0 < 0) {
          return on.field_f - param2;
        }
        return param0 - param2;
    }

    static {
        field_b = "Resign";
        field_c = "Offer rematch";
        field_a = "Auto-respond to <%0>";
    }
}
