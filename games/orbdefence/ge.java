/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ge {
    static String field_i;
    static aa field_g;
    static k field_c;
    il field_d;
    static String field_o;
    il field_p;
    il field_k;
    il field_f;
    int field_e;
    mg field_l;
    long field_j;
    volatile int field_b;
    mg field_m;
    volatile int field_n;
    byte field_h;
    cd field_a;

    abstract void c(int param0);

    final boolean d(int param0) {
        if (param0 >= -4) {
            return true;
        }
        return ((ge) this).g(-119) >= 20 ? true : false;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((ge) this).b(89) >= 20 ? true : false;
    }

    final int g(int param0) {
        if (param0 > -112) {
            return 126;
        }
        return ((ge) this).field_d.a((byte) -4) - -((ge) this).field_p.a((byte) -4);
    }

    abstract boolean e(int param0);

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_o = null;
        field_c = null;
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        if (!(param1 != 0)) {
            return 0;
        }
        if (param1 > 0) {
            var2 = 1;
            if (param1 > 65535) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (param1 > 255) {
                var2 += 8;
                param1 = param1 >> 8;
            }
            if (!(15 >= param1)) {
                param1 = param1 >> 4;
                var2 += 4;
            }
            if (3 < param1) {
                param1 = param1 >> 2;
                var2 += 2;
            }
            if (param1 > 1) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (param0) {
            return -68;
        }
        if (!(param1 >= -65536)) {
            param1 = param1 >> 16;
            var2 += 16;
        }
        if (param1 < -256) {
            param1 = param1 >> 8;
            var2 += 8;
        }
        if (-16 > param1) {
            param1 = param1 >> 4;
            var2 += 4;
        }
        if (!(param1 >= -4)) {
            var2 += 2;
            param1 = param1 >> 2;
        }
        if (param1 < -2) {
            param1 = param1 >> 1;
            var2++;
        }
        return var2;
    }

    abstract void a(Object param0, int param1, boolean param2);

    final cd a(int param0, int param1, boolean param2, int param3, byte param4) {
        long var6 = (long)param1 + ((long)param3 << 32);
        cd var8 = new cd();
        var8.field_n = param2 ? true : false;
        if (param0 != 15937) {
            return null;
        }
        var8.field_h = var6;
        var8.field_s = param4;
        if (param2) {
            if (20 <= ((ge) this).g(-119)) {
                throw new RuntimeException();
            }
            ((ge) this).field_d.a(-62, (o) (Object) var8);
        } else {
            if (!(((ge) this).b(109) < 20)) {
                throw new RuntimeException();
            }
            ((ge) this).field_k.a(-50, (o) (Object) var8);
        }
        return var8;
    }

    abstract void f(int param0);

    final int b(int param0) {
        if (param0 < 43) {
            return 118;
        }
        return ((ge) this).field_k.a((byte) -4) + ((ge) this).field_f.a((byte) -4);
    }

    ge() {
        ((ge) this).field_d = new il();
        ((ge) this).field_p = new il();
        ((ge) this).field_k = new il();
        ((ge) this).field_f = new il();
        ((ge) this).field_l = new mg(6);
        ((ge) this).field_b = 0;
        ((ge) this).field_h = (byte) 0;
        ((ge) this).field_n = 0;
        ((ge) this).field_m = new mg(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting for extra data";
        field_o = "Try again";
    }
}
