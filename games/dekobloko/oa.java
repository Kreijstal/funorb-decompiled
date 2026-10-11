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
              if (param1 == ~param2.length()) {
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
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-var4 + var2_int - 1] = param0.charAt(var4);
          }
          if (param1 != -1) {
            field_f = (String) null;
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("oa.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
          field_e = (int[]) null;
        }
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        field_c = "Enter multiplayer lobby";
        field_d = "You must play 1 more rated game before playing with the current options.";
    }
}
