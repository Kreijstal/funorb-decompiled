/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    private mh field_d;
    private ki field_b;
    static String field_f;
    private ki field_c;
    static String[] field_e;
    static mg field_a;
    private mh field_g;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = OrbDefence.field_D ? 1 : 0;
        ge.field_g.b(0);
        if (param0 <= 23) {
            Object var3 = null;
            vd.a(true, -101, (String) null);
        }
        for (var1 = 0; var1 < 32; var1++) {
            jl.field_b[var1] = 0L;
        }
        for (var1 = 0; -33 < (var1 ^ -1); var1++) {
            qf.field_o[var1] = 0L;
        }
        m.field_c = 0;
    }

    final dl a(int param0, byte param1, int[] param2) {
        if (!(((vd) this).field_c.a((byte) 117) != 1)) {
            return this.a(param2, param0, param1 + -219, 0);
        }
        if (param1 != 92) {
            return null;
        }
        if (-2 == (((vd) this).field_c.a((byte) 104, param0) ^ -1)) {
            return this.a(param2, 0, param1 + -220, param0);
        }
        throw new RuntimeException();
    }

    final dl a(int param0, int[] param1, int param2) {
        if (-2 == (((vd) this).field_b.a((byte) 122) ^ -1)) {
            return this.a(65527, param1, param0, 0);
        }
        if (param2 <= 73) {
            vd.a(56);
        }
        if (!(1 != ((vd) this).field_b.a((byte) 119, param0))) {
            return this.a(65527, param1, 0, param0);
        }
        throw new RuntimeException();
    }

    private final dl a(int[] param0, int param1, int param2, int param3) {
        int var5 = param1 ^ ((-536866817 & param3) << 1493550148 | param3 >>> 867097708);
        var5 = var5 | param3 << 624129392;
        long var6 = (long)var5;
        dl var8 = (dl) (Object) ((vd) this).field_g.a(var6, -1);
        if (!(var8 == null)) {
            return var8;
        }
        if (param0 != null) {
            if (0 >= param0[0]) {
                return null;
            }
        }
        cm var9 = cm.a(((vd) this).field_c, param3, param1);
        int var10 = -10 / ((param2 - -57) / 57);
        if (var9 == null) {
            return null;
        }
        dl var11 = var9.a();
        dl var8_ref = var11;
        ((vd) this).field_g.a(var6, (byte) -91, (ca) (Object) var8_ref);
        if (!(param0 == null)) {
            param0[0] = param0[0] - var11.field_g.length;
        }
        return var8_ref;
    }

    private final dl a(int param0, int[] param1, int param2, int param3) {
        nj var9_ref = null;
        int var5 = (param0 & param3 << 456114436 | param3 >>> -1054279700) ^ param2;
        var5 = var5 | param3 << -1026503536;
        long var6 = 4294967296L ^ (long)var5;
        dl var8 = (dl) (Object) ((vd) this).field_g.a(var6, -1);
        if (!(var8 == null)) {
            return var8;
        }
        if (param1 != null) {
            if (param1[0] <= 0) {
                return null;
            }
        }
        nj var9 = (nj) (Object) ((vd) this).field_d.a(var6, param0 + -65528);
        if (var9 == null) {
            var9_ref = nj.a(((vd) this).field_b, param3, param2);
            if (var9_ref == null) {
                return null;
            }
            ((vd) this).field_d.a(var6, (byte) -93, (ca) (Object) var9_ref);
        }
        dl var8_ref = var9_ref.a(param1);
        if (var8_ref == null) {
            return null;
        }
        var9_ref.b(57);
        ((vd) this).field_g.a(var6, (byte) 117, (ca) (Object) var8_ref);
        return var8_ref;
    }

    public static void b(int param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 != 13461) {
            Object var2 = null;
            vd.a(true, -19, (String) null);
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        jc.field_j = param0 ? true : false;
        if (param1 != -536866817) {
            field_e = null;
        }
        oe.field_p = true;
        oj.field_q = new dh(bm.field_d, qc.field_b, param2, vh.field_j, jc.field_j);
        bm.field_d.b((byte) 74, (pj) (Object) oj.field_q);
    }

    vd(ki param0, ki param1) {
        ((vd) this).field_d = new mh(256);
        ((vd) this).field_g = new mh(256);
        ((vd) this).field_c = param0;
        ((vd) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create";
    }
}
