/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends lg {
    static int[] field_D;
    static int field_E;
    static int[] field_C;

    final static vn a(sm[] param0, int param1, byte[] param2) {
        int var8 = 0;
        int var9 = Torquing.field_u;
        if ((param0.length ^ -1) != -257) {
            throw new IllegalArgumentException();
        }
        if (param1 != 256) {
            Object var10 = null;
            ok.a((fj) null, (java.math.BigInteger) null, (fj) null, (java.math.BigInteger) null, -16);
        }
        int[] var27 = new int[256];
        int[] var22 = var27;
        int[] var17 = var22;
        int[] var12 = var17;
        int[] var11 = var12;
        int[] var3 = var11;
        int[] var28 = new int[256];
        int[] var23 = var28;
        int[] var18 = var23;
        int[] var13 = var18;
        int[] var4 = var13;
        int[] var29 = new int[256];
        int[] var24 = var29;
        int[] var19 = var24;
        int[] var14 = var19;
        int[] var5 = var14;
        int[] var30 = new int[256];
        int[] var25 = var30;
        int[] var20 = var25;
        int[] var15 = var20;
        int[] var6 = var15;
        byte[][] var31 = new byte[256][];
        byte[][] var26 = var31;
        byte[][] var21 = var26;
        byte[][] var16 = var21;
        byte[][] var7 = var16;
        for (var8 = 0; var8 < 256; var8++) {
            var11[var8] = param0[var8].field_a;
            var4[var8] = param0[var8].field_g;
            var5[var8] = param0[var8].field_c;
            var6[var8] = param0[var8].field_d;
            var7[var8] = param0[var8].field_l;
        }
        return new vn(param2, var27, var28, var29, var30, var31);
    }

    public static void a(int param0) {
        field_C = null;
        int var1 = -2 % ((-58 - param0) / 38);
        field_D = null;
    }

    private ok(String param0, el param1, ca param2) {
        super(param0, param1, param2);
        ((ok) this).field_q = ah.field_c.field_i;
    }

    final static void a(byte param0) {
        if (param0 >= -81) {
            Object var2 = null;
            ok.a((fj) null, (java.math.BigInteger) null, (fj) null, (java.math.BigInteger) null, -34);
        }
        if (-4 == (sn.field_i ^ -1)) {
            de.field_c[4] = de.field_c[4] - 5;
        }
    }

    final static void a(fj param0, java.math.BigInteger param1, fj param2, java.math.BigInteger param3, int param4) {
        if (param4 != -4) {
            ok.a(-30);
        }
        op.a((byte) 20, param2, param3, param1, param0.field_n, param0.field_j, 0);
    }

    ok(String param0, ca param1, boolean param2) {
        this(param0, param1);
        ((ok) this).field_A = param2 ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((ok) this).field_A = !((ok) this).field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private ok(String param0, ca param1) {
        this(param0, ah.field_c.field_k, param1);
        ((ok) this).field_q = ah.field_c.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 0;
        field_C = new int[]{157, 187, 393, 92, 10, 0, 388, 214, 388, 361, 413, 413};
        field_D = new int[8192];
    }
}
