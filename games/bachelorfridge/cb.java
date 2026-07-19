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
        int fieldTemp$0 = 0;
        int var2 = 0;
        if (-1 == (this.field_l ^ -1)) {
            this.field_k.b(-1, this.field_j);
            fieldTemp$0 = this.field_l + 1;
            this.field_l = this.field_l + 1;
            if (!(fieldTemp$0 < this.e((byte) 100))) {
                this.d(-24070);
                return true;
            }
            var2 = -15 / ((param0 - 71) / 47);
            return false;
        }
        int fieldTemp$1 = this.field_l + 1;
        this.field_l = this.field_l + 1;
        if (!(fieldTemp$1 < this.e((byte) 100))) {
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
        try {
            this.field_k = param0;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_n = "Try changing the '<%0>' setting.";
    }
}
