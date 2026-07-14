/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends ne {
    int field_p;
    static fb field_o;
    int field_J;
    int field_E;
    int field_r;
    va field_I;
    int field_w;
    int field_u;
    int field_k;
    int field_j;
    int field_G;
    of field_A;
    int field_m;
    int field_y;
    static String field_n;
    int field_l;
    int field_s;
    int field_H;
    int field_D;
    static int field_z;
    int field_t;
    ni field_v;
    kk field_x;
    static String[] field_q;
    int field_i;
    static se field_C;
    static int[] field_B;
    static String[] field_F;

    final void b(boolean param0) {
        Object var3 = null;
        ((lp) this).field_A = null;
        ((lp) this).field_x = null;
        ((lp) this).field_I = null;
        if (!param0) {
          var3 = null;
          lp.a(32, 13, -24, -116, -76, (cn[]) null, 99, (se) null, -88, 17, -20, -33, (cn[]) null, 46, 59, 87, (cn[]) null, -51, (se) null, -61, 66);
          ((lp) this).field_v = null;
          return;
        } else {
          ((lp) this).field_v = null;
          return;
        }
    }

    final static void a(String param0, int param1, boolean param2, String param3) {
        ek.field_i = param0;
        co.field_C = param3;
        gh.a(23321, sl.field_a, param2);
        if (param1 > -31) {
            field_q = null;
        }
    }

    public static void a(byte param0) {
        field_q = null;
        field_B = null;
        field_C = null;
        field_F = null;
        if (param0 != 16) {
            return;
        }
        field_o = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, cn[] param5, int param6, se param7, int param8, int param9, int param10, int param11, cn[] param12, int param13, int param14, int param15, cn[] param16, int param17, se param18, int param19, int param20) {
        if (param3 < 68) {
          field_z = -40;
          fc.a(new qk(param5), param0, param6, param20, param9, param4, param15, param19, param8, param13, param10, new qk(param16), param1, param2, 124, param14, param7, new qk(param12), param11, param18, param17);
          return;
        } else {
          fc.a(new qk(param5), param0, param6, param20, param9, param4, param15, param19, param8, param13, param10, new qk(param16), param1, param2, 124, param14, param7, new qk(param12), param11, param18, param17);
          return;
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param1) {
          return -112;
        } else {
          var3 = 0;
          L0: while (true) {
            if (0 >= param0) {
              return var3;
            } else {
              var3 = var3 << 1050762593 | param2 & 1;
              param2 = param2 >>> 1;
              param0--;
              continue L0;
            }
          }
        }
    }

    lp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "FAILURE";
        field_o = new fb();
        field_z = 50;
        field_q = new String[]{null, "Events in the dungeon are resolved by checking your raider's skills against those of the room. Raider <%attack> is matched against room <%defence>; <%defence> against <%attack>; <%dodge> against <%snare>; and <%sneak> against <%detect>. The chance of your raider winning depends on its skill level in relation to the room's."};
        field_B = new int[8192];
        field_F = new String[]{null, "A <%raider> will surprise the monster if its <%sneak> roll beats the room's <%detect>."};
    }
}
