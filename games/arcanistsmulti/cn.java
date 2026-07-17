/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends kl implements vb {
    static String field_H;
    static ll[] field_S;
    static String field_K;
    private wl field_P;
    static String field_I;
    private ag field_L;
    static int[] field_M;
    static byte[] field_O;
    static ll[] field_N;
    static String field_J;
    static String field_Q;

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (((cn) this).field_P.a(0).a(-114) != nn.field_s) {
            return;
        }
        try {
            qo.a(((cn) this).field_P.h(32), ((cn) this).field_P.g(72), ((cn) this).field_P.e(param0), (byte) -126);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "cn.U(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((cn) this).field_L.field_B = ((cn) this).field_P.a(0).a(param2 + -287) == nn.field_s ? true : false;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "cn.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -94, param1, param2, param3);
        vc.field_e.a(sm.field_b, 4 + param1 - -((cn) this).field_n, vc.field_e.field_C + (param3 + (((cn) this).field_j - -4)), 16777215, -1);
        if (param0 > -52) {
            field_J = null;
        }
    }

    cn(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (pf) null);
        ((cn) this).field_P = new wl((pf) (Object) new ib(10000536), ag.field_E, 0, 0, 140, 25);
        ((cn) this).field_P.a(new bl(), (byte) -48);
        ((cn) this).field_L = new ag(qn.field_lb, (wc) this);
        ((cn) this).field_z = new qm[]{(qm) (Object) ((cn) this).field_P, (qm) (Object) ((cn) this).field_L};
        ((cn) this).field_L.field_r = (pf) (Object) new mm();
        ((cn) this).e((byte) 45);
    }

    final void e(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (param0 <= 17) {
          var3 = null;
          ((cn) this).a(true, -29, 36, -108, (ag) null);
          var2 = 250;
          ((cn) this).field_P.a(25, ((cn) this).field_k - 5 >> 1, 140, ((cn) this).field_v - var2 >> 1, -126);
          ((cn) this).field_L.a(30, 2 + (-30 + (20 + ((cn) this).field_k) >> 1), 100, (-var2 + ((cn) this).field_v >> 1) + 150, -118);
          return;
        } else {
          var2 = 250;
          ((cn) this).field_P.a(25, ((cn) this).field_k - 5 >> 1, 140, ((cn) this).field_v - var2 >> 1, -126);
          ((cn) this).field_L.a(30, 2 + (-30 + (20 + ((cn) this).field_k) >> 1), 100, (-var2 + ((cn) this).field_v >> 1) + 150, -118);
          return;
        }
    }

    public static void g() {
        field_N = null;
        field_M = null;
        field_J = null;
        field_S = null;
        field_H = null;
        field_I = null;
        field_O = null;
        field_K = null;
        field_Q = null;
    }

    final static boolean a(int param0, int param1) {
        if (!(param1 >= 0)) {
            return (1 + param1) % 4 == 0 ? true : false;
        }
        if (!(param1 >= 1582)) {
            return 0 == param1 % 4 ? true : false;
        }
        if (param1 % 4 != 0) {
            return false;
        }
        if (!(0 == param1 % 100)) {
            return true;
        }
        if (0 == param1 % 400) {
            return true;
        }
        return false;
    }

    final static void c() {
        int var1_int = 0;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
            for (var1_int = 0; gb.field_f > var1_int; var1_int++) {
                g.field_d[var1_int] = null;
            }
            gb.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "cn.F(" + 1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Email: ";
        field_I = "Blue Team";
        field_M = new int[8192];
        field_Q = "<%0> has left.";
        field_O = new byte[]{(byte) 2, (byte) 9, (byte) 1};
        field_J = "Kit up your character on the '<%0>' screen and look at the tutorial to learn how to play the game. After learning the basics, enter the lobby and join a Rated game to earn wands. Any wands you earn can be spent on the '<%1>' screen to gain new spells with which to fight your opponents.";
        field_K = "Offer draw";
    }
}
