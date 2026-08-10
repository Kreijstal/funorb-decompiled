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
        return this.a((byte) -109, this.field_f.field_l);
    }

    public final void a(boolean param0, ul param1) {
        try {
            if (!param0) {
                field_l = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ah.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract rf a(int param0, String param1);

    public final boolean c(int param0) {
        int var2;
        int stackIn_3_0 = 0;
        var2 = -113 % ((41 - param0) / 50);
        if (this.field_f.field_l != null) {
          if (this.field_f.field_l.length() == 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackIn_3_0 = 1;
          return stackIn_3_0 != 0;
        }
    }

    public final void a(ul param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ah.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final rf d(int param0) {
        if (param0 >= -60) {
          ah.f(-116);
          return this.a(-1, this.field_f.field_l);
        } else {
          return this.a(-1, this.field_f.field_l);
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
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            ah.a((java.awt.Canvas) null, -55);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
            if (!(-12 != (ff.field_e ^ -1))) {
                bm.b((byte) 62);
            }
            si.a(pl.field_t, hd.field_e, pb.field_d, (byte) 14);
            nn.a(param0, param1, param1 + -1, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ah.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ah(ul param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
        field_i = "OK";
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_l = "Waiting for graphics";
        field_h = false;
        field_m = "Open in popup window";
        field_k = "Close";
    }
}
