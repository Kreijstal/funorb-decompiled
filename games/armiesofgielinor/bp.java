/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bp {
    static String field_m;
    static wk[] field_d;
    static je[] field_j;
    static int field_e;
    static String field_k;
    ui field_b;
    static int field_c;
    ui field_n;
    ui field_f;
    ui field_g;
    vh field_o;
    int field_l;
    long field_r;
    vh field_h;
    volatile int field_q;
    volatile int field_p;
    byte field_i;
    jf field_a;

    final boolean a(byte param0) {
        if (param0 != 51) {
            boolean discarded$0 = ((bp) this).d(100);
        }
        return -21 >= (((bp) this).b(param0 + -179) ^ -1) ? true : false;
    }

    final jf a(int param0, boolean param1, int param2, byte param3, boolean param4) {
        long var6 = ((long)param2 << 1222594912) - -(long)param0;
        jf var8 = new jf();
        var8.field_q = var6;
        var8.field_B = param3;
        if (param1) {
            field_c = 46;
        }
        var8.field_z = param4 ? true : false;
        if (!param4) {
            if (!(-21 < (((bp) this).b(-120) ^ -1))) {
                throw new RuntimeException();
            }
            ((bp) this).field_f.a((ms) (Object) var8, false);
        } else {
            if (((bp) this).a(116) >= 20) {
                throw new RuntimeException();
            }
            ((bp) this).field_b.a((ms) (Object) var8, false);
        }
        return var8;
    }

    abstract boolean a(boolean param0);

    final boolean d(int param0) {
        if (param0 <= 14) {
            field_m = null;
        }
        return ((bp) this).a(88) >= 20 ? true : false;
    }

    public static void c(byte param0) {
        if (param0 != 35) {
            return;
        }
        field_d = null;
        field_m = null;
        field_k = null;
        field_j = null;
    }

    final int b(int param0) {
        if (param0 >= -105) {
            return -114;
        }
        return ((bp) this).field_f.a(30578) - -((bp) this).field_g.a(30578);
    }

    final int a(int param0) {
        if (param0 < 84) {
            return 64;
        }
        return ((bp) this).field_b.a(30578) - -((bp) this).field_n.a(30578);
    }

    final static void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 > -96) {
            bp.a(-87, 28, 102);
        }
        int[] var11 = dr.field_v[param0];
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        for (var4 = 0; var4 < var11.length; var4++) {
            var11[var4] = param1;
            var5 = gq.a(var11[var4]);
            var6 = (524092 & var5) >> 1249207336;
            var6 = var6 + 5 * var4 / var11.length;
            var7 = 255 & var5;
            if ((var7 ^ -1) < -7) {
                var7 = 6;
            }
            var5 = var6 << -594979000 | -524033 & var5;
            var5 = -256 & var5 | var7;
            var9[var4] = gq.b(var5);
        }
    }

    abstract void b(byte param0);

    abstract void c(int param0);

    abstract void a(Object param0, boolean param1, int param2);

    bp() {
        ((bp) this).field_b = new ui();
        ((bp) this).field_n = new ui();
        ((bp) this).field_f = new ui();
        ((bp) this).field_g = new ui();
        ((bp) this).field_o = new vh(6);
        ((bp) this).field_q = 0;
        ((bp) this).field_p = 0;
        ((bp) this).field_i = (byte) 0;
        ((bp) this).field_h = new vh(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 256;
        field_m = "Unfortunately you are not eligible to create an account.";
        field_k = "Waiting for sound effects";
        field_c = -1;
    }
}
