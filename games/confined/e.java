/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int field_e;
    static hb field_c;
    static od field_a;
    static String field_d;
    int field_b;

    final static void a(mn param0, byte param1) {
        dc var3 = null;
        dc var4 = null;
        int var5 = 0;
        dc var3_ref = null;
        dc var4_ref = null;
        int var6 = Confined.field_J ? 1 : 0;
        int var2 = 34 / ((-84 - param1) / 37);
        do {
            var3 = (dc) (Object) param0.a(false);
            if (!(var3 != null)) {
                return;
            }
            var4 = (dc) (Object) param0.a((byte) 82);
            var5 = 1;
            while (var4 != null) {
                if (var4.field_I <= var3.field_I) {
                    var3_ref = var4;
                } else {
                    var5 = 0;
                    ri.a((rk) (Object) var4, 0, (rk) (Object) var3_ref);
                }
                var4 = (dc) (Object) param0.a((byte) -52);
            }
            if (var5 != 0) {
                return;
            }
            var4 = (dc) (Object) param0.a(60);
            var5 = 1;
            var3 = (dc) (Object) param0.d(2123);
            while (var3 != null) {
                if (var4.field_I <= var3.field_I) {
                    var4_ref = var3;
                } else {
                    ri.a((rk) (Object) var4_ref, 0, (rk) (Object) var3);
                    var5 = 0;
                }
                var3 = (dc) (Object) param0.d(2123);
            }
        } while (var5 == 0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 52) {
            e.a(26);
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    e(int param0, int param1, int param2, int param3) {
        ((e) this).field_b = param3;
        ((e) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Score";
    }
}
