/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static int[][] field_b;
    static String field_e;
    static int field_f;
    static int field_d;
    static String field_g;
    static String field_c;
    static String field_a;

    final static ck a(int param0, int param1, ji param2, int param3) {
        if (!gb.a(param3, param2, param0, 49)) {
            return null;
        }
        if (param1 != 50) {
            af.a((byte) -13);
        }
        return nm.g((byte) 26);
    }

    final static void a(int param0, int param1) {
        qd.field_Ob = param1 * param0 / 50;
        ib.field_kb = param1 * 20 / 50;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_c = null;
        int var1 = -41 % ((3 - param0) / 37);
        field_b = null;
        field_e = null;
    }

    final static boolean a(int param0, int[] param1, int[] param2) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        for (var3 = param0; var3 < 8; var3++) {
            if (!(param1[var3] == param2[var3])) {
                return false;
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "FULL ACCESS";
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = "Friends can be added in the multiplayer<nbsp>lobby";
        field_a = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
