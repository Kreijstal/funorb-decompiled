/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends bca {
    static String field_q;
    int field_t;
    static du field_r;
    int field_u;
    static kv field_s;

    tl(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -76, param1);
        if (param0 > -12) {
          return;
        } else {
          param1.d(((tl) this).field_u, 0);
          param1.d(((tl) this).field_t, 0);
          return;
        }
    }

    final void a(op param0, int param1) {
        ((tl) this).a(param0, (byte) -2);
        int var3 = 10 % ((param1 - 12) / 35);
    }

    public static void d(byte param0) {
        field_q = null;
        field_s = null;
        if (param0 != -89) {
            tl.d((byte) 8);
            field_r = null;
            return;
        }
        field_r = null;
    }

    tl(lu param0) {
        super(param0);
        ((tl) this).field_k = param0.e((byte) 81);
        ((tl) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((tl) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((tl) this).field_u = param0.b(16711935);
        ((tl) this).field_t = param0.b(16711935);
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((tl) this).a((op) null, -65);
          return (at) (Object) new fv(param1, (tl) this);
        } else {
          return (at) (Object) new fv(param1, (tl) this);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Seriously offensive language";
        field_r = new du(10, 2, 2, 0);
    }
}
