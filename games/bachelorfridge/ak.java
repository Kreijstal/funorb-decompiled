/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends bca {
    static int field_u;
    int field_s;
    int field_r;
    static sga field_q;
    static String field_t;

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((ak) this).a((op) null, -84);
          return (at) (Object) new pw(param1, (ak) this);
        } else {
          return (at) (Object) new pw(param1, (ak) this);
        }
    }

    final static boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1375) {
          L0: {
            field_t = null;
            if (null == lna.field_C) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == lna.field_C) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ak(lu param0) {
        super(param0);
        ((ak) this).field_k = param0.e((byte) 59);
        ((ak) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((ak) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((ak) this).field_r = param0.b(16711935);
        ((ak) this).field_s = param0.b(16711935);
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -27, param1);
        param1.d(((ak) this).field_r, 0);
        if (param0 > -12) {
          field_q = null;
          param1.d(((ak) this).field_s, 0);
          return;
        } else {
          param1.d(((ak) this).field_s, 0);
          return;
        }
    }

    ak(int param0, nq param1) {
        super(param0, param1);
    }

    public static void d(byte param0) {
        if (param0 < 26) {
            boolean discarded$0 = ak.e(29);
            field_t = null;
            field_q = null;
            return;
        }
        field_t = null;
        field_q = null;
    }

    final void a(op param0, int param1) {
        int var3 = 22 / ((param1 - 12) / 35);
        ((ak) this).a(param0, (byte) -2);
        param0.a(0, ((ak) this).field_r, ((ak) this).field_s, true, ((ak) this).d(1), 27);
    }

    final int[][] d(int param0) {
        int[][] var7 = new int[17][17];
        int[][] var6 = var7;
        int[][] var5 = var6;
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var7[6][7] = 1;
        var7[5][8] = 1;
        var7[6][9] = 1;
        var7[7][6] = 1;
        var7[6][8] = 1;
        var7[7][7] = 1;
        var7[7][8] = 1;
        var7[8][6] = 1;
        var7[8][5] = 1;
        var7[8][7] = 1;
        var7[7][9] = 1;
        var7[7][10] = 1;
        var7[8][10] = 1;
        var7[8][9] = 1;
        var7[9][7] = 1;
        var7[9][6] = 1;
        var7[8][11] = 1;
        var7[8][8] = 1;
        var7[9][10] = 1;
        var7[10][7] = 1;
        var7[9][9] = param0;
        var7[9][8] = 1;
        var7[10][9] = 1;
        var7[10][8] = 1;
        var7[11][8] = 1;
        return var2;
    }

    static {
    }
}
