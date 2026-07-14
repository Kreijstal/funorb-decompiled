/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static pg field_a;
    static String field_b;
    static db[] field_c;

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (!(aa.field_i[param2] != null)) {
            return;
        }
        uf.field_n = param2;
        if (param0 != 0) {
            return;
        }
        uh.field_n.a((byte) 76, param1, aa.field_i[uf.field_n], (param3 ? 30 : 60) * b.field_r / 22050);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 60) {
            field_a = null;
        }
        field_a = null;
    }

    final static jb a(String param0, sh param1, boolean param2, String param3) {
        int var4 = param1.c(param0, (byte) -89);
        if (param2) {
            return null;
        }
        int var5 = param1.a(param3, -27964, var4);
        return uk.a(-40, param1, var4, var5);
    }

    final static String a(char param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        if (param2 < 44) {
            field_c = null;
        }
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "That name is not available";
    }
}
