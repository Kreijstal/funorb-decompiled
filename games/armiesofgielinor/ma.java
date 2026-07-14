/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends fn implements eg {
    static boolean field_Z;
    private int field_W;
    private n field_bb;
    static String field_Y;
    static String field_X;
    static long field_ab;

    final void d(byte param0) {
        if (param0 >= -114) {
            n discarded$0 = ((ma) this).a(-106);
        }
        this.d((byte) -117);
        if (!(null == ((ma) this).field_bb)) {
            ((ma) this).field_bb.a(124);
        }
    }

    final String h(int param0) {
        if (!((ma) this).field_t) {
            return null;
        }
        if (((ma) this).field_s == null) {
            return null;
        }
        ip.a(ko.field_b, ((ma) this).field_l - ((ma) this).field_W + sm.field_d, (byte) 113);
        if (param0 != 21384) {
            return null;
        }
        return ((ma) this).field_s;
    }

    final static ls[] a(int param0, hd param1) {
        int var5 = 0;
        ls var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param1.b(false)) {
            return new ls[]{};
        }
        wo var8 = param1.b(-20681);
        while (0 == var8.field_g) {
            nu.a(10L, 0);
        }
        if (2 == var8.field_g) {
            return new ls[]{};
        }
        int[] var12 = (int[]) var8.field_f;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        ls[] var4 = new ls[var12.length >> 332236098];
        if (param0 >= -3) {
            field_X = null;
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ls();
            var4[var5] = var6;
            var6.field_b = var3[var5 << -918933630];
            var6.field_a = var3[(var5 << -195324254) - -1];
            var6.field_f = var3[(var5 << -1608325406) - -2];
            var6.field_e = var3[(var5 << 2147214882) + 3];
        }
        return var4;
    }

    public final n a(int param0) {
        if (param0 != -918933630) {
            n discarded$0 = ((ma) this).a(-10);
        }
        return ((ma) this).field_bb;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 != 3) {
            int discarded$0 = ma.a(71, -15, 73, 84);
        }
        return (-1 == (param2 & 1) ? param0 : -param0) + (-1 != (param2 & 2) ? -param3 : param3);
    }

    ma(String param0, qo param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(byte param0, n param1) {
        ((ma) this).field_bb = param1;
        if (param0 != 16) {
            Object var4 = null;
            ((ma) this).a((byte) -62, (n) null);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        if (param0 != 32722) {
            ((ma) this).field_W = 103;
        }
        this.a(param0 + 0, param1, param2, param3);
        ((ma) this).field_W = sm.field_d + -((ma) this).field_B + -param1;
    }

    public static void g(byte param0) {
        field_X = null;
        field_Y = null;
        int var1 = 21 % ((param0 - -67) / 48);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = "Units";
        field_X = "Items that can be given to units to improve their abilities in battle.";
        field_Z = true;
    }
}
