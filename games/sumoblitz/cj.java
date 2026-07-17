/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int[] field_e;
    private int[] field_d;
    static String[] field_c;
    private int[] field_g;
    private int field_a;
    private long field_f;
    private int field_b;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
    }

    final void a(bk param0, int param1) {
        ha var4 = null;
        ha var3 = null;
        try {
            var4 = param0.field_g;
            var3 = var4;
            var4.KA(((cj) this).field_g[0], ((cj) this).field_g[1], ((cj) this).field_g[2], ((cj) this).field_g[param1]);
            var4.DA(((cj) this).field_d[0], ((cj) this).field_d[1], ((cj) this).field_d[2], ((cj) this).field_d[3]);
            var3.f(((cj) this).field_b, ((cj) this).field_a);
            param0.field_f = ((cj) this).field_f;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cj.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, bk param1) {
        ha var3 = null;
        try {
            var3 = param1.field_g;
            var3.K(((cj) this).field_g);
            if (param0 >= -106) {
                ((cj) this).field_a = -2;
            }
            ((cj) this).field_d = var3.Y();
            ((cj) this).field_b = var3.i();
            ((cj) this).field_a = var3.XA();
            ((cj) this).field_f = param1.field_f;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cj.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    cj() {
        ((cj) this).field_g = new int[4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{0, 0, 1, 2, 0, 3, 0, 4, 0, 5, 6, 7, 0, 8, 9, 10, 0, 11, 0, 12, 0, 13, 14, 15, 0};
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
