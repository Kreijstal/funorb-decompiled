/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jaa extends bca {
    int field_r;
    static int field_q;
    static int[] field_u;
    int field_t;
    static int field_s;

    final void a(op param0, int param1) {
        param0.b((byte) 40, 33, ((jaa) this).field_t, ((jaa) this).field_r);
        int var3 = -24 / ((param1 - 12) / 35);
    }

    public static void d(int param0) {
        if (param0 > -88) {
            field_u = null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    jaa(int param0, nq param1, int param2, int param3) {
        super(param0, param1);
        ((jaa) this).field_r = param3;
        ((jaa) this).field_t = param2;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new cca(param1, (jaa) this);
    }

    jaa(lu param0) {
        super(param0);
        ((jaa) this).field_k = param0.e((byte) 49);
        ((jaa) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((jaa) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((jaa) this).field_t = param0.b(16711935);
        ((jaa) this).field_r = param0.b(16711935);
    }

    final void a(byte param0, lu param1) {
        if (param0 >= -12) {
          return;
        } else {
          this.a((byte) -88, param1);
          param1.d(((jaa) this).field_t, 0);
          param1.d(((jaa) this).field_r, 0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[5];
        field_s = 0;
    }
}
