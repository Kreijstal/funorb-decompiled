/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vra implements bo {
    private int field_b;
    static int field_a;
    static String field_c;
    private int field_d;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 4) {
            vra.a(22);
        }
    }

    public final void a(int param0, kh param1) {
        try {
            param1.i(8);
            param1.a((byte) -128, this.field_b, 3);
            param1.a((byte) -126, this.field_d, 4);
            param1.k(param0 ^ -1826190742);
            if (param0 != 200) {
                vra.a(79);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vra.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(qh param0, byte param1, v param2) {
        try {
            if (param1 >= -81) {
                vra.a(-117);
            }
            param0.c(this.field_d, 112, this.field_b);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vra.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 126);
        if (param1 != -19) {
            return;
        }
        try {
            this.field_b = param0.b((byte) 44, 3);
            this.field_d = param0.b((byte) 44, 4);
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vra.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Please remove <%0> from your ignore list first.";
    }
}
