/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends bca {
    static String field_v;
    int field_t;
    int field_q;
    static du field_u;
    static sna field_r;
    static char[] field_s;

    uj(lu param0) {
        super(param0);
        ((uj) this).field_k = param0.e((byte) 59);
        ((uj) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((uj) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((uj) this).field_q = param0.b(16711935);
        ((uj) this).field_t = param0.b(16711935);
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -108, param1);
        param1.d(((uj) this).field_q, 0);
        if (param0 > -12) {
          field_s = null;
          param1.d(((uj) this).field_t, 0);
          return;
        } else {
          param1.d(((uj) this).field_t, 0);
          return;
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        field_r = null;
        if (param0 != 20) {
            uj.d((byte) 88);
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new jba(param1, (uj) this);
    }

    final int[][] d(int param0) {
        int[][] var3 = new int[17][17];
        int[][] var2 = var3;
        var3[8][7] = 1;
        var3[7][8] = 1;
        var3[8][8] = param0;
        var3[8][9] = 1;
        var3[9][8] = 1;
        return var2;
    }

    final void a(op param0, int param1) {
        param0.a(0, ((uj) this).field_q, ((uj) this).field_t, false, ((uj) this).d(1), 28);
        int var3 = -67 / ((param1 - 12) / 35);
        ((uj) this).a(param0, (byte) -2);
    }

    uj(int param0, nq param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Ignore";
        field_u = new du(4, 1, 1, 1);
        field_s = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
