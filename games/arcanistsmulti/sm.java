/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static qb field_d;
    static kc field_c;
    static String field_b;
    static kd field_e;
    static int field_a;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != 22230) {
            return true;
          }
          param2 = fb.a(false, '_', param2, "");
          var3 = pn.a(8671, param1);
          stackIn_8_0 = (param2.indexOf(param1) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("sm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(long param0, String param1, java.applet.Applet param2, int param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param0 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + di.a(param3 ^ 15478, qj.b(-26572) + 1000L * param0) + "; Max-Age=" + param0;
              }
              ei.a("document.cookie=\"" + var7Lifetime4 + "\"", param2, 269);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            if (param3 == -15367) {
              return;
            }
            sm.a(51, -15);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("sm.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0) {
          field_a = -109;
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 50) {
          throw new IllegalArgumentException();
        }
        int var2 = 101 % ((-45 - param0) / 42);
    }

    final static void a(int param0, boolean param1, int param2, gh param3, java.awt.Component param4, int param5, dl param6, int param7) {
        try {
          lb.a(param2, param1, 10);
          oh.field_k = lb.a(param6, param4, 0, param7);
          lf.field_a = lb.a(param6, param4, 1, param5);
          pc.field_e = new m();
          qc.field_a = 1000 * param5 / param2;
          lf.field_a.a(pc.field_e);
          jl.field_h = param3;
          jl.field_h.a(ul.field_A, (byte) -66);
          oh.field_k.a(jl.field_h);
          int var8_int = 110 % ((-25 - param0) / 48);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sm.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        field_b = "Please enter your date of birth to enable chat:";
    }
}
