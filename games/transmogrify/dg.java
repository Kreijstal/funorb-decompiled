/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_f;
    static String field_e;
    static hb[] field_d;
    volatile boolean field_c;
    static int field_b;
    static int field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "dg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        tj.field_v = null;
        da.field_y = 0;
        qi.field_d = -1;
        og.field_e = param0;
        lk.field_c = false;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -1) {
            dg.c(3);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    dg() {
    }

    final static void b(int param0) {
        ci.field_f.k(31410);
        if (null != gh.field_m) {
          if (param0 >= -9) {
            dg.a(54);
            ci.field_f.b((qg) (gh.field_m), (byte) -71);
            return;
          } else {
            ci.field_f.b((qg) (gh.field_m), (byte) -71);
            return;
          }
        } else {
          gh.field_m = new sd(ci.field_f, tg.field_c);
          if (param0 < -9) {
            ci.field_f.b((qg) (gh.field_m), (byte) -71);
            return;
          } else {
            dg.a(54);
            ci.field_f.b((qg) (gh.field_m), (byte) -71);
            return;
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(int param0, fe param1) {
        if (param0 > -96) {
            return;
        }
        try {
            ra.a(param1, this.field_f, 100);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "dg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new hb[13];
        field_e = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = -1;
    }
}
