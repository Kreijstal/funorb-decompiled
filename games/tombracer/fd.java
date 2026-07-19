/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static int field_e;
    int field_c;
    int field_f;
    int field_h;
    int field_g;
    int field_b;
    int field_a;
    static lu field_d;

    final fd a(byte param0) {
        if (param0 != 78) {
          return (fd) null;
        } else {
          return new fd(this.field_c, this.field_b, this.field_f, this.field_h, this.field_a, this.field_g);
        }
    }

    final void a(int param0, fd param1) {
        try {
            this.field_c = param1.field_c;
            this.field_f = param1.field_f;
            this.field_h = param1.field_h;
            this.field_b = param1.field_b;
            if (param0 != 167) {
                field_d = (lu) null;
            }
            this.field_g = param1.field_g;
            this.field_a = param1.field_a;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 >= -103) {
            field_d = (lu) null;
        }
    }

    fd(int param0) {
        this.field_f = 128;
        this.field_b = 128;
        this.field_c = param0;
    }

    private fd(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_f = 128;
        this.field_b = 128;
        this.field_b = param1;
        this.field_c = param0;
        this.field_h = param3;
        this.field_a = param4;
        this.field_f = param2;
        this.field_g = param5;
    }

    static {
        field_d = null;
    }
}
