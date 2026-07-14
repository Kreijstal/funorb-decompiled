/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static cn field_a;
    static String field_b;

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        if (param0 > -117) {
            return null;
        }
        int var2 = param1.length();
        char[] var3 = new char[var2];
        for (var4 = 0; var2 > var4; var4++) {
            var3[var2 - (1 + var4)] = param1.charAt(var4);
        }
        return new String(var3);
    }

    final static void a(int param0, lb param1) {
        kl var2 = bf.field_f[2].field_b;
        if (!(!(var2 instanceof fk))) {
            ((fk) (Object) var2).a(param1, 83);
        }
        if (param0 != 27886) {
            field_a = null;
        }
    }

    final static cf[] a(int param0, String param1, int[] param2) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        int var3 = param2.length;
        cf[] var4 = new cf[var3];
        for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = mp.a(Integer.toString(var5 + 1), param1, 0, param2[var5]);
        }
        if (param0 >= -55) {
            Object var7 = null;
            sh.a(-87, (lb) null);
        }
        return var4;
    }

    final static int a(int param0, int param1, int[] param2) {
        int var4 = 0;
        int var3 = 0;
        int var5 = 41 % ((param0 - 57) / 50);
        if ((ib.field_j + -1) * ib.field_d > param1) {
            var3 = param1 % (ib.field_j - 1) + ib.field_j * (param1 / (-1 + ib.field_j));
            var4 = var3 + 1;
        } else {
            var3 = param1 + -((ib.field_j - 1) * ib.field_d);
            var4 = ib.field_j + var3;
        }
        int var6 = param2[var3] - param2[var4];
        return 0 >= var6 ? -var6 : var6;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = null;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email is valid";
    }
}
