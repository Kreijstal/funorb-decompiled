/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class soa {
    private int field_b;
    private long field_c;
    private int field_e;
    private int[] field_d;
    private int[] field_a;

    final void a(byte param0, iqa param1) {
        ha var5 = null;
        ha var3 = null;
        try {
            var5 = param1.field_d;
            var3 = var5;
            var5.KA(this.field_d[0], this.field_d[1], this.field_d[2], this.field_d[3]);
            var5.DA(this.field_a[0], this.field_a[1], this.field_a[2], this.field_a[3]);
            int var4 = -13 / ((31 - param0) / 35);
            var3.f(this.field_b, this.field_e);
            param1.field_f = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "soa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, iqa param1) {
        ha var3 = null;
        try {
            var3 = param1.field_d;
            var3.K(this.field_d);
            this.field_a = var3.Y();
            this.field_b = var3.i();
            this.field_e = var3.XA();
            if (param0 <= 118) {
                this.field_d = (int[]) null;
            }
            this.field_c = param1.field_f;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "soa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    soa() {
        this.field_d = new int[4];
    }

    static {
    }
}
