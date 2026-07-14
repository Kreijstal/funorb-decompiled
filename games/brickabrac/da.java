/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends hb {
    static byte[][] field_L;
    wq field_D;
    static int field_G;
    static jp[] field_E;
    static int[] field_C;
    static int[] field_M;
    int field_K;
    byte field_F;
    static String field_H;
    static String field_J;

    final byte[] c(byte param0) {
        int var2 = 0;
        var2 = -99 % ((4 - param0) / 52);
        if (!((da) this).field_u) {
          if (((da) this).field_D.field_l < ((da) this).field_D.field_k.length - ((da) this).field_F) {
            throw new RuntimeException();
          } else {
            return ((da) this).field_D.field_k;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void f(byte param0) {
        if (pe.field_o.c(95)) {
          dn.b(0, -108, 11);
          if (param0 == 122) {
            return;
          } else {
            field_E = null;
            return;
          }
        } else {
          vg.a(o.field_e.e((byte) 31), false, 11);
          ed.field_d = true;
          if (param0 == 122) {
            return;
          } else {
            field_E = null;
            return;
          }
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var5 = null;
            sk.field_G = param0;
            String var3 = param2.getParameter("cookieprefix");
            String var4 = param2.getParameter("cookiehost");
            if (param1 <= 44) {
                return;
            }
            try {
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (!(param0.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ne.a(param2, "document.cookie=\"" + var5 + "\"", 5797);
            } catch (Throwable throwable) {
            }
            td.a(false, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        field_M = null;
        field_J = null;
        field_C = null;
        int var1 = -85 / ((4 - param0) / 55);
        field_H = null;
        field_E = null;
        field_L = null;
    }

    final static String d(byte param0) {
        if (!(2 <= qg.field_A)) {
            return kd.field_c;
        }
        if (!(null == wl.field_K)) {
            if (!(wl.field_K.a((byte) -127))) {
                return wn.field_a;
            }
            return d.field_C;
        }
        if (param0 != 103) {
            return null;
        }
        if (!(ma.field_P.a((byte) -127))) {
            return tm.field_e;
        }
        if (!ma.field_P.a("commonui", -28138)) {
            return ib.field_F + " - " + ma.field_P.b(0, "commonui") + "%";
        }
        if (!vh.field_S.a((byte) -127)) {
            return vh.field_P;
        }
        if (!(vh.field_S.a("commonui", -28138))) {
            return m.field_k + " - " + vh.field_S.b(0, "commonui") + "%";
        }
        if (!(ja.field_c.a((byte) -127))) {
            return hp.field_k;
        }
        if (!(ja.field_c.a(param0 ^ 12))) {
            return qm.field_e + " - " + ja.field_c.b(-4126) + "%";
        }
        return kd.field_a;
    }

    da() {
    }

    final int f(int param0) {
        if (param0 != -21546) {
            byte[] discarded$9 = ((da) this).c((byte) 12);
            if (!(null != ((da) this).field_D)) {
                return 0;
            }
            return ((da) this).field_D.field_l * 100 / (-((da) this).field_F + ((da) this).field_D.field_k.length);
        }
        if (!(null != ((da) this).field_D)) {
            return 0;
        }
        return ((da) this).field_D.field_l * 100 / (-((da) this).field_F + ((da) this).field_D.field_k.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new byte[250][];
        field_M = new int[8192];
        field_H = "Enter multiplayer lobby";
        field_J = "No highscores";
    }
}
