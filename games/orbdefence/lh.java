/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_a;
    static be field_b;
    static int field_c;
    static int field_d;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -21248) {
          field_b = (be) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(java.applet.Applet param0, String param1, boolean param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            pc.field_ab = param1;
            try {
              if (param2) {
                return;
              }
              var3 = param0.getParameter("cookieprefix");
              var4 = param0.getParameter("cookiehost");
              var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
              if (param1.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              gm.a((byte) -17, "document.cookie=\"" + var5 + "\"", param0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            g.a(1, param0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref2;
            stackIn_13_1 = new StringBuilder().append("lh.A(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = -1;
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_d = 480;
    }
}
