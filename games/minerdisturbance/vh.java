/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh implements uj {
    static String field_e;
    static gj field_f;
    static ea field_c;
    static String[][] field_b;
    static String[] field_h;
    static int field_g;
    static ea[] field_a;
    static String field_d;
    static String[] field_i;

    public final String a(byte param0) {
        int var2 = -60 / ((param0 - -33) / 62);
        return "Fill Cell Oil";
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = (String[][]) null;
        if (param0 != 3) {
          field_i = (String[]) null;
          field_i = null;
          field_d = null;
          field_e = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_d = null;
          field_e = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 > -113) {
            vh.a(-8);
            fa.c(-9);
            return;
        }
        fa.c(-9);
    }

    public final void a(boolean param0) {
        if (param0) {
            field_d = (String) null;
            ha.field_e = 3;
            tb.field_a = 3;
            return;
        }
        ha.field_e = 3;
        tb.field_a = 3;
    }

    final static void a(int param0, ln[] param1) {
        try {
            wk.field_a = new kd(pd.field_b, lc.field_o, param1, new String[]{tj.field_b, fb.field_d, hd.field_c, eg.field_g, sa.field_r, vc.field_u, wd.field_b});
            if (param0 != 3) {
                field_i = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "vh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Creating your account";
        field_b = new String[][]{null, new String[]{"Oil: The black stuff's oil. Watch out! It's harder to swim through than water, and burns if exposed to flame."}};
        field_h = new String[]{"The torch lights up dark areas in the volcano and can let you see through to hidden areas. It doesn't work well underwater, though.", "Illuminate the Super Volcano and peer through to hidden areas. It doesn't work well underwater, though."};
        field_f = new gj();
        field_d = "Names cannot start or end with space or underscore";
    }
}
