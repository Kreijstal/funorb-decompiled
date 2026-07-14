/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ct extends bca {
    static String field_s;
    static String field_r;
    static int field_q;

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            ct.c(-33, 53);
            return (at) (Object) new gq(param1, (ct) this);
        }
        return (at) (Object) new gq(param1, (ct) this);
    }

    final static void c(boolean param0) {
        if (!param0) {
            field_s = null;
            fd.field_z = new eaa();
            return;
        }
        fd.field_z = new eaa();
    }

    final static void c(int param0, int param1) {
        kr.field_vb = param0;
        if (param1 > -112) {
            ct.c(-123, 40);
        }
    }

    public static void d(byte param0) {
        field_s = null;
        field_r = null;
        if (param0 > -66) {
            field_q = -88;
        }
    }

    ct(lu param0) {
        super(param0);
        ((ct) this).field_k = param0.e((byte) 71);
        ((ct) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((ct) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -41, param1);
        if (param0 >= -12) {
            field_q = 10;
        }
    }

    final void a(op param0, int param1) {
        int var3 = -99 % ((12 - param1) / 35);
        ((ct) this).a(param0, (byte) -2);
    }

    ct(int param0, nq param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Open";
        field_r = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
