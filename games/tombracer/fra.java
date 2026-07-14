/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fra extends nv {
    static nh field_q;
    static float field_p;
    static char[] field_n;
    private up field_r;
    int field_o;

    final void k(int param0) {
        ((fra) this).field_o = ((fra) this).b(true).a(125, ((fra) this).field_g.e(9648), ((fra) this).field_r, ((fra) this).field_g.a((byte) 55), ((fra) this).field_g.c(-111), ((fra) this).field_g.d(param0 + -5415));
        if (param0 != 5418) {
            ((fra) this).k(-67);
        }
    }

    fra(la param0, boolean param1) {
        super(param0, param1);
        ((fra) this).field_o = 0;
        ((fra) this).field_r = new up(1, 50);
    }

    fra(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((fra) this).field_o = 0;
        ((fra) this).field_r = ad.a((byte) 87, param1);
    }

    final void a(boolean param0, up param1) {
        ((fra) this).field_r = param1;
        if (!param0) {
            field_q = null;
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            return 23;
        }
        return param0;
    }

    public static void b(int param0) {
        field_q = null;
        field_n = null;
        if (param0 != -27203) {
            field_q = null;
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        ((fra) this).field_r.a(param1, (byte) 125);
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
        ((fra) this).field_r.a((gma) (Object) ((fra) this).e(6), 2348);
        param1.b((byte) -103, 8);
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((fra) this).a(false);
            return 0;
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1.0f;
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
