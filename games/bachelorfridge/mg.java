/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends at {
    private int field_n;
    static sna field_l;
    static mu field_m;
    static int field_k;
    private ad field_j;
    static String field_p;
    static String field_o;

    final static String d(int param0) {
        return re.field_D;
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = ((mg) this).field_n - 1;
        ((mg) this).field_n = ((mg) this).field_n - 1;
        if (!(fieldTemp$0 > 0)) {
            int discarded$1 = -56;
            this.d();
            return true;
        }
        int var2 = ((mg) this).field_n * (320 * (50 - ((mg) this).field_n)) / 2500;
        int var3 = -17 % ((param0 - 71) / 47);
        ((mg) this).field_j.field_k = var2;
        return false;
    }

    private final void d() {
        ((mg) this).field_j.field_k = 0;
    }

    final static be a(byte param0, int param1) {
        if (param1 == -1) {
            return null;
        }
        be var2 = jga.field_y[param1];
        return var2;
    }

    public static void e() {
        field_p = null;
        int var1 = -53;
        field_o = null;
        field_l = null;
        field_m = null;
    }

    mg(ad param0) {
        try {
            ((mg) this).field_n = 50;
            ((mg) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Flingstuff</col>";
        field_o = "New Game";
    }
}
