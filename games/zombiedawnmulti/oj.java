/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends pl implements in {
    private em field_P;
    static ja[] field_M;
    static String field_H;
    static cd field_Q;
    private gn field_B;
    static byte[][] field_N;
    static String field_O;

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        if (this.field_P.a((byte) 78).d(117) != db.field_b) {
            return;
        }
        try {
            mp.a(0, this.field_P.j(-194), this.field_P.i(1), this.field_P.g((byte) -126));
            if (param3 >= -83) {
                oj.h(103);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "oj.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void g(int param0) {
        int var2 = 250;
        this.field_P.b(-var2 + this.field_n >> 1903363937, 20 + (this.field_w - 25) >> 1268844289, 28972, param0, 25);
        this.field_B.b((-var2 + this.field_n >> -1531214687) - -150, (20 + (this.field_w + -30) >> -1684340735) + 2, param0 ^ 29088, 100, 30);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        cp.field_H.c(qa.field_m, 4 + param3 - -this.field_y, 4 + param1 - (-this.field_i + -cp.field_H.field_C), 16777215, -1);
    }

    oj(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (nl) null);
        this.field_P = new em(new tb(10000536), tm.field_b, 0, 0, 140, 25);
        this.field_P.a(3, new dj());
        this.field_B = new gn(ub.field_xb, (bj) (this));
        this.field_E = new cf[]{(cf) ((Object) this.field_P), (cf) ((Object) this.field_B)};
        this.field_B.field_h = (nl) ((Object) new oq());
        this.e(-1);
    }

    final static ul a(boolean param0, int param1, int param2, int param3, boolean param4) {
        if (param3 != -24285) {
          field_O = (String) null;
          return wm.a(param1, param2, param4, false, -127, param0);
        } else {
          return wm.a(param1, param2, param4, false, -127, param0);
        }
    }

    public static void h(int param0) {
        field_M = null;
        if (param0 != 16777215) {
            return;
        }
        field_O = null;
        field_H = null;
        field_Q = null;
        field_N = (byte[][]) null;
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_B.field_F = this.field_P.a((byte) 126).d(53) == db.field_b ? true : false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "oj.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_H = "This game option is not available in rated games.";
        field_N = new byte[50][];
        field_O = "Knowledge is power. Get yourself another powerup slot with this trait.";
    }
}
