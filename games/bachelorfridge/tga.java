/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tga extends jm {
    int field_o;
    static sna field_p;
    int field_n;
    static sna field_m;

    final void b(lu param0, byte param1) {
        try {
            param0.d(((tga) this).field_n, 0);
            int var3_int = -77 % ((param1 - 37) / 38);
            param0.d(((tga) this).field_o, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tga.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(ub param0, int param1) {
        gj var3 = param0.field_o;
        param0.a(27799, (at) (Object) new fha((kj) (Object) new uea(var3, ((tga) this).field_n, ((tga) this).field_o, 16777215)));
        if (param1 >= -2) {
            return;
        }
        try {
            ((tga) this).a(false, var3.field_h);
            var3.field_s.d(73);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tga.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(boolean param0, op param1) {
        int var3_int = 0;
        try {
            if (param0) {
                tga.a(-106);
            }
            var3_int = param1.field_L.field_o[((tga) this).field_n][((tga) this).field_o].field_n;
            if (0 != param1.field_L.field_o[((tga) this).field_n][((tga) this).field_o].field_a) {
                if (-10 > param1.field_L.field_o[((tga) this).field_n][((tga) this).field_o].field_a) {
                    var3_int = param1.field_L.field_o[((tga) this).field_n][((tga) this).field_o].field_a + 6;
                }
            }
            param1.b((byte) 76, var3_int, ((tga) this).field_n, ((tga) this).field_o);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tga.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 >= -63) {
            tga.a(110);
            field_m = null;
            field_p = null;
            return;
        }
        field_m = null;
        field_p = null;
    }

    tga(int param0, int param1) {
        ((tga) this).field_n = param0;
        ((tga) this).field_o = param1;
        ((tga) this).field_j = 2;
    }

    tga(lu param0) {
        try {
            ((tga) this).field_j = 2;
            ((tga) this).field_n = param0.b(16711935);
            ((tga) this).field_o = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
