/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static vh field_d;
    String field_b;
    String field_f;
    static String field_e;
    static int field_g;
    static jp field_a;
    boolean field_c;

    final static void a(int param0, boolean param1, boolean param2, String param3) {
        try {
            be.f(-1);
            wd.field_Ub.k(-22216);
            vj.field_j = new ui(qo.field_x, (String) null, ro.field_e, param1, param2);
            int var4_int = 113 % ((param0 - -67) / 53);
            tn.field_n = new ba(wd.field_Ub, (ei) (Object) vj.field_j);
            wd.field_Ub.b((ei) (Object) tn.field_n, 30000);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "tg.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Hotseat multiplayer game";
    }
}
