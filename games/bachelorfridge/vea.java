/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vea extends ana {
    static int[] field_x;
    private hla field_w;
    private taa field_v;

    private final void b() {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((vea) this).field_w.field_l.a(23, ((vea) this).field_q.field_h);
        if (!(!var2.i(100))) {
            return;
        }
        pp var3 = (pp) (Object) ((vea) this).field_w.field_o.b((byte) 90);
        oha discarded$6 = al.a(87, ((vea) this).field_w.field_k);
        while (var3 != null) {
            var4 = var3.field_h.a(-27449, ((vea) this).field_q);
            var4.b(-1, 19);
            var4.a(24831, 105, gb.field_i);
            var3.a(var2, ((vea) this).field_q.field_h, 12);
            var3 = (pp) (Object) ((vea) this).field_w.field_o.c(0);
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
        if (!(((vea) this).field_l != 100)) {
            jja.a(256, -1, 46);
            int discarded$0 = 1;
            this.b();
        }
        int fieldTemp$1 = ((vea) this).field_l - 1;
        ((vea) this).field_l = ((vea) this).field_l - 1;
        if (!(fieldTemp$1 < 0)) {
            return false;
        }
        int discarded$2 = -91;
        this.f();
        return true;
    }

    public static void e() {
        field_x = null;
    }

    private final void f() {
    }

    vea(gj param0, hla param1) {
        super(param0, (bca) (Object) param1);
        ad var3 = null;
        try {
            ((vea) this).field_w = param1;
            var3 = ((vea) this).field_w.field_q.a(-27449, ((vea) this).field_q);
            ((vea) this).field_v = new taa(((vea) this).field_q, var3);
            ((vea) this).a(27799, (at) (Object) ((vea) this).field_v);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
    }
}
