/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends oh {
    static String field_s;
    int field_l;
    fs field_w;
    ln field_p;
    pf field_v;
    fs field_i;
    static qr field_u;
    int field_n;
    static String[] field_x;
    int[] field_j;
    static in field_q;
    int[] field_k;
    static int field_o;
    sd field_m;
    fs[] field_h;
    static int field_t;
    static String field_r;

    final static fb a(int param0, int param1) {
        if (param1 != 30888) {
            return null;
        }
        return (fb) (Object) (ea.field_b == null ? null : ea.field_b.a(65280, (long)param0));
    }

    public static void a(int param0) {
        field_q = null;
        field_u = null;
        if (param0 <= 5) {
            field_s = null;
        }
        field_r = null;
        field_x = null;
        field_s = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((eg) this).field_n = ((eg) this).field_n + param0;
        ((eg) this).field_v.a((byte) -113, (oh) (Object) new ne(((eg) this).field_w, param1, param0, param2));
        int var5 = -83 / ((48 - param3) / 45);
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 14775) {
            field_r = null;
        }
        ((eg) this).field_n = ((eg) this).field_n + param2;
        ((eg) this).field_v.a((byte) -113, (oh) (Object) new ne(((eg) this).field_w, param0, param2, 0));
    }

    final static void a(int param0, wj param1, boolean param2) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        sl var7 = js.field_f;
        sl var8 = var7;
        var8.h(param0, 255);
        var8.field_j = var8.field_j + 1;
        int var4 = var8.field_j;
        var8.c(1, (byte) -86);
        var8.d(param1.field_h, 255);
        var8.d(param1.field_m, 255);
        var8.d(param1.field_j, 255);
        var8.e(11135, param1.field_q);
        var8.e(11135, param1.field_o);
        var8.e(11135, param1.field_p);
        var8.e(11135, param1.field_l);
        var8.c(param1.field_i.length, (byte) -104);
        if (!param2) {
            return;
        }
        for (var5 = 0; var5 < param1.field_i.length; var5++) {
            var7.e(11135, param1.field_i[var5]);
        }
        int discarded$0 = var8.a(var4, -24);
        var8.b(-var4 + var8.field_j, (byte) 127);
    }

    final static boolean a(byte param0) {
        if (param0 < 73) {
            eg.b(44, -8, 127);
        }
        return null != ck.field_a ? true : false;
    }

    final static tq c(int param0, int param1) {
        tq var2 = new tq(param0, false);
        if (param1 != 0) {
            field_u = null;
        }
        return var2;
    }

    final void a(byte param0, int[] param1) {
        if (param0 <= 35) {
            ((eg) this).field_j = null;
        }
        ((eg) this).field_k = param1;
    }

    final void a(int param0, int param1, mg param2, int param3) {
        ((eg) this).field_v.a((byte) -113, (oh) (Object) new ne(param2, param3, param0));
        ((eg) this).field_n = ((eg) this).field_n + param3;
        if (param1 != 0) {
            ((eg) this).field_w = null;
        }
    }

    eg(ln param0, fs[] param1, int[] param2) {
        ((eg) this).field_h = param1;
        ((eg) this).field_p = param0;
        ((eg) this).field_j = (int[]) param2.clone();
        ((eg) this).field_w = ((eg) this).field_p.field_y;
        ((eg) this).field_v = new pf();
        ((eg) this).field_n = 0;
    }

    final static void b(int param0, int param1, int param2) {
        cn.field_w = param0;
        if (param2 != 0) {
            field_u = null;
        }
        dm.field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Try changing the following settings:  ";
        field_x = new String[]{"<%0> Souls", "<%0> Ships", "<%0> Suns", "the <%0> Moon", "<%0> Peace", "the <%0> War", "<%0> Stars", "the <%0> People", "the <%0> Lights", "the <%0> Gate", "<%0> Empires", "<%0> Worlds", "<%0> Shadow", "<%0> Thunder", "the <%0> Storm", "<%0> Night", "<%0> Triumphs", "<%0> Steel", "<%0> Dreams"};
        field_r = "Players: <%0>/<%1>";
    }
}
