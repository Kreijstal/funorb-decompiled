/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws extends wda {
    private boolean field_p;
    static int field_r;
    private boolean field_q;
    static int[] field_o;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return 81;
        }
        return param1;
    }

    final void b(byte param0) {
        hca var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var2 = 72 % ((-69 - param0) / 42);
        if (!(!this.field_k)) {
            var3 = this.field_n.H(-34);
            if (!(!var3.u(-25561))) {
                return;
            }
            var4 = var3.m((byte) -63);
            var5 = var3.B(0);
            if (!(!this.field_q)) {
                var5 = var5 * -1;
            }
            if (!(!this.field_p)) {
                var4 = var4 * -1;
            }
            this.field_n.a((byte) -105, var4, var5);
        }
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 != 1) {
            ws.e(-44);
        }
    }

    final void a(kh param0, byte param1) {
        try {
            if (param1 >= -78) {
                this.b((byte) 11);
            }
            super.a(param0, (byte) -116);
            param0.a((byte) -128, !this.field_p ? 0 : 1, 1);
            param0.a((byte) -125, this.field_q ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ws.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        int discarded$0 = 0;
        if (param0 != 1) {
            discarded$0 = this.a(-86, 99);
        }
    }

    ws(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_p = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
            this.field_q = param1.b((byte) 44, 1) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ws.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            field_o = (int[]) null;
            return 4;
        }
        return 4;
    }

    final static void f(int param0) {
        if (param0 != 29320) {
            ws.e(-56);
        }
    }

    static {
        field_o = new int[]{2, 3, 4};
    }
}
