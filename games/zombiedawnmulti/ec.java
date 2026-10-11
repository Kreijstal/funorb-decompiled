/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static cj field_b;
    static String field_a;
    static boolean field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -12) {
          field_b = (cj) null;
        }
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
        try {
          int var5 = 0;
          RuntimeException var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String var8 = null;
          String stackIn_9_0 = null;
          Object stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            try {
              var8 = (String) (fo.b(param0, 13093, "getcookies"));
              var4 = mk.a(';', false, var8);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_9_0;
                }
              }
              if (param1 < 94) {
                field_a = (String) null;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var3;
            stackIn_19_1 = new StringBuilder().append("ec.B(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = null;
        String var4Lifetime1;
        if (param0) {
          oo.f(0, 0, oo.field_b, oo.field_l, 0, 192);
          if (param2 >= -98) {
            var4 = (String) null;
            ec.a((java.applet.Applet) null, (byte) -12, (String) null);
            wj.b(param0, -120);
            return;
          }
          wj.b(param0, -120);
          return;
        }
        oo.b();
        if (param2 >= -98) {
          var4Lifetime1 = (String) null;
          ec.a((java.applet.Applet) null, (byte) -12, (String) null);
          wj.b(param0, -120);
          return;
        }
        wj.b(param0, -120);
    }

    static {
        field_c = false;
        field_a = "Research";
    }
}
