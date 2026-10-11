/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static int field_f;
    static String field_e;
    static String field_a;
    static int field_d;
    static int field_b;
    static String[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        int var1 = -67 % ((-80 - param0) / 33);
    }

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1 != -2964) {
            stackIn_3_0 = -107;
            return stackIn_3_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = (var3 << 5) - var3 + vb.a((byte) -128, param0.charAt(var4));
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("lb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            hb.field_o = param0;
            try {
              var3 = param1.getParameter("cookieprefix");
              var4 = param1.getParameter("cookiehost");
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (~param0.length() == param2) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              cd.a(param1, 13162, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            dh.a(param1, true);
          } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "lb.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = "Select a mission from the main map to activate this button";
        field_f = 2;
        field_a = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_c = new String[]{"Small Arms", "Large Arms", "Armour", "Grenades", "Advanced Weapons", "Alien Weapons"};
        field_b = -1;
    }
}
