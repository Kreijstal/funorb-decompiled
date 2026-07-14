/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_e;
    static int field_a;
    static cr field_c;
    static String field_b;
    static String field_f;
    static String field_d;
    static String field_g;

    public static void a(byte param0) {
        if (param0 <= 33) {
            return;
        }
        field_d = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_g = null;
    }

    final static void a(int param0, er[] param1, int param2, int param3, int param4, int param5, int param6, er[] param7, int param8, cc param9, int param10, int param11, int param12, int param13, int param14, int param15, er[] param16, int param17, int param18, byte param19, cc param20) {
        mq.a(param17, new mp(param1), param10, param9, param8, param18, param13, param14, param2, new mp(param7), (byte) 88, param4, param6, param3, param11, param20, param12, param0, param15, new mp(param16), param5);
        int var21 = 93 % ((33 - param19) / 55);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -5141) {
            return;
        }
        for (var1 = 0; var1 < no.field_d; var1++) {
            eo.field_l[var1] = null;
        }
        no.field_d = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = "You lost!";
        field_g = "Loading textures";
        field_f = "Public";
        field_b = "You have been removed from <%0>'s game.";
    }
}
