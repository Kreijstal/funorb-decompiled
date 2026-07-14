/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends bca {
    static sna field_v;
    static jfa field_s;
    static String field_t;
    static byte[][] field_q;
    int field_r;
    static int field_u;

    final void a(byte param0, lu param1) {
        this.a((byte) -98, param1);
        param1.d(((rn) this).field_r, 0);
        if (param0 > -12) {
            field_s = null;
        }
    }

    rn(int param0, nq param1, int param2) {
        super(param0, param1);
        ((rn) this).field_r = param2;
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          at discarded$2 = ((rn) this).a(-73, (gj) null);
          return (at) (Object) new baa(param1, (rn) this);
        } else {
          return (at) (Object) new baa(param1, (rn) this);
        }
    }

    final static int c(int param0, int param1) {
        int var2 = param1 * (param1 * param1 >> -721907988) >> -2102257876;
        int var3 = -61440 + 6 * param1;
        int var4 = param0 - -(param1 * var3 >> 992823852);
        return var2 * var4 >> 1541923884;
    }

    public static void d(int param0) {
        field_v = null;
        if (param0 < 83) {
            return;
        }
        field_t = null;
        field_s = null;
        field_q = null;
    }

    final void a(op param0, int param1) {
        int var3 = -54 % ((param1 - 12) / 35);
        ((rn) this).a(param0, (byte) -2);
    }

    rn(lu param0) {
        super(param0);
        ((rn) this).field_k = param0.e((byte) 50);
        ((rn) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((rn) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((rn) this).field_r = param0.b(16711935);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Congratulations, You have been awarded £5 to spend on more food in the shop. Click Continue to return to your fridge.";
        field_q = new byte[250][];
    }
}
