/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    String field_l;
    cg[] field_e;
    private int field_k;
    int field_b;
    ul field_g;
    ok[] field_p;
    String field_h;
    int field_c;
    private int field_m;
    String field_f;
    static ah field_a;
    static oa field_i;
    ul field_j;
    static String field_n;
    static double field_d;
    static int field_o;

    final void a(ok param0, byte param1) {
        int var3 = 0;
        ok[] var4 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (((ji) this).field_b + 1 > ((ji) this).field_m) {
            var3 = 0 != ((ji) this).field_m ? 2 * ((ji) this).field_m : 2;
            var4 = new ok[var3];
            for (var5 = 0; var5 < ((ji) this).field_b; var5++) {
                var4[var5] = ((ji) this).field_p[var5];
            }
            ((ji) this).field_m = var3;
            ((ji) this).field_p = var4;
        }
        ((ji) this).field_b = ((ji) this).field_b + 1;
        ((ji) this).field_p[((ji) this).field_b] = param0;
        if (param1 != 7) {
            Object var7 = null;
            ((ji) this).a((cg) null, -26);
        }
    }

    final static void a(byte param0) {
        ka.field_b.a(false);
        if (be.field_l == null) {
            be.field_l = new ra(ka.field_b, nl.field_c);
        }
        ka.field_b.a((n) (Object) be.field_l, false);
        if (param0 > -80) {
            field_i = null;
        }
    }

    final static go a(String param0, byte param1) {
        int var2 = 11 / ((param1 - 8) / 60);
        return new go(param0);
    }

    public static void a(boolean param0) {
        field_n = null;
        field_a = null;
        if (!param0) {
            field_a = null;
        }
        field_i = null;
    }

    final void a(cg param0, int param1) {
        int var3 = 0;
        cg[] var4 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (!(1 + ((ji) this).field_c <= ((ji) this).field_k)) {
            var3 = 0 == ((ji) this).field_k ? 2 : ((ji) this).field_k * 2;
            var4 = new cg[var3];
            for (var5 = 0; ((ji) this).field_c > var5; var5++) {
                var4[var5] = ((ji) this).field_e[var5];
            }
            ((ji) this).field_k = var3;
            ((ji) this).field_e = var4;
        }
        if (param1 != 0) {
            ((ji) this).field_m = 100;
        }
        ((ji) this).field_c = ((ji) this).field_c + 1;
        ((ji) this).field_e[((ji) this).field_c] = param0;
    }

    ji(String param0) {
        ((ji) this).field_k = 0;
        ((ji) this).field_f = "";
        ((ji) this).field_g = null;
        ((ji) this).field_j = null;
        ((ji) this).field_m = 0;
        ((ji) this).field_b = 0;
        ((ji) this).field_h = param0;
        ((ji) this).field_p = null;
        ((ji) this).field_e = null;
        ((ji) this).field_c = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ah();
        field_d = 0.0;
        field_n = "Two players can play simultaneously on the same machine. Select a two-player (<col=1>2P</col>) game type at the course menu.";
        field_o = -1;
    }
}
