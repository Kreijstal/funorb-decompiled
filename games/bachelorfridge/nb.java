/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends bca {
    static int field_r;
    static String field_q;

    final void a(op param0, int param1) {
        ((nb) this).a(param0, (byte) -2);
        int var3 = -50 % ((12 - param1) / 35);
    }

    nb(int param0, nq param1) {
        super(param0, param1);
    }

    nb(lu param0) {
        super(param0);
        ((nb) this).field_k = param0.e((byte) 123);
        ((nb) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((nb) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    public static void d(int param0) {
        if (param0 >= -64) {
            field_q = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            nb.d(36);
            return (at) (Object) new eja(param1, (nb) this);
        }
        return (at) (Object) new eja(param1, (nb) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 20;
    }
}
