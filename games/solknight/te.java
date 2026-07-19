/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends si {
    static ng field_L;
    static jd field_N;
    static int field_O;
    int field_H;
    static String[] field_I;
    static String field_K;
    static String field_J;
    static int field_M;

    public static void a(byte param0) {
        field_L = null;
        field_N = null;
        field_K = null;
        if (param0 != 45) {
            return;
        }
        field_J = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (param1 ^ -1)) {
            return;
        }
        if (!(this.field_G != null)) {
            return;
        }
        if (this.field_H == 0) {
            return;
        }
        if (!(this.field_H != 256)) {
            this.field_G.a(param0 - -this.field_j, param1, param2 - -this.field_m, 0);
            return;
        }
        o var6 = new o(this.field_G.field_t, this.field_G.field_x);
        cl.a(-119, var6);
        this.field_G.a(0, param1, 0, param3);
        mf.e(4096);
        var6.c(param2 - -this.field_m, this.field_j + param0, this.field_H);
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        if (param0 != 25403) {
          return -126;
        } else {
          var3 = -1 + param1 & param2 >> -170852673;
          return (param2 - -(param2 >>> -2131518657)) % param1 - -var3;
        }
    }

    final static String d(byte param0) {
        if (param0 != 18) {
            te.a((byte) -93);
            return vc.field_c;
        }
        return vc.field_c;
    }

    public te() {
        super(0, 0, 0, 0, (j) null, (dg) null);
        this.field_H = 256;
    }

    te(rc param0) {
        super(param0.field_m, param0.field_j, param0.field_t, param0.field_x, (j) null, (dg) null);
        try {
            param0.b(this.field_x, this.field_t, 0, 0, 0);
            this.field_H = 256;
            this.field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_L = new ng();
        field_J = "Loading...";
    }
}
