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
        if (param0 != -24070) {
            cb.d((byte) -101);
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (-1 == (((cb) this).field_l ^ -1)) {
            ((cb) this).field_k.b(-1, ((cb) this).field_j);
            ((cb) this).field_l = ((cb) this).field_l + 1;
            if (!(((cb) this).field_l + 1 < this.e((byte) 100))) {
                this.d(-24070);
                return true;
            }
            var2 = -15 / ((param0 - 71) / 47);
            return false;
        }
        ((cb) this).field_l = ((cb) this).field_l + 1;
        if (!(((cb) this).field_l + 1 < this.e((byte) 100))) {
            this.d(-24070);
            return true;
        }
        var2 = -15 / ((param0 - 71) / 47);
        return false;
    }

    private final int e(byte param0) {
        int var2 = 3 % ((param0 - -33) / 52);
        return 10;
    }

    public static void d(byte param0) {
        if (param0 < 102) {
            return;
        }
        field_n = null;
        field_m = null;
        field_o = null;
    }

    cb(ad param0, int param1) {
        ((cb) this).field_k = param0;
        ((cb) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Try changing the '<%0>' setting.";
    }
}
