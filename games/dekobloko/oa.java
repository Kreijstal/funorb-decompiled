/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_f;
    static int[] field_e;
    static String field_c;
    static int field_a;
    static String field_d;
    static ck[] field_b;

    final static void a(int param0) {
        if (param0 <= 125) {
            return;
        }
        sg.field_d = null;
        tc.field_Nb = (byte[][]) null;
        hc.field_c = null;
        tm.field_a = null;
        fh.field_a = null;
        mb.field_d = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                u.field_a = param2;
                try {
                    var3 = param0.getParameter("cookieprefix");
                    var4 = param0.getParameter("cookiehost");
                    var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    if (!(param1 != (param2.length() ^ -1))) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    nc.a((byte) -51, param0, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                me.a((byte) 121, param0);
            } catch (RuntimeException runtimeException) {
                throw dh.a((Throwable) ((Object) runtimeException), "oa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var2_int) {
                  if (param1 == -1) {
                    break L2;
                  } else {
                    field_f = (String) null;
                    break L2;
                  }
                } else {
                  var3[-var4 + var2_int + -1] = param0.charAt(var4);
                  var4++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_8_0 = new String(var3);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("oa.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void b(int param0) {
        if (param0 != -1) {
          field_e = (int[]) null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    static {
        field_c = "Enter multiplayer lobby";
        field_d = "You must play 1 more rated game before playing with the current options.";
    }
}
