/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ela extends pp {
    private int field_k;
    static ee[] field_j;
    static sna field_i;

    public static void d(byte param0) {
        if (param0 != 80) {
            field_i = (sna) null;
            field_j = null;
            field_i = null;
            return;
        }
        field_j = null;
        field_i = null;
    }

    final void a(lu param0, byte param1) {
        try {
            int var3_int = 37 % ((34 - param1) / 58);
            super.a(param0, (byte) -49);
            er.a(this.field_h, 108, param0);
            param0.d(this.field_k, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ela.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(aga param0, op param1, int param2) {
        aga var4 = this.field_h.a(param2 ^ 18, param1);
        if (!(var4 != null)) {
            return;
        }
        try {
            var4.c(this.field_k, (byte) -79);
            if (param2 != 12) {
                ela.d((byte) 105);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ela.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ela(nq param0, int param1) {
        try {
            this.field_h = param0;
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ela.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
