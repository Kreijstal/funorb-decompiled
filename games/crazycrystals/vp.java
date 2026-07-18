/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp {
    static String field_g;
    static dl field_d;
    private long field_f;
    private int field_h;
    static int[] field_a;
    private ij field_c;
    static dl[][] field_i;
    private ij[] field_e;
    static int field_b;

    final ij b(int param0) {
        ij var3 = null;
        int var4 = CrazyCrystals.field_B;
        if (((vp) this).field_c == null) {
            return null;
        }
        ij var2 = ((vp) this).field_e[(int)(((vp) this).field_f & (long)(((vp) this).field_h + -1))];
        while (var2 != ((vp) this).field_c) {
            if (((vp) this).field_f == ((vp) this).field_c.field_k) {
                var3 = ((vp) this).field_c;
                ((vp) this).field_c = ((vp) this).field_c.field_j;
                return var3;
            }
            ((vp) this).field_c = ((vp) this).field_c.field_j;
        }
        ((vp) this).field_c = null;
        if (param0 == 50) {
            return null;
        }
        ij discarded$0 = ((vp) this).b(-23);
        return null;
    }

    final void a(ij param0, long param1, byte param2) {
        ij var5 = null;
        try {
            if (param2 <= 33) {
                ((vp) this).a((ij) null, 115L, (byte) -90);
            }
            if (null != param0.field_g) {
                param0.a(1);
            }
            var5 = ((vp) this).field_e[(int)(param1 & (long)(((vp) this).field_h - 1))];
            param0.field_j = var5;
            param0.field_g = var5.field_g;
            param0.field_g.field_j = param0;
            param0.field_k = param1;
            param0.field_j.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "vp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ij a(long param0, boolean param1) {
        ij var5 = null;
        int var6 = CrazyCrystals.field_B;
        ((vp) this).field_f = param0;
        ij var4 = ((vp) this).field_e[(int)(param0 & (long)(-1 + ((vp) this).field_h))];
        ((vp) this).field_c = var4.field_j;
        if (!param1) {
            ((vp) this).field_f = -86L;
        }
        while (var4 != ((vp) this).field_c) {
            if (param0 == ((vp) this).field_c.field_k) {
                var5 = ((vp) this).field_c;
                ((vp) this).field_c = ((vp) this).field_c.field_j;
                return var5;
            }
            ((vp) this).field_c = ((vp) this).field_c.field_j;
        }
        ((vp) this).field_c = null;
        return null;
    }

    public static void a() {
        field_g = null;
        field_i = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = CrazyCrystals.field_B;
        jm.field_h.a(15834);
        for (var1_int = 0; var1_int < 32; var1_int++) {
            mc.field_p[var1_int] = 0L;
        }
        for (var1_int = 0; var1_int < 32; var1_int++) {
            v.field_a[var1_int] = 0L;
        }
        if (param0 <= 101) {
            return;
        }
        try {
            hf.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "vp.C(" + param0 + ')');
        }
    }

    vp(int param0) {
        int var2 = 0;
        ij var3 = null;
        ((vp) this).field_h = param0;
        ((vp) this).field_e = new ij[param0];
        for (var2 = 0; param0 > var2; var2++) {
            ij dupTemp$0 = new ij();
            var3 = dupTemp$0;
            ((vp) this).field_e[var2] = dupTemp$0;
            var3.field_j = var3;
            var3.field_g = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[5];
        field_g = "You will have to push this rock while it is falling ...";
        field_b = 50;
    }
}
