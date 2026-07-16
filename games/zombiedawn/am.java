/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends de {
    private uo field_l;
    private int field_n;
    static String field_m;

    final void a(int param0, int[] param1) {
        ((am) this).field_l = new uo(param1);
        int var3 = 35 % ((-7 - param0) / 53);
    }

    final int i(byte param0) {
        if (param0 <= 122) {
            return 95;
        }
        int fieldTemp$0 = ((am) this).field_j;
        ((am) this).field_j = ((am) this).field_j + 1;
        return ((am) this).field_h[fieldTemp$0] + -((am) this).field_l.a(92) & 255;
    }

    final void h(byte param0) {
        if (param0 != 75) {
            ((am) this).i(13);
        }
        ((am) this).field_n = ((am) this).field_j * 8;
    }

    final void i(int param0) {
        ((am) this).field_j = (7 + ((am) this).field_n) / param0;
    }

    final static void k(int param0) {
        if (ej.field_x != 0 + -mj.field_b) {
            if (ej.field_x == -mj.field_b + 250) {
            }
        }
        if (param0 != -21215) {
            return;
        }
        ej.field_x = ej.field_x + 1;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        int var2 = param0.length();
        if (param1 != 1) {
            return null;
        }
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[var2 - (1 + var4)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        for (var5 = param3; param0 > var5; var5++) {
            int fieldTemp$0 = ((am) this).field_j;
            ((am) this).field_j = ((am) this).field_j + 1;
            param1[var5 - -param2] = (byte)(((am) this).field_h[fieldTemp$0] + -((am) this).field_l.a(96));
        }
    }

    am(int param0) {
        super(param0);
    }

    final int k(int param0, int param1) {
        int var6 = ZombieDawn.field_J;
        int var3 = ((am) this).field_n >> 1216666883;
        int var4 = 8 + -(7 & ((am) this).field_n);
        int var5 = 0;
        ((am) this).field_n = ((am) this).field_n + param1;
        if (param0 < 10) {
            field_m = null;
        }
        while (param1 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((am) this).field_h[incrementValue$0] & jd.field_e[var4]) << param1 + -var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (((am) this).field_h[var3] >> var4 + -param1 & jd.field_e[param1]);
        } else {
            var5 = var5 + (jd.field_e[var4] & ((am) this).field_h[var3]);
        }
        return var5;
    }

    am(byte[] param0) {
        super(param0);
    }

    public static void j(int param0) {
        int var1 = -108 % ((-29 - param0) / 56);
        field_m = null;
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = ((am) this).field_j;
        ((am) this).field_j = ((am) this).field_j + 1;
        ((am) this).field_h[fieldTemp$0] = (byte)(param1 + ((am) this).field_l.a(124));
        if (param0 != 11) {
            ((am) this).field_n = -62;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        if (11 == fl.field_a) {
            qo.c(29756);
        }
        qh.a(mm.field_k, ka.field_a, (byte) -92, ma.field_p);
        uh.a(-113, 0, 0, param0);
        if (param1 > -79) {
            Object var3 = null;
            String discarded$0 = am.a((String) null, 84);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Unpacking sound effects";
    }
}
