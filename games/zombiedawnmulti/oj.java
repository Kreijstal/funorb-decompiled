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
        if (((oj) this).field_P.a((byte) 78).d(117) != db.field_b) {
          return;
        } else {
          L0: {
            mp.a(0, ((oj) this).field_P.j(-194), ((oj) this).field_P.i(1), ((oj) this).field_P.g((byte) -126));
            if (param3 < -83) {
              break L0;
            } else {
              oj.h(103);
              break L0;
            }
          }
          return;
        }
    }

    final void g(int param0) {
        int var2 = 250;
        ((oj) this).field_P.b(-var2 + ((oj) this).field_n >> 1903363937, 20 + (((oj) this).field_w - 25) >> 1268844289, 28972, param0, 25);
        ((oj) this).field_B.b((-var2 + ((oj) this).field_n >> -1531214687) - -150, (20 + (((oj) this).field_w + -30) >> -1684340735) + 2, param0 ^ 29088, 100, 30);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        cp.field_H.c(qa.field_m, 4 + param3 - -((oj) this).field_y, 4 + param1 - (-((oj) this).field_i + -cp.field_H.field_C), 16777215, -1);
    }

    oj(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (nl) null);
        ((oj) this).field_P = new em((nl) (Object) new tb(10000536), tm.field_b, 0, 0, 140, 25);
        ((oj) this).field_P.a(3, new dj());
        ((oj) this).field_B = new gn(ub.field_xb, (bj) this);
        ((oj) this).field_E = new cf[]{(cf) (Object) ((oj) this).field_P, (cf) (Object) ((oj) this).field_B};
        ((oj) this).field_B.field_h = (nl) (Object) new oq();
        ((oj) this).e(-1);
    }

    final static ul a(boolean param0, int param1, int param2, int param3, boolean param4) {
        if (param3 != -24285) {
          field_O = null;
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
        field_N = null;
    }

    final void a(int param0, cf param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((oj) this).field_B.field_F = ((oj) this).field_P.a((byte) 126).d(53) == db.field_b ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "This game option is not available in rated games.";
        field_N = new byte[50][];
        field_O = "Knowledge is power. Get yourself another powerup slot with this trait.";
    }
}
