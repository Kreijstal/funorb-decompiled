/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws extends rqa {
    static String field_o;

    public static void e(int param0) {
        if (param0 >= -121) {
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        rw.field_n = param0[0].d(0);
        if (param1 >= -119) {
            field_o = null;
        }
        return new nc((Object) (Object) "void");
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ws.f(118);
        }
        return ira.a(lsa.field_f, nkb.field_o, 41);
    }

    final static boolean f(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ila.a(param0 ^ 0, vpa.b((byte) -113));
    }

    ws(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var2 = 0;
        if (param0 >= 104) {
          L0: while (true) {
            if (param1.length() <= var2) {
              return false;
            } else {
              var3 = param1.charAt(var2);
              if (!cs.a((char) var3, 0)) {
                if (!haa.a((char) var3, true)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Squid chassis";
    }
}
