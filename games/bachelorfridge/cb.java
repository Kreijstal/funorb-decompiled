/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends at {
    private int field_j;
    static String field_n;
    static sna[] field_o;
    private int field_l;
    private ad field_k;
    static sna field_m;

    private final void d(int param0) {
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (((cb) this).field_l == 0) {
            ((cb) this).field_k.b(-1, ((cb) this).field_j);
            int fieldTemp$0 = ((cb) this).field_l + 1;
            ((cb) this).field_l = ((cb) this).field_l + 1;
            int discarded$1 = 100;
            if (!(fieldTemp$0 < this.e())) {
                this.d(-24070);
                return true;
            }
            var2 = -15 / ((param0 - 71) / 47);
            return false;
        }
        int fieldTemp$2 = ((cb) this).field_l + 1;
        ((cb) this).field_l = ((cb) this).field_l + 1;
        int discarded$3 = 100;
        if (!(fieldTemp$2 < this.e())) {
            this.d(-24070);
            return true;
        }
        var2 = -15 / ((param0 - 71) / 47);
        return false;
    }

    private final int e() {
        int var2 = 1;
        return 10;
    }

    public static void d() {
        field_n = null;
        field_m = null;
        field_o = null;
    }

    cb(ad param0, int param1) {
        try {
            ((cb) this).field_k = param0;
            ((cb) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Try changing the '<%0>' setting.";
    }
}
