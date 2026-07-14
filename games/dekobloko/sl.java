/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_a;
    static String field_g;
    static int field_f;
    static boolean field_c;
    static String field_b;
    static String field_d;
    static String field_e;

    final static void a(String param0, int[] param1, byte param2, nm param3, w param4, String param5, long param6, int param7, int param8) {
        ki.field_w = param3;
        w.field_H = new pf(param4, param6, param0, param5, param8, param7, param1);
        if (param2 <= 84) {
            field_g = null;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        if (param0 != 110) {
            field_c = true;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = mc.field_b[jm.field_p];
        int var5 = mc.field_b[(jm.field_p - -1) % mc.field_b.length];
        int var6 = fl.a(var5, jg.field_g, param3, var4, 110);
        int var7 = sb.field_o[jm.field_p];
        if (param1 >= -35) {
            sl.a((byte) 86);
        }
        int var8 = sb.field_o[(jm.field_p - -1) % mc.field_b.length];
        int var9 = fl.a(var8, jg.field_g, param3, var7, 114);
        hk.d(param2, param0, 640, 480, var6, var9);
    }

    final static long a(int param0) {
        if (param0 != -1) {
            sl.a((String) null, (int[]) null, (byte) 24, (nm) null, (w) null, (String) null, -106L, 12, -60);
        }
        return -p.field_a + ik.a(4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Username: ";
        field_b = "Score";
        field_d = "You have been removed from <%0>'s game.";
        field_e = "Passwords must be between 5 and 20 letters and numbers";
        field_f = 0;
    }
}
