/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static qr field_g;
    oh field_h;
    static volatile boolean field_c;
    static String field_f;
    static long field_e;
    private oh field_b;
    static bi field_d;
    static bi[] field_a;

    final boolean g(int param0) {
        int var2 = -83 / ((param0 - -24) / 49);
        return ((pf) this).field_h == ((pf) this).field_h.field_f ? true : false;
    }

    final int a(byte param0, oh[] param1) {
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4 = -101 / ((param0 - -4) / 48);
        int var3 = 0;
        oh var5 = ((pf) this).field_h.field_f;
        while (((pf) this).field_h != var5) {
            var3++;
            param1[var3] = (oh) (Object) param1;
            var5 = var5.field_f;
        }
        return var3;
    }

    final static void a(int param0, boolean param1, int param2) {
        fc var4 = null;
        String var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        if (param2 != -1043) {
            return;
        }
        ve var3 = rq.a(true, param0, param1);
        if (!(var3 == null)) {
            hp.field_m.a(false, param2 + -15618);
            var4 = hp.field_m;
            var5_ref = qc.field_u;
            var4.field_j.a(param2 ^ -1044, 5, var5_ref);
            var4 = hp.field_m;
            var5 = nh.field_p;
            var6 = td.field_P;
            var4.field_j.b(0, 0, 0, var5, var6);
        }
        di.a(-7904, param1, param0);
    }

    final oh f(int param0) {
        oh var2 = ((pf) this).field_h.field_e;
        if (var2 == ((pf) this).field_h) {
            ((pf) this).field_b = null;
            return null;
        }
        ((pf) this).field_b = var2.field_e;
        if (param0 != 3725) {
            return null;
        }
        return var2;
    }

    final oh b(int param0) {
        oh var2 = ((pf) this).field_b;
        if (!(((pf) this).field_h != var2)) {
            ((pf) this).field_b = null;
            return null;
        }
        ((pf) this).field_b = var2.field_e;
        if (param0 >= -120) {
            field_a = null;
        }
        return var2;
    }

    final int e(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0;
        oh var3 = ((pf) this).field_h.field_f;
        while (var3 != ((pf) this).field_h) {
            var2++;
            var3 = var3.field_f;
        }
        return var2;
    }

    final oh b(oh param0, int param1) {
        oh var3 = null;
        if (param1 != -9189) {
            ((pf) this).a(-87);
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((pf) this).field_h.field_f;
        }
        if (((pf) this).field_h == var3) {
            ((pf) this).field_b = null;
            return null;
        }
        ((pf) this).field_b = var3.field_f;
        return var3;
    }

    final oh h(int param0) {
        oh var2 = ((pf) this).field_h.field_f;
        if (var2 == ((pf) this).field_h) {
            return null;
        }
        var2.b((byte) -104);
        if (param0 <= 25) {
            return null;
        }
        return var2;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_g = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    final oh d(int param0) {
        oh var2 = ((pf) this).field_h.field_f;
        if (param0 != 0) {
            field_f = null;
        }
        if (((pf) this).field_h == var2) {
            ((pf) this).field_b = null;
            return null;
        }
        ((pf) this).field_b = var2.field_f;
        return var2;
    }

    final void a(oh param0, int param1) {
        if (null != param0.field_e) {
            param0.b((byte) -90);
        }
        param0.field_f = ((pf) this).field_h.field_f;
        param0.field_e = ((pf) this).field_h;
        param0.field_e.field_f = param0;
        param0.field_f.field_e = param0;
        if (param1 != 0) {
            field_a = null;
        }
    }

    final oh a(boolean param0) {
        if (!param0) {
            ((pf) this).field_h = null;
        }
        oh var2 = ((pf) this).field_h.field_e;
        if (var2 == ((pf) this).field_h) {
            return null;
        }
        var2.b((byte) -125);
        return var2;
    }

    private final void a(boolean param0, oh param1, pf param2) {
        oh var4 = ((pf) this).field_h.field_e;
        if (param0) {
            field_f = null;
        }
        ((pf) this).field_h.field_e = param1.field_e;
        param1.field_e.field_f = ((pf) this).field_h;
        if (!(param1 == ((pf) this).field_h)) {
            param1.field_e = param2.field_h.field_e;
            param1.field_e.field_f = param1;
            var4.field_f = param2.field_h;
            param2.field_h.field_e = var4;
        }
    }

    final void a(byte param0, oh param1) {
        if (null != param1.field_e) {
            param1.b((byte) -104);
        }
        param1.field_e = ((pf) this).field_h.field_e;
        param1.field_f = ((pf) this).field_h;
        param1.field_e.field_f = param1;
        if (param0 != -113) {
            return;
        }
        param1.field_f.field_e = param1;
    }

    final oh a(byte param0) {
        oh var2 = ((pf) this).field_b;
        if (var2 == ((pf) this).field_h) {
            ((pf) this).field_b = null;
            return null;
        }
        if (param0 != -71) {
            return null;
        }
        ((pf) this).field_b = var2.field_f;
        return var2;
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0.charAt(0);
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (!(var2 == param0.charAt(var3))) {
                return false;
            }
        }
        if (param1 != 24) {
            field_f = null;
            return true;
        }
        return true;
    }

    final void a(int param0) {
        oh var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
            var2 = ((pf) this).field_h.field_f;
            if (((pf) this).field_h == var2) {
                break;
            }
            var2.b((byte) -72);
        }
        ((pf) this).field_b = null;
        if (param0 != 0) {
            Object var4 = null;
            ((pf) this).a((byte) -24, (oh) null);
        }
    }

    public pf() {
        ((pf) this).field_h = new oh();
        ((pf) this).field_h.field_f = ((pf) this).field_h;
        ((pf) this).field_h.field_e = ((pf) this).field_h;
    }

    final void a(byte param0, pf param1) {
        this.a(false, ((pf) this).field_h.field_f, param1);
        if (param0 != -90) {
            ((pf) this).field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Play free version";
        field_c = false;
    }
}
