/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ica extends bca {
    static int[][] field_r;
    int field_s;
    static kv field_t;
    int field_q;

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new aw(param1, (ica) this);
    }

    final void a(op param0, int param1) {
        int var3 = -26 % ((param1 - 12) / 35);
        ((ica) this).a(param0, (byte) -2);
    }

    ica(int param0, nq param1) {
        super(param0, param1);
    }

    public static void d(byte param0) {
        field_t = null;
        field_r = null;
        if (param0 > -98) {
            field_t = null;
        }
    }

    ica(lu param0) {
        super(param0);
        ((ica) this).field_k = param0.e((byte) 117);
        ((ica) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((ica) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((ica) this).field_s = param0.b(16711935);
        ((ica) this).field_q = param0.b(16711935);
    }

    final int[][] a(op param0, int param1, int param2, aga param3) {
        int[][] var5 = null;
        Object var6 = null;
        int[][] var7 = null;
        int[][] var8 = null;
        int[][] var9 = null;
        int[][] var10 = null;
        int[][] var11 = null;
        var11 = new int[17][17];
        var10 = var11;
        var9 = var10;
        var8 = var9;
        var7 = var8;
        var5 = var7;
        if (param2 >= -35) {
          var6 = null;
          at discarded$1 = ((ica) this).a(-18, (gj) null);
          var11[6][7] = 1;
          var11[5][8] = 1;
          var11[6][9] = 1;
          var11[7][6] = 1;
          var11[7][7] = 1;
          var11[6][8] = 1;
          var11[7][10] = 1;
          var11[7][9] = 1;
          var11[8][7] = 1;
          var11[8][5] = 1;
          var11[8][6] = 1;
          var11[7][8] = 1;
          var11[8][11] = 1;
          var11[9][6] = 1;
          var11[8][9] = 1;
          var11[8][10] = 1;
          var11[8][8] = 1;
          var11[9][7] = 1;
          var11[9][8] = 1;
          var11[9][9] = 1;
          var11[9][10] = 1;
          var11[10][7] = 1;
          var11[10][9] = 1;
          var11[10][8] = 1;
          var11[11][8] = 1;
          return var5;
        } else {
          var11[6][7] = 1;
          var11[5][8] = 1;
          var11[6][9] = 1;
          var11[7][6] = 1;
          var11[7][7] = 1;
          var11[6][8] = 1;
          var11[7][10] = 1;
          var11[7][9] = 1;
          var11[8][7] = 1;
          var11[8][5] = 1;
          var11[8][6] = 1;
          var11[7][8] = 1;
          var11[8][11] = 1;
          var11[9][6] = 1;
          var11[8][9] = 1;
          var11[8][10] = 1;
          var11[8][8] = 1;
          var11[9][7] = 1;
          var11[9][8] = 1;
          var11[9][9] = 1;
          var11[9][10] = 1;
          var11[10][7] = 1;
          var11[10][9] = 1;
          var11[10][8] = 1;
          var11[11][8] = 1;
          return var5;
        }
    }

    final void a(byte param0, lu param1) {
        Object var4 = null;
        this.a((byte) -106, param1);
        if (param0 > -12) {
          var4 = null;
          at discarded$2 = ((ica) this).a(106, (gj) null);
          param1.d(((ica) this).field_s, 0);
          param1.d(((ica) this).field_q, 0);
          return;
        } else {
          param1.d(((ica) this).field_s, 0);
          param1.d(((ica) this).field_q, 0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
