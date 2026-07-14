/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ima extends bca {
    int field_q;
    static int field_s;
    static int field_r;
    int field_t;

    final void a(byte param0, lu param1) {
        Object var4 = null;
        this.a((byte) -38, param1);
        param1.d(((ima) this).field_q, 0);
        if (param0 > -12) {
          var4 = null;
          at discarded$2 = ((ima) this).a(-92, (gj) null);
          param1.d(((ima) this).field_t, 0);
          return;
        } else {
          param1.d(((ima) this).field_t, 0);
          return;
        }
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((ima) this).a((byte) -31, (lu) null);
          return (at) (Object) new ln(param1, (ima) this);
        } else {
          return (at) (Object) new ln(param1, (ima) this);
        }
    }

    ima(int param0, nq param1) {
        super(param0, param1);
    }

    final static jna a(lu param0, boolean param1) {
        if (!param1) {
            return null;
        }
        jna var2 = new jna();
        var2.a(-115, param0);
        return var2;
    }

    ima(lu param0) {
        super(param0);
        ((ima) this).field_k = param0.e((byte) 76);
        ((ima) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((ima) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((ima) this).field_q = param0.b(16711935);
        ((ima) this).field_t = param0.b(16711935);
    }

    final void a(op param0, int param1) {
        ((ima) this).a(param0, (byte) -2);
        int var3 = -3 / ((param1 - 12) / 35);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 9;
    }
}
