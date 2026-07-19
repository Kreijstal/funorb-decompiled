/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends sh {
    static boolean[] field_E;
    private tf field_C;
    static int field_G;
    static m field_F;

    final void f(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(this.field_C);
        dd var3 = (dd) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            var3.field_I = false;
            var3 = (dd) ((Object) var2.a((byte) 125));
        }
        if (param0 != 10936) {
            return;
        }
        this.field_A = null;
    }

    final void a(boolean param0, el param1) {
        dd var3 = null;
        boolean discarded$0 = false;
        try {
            if (!(param1 instanceof dd)) {
                throw new IllegalArgumentException();
            }
            var3 = (dd) ((Object) param1);
            this.field_C.a(var3, param0);
            var3.field_I = true;
            discarded$0 = var3.a((byte) -37, (el) (this));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ng.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var8 = Geoblox.field_C;
        if (null != this.field_q) {
            this.field_q.a(param0, -70, param1, true, (el) (this));
        }
        int var6 = 75 / ((1 - param2) / 43);
        gb var5 = new gb(this.field_C);
        el var7 = (el) ((Object) var5.d(1));
        while (var7 != null) {
            var7.a(param0 + this.field_v, param1 + this.field_m, (byte) -106, param3);
            var7 = (el) ((Object) var5.c(26));
        }
    }

    final static void g(int param0) {
        if (param0 != -13912) {
            return;
        }
        sl.field_k = new tf();
    }

    final static void h(int param0) {
        fj.field_p.b();
        oh.field_a.b();
        if (param0 <= 9) {
            field_G = -2;
        }
    }

    final void l(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(this.field_C);
        if (param0 != 0) {
            return;
        }
        dd var3 = (dd) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (var3.h(229)) {
                var3.a(false);
            }
            var3 = (dd) ((Object) var2.a((byte) 112));
        }
    }

    public ng() {
        super(0, 0, kb.field_b, fa.field_i, (dh) null, (bb) null);
        this.field_C = new tf();
    }

    final el e(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(this.field_C);
        dd var3 = (dd) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (!(!var3.field_I)) {
                return var3.f((byte) -79);
            }
            var3 = (dd) ((Object) var2.a((byte) 119));
        }
        if (param0 == -4863) {
            return null;
        }
        field_G = 111;
        return null;
    }

    final void i(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(this.field_C);
        dd var3 = (dd) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (var3.f(-1)) {
                var3.a(false);
            }
            var3 = (dd) ((Object) var2.a((byte) 115));
        }
        this.field_A = (el) ((Object) this.j(100));
        if (param0 >= -14) {
            field_F = (m) null;
        }
    }

    public static void k(int param0) {
        field_F = null;
        field_E = null;
        if (param0 >= -53) {
            field_E = (boolean[]) null;
        }
    }

    final dd j(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(this.field_C);
        dd var3 = (dd) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (var3.field_I) {
                return var3;
            }
            var3 = (dd) ((Object) var2.a((byte) 111));
        }
        if (param0 >= 57) {
            return null;
        }
        el discarded$0 = this.e(89);
        return null;
    }

    static {
    }
}
