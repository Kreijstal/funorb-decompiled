/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends bca {
    int[] field_q;
    int field_r;
    int field_s;

    j(lu param0) {
        super(param0);
        int var3 = 0;
        ((j) this).field_k = param0.e((byte) 85);
        ((j) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((j) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((j) this).field_r = param0.b(16711935);
        ((j) this).field_s = param0.b(16711935);
        ((j) this).field_q = new int[((j) this).field_o.g(0)];
        for (var3 = 0; ((j) this).field_q.length > var3; var3++) {
            ((j) this).field_q[var3] = param0.b(16711935);
        }
    }

    final void a(byte param0, lu param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = BachelorFridge.field_y;
        this.a((byte) -63, param1);
        param1.d(((j) this).field_r, 0);
        param1.d(((j) this).field_s, 0);
        var7 = ((j) this).field_q;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            if (param0 > -12) {
              ((j) this).field_q = null;
              return;
            } else {
              return;
            }
          } else {
            var5 = var7[var4];
            param1.d(var5, 0);
            var4++;
            continue L0;
          }
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new cma(param1, (j) this);
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          param4 = param4 - (lo.field_b.a(param0) >> -82147903);
          if (param5) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ce.a(stackIn_3_0 != 0, param2, param1, param0, param4, param3);
        if (param5) {
          return;
        } else {
          return;
        }
    }

    final int[][] a(int param0, int param1, op param2, aga param3) {
        int[][] var11 = new int[17][17];
        int[][] var10 = var11;
        int[][] var9 = var10;
        int[][] var8 = var9;
        int[][] var7 = var8;
        int[][] var5 = var7;
        var11[6][7] = 1;
        var11[5][8] = 1;
        var11[7][7] = 1;
        int var6 = 117 / ((55 - param1) / 46);
        var11[7][6] = 1;
        var11[6][9] = 1;
        var11[6][8] = 1;
        var11[7][10] = 1;
        var11[8][6] = 1;
        var11[7][8] = 1;
        var11[7][9] = 1;
        var11[8][7] = 1;
        var11[8][5] = 1;
        var11[8][9] = 1;
        var11[9][6] = 1;
        var11[8][11] = 1;
        var11[8][8] = 1;
        var11[8][10] = 1;
        var11[9][7] = 1;
        var11[9][8] = 1;
        var11[10][7] = 1;
        var11[9][9] = 1;
        var11[9][10] = 1;
        var11[10][9] = 1;
        var11[10][8] = 1;
        var11[11][8] = 1;
        return var5;
    }

    j(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        aga var3 = null;
        int var4 = 0;
        int var5 = 0;
        pp var6 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var3 = ((j) this).field_l.a(8, param0);
        var5 = 0 / ((12 - param1) / 35);
        var4 = 0;
        var6 = (pp) (Object) ((j) this).field_o.b((byte) 90);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (!(var6 instanceof iv)) {
                var6.a(var3, param0, 12);
                break L1;
              } else {
                ((iv) (Object) var6).a((byte) -67, var3, param0, ((j) this).field_q[var4]);
                break L1;
              }
            }
            var6 = (pp) (Object) ((j) this).field_o.c(0);
            var4++;
            continue L0;
          }
        }
    }

    static {
    }
}
