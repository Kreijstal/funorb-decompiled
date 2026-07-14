/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends qr {
    static String[] field_Bb;
    qr field_Eb;
    static qr field_xb;
    qr field_Fb;
    static int field_Gb;
    static String field_Ab;
    ub field_Db;
    static long field_Cb;
    static String field_zb;
    qr field_yb;

    public static void g(int param0) {
        field_Bb = null;
        field_zb = null;
        field_Ab = null;
        if (param0 != 23880) {
            Object var2 = null;
            am.a(-49, 17, (bi) null, -112, 60, 124, (byte) -54);
            field_xb = null;
            return;
        }
        field_xb = null;
    }

    am(long param0, am param1, String param2, String param3) {
        this(param0, (qr) (Object) param1, param1.field_Db.field_zb, param1.field_Db.field_Ab, param1.field_Fb, param2, param3);
    }

    am(long param0, qr param1, qr param2, ur param3, qr param4, String param5, String param6) {
        super(param0, param1);
        ((am) this).field_Eb = new qr(0L, (qr) null);
        ((am) this).field_Db = new ub(0L, ((am) this).field_Eb, param2, param3);
        ((am) this).field_Fb = new qr(0L, param4);
        ((am) this).field_yb = new qr(0L, param4);
        ((am) this).field_Fb.field_z = param5;
        ((am) this).field_yb.field_z = param6;
        ((am) this).a(4, (qr) (Object) ((am) this).field_Db);
        ((am) this).a(4, ((am) this).field_Fb);
        ((am) this).a(4, ((am) this).field_yb);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (((am) this).field_K + param0) / 2;
        int var6 = ((am) this).field_mb - param3;
        ((am) this).field_Db.a(((am) this).field_K, 0, 0, param0, param2 ^ -126, var6 + -param0, param1);
        ((am) this).field_Fb.field_mb = param3;
        ((am) this).field_Fb.field_hb = param2;
        ((am) this).field_Fb.field_K = -param0 + var5;
        ((am) this).field_Fb.field_db = var6;
        ((am) this).field_yb.field_K = ((am) this).field_K + -var5;
        ((am) this).field_yb.field_hb = var5;
        ((am) this).field_yb.field_db = var6;
        ((am) this).field_yb.field_mb = param3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        ((am) this).field_db = param1;
        if (param6 < 78) {
            ((am) this).field_yb = null;
            ((am) this).field_mb = param0;
            ((am) this).field_hb = param7;
            ((am) this).field_K = param5;
            ((am) this).a(param3, param2, 0, param4);
            return;
        }
        ((am) this).field_mb = param0;
        ((am) this).field_hb = param7;
        ((am) this).field_K = param5;
        ((am) this).a(param3, param2, 0, param4);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        int var6 = param3 / 10 + 1;
        int var7 = 96 / var6;
        if (param2 >= -14) {
            return;
        }
        jq.a(96, 127, param0, 96 - var7, param4, param5, false, param1);
        int var8 = 96;
        for (var9 = 1; var9 < var6; var9++) {
            var8 = var8 - var7;
            jq.a(var8, 78, param0, -var7 + var8, param4, var9 * 10 + param5, true, param1);
        }
    }

    final static void a(int param0, int param1, bi param2, int param3, int param4, int param5, byte param6) {
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        param1 = param1 - param2.field_x;
        param3 = param3 - param2.field_t;
        int var8 = 103 / ((param6 - 72) / 52);
        int var7 = param1 * param2.field_z - -param3;
        int var9 = gf.field_b * param5 + param0;
        while (true) {
            param4--;
            if (param4 < 0) {
                break;
            }
            var9++;
            var7++;
            gf.field_h[var9] = param2.field_B[var7];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_Ab = "Who can join";
        field_zb = "Efficiency";
    }
}
