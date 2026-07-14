/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends wi {
    static ak field_w;
    private bi field_r;
    int field_z;
    private String field_q;
    int field_y;
    private bi field_v;
    boolean field_t;
    static int field_s;
    static int[] field_u;
    fa field_x;

    final static int e(int param0) {
        if (param0 != 24089) {
            return 10;
        }
        return ng.field_c;
    }

    public static void d(int param0) {
        field_w = null;
        field_u = null;
        if (param0 <= 107) {
            field_u = null;
        }
    }

    final void c(int param0) {
        if (param0 <= 8) {
            Object var3 = null;
            String discarded$0 = rk.a((String) null, 32);
        }
        if (!(((rk) this).field_k)) {
            ((rk) this).field_c = false;
            return;
        }
        if (!((rk) this).a((byte) 122)) {
            return;
        }
        if (!((rk) this).field_c) {
            if ((kc.field_f ^ -1) == -2) {
                ((rk) this).field_t = !((rk) this).field_t ? true : false;
            }
        }
        ((rk) this).field_c = (kc.field_f ^ -1) == -2 ? true : false;
    }

    final void b(byte param0) {
        gb.a(ia.field_q);
        gb.a(((rk) this).field_l, ((rk) this).field_a, ((rk) this).field_n + ((rk) this).field_l, ((rk) this).field_a - -((rk) this).field_d);
        bi var2 = ((rk) this).field_t ? ((rk) this).field_r : ((rk) this).field_v;
        var2.a(((rk) this).field_l, ((rk) this).field_a);
        if (param0 >= -17) {
            Object var3 = null;
            String discarded$0 = rk.a((String) null, -66);
        }
        if (null != ((rk) this).field_x) {
            ((rk) this).field_x.c(((rk) this).field_q, ((rk) this).field_l + var2.field_c - -5, ((rk) this).field_x.field_N / 2 + (((rk) this).field_a + var2.field_a / 2), ((rk) this).field_y, ((rk) this).field_z);
        }
        gb.b(ia.field_q);
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[-var4 + (-1 + var2)] = param0.charAt(var4);
        }
        if (param1 != 5) {
            field_w = null;
        }
        return new String(var3);
    }

    rk(int param0, int param1, bi param2, bi param3, String param4, fa param5) {
        ((rk) this).field_t = false;
        ((rk) this).field_q = param4;
        ((rk) this).field_x = param5;
        ((rk) this).field_r = param3;
        ((rk) this).field_l = param0;
        ((rk) this).field_v = param2;
        ((rk) this).field_a = param1;
        ((rk) this).field_n = ((rk) this).field_r.field_c + 5 - -((rk) this).field_x.b(((rk) this).field_q);
        ((rk) this).field_d = ((rk) this).field_r.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new ak();
        field_u = new int[5];
    }
}
