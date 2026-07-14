/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt extends bca {
    static kv[] field_r;
    static int field_s;
    static String field_q;

    bt(lu param0) {
        super(param0);
        ((bt) this).field_k = param0.e((byte) 77);
        ((bt) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((bt) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != -17811) {
            field_s = -49;
        }
    }

    final void a(op param0, int param1) {
        int var3 = -47 / ((12 - param1) / 35);
        ((bt) this).a(param0, (byte) -2);
    }

    bt(int param0, nq param1) {
        super(param0, param1);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new gp(param1, (bt) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 1;
        field_q = "Unable to add name - system busy";
    }
}
