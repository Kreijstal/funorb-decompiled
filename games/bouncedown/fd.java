/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fd extends ug {
    static tg field_m;
    static tg[] field_n;
    static String field_o;

    public static void a() {
        field_o = null;
        field_n = null;
        field_m = null;
    }

    final static void a(gk param0, int param1) {
        te var2 = null;
        try {
            if (param1 != -1) {
                Object var3 = null;
                fd.a((gk) null, 94);
            }
            te.b(param0.b("headers.packvorbis", "", param1 + -72));
            var2 = te.a(param0, "jagex logo2.packvorbis", "");
            ue discarded$0 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "fd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fd() {
    }

    final static String c() {
        String var1 = "";
        if (null != vk.field_c) {
            var1 = vk.field_c.a(0);
        }
        if (-1 == var1.length()) {
            int discarded$0 = 44;
            var1 = bj.j();
        }
        if (-1 == var1.length()) {
            var1 = wk.field_H;
        }
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Type your password again to make sure it's correct";
    }
}
