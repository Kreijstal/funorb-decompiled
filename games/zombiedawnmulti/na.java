/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends rg {
    static ri field_I;
    static String field_F;
    int field_E;
    static ja[] field_G;
    static int[][] field_J;
    static int[] field_K;
    static ri[][] field_H;

    na(cf param0) {
        super(param0.field_y, param0.field_i, param0.field_n, param0.field_w, (nl) null, (bj) null);
        param0.b(0, 0, 28972, ((na) this).field_n, ((na) this).field_w);
        ((na) this).field_E = 256;
        ((na) this).field_B = param0;
    }

    public static void g(byte param0) {
        field_K = null;
        field_H = null;
        field_F = null;
        field_G = null;
        field_I = null;
        if (param0 >= -59) {
            return;
        }
        field_J = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (param2 ^ -1)) {
            return;
        }
        if (!(((na) this).field_B != null)) {
            return;
        }
        if (((na) this).field_E == 0) {
            return;
        }
        if ((((na) this).field_E ^ -1) == -257) {
            ((na) this).field_B.a(-2, param1 + ((na) this).field_i, param2, param3 - -((na) this).field_y);
            return;
        }
        ja var6 = new ja(((na) this).field_B.field_n, ((na) this).field_B.field_w);
        r.a(0, var6);
        if (param0 != -2) {
            field_G = null;
        }
        ((na) this).field_B.a(param0 + 0, 0, param2, 0);
        ql.a(true);
        var6.c(param3 - -((na) this).field_y, param1 + ((na) this).field_i, ((na) this).field_E);
    }

    public na() {
        super(0, 0, 0, 0, (nl) null, (bj) null);
        ((na) this).field_E = 256;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (qj.field_p) {
            // ifeq L24
            // if_icmpge L24
        } else {
            return false;
        }
        int var3 = (400 - se.field_E >> -1753618463) + 10;
        int var4 = 20 + se.field_E + param1;
        int var5 = 40;
        if (param0 > var3) {
            if (var5 < param2) {
                if (param0 < var3 + var4) {
                    if (var5 + hj.field_g > param2) {
                        iq.a(-14, (byte) 99);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final static void a(byte param0, fh param1) {
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int[][] var6 = param1.field_i.field_k;
        int[][] var2 = var6;
        dq.field_j = new int[var6.length][var6[0].length];
        int var3 = 0;
        if (param0 <= 124) {
            field_J = null;
        }
        while (var3 < var2.length) {
            for (var4 = 0; var4 < var2[0].length; var4++) {
                dq.field_j[var3][var4] = 0 == tq.b(1, var2[var3][var4]) ? -1 : 0;
            }
            var3++;
        }
    }

    final static boolean a(int[] param0, byte param1, String param2, long param3, int param4) {
        if (param1 > -35) {
            boolean discarded$0 = na.b(-55, -5, 10);
        }
        if (!tn.a(param2, param3, (byte) -91, param4, param0)) {
            return false;
        }
        if (1 == param4) {
            param4 = 0;
        }
        qf.field_g = param2;
        va.field_a = param4;
        CharSequence var7 = (CharSequence) (Object) param2;
        ql.field_a = tg.a(var7, false);
        jj.field_M = param3;
        ld var6 = id.a(kb.field_x, bb.field_k, (byte) -65, param0, tg.field_d);
        wi.a((byte) 4, var6);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Confuse clueless humans with smoke and mirrors...";
        field_H = new ri[1][];
    }
}
