/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static String field_c;
    static int field_b;
    static int field_d;
    static String field_a;

    final static int a(int param0, byte param1, int param2) {
        int var3 = param0 >>> 1346386079;
        if (param1 <= 118) {
            return 121;
        }
        return -var3 + (var3 + param0) / param2;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 > -108) {
            int discarded$0 = bn.a(-84, (byte) 74, -123);
        }
    }

    final static boolean a(int param0, char param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        if (Character.isISOControl(param1)) {
            return false;
        }
        int var2 = 70 / ((0 - param0) / 60);
        if (kn.a(param1, (byte) -69)) {
            return true;
        }
        char[] var7 = va.field_e;
        char[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (param1 == var5) {
                return true;
            }
        }
        var3 = li.field_f;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 == param1) {
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please enter your date of birth to enable chat:";
        field_a = "Logging in...";
    }
}
