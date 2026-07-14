/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends ge {
    static String field_L;
    static String field_J;
    static nh field_K;

    final static la a(int param0, boolean param1, dt param2, int param3, byte param4) {
        if (param4 > -120) {
            boolean discarded$0 = tp.a(106, (byte) 37, 71);
        }
        g var5 = null;
        var5 = kq.a(95, param0);
        return gba.a(param3, param1, var5, 21789, param2);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_K = null;
            return false;
        }
        return false;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            boolean discarded$0 = ((tp) this).B(18);
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            ((tp) this).q((byte) -23);
        }
        return false;
    }

    tp(la param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(int param0, byte param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param1 == 3) {
          L0: {
            if ((458752 & param2) == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (stackIn_5_0 != 0 | ir.a(param2, param0, (byte) -94)) {
                break L2;
              } else {
                if (!uu.a(true, param2, param0)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L1;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        for (var7 = 0; var7 < param4; var7++) {
            ra.a(param6 + -(2 * var7), param3, param2 + var7, -(var7 * 2) + param5, false, var7 + param0);
        }
        if (param1 != -85) {
            field_L = null;
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -57;
        }
        return 7;
    }

    final void q(byte param0) {
        super.q(param0);
        ((tp) this).b(-88, 2097152, 2097152);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    public static void t(byte param0) {
        field_J = null;
        int var1 = 95 % ((param0 - -24) / 54);
        field_K = null;
        field_L = null;
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            field_L = null;
            return true;
        }
        return true;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = new fsa(param2, param0);
        var4.b((byte) -11, ((tp) this).field_k, ((tp) this).field_l);
        var4.h(param1, 0);
        var4.a((byte) 83, (nv) (Object) new eq(param2, param0));
        ov var5 = new ov(param2, param0);
        var5.a(new up(6, 10), true);
        ((tp) this).a((byte) 43, (mra) (Object) var5, param2);
        var4.a((byte) 83, (nv) (Object) var5);
        mfa var6 = rm.field_a;
        boa var7 = (boa) (Object) var6.a(7, param1 ^ 77);
        var7.b(113, 15);
        var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    tp(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Press <img=7> or <img=5> to change view";
        field_L = "This game option is not available in rated games.";
    }
}
