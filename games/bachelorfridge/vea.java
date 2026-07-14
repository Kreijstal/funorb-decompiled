/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vea extends ana {
    static int[] field_x;
    private hla field_w;
    private taa field_v;

    private final void b(boolean param0) {
        pp var3_ref = null;
        ad var6 = null;
        ad var7 = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((vea) this).field_w.field_l.a(23, ((vea) this).field_q.field_h);
        if (!param0) {
            field_x = null;
            if (!(!var2.i(100))) {
                return;
            }
            var3_ref = (pp) (Object) ((vea) this).field_w.field_o.b((byte) 90);
            oha discarded$6 = al.a(87, ((vea) this).field_w.field_k);
            while (var3_ref != null) {
                var6 = var3_ref.field_h.a(-27449, ((vea) this).field_q);
                var6.b(-1, 19);
                var6.a(24831, 105, gb.field_i);
                var3_ref.a(var2, ((vea) this).field_q.field_h, 12);
                var3_ref = (pp) (Object) ((vea) this).field_w.field_o.c(0);
            }
            return;
        }
        if (!(!var2.i(100))) {
            return;
        }
        var3_ref = (pp) (Object) ((vea) this).field_w.field_o.b((byte) 90);
        oha discarded$13 = al.a(87, ((vea) this).field_w.field_k);
        while (var3_ref != null) {
            var7 = var3_ref.field_h.a(-27449, ((vea) this).field_q);
            var7.b(-1, 19);
            var7.a(24831, 105, gb.field_i);
            var3_ref.a(var2, ((vea) this).field_q.field_h, 12);
            var3_ref = (pp) (Object) ((vea) this).field_w.field_o.c(0);
        }
    }

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param0 != 8192) {
          int discarded$2 = vea.a(-21, 118, 114, true);
          return fda.b(param0 ^ 8193);
        } else {
          return fda.b(param0 ^ 8193);
        }
    }

    final boolean c(byte param0) {
        int var2 = -28 / ((param0 - 71) / 47);
        if (((vea) this).field_m.a((byte) -106)) {
            return false;
        }
        if (((vea) this).field_v.a((byte) -106)) {
            return false;
        }
        if (!((((vea) this).field_l ^ -1) != -101)) {
            jja.a(256, -1, 46);
            this.b(true);
        }
        ((vea) this).field_l = ((vea) this).field_l - 1;
        if (!(-1 < (((vea) this).field_l - 1 ^ -1))) {
            return false;
        }
        this.f((byte) -91);
        return true;
    }

    public static void e(byte param0) {
        if (param0 <= 14) {
            field_x = null;
            field_x = null;
            return;
        }
        field_x = null;
    }

    private final void f(byte param0) {
        if (param0 >= -90) {
            ((vea) this).field_v = null;
        }
    }

    vea(gj param0, hla param1) {
        super(param0, (bca) (Object) param1);
        ((vea) this).field_w = param1;
        ad var3 = ((vea) this).field_w.field_q.a(-27449, ((vea) this).field_q);
        ((vea) this).field_v = new taa(((vea) this).field_q, var3);
        ((vea) this).a(27799, (at) (Object) ((vea) this).field_v);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
    }
}
