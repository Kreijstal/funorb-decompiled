/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wq extends oh {
    static int[] field_I;
    static int[] field_G;
    int field_J;
    static String field_L;
    static Calendar field_K;
    static boolean field_H;
    static od field_M;

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        if (!(null != ((wq) this).field_C)) {
            return;
        }
        if (!(-1 != (((wq) this).field_J ^ -1))) {
            return;
        }
        if (!((((wq) this).field_J ^ -1) != -257)) {
            ((wq) this).field_C.a(false, param1, ((wq) this).field_o + param2, param3 + ((wq) this).field_t);
            return;
        }
        er var6 = new er(((wq) this).field_C.field_n, ((wq) this).field_C.field_s);
        lq.a(var6, (byte) -94);
        ((wq) this).field_C.a(param0, param1, 0, 0);
        ln.d(-28558);
        var6.c(((wq) this).field_o + param2, param3 + ((wq) this).field_t, ((wq) this).field_J);
    }

    public wq() {
        super(0, 0, 0, 0, (ur) null, (uf) null);
        ((wq) this).field_J = 256;
    }

    wq(iq param0) {
        super(param0.field_o, param0.field_t, param0.field_n, param0.field_s, (ur) null, (uf) null);
        param0.a(false, 0, 0, ((wq) this).field_s, ((wq) this).field_n);
        ((wq) this).field_J = 256;
        ((wq) this).field_C = param0;
    }

    public static void h(int param0) {
        field_I = null;
        field_K = null;
        if (param0 != -12477) {
            return;
        }
        field_M = null;
        field_G = null;
        field_L = null;
    }

    final static void i(int param0) {
        p.a(param0 + -33);
        if (param0 != 0) {
            wq.h(-95);
            rh.b(-14, 4);
            return;
        }
        rh.b(-14, 4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[8192];
        field_L = "Your Time: <%0>";
        field_K = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
