/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends ab implements dn {
    static String field_t;
    private mi field_v;
    static int[] field_w;
    private mi field_x;
    private mi field_u;

    public static void a(byte param0) {
        int var1 = -30 / ((16 - param0) / 51);
        field_w = null;
        field_t = null;
    }

    final static boolean a(int param0, dl param1) {
        int var2 = 110 / ((param0 - 9) / 54);
        return -2 == (param1.b((byte) 88, 1) ^ -1) ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = ((tn) this).field_p + param3;
        int var6 = ((tn) this).field_h + param2;
        int discarded$24 = qo.field_b.a(jc.field_Mc, 20 + var5, var6 + 20, -40 + ((tn) this).field_q, -50 + ((tn) this).field_n, 16777215, -1, 1, 0, qo.field_b.field_I);
        if (param0 <= 64) {
            ((tn) this).a((byte) 126, -69, -35, 122);
        }
        this.a((byte) 110, param1, param2, param3);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        if (this.a(33, param1, param2, param3)) {
            return true;
        }
        int var5 = 103 % ((-53 - param0) / 33);
        if (!(98 != param1)) {
            return ((tn) this).b(param3, -108);
        }
        if (99 == param1) {
            return ((tn) this).a(80, param3);
        }
        return false;
    }

    final static boolean a(gk param0, byte param1, int param2, int param3) {
        byte[] var6 = param0.a(param3, -10470, param2);
        byte[] var4 = var6;
        if (param1 != -127) {
            dl var5 = (dl) null;
            boolean discarded$0 = tn.a(-9, (dl) null);
        }
        if (!(var6 != null)) {
            return false;
        }
        jr.a(var6, param1 + 7275);
        return true;
    }

    final static ll a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (!param2) {
            return (ll) null;
        }
        ll var6 = new ll(param1, param1);
        ll var3 = var6;
        for (var4 = 0; var4 < ((ll) var3).field_x.length; var4++) {
            ((ll) var6).field_x[var4] = param0;
        }
        return var3;
    }

    public tn() {
        super(0, 0, 476, 225, (ir) null);
        ((tn) this).field_u = new mi(jd.field_b, (no) null);
        ((tn) this).field_v = new mi(md.field_s, (no) null);
        ((tn) this).field_x = new mi(nu.field_a, (no) null);
        qb var1 = new qb();
        ((tn) this).field_u.field_e = (ir) (Object) var1;
        ((tn) this).field_v.field_e = (ir) (Object) var1;
        ((tn) this).field_x.field_e = (ir) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -1039729183;
        ((tn) this).field_v.a(30, -var3 + ((tn) this).field_q >> -384571999, -48 + (((tn) this).field_n + -var2), var4, (byte) 127);
        ((tn) this).field_x.a(30, var4 + (-var3 + ((tn) this).field_q >> -1242618111) + var2, -var2 + -48 + ((tn) this).field_n, var4, (byte) 123);
        ((tn) this).field_u.a(30, ((tn) this).field_q - var3 >> 87508609, -(var2 * 2) + (-78 + ((tn) this).field_n), var3, (byte) 126);
        ((tn) this).field_v.field_o = (no) this;
        ((tn) this).field_u.field_o = (no) this;
        ((tn) this).field_x.field_o = (no) this;
        ((tn) this).field_u.field_k = cl.field_db;
        ((tn) this).field_x.field_k = td.field_c;
        ((tn) this).a((ea) (Object) ((tn) this).field_v, 1);
        ((tn) this).a((ea) (Object) ((tn) this).field_u, 1);
        ((tn) this).a((ea) (Object) ((tn) this).field_x, 1);
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        se.field_a = param3;
        dp.field_i = param2;
        ua.a(ec.field_o, param1, (byte) -101);
        if (param0 != 1) {
            field_w = (int[]) null;
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var7 = AceOfSkies.field_G ? 1 : 0;
        int var6 = 77 % ((param4 - -27) / 61);
        if (param1 == ((tn) this).field_v) {
            ua.e(4754);
        } else {
            if (((tn) this).field_u == param1) {
                cu.c((byte) 96);
            } else {
                if (param1 == ((tn) this).field_x) {
                    of.a(111);
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[1];
    }
}
