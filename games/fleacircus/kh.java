/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    char[][] field_c;
    byte field_e;
    static mk field_a;
    byte field_f;
    static int field_d;
    static int field_g;
    static int field_b;

    final static Object a(boolean param0, byte[] param1, int param2) {
        qe var3 = null;
        if (param1 == null) {
            return null;
        }
        if (!((param1.length ^ -1) >= param2)) {
            var3 = new qe();
            ((hd) (Object) var3).a(param2 + 13, param1);
            return (Object) (Object) var3;
        }
        if (param0) {
            return (Object) (Object) rl.a(1, param1);
        }
        return (Object) (Object) param1;
    }

    public static void a(byte param0) {
        if (param0 > -34) {
            return;
        }
        field_a = null;
    }

    kh(byte[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 3;
        ((kh) this).field_f = param0[1];
        ((kh) this).field_e = param0[2];
        ((kh) this).field_c = new char[40][21];
        for (var3 = 0; -41 < (var3 ^ -1); var3++) {
            for (var4 = 0; (var4 ^ -1) > -22; var4++) {
                ((kh) this).field_c[var3][var4] = (char)param0[var2];
                var2++;
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (rl.field_e != null) {
            // if_icmplt L17
        } else {
            rl.field_e = new int[param1 * 2];
        }
        if (null != jl.field_b) {
            // if_icmpgt L43
        } else {
            jl.field_b = new int[param1 * 2];
        }
        if (null != kk.field_b) {
            // if_icmple L80
        }
        kk.field_b = new int[param1 * 2];
        if (hg.field_q != null) {
            // if_icmple L108
        }
        hg.field_q = new int[param1 * 2];
        if (vh.field_i != null) {
            // if_icmpge L136
        }
        vh.field_i = new int[2 * param1];
        if (null != uj.field_a) {
            // if_icmplt L154
        } else {
            uj.field_a = new int[2 * param1];
        }
        if (param2 != 26721) {
            kh.a(-42, -43, 83);
        }
        if (mh.field_y != null) {
            // if_icmpgt L200
        } else {
            mh.field_y = new int[(param1 + param0) * 2];
        }
        if (null != se.field_d) {
            // if_icmpge L239
        }
        se.field_d = new boolean[param1 * 2];
        lc.field_u = -2147483648;
        ok.field_L = -2147483648;
        ak.field_f = 2147483647;
        ea.field_a = 2147483647;
        qh.field_D = 0;
    }

    static {
    }
}
