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
        if (this.field_P.a(0).a(-114) != nn.field_s) {
            return;
        }
        try {
            qo.a(this.field_P.h(32), this.field_P.g(72), this.field_P.e(param0), (byte) -126);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "cn.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_L.field_B = this.field_P.a(0).a(param2 + -287) == nn.field_s ? true : false;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "cn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -94, param1, param2, param3);
        vc.field_e.a(sm.field_b, 4 + param1 - -this.field_n, vc.field_e.field_C + (param3 + (this.field_j - -4)), 16777215, -1);
        if (param0 > -52) {
            field_J = (String) null;
        }
    }

    cn(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (pf) null);
        this.field_P = new wl(new ib(10000536), ag.field_E, 0, 0, 140, 25);
        this.field_P.a(new bl(), (byte) -48);
        this.field_L = new ag(qn.field_lb, (wc) (this));
        this.field_z = new qm[]{(qm) ((Object) this.field_P), (qm) ((Object) this.field_L)};
        this.field_L.field_r = (pf) ((Object) new mm());
        this.e((byte) 45);
    }

    final void e(int param0) {
        int var2 = 0;
        ag var3 = null;
        if (param0 <= 17) {
          var3 = (ag) null;
          this.a(true, -29, 36, -108, (ag) null);
          var2 = 250;
          this.field_P.a(25, this.field_k - 5 >> -532994239, 140, this.field_v - var2 >> 847550433, -126);
          this.field_L.a(30, 2 + (-30 + (20 + this.field_k) >> 1542274945), 100, (-var2 + this.field_v >> 798899233) + 150, -118);
          return;
        } else {
          var2 = 250;
          this.field_P.a(25, this.field_k - 5 >> -532994239, 140, this.field_v - var2 >> 847550433, -126);
          this.field_L.a(30, 2 + (-30 + (20 + this.field_k) >> 1542274945), 100, (-var2 + this.field_v >> 798899233) + 150, -118);
          return;
        }
    }

    public static void g(byte param0) {
        field_N = null;
        field_M = null;
        field_J = null;
        field_S = null;
        if (param0 < 95) {
          cn.c(true);
          field_H = null;
          field_I = null;
          field_O = null;
          field_K = null;
          field_Q = null;
          return;
        } else {
          field_H = null;
          field_I = null;
          field_O = null;
          field_K = null;
          field_Q = null;
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 > 103) {
          if ((param1 ^ -1) > -1) {
            L0: {
              if ((1 + param1) % 4 != 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          } else {
            if (-1583 < (param1 ^ -1)) {
              L1: {
                if (0 != param1 % 4) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              return stackIn_13_0 != 0;
            } else {
              if (-1 == (param1 % 4 ^ -1)) {
                if (0 != param1 % 100) {
                  return true;
                } else {
                  if (0 == param1 % 400) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void c(boolean param0) {
        int var1_int = 0;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
            if (!param0) {
                field_O = (byte[]) null;
            }
            for (var1_int = 0; gb.field_f > var1_int; var1_int++) {
                g.field_d[var1_int] = null;
            }
            gb.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "cn.F(" + param0 + ')');
        }
    }

    static {
        field_H = "Email: ";
        field_I = "Blue Team";
        field_M = new int[8192];
        field_Q = "<%0> has left.";
        field_O = new byte[]{(byte)2, (byte)9, (byte) 1};
        field_J = "Kit up your character on the '<%0>' screen and look at the tutorial to learn how to play the game. After learning the basics, enter the lobby and join a Rated game to earn wands. Any wands you earn can be spent on the '<%1>' screen to gain new spells with which to fight your opponents.";
        field_K = "Offer draw";
    }
}
