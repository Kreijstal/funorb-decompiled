/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class naa extends bca {
    int field_r;
    int field_q;
    int field_t;
    aj[] field_s;
    int field_u;

    final int[][] d(int param0) {
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
        var7[5][8] = 1;
        var7[6][7] = 1;
        var7[7][7] = 1;
        var7[6][8] = 1;
        var7[6][9] = 1;
        var7[7][6] = 1;
        var7[7][9] = 1;
        var7[8][6] = 1;
        var7[7][10] = 1;
        var7[8][5] = 1;
        var7[8][7] = 1;
        var7[7][8] = 1;
        var7[9][7] = 1;
        var7[9][6] = 1;
        var7[8][8] = 1;
        var7[8][10] = 1;
        var7[8][11] = 1;
        var7[8][9] = 1;
        var7[9][8] = 1;
        var7[9][10] = 1;
        var7[9][9] = 1;
        var7[10][7] = 1;
        var7[10][9] = 1;
        if (param0 == 9268) {
          var7[10][8] = 1;
          var7[11][8] = 1;
          return var2;
        } else {
          return null;
        }
    }

    naa(int param0, nq param1) {
        super(param0, param1);
        ((naa) this).field_u = 0;
        ((naa) this).field_s = new aj[6];
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            Object var4 = null;
            ((naa) this).a((byte) 60, (lu) null);
            return (at) (Object) new jga(param1, (naa) this);
        }
        return (at) (Object) new jga(param1, (naa) this);
    }

    final void a(byte param0, lu param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        this.a((byte) -86, param1);
        if (param0 <= -12) {
          param1.d(((naa) this).field_q, 0);
          param1.d(((naa) this).field_t, 0);
          param1.d(((naa) this).field_u, 0);
          param1.d(((naa) this).field_r, 0);
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((naa) this).field_u) {
              return;
            } else {
              param1.d(((naa) this).field_s[var3].field_c, 0);
              param1.d(((naa) this).field_s[var3].field_a, 0);
              var3++;
              continue L0;
            }
          }
        } else {
          int[][] discarded$1 = ((naa) this).d(-70);
          param1.d(((naa) this).field_q, 0);
          param1.d(((naa) this).field_t, 0);
          param1.d(((naa) this).field_u, 0);
          param1.d(((naa) this).field_r, 0);
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((naa) this).field_u) {
              return;
            } else {
              param1.d(((naa) this).field_s[var3].field_c, 0);
              param1.d(((naa) this).field_s[var3].field_a, 0);
              var3++;
              continue L1;
            }
          }
        }
    }

    final void a(op param0, int param1) {
        int var3 = 0;
        aj var5 = null;
        wia var6 = null;
        int var7 = BachelorFridge.field_y;
        ((naa) this).a(param0, (byte) -2);
        param0.a(((naa) this).field_u, ((naa) this).field_s, 38, (byte) -36);
        int var4 = 60 / ((12 - param1) / 35);
        for (var3 = 0; ((naa) this).field_u > var3; var3++) {
            var5 = ((naa) this).field_s[var3];
            var6 = param0.field_a[var5.field_c][var5.field_a];
            if (!((var6.field_n ^ -1) == -39)) {
                throw new RuntimeException();
            }
            var6.field_j = var3 != ((naa) this).field_r ? 0 : 1;
        }
    }

    naa(lu param0) {
        super(param0);
        int var3 = 0;
        ((naa) this).field_k = param0.e((byte) 83);
        ((naa) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((naa) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((naa) this).field_q = param0.b(16711935);
        ((naa) this).field_t = param0.b(16711935);
        ((naa) this).field_u = param0.b(16711935);
        ((naa) this).field_r = param0.b(16711935);
        ((naa) this).field_s = new aj[((naa) this).field_u];
        for (var3 = 0; ((naa) this).field_u > var3; var3++) {
            ((naa) this).field_s[var3] = new aj(param0.b(16711935), param0.b(16711935));
        }
    }

    static {
    }
}
