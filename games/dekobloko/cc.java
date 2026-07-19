/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_g;
    static pi[][] field_f;
    static int[] field_h;
    static String field_d;
    static String field_b;
    static int field_a;
    private ck[] field_c;
    static String field_e;

    final static f a(int param0, byte param1) {
        f var2 = null;
        var2 = new f();
        rc.field_e.a(var2, 2777);
        gm.b(param0, 65);
        if (param1 > -81) {
          field_a = 118;
          return var2;
        } else {
          return var2;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_h = null;
        field_e = null;
        field_b = null;
        if (param0 != -94) {
          field_g = (String) null;
          field_f = (pi[][]) null;
          return;
        } else {
          field_f = (pi[][]) null;
          return;
        }
    }

    final static void a(int param0) {
        kb.field_i = new bk(ui.field_x, tg.field_h, ib.field_nb, ua.field_H, al.field_h, df.field_ab);
        if (param0 != 8) {
            cc.a((byte) 88);
        }
    }

    cc(ck[] param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -29 / ((param1 - -69) / 54);
        vk.a(param4, (byte) 50, this.field_c, param0, param3, param2);
    }

    static {
        field_g = "Score: ";
        field_f = new pi[8][];
        field_d = "Colourful pieces are falling from the sky!";
        field_b = "Staff impersonation";
        field_e = "More suggestions";
    }
}
