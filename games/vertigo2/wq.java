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
        if (!(null != this.field_C)) {
            return;
        }
        if (!(-1 != (this.field_J ^ -1))) {
            return;
        }
        if (!((this.field_J ^ -1) != -257)) {
            this.field_C.a(false, param1, this.field_o + param2, param3 + this.field_t);
            return;
        }
        er var6 = new er(this.field_C.field_n, this.field_C.field_s);
        lq.a(var6, (byte) -94);
        this.field_C.a(param0, param1, 0, 0);
        ln.d(-28558);
        var6.c(this.field_o + param2, param3 + this.field_t, this.field_J);
    }

    public wq() {
        super(0, 0, 0, 0, (ur) null, (uf) null);
        this.field_J = 256;
    }

    wq(iq param0) {
        super(param0.field_o, param0.field_t, param0.field_n, param0.field_s, (ur) null, (uf) null);
        try {
            param0.a(false, 0, 0, this.field_s, this.field_n);
            this.field_J = 256;
            this.field_C = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
        field_G = new int[8192];
        field_L = "Your Time: <%0>";
        field_K = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
