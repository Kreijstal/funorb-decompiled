/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends fe implements ub {
    private int field_K;
    private he field_L;

    public final he a(boolean param0) {
        if (param0) {
            return null;
        }
        return ((ng) this).field_L;
    }

    ng(String param0, qg param1, int param2) {
        super(param0, param1, param2);
    }

    final static void h(byte param0) {
        int var1 = -66 / ((param0 - 23) / 56);
        Object var2 = null;
        kg.a((String) null, wj.field_c, (byte) 92);
    }

    final String d(int param0) {
        if (!((ng) this).field_h) {
            return null;
        }
        if (((ng) this).field_p == null) {
            return null;
        }
        vc.a(la.field_c, pe.field_d + -((ng) this).field_K + ((ng) this).field_i, 1);
        if (param0 != 12606) {
            return null;
        }
        return ((ng) this).field_p;
    }

    final static void k(int param0) {
        if (param0 <= 65) {
            ng.k(69);
        }
    }

    final void f(boolean param0) {
        super.f(param0);
        if (!(null == ((ng) this).field_L)) {
            ((ng) this).field_L.a((byte) 58);
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        if (param0 < 27) {
            return;
        }
        super.a(90, param1, param2, param3);
        ((ng) this).field_K = -param1 + pe.field_d + -((ng) this).field_s;
    }

    final static void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = StarCannon.field_A;
        int var1 = jf.field_a[0];
        for (var2 = param0; var2 < jf.field_a.length; var2++) {
            var3 = jf.field_a[var2];
            ug.a(ih.field_d, var2 << -95107932, ih.field_d, var1, var3);
            var1 = var1 + var3;
        }
    }

    final void a(he param0, int param1) {
        ((ng) this).field_L = param0;
        if (param1 != 0) {
            Object var4 = null;
            ((ng) this).a((he) null, 118);
        }
    }

    final static sk a(byte param0, String param1) {
        if (param1 == null) {
            return tg.field_x;
        }
        if (param1.length() == 0) {
            return tg.field_x;
        }
        if (param0 < 94) {
            return null;
        }
        int var2 = param1.indexOf('@');
        if (var2 == -1) {
            return qb.field_b;
        }
        String var3 = param1.substring(0, var2);
        String var4 = param1.substring(var2 - -1);
        sk var5 = vk.a((byte) 63, var3);
        if (!(var5 == null)) {
            return var5;
        }
        return b.a(var4, 112);
    }

    static {
    }
}
