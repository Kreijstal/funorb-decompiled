/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static ck[] field_h;
    static w field_g;
    static int field_b;
    static mh field_f;
    static w field_a;
    static int[] field_d;
    static pi field_e;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_h = null;
    }

    final static void a(boolean param0) {
        be var1 = null;
        int var2 = client.field_A ? 1 : 0;
        try {
            md.field_Z = 0;
            f.field_w = null;
            ed.field_g = 0;
            qi.field_S.c(111);
            uf.field_z.c(117);
            var1 = mc.field_a.c(-9443);
            while (var1 != null) {
                var1.e((byte) 105);
                var1 = mc.field_a.b(-112);
            }
            var1 = hg.field_e.c(-9443);
            while (var1 != null) {
                var1.e((byte) 100);
                var1 = hg.field_e.b(104);
            }
            jj.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "d.A(" + true + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_c = 0;
        field_e = new pi(36, 36, 0);
    }
}
