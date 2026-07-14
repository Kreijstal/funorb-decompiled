/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dtb implements dja {
    static String field_a;

    public static void b(byte param0) {
        if (param0 != 124) {
            return;
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = 49 % ((-64 - param0) / 50);
        return (tv) (Object) new bea();
    }

    final static fm[] a(eab param0, int param1) {
        int var5 = 0;
        fm var6 = null;
        int var7 = VoidHunters.field_G;
        if (!(param0.a(0))) {
            return new fm[]{};
        }
        mob var8 = param0.d(85);
        while (var8.field_f == 0) {
            gdb.b(127, 10L);
        }
        if (2 == var8.field_f) {
            return new fm[]{};
        }
        if (param1 != -30334) {
            field_a = null;
        }
        int[] var12 = (int[]) var8.field_d;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        fm[] var4 = new fm[var12.length >> -154401150];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new fm();
            var4[var5] = var6;
            var6.field_c = var3[var5 << -985098878];
            var6.field_a = var3[1 + (var5 << 569835714)];
            var6.field_e = var3[2 + (var5 << -845278878)];
            var6.field_d = var3[(var5 << 242657410) - -3];
        }
        return var4;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            Object var4 = null;
            boolean discarded$0 = dtb.a('￸', 101, (CharSequence) null);
        }
        return (tv[]) (Object) new bea[param1];
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        if (param1 <= 18) {
            return true;
        }
        if (!qnb.a((byte) -35, param0)) {
            return false;
        }
        if (param2 == null) {
            return false;
        }
        int var3 = param2.length();
        if (12 <= var3) {
            return false;
        }
        if (fg.a(param0, 70)) {
            if (var3 == 0) {
                return false;
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Keep the tech in your spawn to deplete the enemy's score";
    }
}
