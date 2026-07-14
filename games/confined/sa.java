/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sa extends ee {
    da field_S;
    private da field_Q;
    private int field_T;
    static byte[] field_V;
    static String field_W;
    private ee field_X;
    private double field_Y;
    static boolean field_R;

    final boolean f(int param0) {
        if (param0 >= -54) {
            return false;
        }
        return ((sa) this).field_X.f(-58);
    }

    final void a(cl param0, byte param1) {
        int var3 = -85 / ((-35 - param1) / 60);
        param0.a((byte) 9, (sa) this);
    }

    private final void a(int param0, ee param1) {
        if (((sa) this).field_X == param1) {
          if (-1 <= (((sa) this).field_T ^ -1)) {
            L0: {
              ((sa) this).a(param1, 1.0, -67);
              ((sa) this).d(10797);
              if (param0 >= 98) {
                break L0;
              } else {
                ((sa) this).field_Y = 0.723536474622876;
                break L0;
              }
            }
            return;
          } else {
            ((sa) this).field_T = ((sa) this).field_T + 1;
            return;
          }
        } else {
          L1: {
            ((sa) this).a(param1, 1.0, -67);
            ((sa) this).d(10797);
            if (param0 >= 98) {
              break L1;
            } else {
              ((sa) this).field_Y = 0.723536474622876;
              break L1;
            }
          }
          return;
        }
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
            sa.h((byte) -107);
        }
    }

    final void a(int param0, int param1) {
        L0: {
          if (0 < ((sa) this).field_T) {
            ((sa) this).field_T = ((sa) this).field_T - 1;
            break L0;
          } else {
            break L0;
          }
        }
        ((sa) this).field_L = ((sa) this).field_L * 0.95;
        ((sa) this).field_G = ((sa) this).field_G * 0.95;
        ((sa) this).field_K = ((sa) this).field_K * 0.95;
        ((sa) this).field_S.a(param0 ^ -11818, ((sa) this).field_Q);
        super.a(param0, param1);
        if (((sa) this).field_D < 0.0) {
          ((sa) this).field_s = 2;
          ((sa) this).field_z = true;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, hf param1) {
        Object var4 = null;
        if (param0 > -29) {
          var4 = null;
          ((sa) this).a(-51, (mb) null);
          param1.b((ee) this, -127);
          return;
        } else {
          param1.b((ee) this, -127);
          return;
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        ((sa) this).d(10797);
        if (param0 != 256) {
            Object var15 = null;
            ((sa) this).a(-82, (mb) null);
        }
    }

    sa(hn param0, ee param1, da param2, double param3, double param4, double param5) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, param3, param4);
        ((sa) this).field_T = 1;
        ((sa) this).field_Q = new da();
        ((sa) this).field_X = param1;
        ((sa) this).field_G = param1.field_G;
        ((sa) this).field_Y = param5;
        ((sa) this).field_K = param1.field_K;
        ((sa) this).field_L = param1.field_L;
        ((sa) this).field_S = new da(param2);
        double[] var13 = new double[12];
        double[] var12 = var13;
        double[] var11 = var12;
        double[] var10 = var11;
        param2.a((byte) 62, var13);
        ((sa) this).field_Q.a(0.04, var13[8], var13[6], var13[7], 7);
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return false;
        }
        return true;
    }

    final void a(int param0, mb param1) {
        param1.a((byte) 9, (sa) this);
        if (param0 != -23154) {
            ((sa) this).a(-98, -49);
        }
    }

    public static void h(byte param0) {
        Object var2 = null;
        if (param0 != -28) {
          var2 = null;
          int discarded$2 = sa.a(4, (byte) -53, (CharSequence) null);
          field_W = null;
          field_V = null;
          return;
        } else {
          field_W = null;
          field_V = null;
          return;
        }
    }

    final void a(pm param0, int param1) {
        Object var4 = null;
        if (param1 > -81) {
          var4 = null;
          ((sa) this).a(false, (il) null);
          param0.a((byte) 9, (sa) this);
          return;
        } else {
          param0.a((byte) 9, (sa) this);
          return;
        }
    }

    final void a(boolean param0, ee param1) {
        this.a(116, param1);
        if (!param0) {
        }
    }

    final void a(boolean param0, il param1) {
        if (param0) {
            ((sa) this).field_T = -120;
            param1.c((ee) this, -7442);
            return;
        }
        param1.c((ee) this, -7442);
    }

    final void a(int param0, vg param1) {
        param1.a((byte) 9, (sa) this);
        if (param0 != -1) {
            field_W = null;
        }
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            ((sa) this).field_Y = -1.058661999384887;
            return false;
        }
        return false;
    }

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            field_R = false;
            return false;
        }
        return false;
    }

    final void a(int param0, ah param1) {
        param1.b(false, (ee) this);
        int var3 = -102 / ((param0 - 14) / 53);
    }

    final double a(int param0, boolean param1, double param2) {
        double stackIn_4_0 = 0.0;
        double stackIn_8_0 = 0.0;
        double stackOut_7_0 = 0.0;
        double stackOut_6_0 = 0.0;
        double stackOut_3_0 = 0.0;
        double stackOut_2_0 = 0.0;
        param2 = param2 - 4.0;
        ((sa) this).d(param0 + -3373);
        if (param0 != 14170) {
          L0: {
            ((sa) this).field_Y = -1.7791750168521754;
            if (param2 < 0.0) {
              stackOut_7_0 = 0.0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = param2;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param2 < 0.0) {
              stackOut_3_0 = 0.0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = param2;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, int param1) {
        em.field_a = 20 * param1 / 50;
        if (param0 != -35) {
          field_V = null;
          gd.field_u = 4 * param1 / 50;
          return;
        } else {
          gd.field_u = 4 * param1 / 50;
          return;
        }
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        if (param1 <= 52) {
            return 93;
        }
        return b.a(true, param0, (byte) 16, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Others have tried#and failed.#If you succeed, your reward#will be#immeasurable.";
        field_V = new byte[65536];
        lj.a(field_V, 0, 65536, (byte) -128);
        field_R = false;
    }
}
