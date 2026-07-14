/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pl extends jl {
    int field_t;
    int field_x;
    int field_w;
    int field_u;
    int field_v;
    int field_s;
    static bi field_y;

    final static void a(mi param0, boolean param1) {
        ph var2 = null;
        ph.b(param0.a(112, "headers.packvorbis", ""));
        var2 = ph.a(param0, "jagex logo2.packvorbis", "");
        bi discarded$5 = var2.b();
        if (!param1) {
          field_y = null;
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_y = null;
        if (param0 != -1444) {
            pl.c(-21);
        }
    }

    pl() {
    }

    static {
    }
}
