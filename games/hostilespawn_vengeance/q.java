/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_k;
    static int field_d;
    static int field_h;
    static bd field_c;
    static bn field_b;
    static String field_l;
    static na field_j;
    static ql field_g;
    static String field_a;
    static int[][] field_e;
    static b field_i;
    static bd field_f;
    static String[] field_m;
    static int field_n;

    final static void b(int param0) {
        qb var1 = null;
        int var2 = HostileSpawn.field_I ? 1 : 0;
        try {
            uj.field_m.f();
            if (param0 != 14470) {
                field_l = (String) null;
            }
            eb.field_e.f();
            de.field_n = de.field_n - 1;
            if (!(de.field_n != 0)) {
                de.field_n = 200;
                var1 = (qb) ((Object) jn.field_H.g(param0 ^ -14500));
                while (var1 != null) {
                    if (!(var1.field_j.a(3000))) {
                        var1.b(param0 ^ -14511);
                    }
                    var1 = (qb) ((Object) jn.field_H.a(12684));
                }
                if (ej.field_g != null) {
                    var1 = (qb) ((Object) ej.field_g.g(-27));
                    while (var1 != null) {
                        if (!(var1.field_j.a(param0 + -11470))) {
                            var1.b(-17);
                        }
                        var1 = (qb) ((Object) ej.field_g.a(12684));
                    }
                }
            }
            if (uh.field_l != null) {
                if (uh.field_l.f(323697071)) {
                    return;
                }
                id.field_t = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "q.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_f = null;
        field_g = null;
        field_l = null;
        field_e = (int[][]) null;
        field_c = null;
        field_a = null;
        field_j = null;
        if (param0 != 50) {
          q.c(-56);
          field_i = null;
          field_b = null;
          return;
        } else {
          field_i = null;
          field_b = null;
          return;
        }
    }

    final static String c(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        if (od.field_I == ti.field_b) {
            return qi.field_G;
        }
        return fc.field_y;
    }

    static {
        jn.a(256, 50);
        field_l = "You destroyed the main reactor for this level. Activate another reactor to restore power to the lift.";
        field_i = null;
        field_a = "Find a way back to the lift.";
        field_n = 5701664;
        field_m = new String[]{"Highscores: Kerrus", "Highscores: Vengeance"};
    }
}
