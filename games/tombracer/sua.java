/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sua extends kna {
    private int field_F;
    static double field_J;
    static vna field_H;
    static int field_L;
    static fta field_G;
    static jea field_K;
    static int field_I;

    public static void B(int param0) {
        if (param0 <= 19) {
          sua.r((byte) 98);
          field_G = null;
          field_K = null;
          field_H = null;
          return;
        } else {
          field_G = null;
          field_K = null;
          field_H = null;
          return;
        }
    }

    final void a(la param0, int param1) {
        super.a(param0, param1);
        ((sua) this).field_F = -((sua) this).field_F;
    }

    final void q(byte param0) {
        super.q(param0);
        ((sua) this).b(-113, 2097152, 2097152);
        ((sua) this).a((byte) 89, new mka[1]);
    }

    final static void r(byte param0) {
        int var1 = 0;
        if ((ot.field_v ^ -1) <= -225) {
          mp.a(2, 256);
          if (param0 == 63) {
            return;
          } else {
            goa discarded$4 = sua.A(63);
            return;
          }
        } else {
          var1 = ot.field_v % 32;
          mp.a(2, -var1 + (ot.field_v + 32));
          if (param0 == 63) {
            return;
          } else {
            goa discarded$5 = sua.A(63);
            return;
          }
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_K = null;
            return true;
        }
        return true;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -38, dqa.a(!param0 ? true : false, ((sua) this).field_F, 5), 5);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var8 = new fsa(param2, param0);
        var8.b((byte) -11, ((sua) this).field_k, ((sua) this).field_l);
        var8.h(param1, 0);
        var8.a(1, (byte) -12, true);
        var8.a((byte) -3, 6);
        var8.b((byte) 17, false);
        var8.g(param1 ^ 109, 2);
        var8.a((byte) 83, (nv) (Object) new eq(param2, param0));
        spa var5 = new spa(param2, param0);
        var5.a((byte) -124, ((sua) this).field_F * 8);
        var8.a((wda) (Object) var5, 0);
        mfa var6 = rm.field_a;
        nq var7 = (nq) (Object) var6.a(16, 124);
        var7.b(8022, 2);
        var8.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var8;
    }

    sua(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((sua) this).field_F = 4;
        ((sua) this).field_F = bla.a(true, 5, param2.b((byte) 44, 5));
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_H = null;
            return false;
        }
        return false;
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        uia var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new uia(param0);
                    var3 = var9.h(255);
                    var4 = var9.e(124);
                    if (param1 <= -99) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    goa discarded$4 = sua.A(-108);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 > -1) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == oma.field_H) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (oma.field_H >= var4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 == var3) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.e(-127);
                    if (var5_int < 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (oma.field_H == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var5_int > oma.field_H) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (-2 == (var3 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7 = (Object) (Object) sma.field_e;
                    // monitorenter sma.field_e
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        sma.field_e.a((byte) -34, var16, var9);
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var8;
                }
                case 19: {
                    int discarded$5 = kr.a(var16, var5_int, param0, var4, 9);
                    return var6;
                }
                case 20: {
                    return var6;
                }
                case 21: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(var17, 0, -86, var4);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            Object var3 = null;
            ((sua) this).a((la) null, -35);
            return 7;
        }
        return 7;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    sua(la param0, int param1) {
        super(param0, param1);
        ((sua) this).field_F = 4;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return true;
    }

    final static goa A(int param0) {
        String var1 = null;
        var1 = cs.a((byte) -112);
        if (param0 >= 46) {
          if (var1 != null) {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              return new goa(cs.a((byte) 94), npa.a(32));
            } else {
              var1 = "";
              return new goa(cs.a((byte) 94), npa.a(32));
            }
          } else {
            return new goa(cs.a((byte) 94), npa.a(32));
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = 0.0;
        field_H = new vna();
        field_G = new fta();
    }
}
