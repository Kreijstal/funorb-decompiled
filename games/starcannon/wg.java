/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static int field_e;
    static int field_c;
    static String field_a;
    static o field_d;
    static int field_b;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -20) {
          wg.a((byte) -100);
        }
    }

    final static int a(boolean param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (0 == param1) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            param1 = param1 >> 8;
            var2 += 8;
          }
          if (15 < param1) {
            var2 += 4;
            param1 = param1 >> 4;
          }
          if (param1 > 3) {
            param1 = param1 >> 2;
            var2 += 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        if (param0) {
          wg.a(false, -64);
        }
        var2Lifetime1 = 2;
        if (-65536 > param1) {
          var2Lifetime1 += 16;
          param1 = param1 >> 16;
        }
        if (param1 < -256) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param1 < -16) {
          var2Lifetime1 += 4;
          param1 = param1 >> 4;
        }
        if (param1 < -4) {
          param1 = param1 >> 2;
          var2Lifetime1 += 2;
        }
        if (param1 < -2) {
          param1 = param1 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    final static void a(byte param0, String param1, java.applet.Applet param2, String param3, long param4) {
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
              var9 = param3 + "=" + param1 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param4) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + ge.a((byte) -36, dd.b(84) + 1000L * param4) + "; Max-Age=" + param4;
              }
              mb.a("document.cookie=\"" + var7Lifetime4 + "\"", param2, 790);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            if (param0 >= 82) {
              return;
            }
            wg.a(true, -125);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("wg.C(").append(param0).append(',');
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
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = 0;
        field_d = new o(11, 0, 1, 2);
    }
}
