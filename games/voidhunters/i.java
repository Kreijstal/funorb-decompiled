/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends ka implements e {
    private qeb[] field_a;
    long field_nativeid;
    private ya field_b;
    private tn[] field_c;
    private oa field_d;

    protected final void finalize() {
        if (((i) this).field_nativeid != 0L) {
            pq.a(0, (e) this);
        }
    }

    final native void O(int param0, int param1, int param2);

    final native int RA();

    final native int HA();

    private final native void R(oa param0, ya param1, int param2, int param3, int[] param4, int[] param5, int[] param6, int[] param7, short[] param8, int param9, short[] param10, short[] param11, short[] param12, byte[] param13, byte[] param14, byte[] param15, byte[] param16, short[] param17, short[] param18, int[] param19, byte param20, short[] param21, int param22, byte[] param23, short[] param24, short[] param25, short[] param26, int[] param27, int[] param28, int[] param29, byte[] param30, byte[] param31, int[] param32, int[] param33, int[] param34, int[] param35, int param36, int param37, int param38, int param39, int param40, int param41, int[] param42);

    final native int G();

    private final native void oa(oa param0);

    public final native void w(boolean param0);

    final native void H(int param0, int param1, int param2);

    final native int V();

    i(oa param0, ya param1, cbb param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int var15 = 0;
        bqa var18 = null;
        bqa var21 = null;
        sr var17 = null;
        bqa var19 = null;
        ((i) this).field_d = param0;
        ((i) this).field_b = param1;
        ((i) this).field_a = param2.field_c;
        ((i) this).field_c = param2.field_l;
        int var8 = param2.field_c == null ? 0 : param2.field_c.length;
        int var9 = param2.field_l == null ? 0 : param2.field_l.length;
        int var10 = 0;
        int[] var28 = new int[var8 * 3 + var9];
        int[] var26 = var28;
        int[] var24 = var26;
        int[] var22 = var24;
        int[] var11 = var22;
        for (var12 = 0; var12 < var8; var12++) {
            var10++;
            var11[var10] = ((i) this).field_a[var12].field_d;
            var10++;
            var11[var10] = ((i) this).field_a[var12].field_a;
            var10++;
            var11[var10] = ((i) this).field_a[var12].field_b;
        }
        for (var12 = 0; var12 < var9; var12++) {
            var10++;
            var11[var10] = ((i) this).field_c[var12].field_a;
        }
        var12 = param2.field_g == null ? 0 : param2.field_g.length;
        int[] var29 = new int[var12 * 8];
        int[] var27 = var29;
        int[] var25 = var27;
        int[] var23 = var25;
        int[] var13 = var23;
        int var14 = 0;
        for (var15 = 0; var15 < var12; var15++) {
            var18 = param2.field_g[var15];
            var21 = var18;
            var17 = jm.a(var21.field_e, 0);
            var14++;
            var13[var14] = var18.field_b;
            var14++;
            var13[var14] = var17.field_g;
            var14++;
            var13[var14] = var17.field_b;
            var14++;
            var13[var14] = var17.field_e;
            var14++;
            var13[var14] = var17.field_d;
            var14++;
            var13[var14] = var17.field_f;
            var14++;
            var13[var14] = var17.field_a ? -1 : 0;
        }
        int var20 = 0;
        var15 = var20;
        while (var20 < var12) {
            var19 = param2.field_g[var20];
            var14++;
            var13[var14] = var19.field_a;
            var20++;
        }
        this.R(((i) this).field_d, ((i) this).field_b, param2.field_s, param2.field_D, param2.field_v, param2.field_G, param2.field_x, param2.field_p, param2.field_z, param2.field_j, param2.field_k, param2.field_o, param2.field_K, param2.field_E, param2.field_m, param2.field_r, param2.field_M, param2.field_b, param2.field_u, param2.field_y, param2.field_d, param2.field_w, param2.field_B, param2.field_e, param2.field_t, param2.field_i, param2.field_H, param2.field_F, param2.field_a, param2.field_C, param2.field_J, param2.field_n, param2.field_L, param2.field_f, param2.field_I, var28, var8, var9, param3, param4, param5, param6, var29);
    }

    i(oa param0) {
        ((i) this).field_d = param0;
        ((i) this).field_b = null;
        this.oa(param0);
    }
}
