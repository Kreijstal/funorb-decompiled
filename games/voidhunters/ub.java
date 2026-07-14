/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ub extends ksa implements tv {
    static String field_g;
    static int[] field_f;
    static String[] field_d;
    static clb field_e;
    static String field_h;

    ub() {
    }

    public void a(faa param0, boolean param1) {
        if (param1) {
            field_g = null;
        }
    }

    public void b(byte param0, tv param1) {
        if (param0 <= 54) {
            Object var4 = null;
            ((ub) this).a((faa) null, false);
        }
    }

    public void b(faa param0, int param1) {
        if (param1 >= -109) {
            Object var4 = null;
            boolean discarded$0 = ((ub) this).a((byte) -11, (tv) null);
        }
    }

    void a(tv param0, int param1) {
        if (param1 > -19) {
            field_e = null;
        }
    }

    public static void c(byte param0) {
        field_d = null;
        field_h = null;
        if (param0 <= 37) {
            return;
        }
        field_e = null;
        field_f = null;
        field_g = null;
    }

    public boolean a(byte param0, tv param1) {
        int var3 = 103 / ((22 - param0) / 59);
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> has entered a game.";
        field_f = new int[]{1, 0};
        field_h = "Waiting for <%0> to start the game...";
        field_d = new String[]{"Game type"};
        field_e = new clb();
    }
}
