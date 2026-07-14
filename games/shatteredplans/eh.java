/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends ek implements bp {
    static bi[] field_L;
    static int field_C;
    private wd field_J;
    static String field_N;
    private kg field_M;
    static String[] field_I;
    static boolean field_P;
    static int field_Q;

    final void a(int param0, int param1, vg param2, byte param3) {
        super.a(param0, param1, param2, param3);
        ((eh) this).field_M.field_y = ((eh) this).field_J.a((byte) 127).c(100) == p.field_g ? true : false;
    }

    final static hb a(int param0, el param1) {
        if (param0 != 25) {
            field_N = null;
            return (hb) (Object) new pd(param1);
        }
        return (hb) (Object) new pd(param1);
    }

    public static void i(int param0) {
        field_N = null;
        field_I = null;
        field_L = null;
        int var1 = -111 / ((param0 - -43) / 42);
    }

    final void h(int param0) {
        int var2 = 250;
        ((eh) this).field_J.a(((eh) this).field_n + 20 - 25 >> -682304991, 25, (byte) 118, -var2 + ((eh) this).field_x >> 156642689, 140);
        ((eh) this).field_M.a((((eh) this).field_n + -10 >> -794103839) - -2, 30, (byte) 103, 140 + ((((eh) this).field_x - var2 >> 2005975585) + 10), 100);
        int var3 = -95 / ((param0 - -31) / 62);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        mf.field_x.d(kr.field_c, ((eh) this).field_m + (param3 + 4), ((eh) this).field_q + (param2 + (mf.field_x.field_J - -4)), 16777215, -1);
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        if (!(((eh) this).field_J.a((byte) 111).c(-123) == p.field_g)) {
            return;
        }
        vf.a(((eh) this).field_J.l(88), ((eh) this).field_J.f((byte) 96), 4, ((eh) this).field_J.d(false));
        if (param1 != 6) {
            field_Q = -62;
        }
    }

    eh(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (iq) null);
        ((eh) this).field_J = new wd((iq) (Object) new rr(10000536), va.field_j, 0, 0, 140, 25);
        ((eh) this).field_J.a(new ja(), -70);
        ((eh) this).field_M = new kg(gq.field_b, (ko) this);
        ((eh) this).field_B = new vg[]{(vg) (Object) ((eh) this).field_J, (vg) (Object) ((eh) this).field_M};
        ((eh) this).field_M.field_p = (iq) (Object) new qp();
        ((eh) this).d((byte) -118);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "<%0> has lost connection.";
        field_I = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th"};
        field_P = true;
    }
}
