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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        var2 = param0.length();
        var3 = 0;
        if (param1 != -2964) {
          return -107;
        } else {
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = (var3 << 590171557) - var3 - -vb.a((byte) -128, param0.charAt(var4));
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            hb.field_o = param0;
            try {
                var3 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (!((param0.length() ^ -1) != param2)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                cd.a(param1, 13162, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            dh.a(param1, true);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Select a mission from the main map to activate this button";
        field_f = 2;
        field_a = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_c = new String[]{"Small Arms", "Large Arms", "Armour", "Grenades", "Advanced Weapons", "Alien Weapons"};
        field_b = -1;
    }
}
