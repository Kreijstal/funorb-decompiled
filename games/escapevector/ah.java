/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah extends sm implements rj {
    static String field_i;
    static String field_g;
    static String field_l;
    static String field_m;
    static ed field_j;
    static boolean field_h;
    static long field_e;
    private ul field_f;
    static String field_k;

    final String a(byte param0) {
        int var2 = 91 / ((52 - param0) / 53);
        return ((ah) this).a((byte) -109, ((ah) this).field_f.field_l);
    }

    public final void a(boolean param0, ul param1) {
        if (!param0) {
            field_l = null;
        }
    }

    abstract rf a(int param0, String param1);

    public final boolean c(int param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = -113 % ((41 - param0) / 50);
        if (((ah) this).field_f.field_l != null) {
          if (((ah) this).field_f.field_l.length() == 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public final void a(ul param0, int param1) {
        if (param1 != 0) {
            return;
        }
        ((ah) this).a(false);
    }

    final rf d(int param0) {
        if (param0 >= -60) {
          ah.f(-116);
          return ((ah) this).a(-1, ((ah) this).field_f.field_l);
        } else {
          return ((ah) this).a(-1, ((ah) this).field_f.field_l);
        }
    }

    abstract String a(byte param0, String param1);

    public static void f(int param0) {
        field_j = null;
        field_m = null;
        field_g = null;
        field_l = null;
        field_k = null;
        field_i = null;
        if (param0 != -16187) {
            Object var2 = null;
            ah.a((java.awt.Canvas) null, -55);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        if (!(-12 != (ff.field_e ^ -1))) {
            bm.b((byte) 62);
        }
        si.a(pl.field_t, hd.field_e, pb.field_d, (byte) 14);
        nn.a(param0, param1, param1 + -1, 0);
    }

    ah(ul param0) {
        ((ah) this).field_f = param0;
    }

    final static void e(int param0) {
        tg.field_nb = null;
        qm.field_f = null;
        nn.field_i = null;
        tb.field_G = null;
        tb.field_D = false;
        if (param0 != 0) {
            field_e = -59L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "OK";
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_l = "Waiting for graphics";
        field_h = false;
        field_m = "Open in popup window";
        field_k = "Close";
    }
}
