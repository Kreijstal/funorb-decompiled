/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends mg {
    static String field_n;
    static String field_s;
    static String[] field_p;
    static jl field_r;
    private boolean field_q;
    static ak field_u;
    private qo field_t;
    private String field_o;
    static String field_m;

    public static void f(int param0) {
        field_s = null;
        field_u = null;
        if (param0 != 16) {
          ak discarded$2 = kc.e(-78);
          field_m = null;
          field_p = null;
          field_n = null;
          field_r = null;
          return;
        } else {
          field_m = null;
          field_p = null;
          field_n = null;
          field_r = null;
          return;
        }
    }

    final String a(int param0, String param1) {
        if (((kc) this).field_t.a(param1, true) == sk.field_a) {
            return ((kc) this).field_t.a(-80, param1);
        }
        if (param0 >= -76) {
            return null;
        }
        if (!(((kc) this).a(param1, true) != sk.field_a)) {
            return jc.field_e;
        }
        return e.field_c;
    }

    kc(c param0, c param1) {
        super(param0);
        ((kc) this).field_q = false;
        ((kc) this).field_o = "";
        ((kc) this).field_t = new qo(param0, param1);
    }

    final static ak e(int param0) {
        if (param0 != 16) {
            return null;
        }
        return ae.field_c.field_Fb;
    }

    final dj a(String param0, boolean param1) {
        fl var3 = null;
        if (!param1) {
            return null;
        }
        if (((kc) this).field_t.a(param0, param1) == sk.field_a) {
            return sk.field_a;
        }
        if (!(param0.equals((Object) (Object) ((kc) this).field_o))) {
            var3 = rn.a(param0, (byte) -99);
            if (!(var3.d(121))) {
                return tg.field_j;
            }
            ((kc) this).field_o = param0;
            ((kc) this).field_q = var3.b(-20425);
        }
        return ((kc) this).field_q ? qk.field_g : sk.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Message lobby";
        field_n = "<%0> cannot join; the game is full.";
        field_p = new String[16];
        field_m = "On";
    }
}
