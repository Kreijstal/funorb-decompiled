/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fm {
    private String field_h;
    static int field_g;
    static String field_l;
    static ud field_n;
    private String field_m;
    static ck[][][] field_j;
    static boolean field_k;
    static nk field_i;

    final static jg b(byte param0) {
        int var1 = 82 % ((param0 - -59) / 56);
        return new jg(f.a(116), em.b((byte) -126));
    }

    final void a(wl param0, byte param1) {
        param0.b(8, ((ob) this).field_m);
        if (param1 < 34) {
            ve discarded$0 = ob.a(-10, 21);
        }
        param0.a(((ob) this).field_h, true);
    }

    final static ve a(int param0, int param1) {
        if (param1 != 8) {
            field_l = null;
        }
        return (ve) (Object) (tg.field_b != null ? tg.field_b.a(param1 ^ 24718, (long)param0) : null);
    }

    final static ck[] a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        ck[] var7 = new ck[9];
        ck[] var4 = var7;
        var7[0] = sm.a((byte) -99, param3, param0);
        for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
        }
        if (param2 != -3932) {
            ob.a((byte) 72);
        }
        var4[4] = sm.a((byte) -122, 64, param1);
        return var4;
    }

    final gh a(int param0) {
        if (param0 != 18) {
            return null;
        }
        return pb.field_i;
    }

    final static void a(int param0, ui param1, byte param2) {
        int var4 = client.field_A ? 1 : 0;
        if (rc.field_d == param1) {
            wj.field_Ob.c(param0);
        } else {
            if (rc.field_d != null) {
                // ifnull L57
                wj.field_Ob.a(param1, 0, 0, 16);
                rc.field_d = param1;
                wj.field_Ob.c(param0);
            } else {
                nn.a(param0, param1, true);
            }
        }
        if (param2 < 45) {
            field_g = 64;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_l = null;
        if (param0 < 86) {
            ck[] discarded$0 = ob.a(-105, -21, 61, -11);
        }
        field_n = null;
    }

    final static void b(int param0, int param1, int param2, int param3) {
        if (256 == param2) {
            pg.field_e.f(param0, param3, 64);
        } else {
            pg.field_e.f(param0, param3, param2 >> -299374302);
        }
        if (param1 != -299374302) {
            ob.a((byte) 0);
        }
    }

    ob(String param0, String param1) {
        ((ob) this).field_m = param0;
        ((ob) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Message game";
        field_j = new ck[8][7][16];
    }
}
