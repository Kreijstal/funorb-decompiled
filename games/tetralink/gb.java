/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends mc {
    static String field_q;
    gb field_o;
    long field_n;
    static int[] field_r;
    static String field_p;
    gb field_s;

    final long c(int param0) {
        int var2 = 17 / ((param0 - -27) / 46);
        return ((gb) this).field_n;
    }

    final void a(long param0, int param1) {
        if (null != ((gb) this).field_s) {
            throw new RuntimeException();
        }
        if (param1 != 17260) {
            gb.a((byte) -92, true);
        }
        ((gb) this).field_n = param0;
    }

    final boolean a(int param0) {
        if (!(null != ((gb) this).field_s)) {
            return false;
        }
        if (param0 != 2) {
            field_r = null;
            return true;
        }
        return true;
    }

    final static kh a(boolean param0, int[] param1, kh param2) {
        if (param0) {
            return null;
        }
        kh var3 = new kh(0, 0, 0);
        var3.field_k = param2.field_k;
        var3.field_d = param2.field_d;
        var3.field_f = param2.field_f;
        var3.field_b = param2.field_b;
        var3.field_j = param2.field_j;
        var3.field_h = param2.field_h;
        var3.field_p = param1;
        var3.field_o = param2.field_o;
        return var3;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = TetraLink.field_J;
          if (0 >= mb.field_C) {
            if (!ug.o(-115)) {
              var2 = 1;
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          } else {
            L1: {
              if (hn.field_M != null) {
                hd.field_u = hn.field_M.b(false);
                pf.a(123, 2);
                break L1;
              } else {
                hd.field_u = bm.a(480, 0, 0, 640, 0, nd.field_Pb);
                break L1;
              }
            }
            if (hd.field_u == null) {
              var2 = 3;
              break L0;
            } else {
              da.a((byte) -76, (java.awt.Canvas) (Object) hd.field_u);
              var2 = 2;
              break L0;
            }
          }
        }
        L2: {
          if (null != hn.field_M) {
            break L2;
          } else {
            if (!rm.field_f) {
              break L2;
            } else {
              om.a(param1, 10, var2);
              break L2;
            }
          }
        }
        L3: {
          if (param0 <= -68) {
            break L3;
          } else {
            var4 = null;
            kh discarded$1 = gb.a(false, (int[]) null, (kh) null);
            break L3;
          }
        }
    }

    final void e(int param0) {
        if (!(null != ((gb) this).field_s)) {
            return;
        }
        ((gb) this).field_s.field_o = ((gb) this).field_o;
        ((gb) this).field_o.field_s = ((gb) this).field_s;
        ((gb) this).field_s = null;
        if (param0 != 0) {
            return;
        }
        ((gb) this).field_o = null;
    }

    final static dk a(byte param0, java.applet.Applet param1) {
        int var4 = 0;
        dk var5 = null;
        int var6 = TetraLink.field_J;
        String var2 = TetraLink.a("jagex-last-login-method", -28536, param1);
        if (!(var2 != null)) {
            return vc.field_b;
        }
        dk[] var3_ref_dk__ = lf.a(7);
        for (var4 = 0; var4 < var3_ref_dk__.length; var4++) {
            var5 = var3_ref_dk__[var4];
            if (!(!var5.a(16412, var2))) {
                return var5;
            }
        }
        int var3 = -31 / ((param0 - 21) / 47);
        return vc.field_b;
    }

    public static void d(int param0) {
        field_q = null;
        field_p = null;
        if (param0 < 88) {
            field_r = null;
        }
        field_r = null;
    }

    protected gb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "You do not have a suitable number of players for the current options.";
        field_p = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
