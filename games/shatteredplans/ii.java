/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ii extends df {
    static String field_r;
    int field_t;
    static String field_v;
    int field_x;
    int field_z;
    static String field_s;
    static qr field_u;
    static bi field_q;
    int field_w;
    static bi field_y;
    int field_o;
    int field_p;

    final static void a(bc param0, bc param1, int param2) {
        sf.field_d = gh.a(param0, "", "shattered_plans_intro");
        wp.field_a = gh.a(param0, "", "shattered_plans_ingame_two");
        js.field_i = gh.a(param0, "", "shattered_plans_ingame");
        hk.field_nb = wp.field_a;
        hj.field_n = gh.a(param0, "", "shattered_plans_win");
        wh.field_b = gh.a(param0, "", "shattered_plans_lose");
        boolean discarded$27 = u.field_b.field_u.a(param1, sf.field_d, 50, 0, mj.field_Sb);
        boolean discarded$46 = u.field_b.field_u.a(param1, wp.field_a, 41, 0, mj.field_Sb);
        boolean discarded$56 = u.field_b.field_u.a(param1, js.field_i, 111, 0, mj.field_Sb);
        if (param2 < 26) {
            return;
        }
        try {
            u.field_b.field_u.f(256);
            mj.field_Sb = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ii.WB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_o << 997342595;
        int var7 = this.field_p << -1363101597;
        param3 = (param3 << 1147197732) - -(var6 & 15);
        param1 = (param1 << -1904765116) - -(param0 & var7);
        this.a(var6, var7, param3, param1, param4, param2);
    }

    public static void e(int param0) {
        bc var2 = null;
        field_s = null;
        if (param0 != 997342595) {
          var2 = (bc) null;
          ii.a((bc) null, (bc) null, 124);
          field_y = null;
          field_r = null;
          field_q = null;
          field_v = null;
          field_u = null;
          return;
        } else {
          field_y = null;
          field_r = null;
          field_q = null;
          field_v = null;
          field_u = null;
          return;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    ii() {
    }

    static {
        field_v = "Discard";
        field_s = "PENDING";
        field_r = "Loading graphics";
    }
}
