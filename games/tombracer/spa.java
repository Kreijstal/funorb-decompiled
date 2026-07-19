/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class spa extends wda {
    private int field_p;
    static jea field_o;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return -115;
        }
        param1 = fs.a((byte) 23, param1, this.field_p);
        return param1;
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -109);
            if (param1 >= -78) {
                this.b(-41);
            }
            param0.a((byte) -128, dqa.a(true, this.field_p, 12), 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "spa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 > -121) {
            this.field_p = -76;
            this.field_p = param1;
            return;
        }
        this.field_p = param1;
    }

    spa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_p = bla.a(true, 12, param1.b((byte) 44, 12));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "spa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    spa(la param0, boolean param1) {
        super(param0, param1);
        try {
            this.field_p = 16;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "spa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        this.field_n.c(false, this.field_p);
        int var2 = 24 % ((param0 - -69) / 42);
    }

    final void b(int param0) {
        if (param0 != 1) {
            this.a((byte) 79, 28);
        }
    }

    final int c(int param0) {
        int discarded$0 = 0;
        if (param0 != 1) {
            discarded$0 = this.a(40, 31);
            return 6;
        }
        return 6;
    }

    public static void d(boolean param0) {
        if (!param0) {
            return;
        }
        field_o = null;
    }

    final void c(byte param0) {
        super.c((byte) -125);
        if (param0 >= -116) {
            return;
        }
        this.field_p = -this.field_p;
    }

    static {
    }
}
