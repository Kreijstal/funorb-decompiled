/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static sna field_b;
    int field_d;
    private int field_f;
    private int field_c;
    pd[] field_a;
    static String field_e;

    final void a(byte param0, pd param1) {
        if (this.field_f >= qga.field_p[this.field_c]) {
            return;
        }
        try {
            this.field_a[this.field_f] = param1;
            this.field_f = this.field_f + 1;
            if (param0 > -93) {
                this.field_c = 122;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(je param0, int param1) {
        if (param1 != -2490) {
            return;
        }
        try {
            saa.field_a.b(param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qc(int param0) {
        this.field_c = param0;
        this.field_d = qga.field_p[this.field_c];
        this.field_a = new pd[this.field_d];
    }

    public static void a(byte param0) {
        if (param0 <= 15) {
            field_e = (String) null;
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    static {
        field_e = "Scamming";
    }
}
