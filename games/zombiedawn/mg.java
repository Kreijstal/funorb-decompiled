/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends le {
    static int field_j;
    int field_i;
    int field_h;

    final static void a(int param0) {
        hn var1 = null;
        int var2 = ZombieDawn.field_J;
        try {
            sh.field_d.g();
            cf.field_fb.g();
            if (param0 > -30) {
                field_j = 75;
            }
            d.field_b = d.field_b - 1;
            if (!(d.field_b != 0)) {
                d.field_b = 200;
                var1 = (hn) ((Object) fj.field_i.b((byte) 26));
                while (var1 != null) {
                    if (!(var1.field_k.a((byte) 73))) {
                        var1.b(-27598);
                    }
                    var1 = (hn) ((Object) fj.field_i.a(false));
                }
                if (sf.field_n != null) {
                    var1 = (hn) ((Object) sf.field_n.b((byte) 26));
                    while (var1 != null) {
                        if (!(var1.field_k.a((byte) 73))) {
                            var1.b(-27598);
                        }
                        var1 = (hn) ((Object) sf.field_n.a(false));
                    }
                }
            }
            if (uh.field_o != null) {
                if (!uh.field_o.c((byte) -34)) {
                    te.field_kb = null;
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        se.field_j = oj.b(0);
        wo.field_xb = new dn();
        if (param0) {
            return;
        }
        ad.c((byte) 122);
    }

    private mg() throws Throwable {
        throw new Error();
    }

    static {
        field_j = 64;
    }
}
