/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String[] field_g;
    static String field_e;
    static uo field_d;
    static int[] field_b;
    static String field_c;
    static int field_a;
    static String field_h;
    static boolean field_f;

    final static void a(byte param0, int param1, int param2, int param3, mp param4, mp param5) {
        eb.field_h = 5;
        try {
            td.field_a = param5;
            vo.field_y = 10;
            hc.field_a = 20;
            od.field_Jb = param4;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ni.B(" + 107 + 44 + 5 + 44 + 10 + 44 + 20 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static va a() {
        if (!(ek.field_F != null)) {
            ek.field_F = new va(bl.field_N, 20, 0, 0, 0, 11579568, -1, 0, 0, bl.field_N.field_z, -1, 2147483647, true);
        }
        return ek.field_F;
    }

    public static void b() {
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_g = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"&***", "soldier", "killer", "upstart", "fighter", "survivor", "warrior", "subjugator", "conquistador", "tyrant", "despot", "duce", "vanquisher", "suzerain", "usurper", "conqueror", "leader", "patrician", "dominar", "baron", "caliph", "czar", "imperator", "khan", "satrap", "dictator", "magnate", "overlord", "rajah", "sultan", "rex", "lord", "caeser", "kaiser", "emperor", "monarch", "gerent", "maharajah", "mikado", "pasha", "shah"};
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_e = "Invite more players, or alternatively try changing the following settings:  ";
        field_h = "Create your own free Jagex account";
        field_c = "Name";
    }
}
