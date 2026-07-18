/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends pg {
    int field_u;
    int field_l;
    int field_h;
    int field_i;
    int field_H;
    int field_I;
    int field_j;
    int field_q;
    static String field_o;
    int field_C;
    ba field_x;
    int field_v;
    static int field_r;
    static int field_s;
    int field_y;
    static ll[] field_E;
    fg field_D;
    static qb field_F;
    static int field_g;
    int field_p;
    wf field_m;
    int field_w;
    int field_t;
    kd field_n;
    int field_k;
    int field_z;
    int field_B;

    final static void a(ll param0, byte param1, int param2, byte param3, int param4, int param5, nf param6) {
        try {
            sn.a(param5, param0, param2, -19, param6, true, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "o.A(" + (param0 != null ? "{...}" : "null") + ',' + -47 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0) {
        if (!param0) {
          ((o) this).b(false);
          ((o) this).field_x = null;
          ((o) this).field_n = null;
          ((o) this).field_m = null;
          ((o) this).field_D = null;
          return;
        } else {
          ((o) this).field_x = null;
          ((o) this).field_n = null;
          ((o) this).field_m = null;
          ((o) this).field_D = null;
          return;
        }
    }

    final static void a() {
        jl.field_c.field_i = 0;
        jl.field_c.field_o = 0;
    }

    public static void c() {
        field_o = null;
        field_E = null;
        field_F = null;
    }

    o() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
        field_o = "Game options";
        field_g = 4;
    }
}
