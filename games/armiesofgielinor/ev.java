/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ev implements ok {
    static String field_e;
    static int field_d;
    static boolean field_b;
    static int field_a;
    static int field_c;

    public static void a(int param0) {
        if (param0 != 960112080) {
            Object var2 = null;
            int[] discarded$0 = ev.a((vh) null, (byte) 105);
        }
        field_e = null;
    }

    final static int[] a(vh param0, byte param1) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0.k(param1 ^ -98);
        if (var2 == 0) {
            return null;
        }
        int[] var3 = new int[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[var4] = param0.k(0);
        }
        if (param1 != -98) {
            ev.a(4);
        }
        return var3;
    }

    public void a(int param0, int param1, int param2) {
        if (param1 != -32263) {
            return;
        }
        ra.a(param2, param1 ^ -9688, param0);
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param2 >> 960112080;
        if (param0 >= -33) {
            field_e = null;
        }
        int var4 = 65535 & param2;
        int var5 = param1 >> 568410800;
        int var6 = param1 & 65535;
        return var5 * var4 + param1 * var3 + (var6 * var4 >> -1272601136);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_e = "Join <%0>'s game";
        field_a = 0;
        field_c = 0;
    }
}
