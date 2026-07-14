/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static String field_c;
    static boolean[] field_d;
    static mm field_f;
    static boolean field_a;
    static ud field_e;
    static String field_b;

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 != 112) {
            field_b = null;
        }
    }

    final static void a(int param0, ck[] param1, mm param2, boolean param3, mm param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, ck[] param12, int param13, int param14, int param15, ck[] param16, int param17, int param18, int param19, int param20) {
        n.a(param18, new cc(param12), param4, param6, param20, new cc(param1), param13, param2, param14, param19, new cc(param16), param7, -6, param17, param15, param0, param10, param8, param5, param11, param9);
        if (!param3) {
            field_e = null;
        }
    }

    final static ck[] a(int param0, ji param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 112) {
          return null;
        } else {
          var4 = param1.b(param0 + -113, param2);
          var5 = param1.a(var4, 13030, param3);
          return we.a(param1, -126, var5, var4);
        }
    }

    final static tj a(long param0, byte param1) {
        if (param1 < 47) {
            return null;
        }
        return (tj) (Object) hn.field_h.a(24710, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The Twist";
        field_d = new boolean[112];
        field_b = "<%0> cannot join; the game is full.";
    }
}
