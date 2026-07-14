/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bea extends bca {
    int field_t;
    int field_q;
    static int field_v;
    int[][] field_r;
    static String field_s;
    static sna field_u;

    bea(lu param0) {
        super(param0);
        int var4 = 0;
        ((bea) this).field_k = param0.e((byte) 82);
        ((bea) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((bea) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((bea) this).field_q = param0.b(16711935);
        ((bea) this).field_t = param0.b(16711935);
        int var3 = param0.b(16711935);
        ((bea) this).field_r = new int[var3][2];
        for (var4 = 0; var4 < var3; var4++) {
            ((bea) this).field_r[var4] = new int[2];
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            bea.d(false);
            return (at) (Object) new lma(param1, (bea) this);
        }
        return (at) (Object) new lma(param1, (bea) this);
    }

    final void a(byte param0, lu param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        this.a((byte) -126, param1);
        param1.d(((bea) this).field_q, 0);
        param1.d(((bea) this).field_t, 0);
        param1.d(((bea) this).field_r.length, 0);
        if (param0 >= -12) {
            field_v = 101;
            for (var3 = 0; var3 < ((bea) this).field_r.length; var3++) {
                param1.d(((bea) this).field_r[var3][0], 0);
                param1.d(((bea) this).field_r[var3][1], 0);
            }
            return;
        }
        for (var3 = 0; var3 < ((bea) this).field_r.length; var3++) {
            param1.d(((bea) this).field_r[var3][0], 0);
            param1.d(((bea) this).field_r[var3][1], 0);
        }
    }

    final static pp a(int param0, lu param1) {
        if (param0 != -1547040176) {
            field_v = -45;
            return (pp) (Object) new ic();
        }
        return (pp) (Object) new ic();
    }

    final int[][] c(boolean param0) {
        int[][] var2 = null;
        int[][] var3 = null;
        int[][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[][] var7 = null;
        var7 = new int[17][17];
        var6 = var7;
        var5 = var6;
        var4 = var5;
        var3 = var4;
        var2 = var3;
        var7[6][7] = 1;
        var7[5][8] = 1;
        var7[6][8] = 1;
        var7[7][7] = 1;
        var7[6][9] = 1;
        var7[7][6] = 1;
        var7[8][5] = 1;
        var7[7][8] = 1;
        var7[7][9] = 1;
        var7[7][10] = 1;
        var7[8][7] = 1;
        var7[8][6] = 1;
        var7[8][10] = 1;
        var7[8][11] = 1;
        var7[8][9] = 1;
        var7[9][6] = 1;
        var7[9][7] = 1;
        var7[8][8] = 1;
        var7[10][7] = 1;
        var7[9][8] = 1;
        var7[9][10] = 1;
        var7[9][9] = 1;
        var7[10][8] = 1;
        if (!param0) {
          var7[10][9] = 1;
          var7[11][8] = 1;
          return var2;
        } else {
          field_u = null;
          var7[10][9] = 1;
          var7[11][8] = 1;
          return var2;
        }
    }

    final static void e(int param0) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (param0 <= 83) {
            return;
        }
        ada.field_p.d(0, 0);
        gla.field_j.c(137, 0);
        ml.field_a.d(127, 0);
        vj.field_p.e(154, 17);
        int var1 = 249;
        int var2 = 10;
        int var3 = -var1 + 640 >> 1531348769;
        int var4 = 300;
        em.field_S.e(-8 + var3, -9 + var4);
        int var5 = (int)(fla.field_r * (float)var1 / 100.0f);
        for (var6 = 0; var5 > var6; var6++) {
            var7 = 74 + var6 * 177 / (-1 + var1);
            var8 = var6 * 155 / (-1 + var1) + 59;
            dg.f(var3 + var6, var4, var2, var7 << -1547040176 | var8 << -40183320);
        }
        if (jga.field_v != null) {
            jha.field_g.a(jga.field_v, 320, var4 + -20, 3826700, -1);
            return;
        }
    }

    final static void d(int param0) {
        jm.field_g.setLength(0);
        gk.field_d = 0;
        if (param0 > -100) {
            bea.e(110);
        }
    }

    bea(int param0, nq param1) {
        super(param0, param1);
        ((bea) this).field_r = new int[12][2];
    }

    final void a(op param0, int param1) {
        ((bea) this).a(param0, (byte) -2);
        param0.a(((bea) this).field_r, (byte) 25, ((bea) this).field_r.length, 37, ((bea) this).field_q, ((bea) this).field_t);
        int var3 = -52 / ((param1 - 12) / 35);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, String param11, String param12) {
        ur.field_e[pe.field_m] = (oha) (Object) new hd(param5, param9, param10, param11, param12, param4, param2, param8, param7, param0, param3, param1);
        int var13 = -79 % ((0 - param6) / 43);
        pe.field_m = pe.field_m + 1;
    }

    public static void d(boolean param0) {
        field_s = null;
        if (!param0) {
            field_s = null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 4;
        field_s = "Spectate <%0>'s game";
    }
}
