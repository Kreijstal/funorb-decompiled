/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    int field_n;
    int field_k;
    static int[] field_e;
    int field_l;
    String field_o;
    static int field_d;
    int field_m;
    w field_f;
    boolean field_j;
    int field_i;
    static String field_b;
    int[] field_q;
    static String field_c;
    String field_h;
    static String field_a;
    String field_p;
    String field_g;
    long field_r;

    final int b(byte param0) {
        if (!((hl) this).field_j) {
            // if_icmpne L30
            // if_icmpgt L28
        } else {
            return 2;
        }
        if ((uc.field_g ^ -1L) == (((hl) this).field_r ^ -1L)) {
            return 1;
        }
        if (2 == jj.field_b) {
            if (!(!qe.a(((hl) this).field_o, 3))) {
                return 1;
            }
        }
        if (param0 != 94) {
            ((hl) this).field_p = null;
            return 0;
        }
        return 0;
    }

    final static boolean a(byte param0) {
        if (param0 != -53) {
            return false;
        }
        return sg.a(cf.field_c, 113, fm.field_d);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        db.a((java.awt.Component) (Object) param0, false);
        if (param1 >= -29) {
            Object var3 = null;
            hl.a((java.awt.Canvas) null, (byte) -79);
        }
        al.a(-2204, (java.awt.Component) (Object) param0);
        if (!(uc.field_e == null)) {
            uc.field_e.a((java.awt.Component) (Object) param0, -63);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -21128) {
            hl.a(-128);
        }
        field_e = null;
        field_a = null;
        field_b = null;
    }

    hl(boolean param0) {
        ((hl) this).field_i = vl.field_k;
        ((hl) this).field_r = fc.field_h;
        ((hl) this).field_g = qm.field_e;
        ((hl) this).field_p = ad.field_x;
        ((hl) this).field_n = ic.field_a;
        ((hl) this).field_l = tg.field_c;
        if (!param0) {
            ((hl) this).field_q = null;
        } else {
            ((hl) this).field_q = fa.field_q;
        }
        ((hl) this).field_m = mf.field_R;
        ((hl) this).field_j = fm.field_f;
        ((hl) this).field_k = dh.field_d;
        ((hl) this).field_h = ib.field_pb;
        ((hl) this).field_o = sa.field_B;
    }

    hl(int param0, String param1, int param2, String param3, String param4) {
        ((hl) this).field_i = 0;
        ((hl) this).field_n = 0;
        ((hl) this).field_m = param0;
        ((hl) this).field_g = param3;
        ((hl) this).field_l = 0;
        ((hl) this).field_k = param2;
        ((hl) this).field_q = null;
        ((hl) this).field_r = 0L;
        ((hl) this).field_o = param1;
        ((hl) this).field_h = param4;
        ((hl) this).field_j = true;
        ((hl) this).field_p = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
        field_b = "Decline invitation to <%0>'s game";
        field_c = "Who can join";
        field_a = null;
    }
}
