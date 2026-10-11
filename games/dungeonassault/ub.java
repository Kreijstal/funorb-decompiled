/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ne {
    static vn field_n;
    static byte[][] field_q;
    static String field_k;
    static od field_s;
    static String field_m;
    static int field_p;
    static tf field_i;
    static String field_r;
    static String field_o;
    static cn field_j;
    static String field_l;

    public static void a(byte param0) {
        field_q = (byte[][]) null;
        field_o = null;
        field_r = null;
        field_m = null;
        field_s = null;
        field_i = null;
        int var1 = 35 / ((param0 - 65) / 36);
        field_k = null;
        field_n = null;
        field_l = null;
        field_j = null;
    }

    final static int a(byte param0, int param1) {
        if (param0 == 15) {
          return param1 == 0 ? 0 : param1 != 1 ? param1 == 2 ? 6 : 9 : 3;
        }
        return 34;
    }

    private ub() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Play Tutorial";
        field_m = "<col=FF0000>Defence -2</col>";
        field_s = new od();
        field_o = null;
        field_r = "To get the maximum benefit from the Dungeon Assault tutorial, we recommend that you <col=FFC080>log in or register</col> before starting.<br><br>You can continue without logging in, but you will need to repeat sections of the tutorial later before playing Dungeon Assault.";
        field_p = 0;
        field_l = "Goblin Cleaver";
    }
}
