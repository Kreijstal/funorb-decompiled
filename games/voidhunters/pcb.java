/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pcb extends rqa {
    static boolean field_o;
    static int field_p;

    final static void a(int param0, boolean param1, boolean param2) {
        ogb.a(param2, 62, 71, 64, hv.field_o, 66, w.field_v, 2000, 70, 65, 69, 72, ena.field_p, 68, (byte) 91);
        dra.a((byte) 125, 3);
        if (!param1) {
          qfa.a(62, true);
          if (param0 < 68) {
            field_p = 55;
            return;
          } else {
            return;
          }
        } else {
          lw.field_f = true;
          qfa.a(62, true);
          if (param0 >= 68) {
            return;
          } else {
            field_p = 55;
            return;
          }
        }
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            nga.field_e = param1;
            try {
                var6 = param0.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param2 != (param1.length() ^ -1)) {
                    var5 = var7 + "; Expires=" + tnb.a((byte) -88, 94608000000L + wt.a(false)) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ia.a((byte) -126, param0, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            hg.a(-38, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    pcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(0, 62, param0[0].a(22));
        if (param1 > -119) {
          pcb.a(57, true, true);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
    }
}
