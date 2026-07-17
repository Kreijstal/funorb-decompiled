/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static int field_b;
    static String field_c;
    static String field_a;

    final static void a() {
        if (!(tc.field_x)) {
            throw new IllegalStateException();
        }
        if (!(null == fa.field_G)) {
            fa.field_G.n(-125);
        }
        int discarded$0 = 94;
        String var1 = ob.c();
        wi.field_c = new rg(var1, (String) null, true, false, false);
        ti.field_b.a((byte) 86, (uj) (Object) t.field_h);
        t.field_h.c(20317, (uj) (Object) wi.field_c);
        t.field_h.j(-125);
    }

    public static void b() {
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Instructions";
        field_a = "achievements to collect";
    }
}
