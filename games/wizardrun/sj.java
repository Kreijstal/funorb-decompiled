/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends mf {
    static int[] field_m;
    static int field_n;
    static long field_k;
    static int field_l;

    final ok a(int param0, String param1) {
        int var3 = tg.a(param0, param1) == null ? 1 : 0;
        if (var3 == 0) {
            return hg.field_c;
        }
        return gf.field_V;
    }

    sj(og param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        if (!(((sj) this).a(param1, param0) != hg.field_c)) {
            return kd.field_b;
        }
        return eh.field_h;
    }

    public static void f(int param0) {
        if (param0 > -122) {
            sj.f(-67);
            field_m = null;
            return;
        }
        field_m = null;
    }

    static {
    }
}
