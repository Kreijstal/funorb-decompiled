/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends rk implements jl {
    static boolean field_ib;
    static String field_gb;
    static int field_eb;
    private nb field_fb;
    static String field_hb;
    private int field_db;

    final String c(byte param0) {
        if (!this.field_q) {
          return null;
        }
        if (this.field_B == null) {
          return null;
        }
        kl.a(11024, bh.field_g - (this.field_db - this.field_t), pm.field_f);
        if (param0 == 113) {
          return this.field_B;
        }
        field_gb = (String) null;
        return this.field_B;
    }

    final void l(int param0) {
        super.l(param0);
        if (this.field_fb != null) {
          this.field_fb.c((byte) -51);
        }
    }

    og(String param0, kg param1, int param2) {
        super(param0, param1, param2);
    }

    public final nb a(int param0) {
        if (param0 > -86) {
          field_gb = (String) null;
          return this.field_fb;
        }
        return this.field_fb;
    }

    final void a(nb param0, int param1) {
        if (param1 != -5362) {
          return;
        }
        try {
          this.field_fb = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "og.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        im.field_f = param0 ? true : false;
        if (param2) {
          gb.field_Ob = ve.field_nc;
          fe.field_b = param1;
          return;
        }
        og.a(false, -59, false);
        gb.field_Ob = ve.field_nc;
        fe.field_b = param1;
    }

    public static void i(byte param0) {
        field_gb = null;
        if (param0 <= 106) {
          field_gb = (String) null;
          field_hb = null;
          return;
        }
        field_hb = null;
    }

    final void a(ce param0, int param1, int param2, int param3) {
        super.a(param0, 50, param2, param3);
        if (param1 < 38) {
          return;
        }
        try {
          this.field_db = bh.field_g - this.field_u - param3;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "og.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_gb = "Close";
        field_ib = true;
        field_hb = "Next";
    }
}
