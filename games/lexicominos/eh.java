/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static String field_c;
    static int field_b;
    static boolean field_a;
    static sh field_d;

    final static void a(int param0, db param1, int param2, int param3, String param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Lexicominos.field_L ? 1 : 0;
        int var6 = param4.length();
        for (var7 = param3; var6 > var7; var7++) {
            var8 = param4.charAt(var7);
            if (!(var8 == 32)) {
                cg.a(bi.field_a, param1, param0, param5, (byte) -98, pa.field_d, param2, (char) var8);
            }
            param2 = param2 + param1.field_p;
        }
    }

    public static void a(byte param0) {
        int var1 = 84 % ((param0 - -10) / 56);
        field_c = null;
        field_d = null;
    }

    final static void a(vb param0, int param1, byte param2) {
        if (param2 != -4) {
            return;
        }
        jl.field_a.b(param2 + 105, (kd) (Object) param0);
        vi.a(param1, param0, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Connection lost - attempting to reconnect";
        field_a = false;
    }
}
