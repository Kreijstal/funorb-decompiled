/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends bca {
    ir(lu param0) {
        super(param0);
        ((ir) this).field_k = param0.e((byte) 123);
        ((ir) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((ir) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final int[][] d(int param0) {
        int[][] var7 = new int[17][17];
        int[][] var6 = var7;
        int[][] var5 = var6;
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var7[5][8] = 1;
        var7[6][7] = 1;
        var7[6][9] = 1;
        var7[7][6] = 1;
        var7[7][7] = 1;
        var7[6][8] = 1;
        var7[7][8] = 1;
        var7[8][6] = 1;
        var7[8][5] = 1;
        var7[7][10] = 1;
        var7[7][9] = 1;
        var7[8][7] = 1;
        var7[8][10] = 1;
        var7[9][8] = 1;
        var7[9][7] = 1;
        var7[8][11] = 1;
        var7[param0][6] = 1;
        var7[8][9] = 1;
        var7[10][8] = 1;
        var7[9][9] = 1;
        var7[10][7] = 1;
        var7[9][10] = 1;
        var7[11][8] = 1;
        var7[10][9] = 1;
        return var2;
    }

    final void a(op param0, int param1) {
        ((ir) this).a(param0, (byte) -2);
        int var3 = -97 / ((param1 - 12) / 35);
    }

    ir(int param0, nq param1) {
        super(param0, param1);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new vh(param1, (ir) this);
    }

    static {
    }
}
