/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_a;
    static int field_e;
    static int field_b;
    static int field_d;
    static String[] field_c;

    final static void a(int param0, int param1, int param2, int param3) {
        jc.a(param2, param1, param3, 0, 2, 0);
        int var4 = 14 / ((-45 - param0) / 48);
    }

    public static void a(int param0) {
        int var1 = 59 % ((58 - param0) / 55);
        field_a = null;
        field_c = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) ib.field_f;
                    // monitorenter ib.field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        la.field_g = ua.field_a;
                        fc.field_m = fc.field_m + 1;
                        hj.field_S = wi.field_tb;
                        eh.field_h = dj.field_d;
                        cp.field_U = lj.field_g;
                        lj.field_g = false;
                        no.field_d = wm.field_g;
                        lc.field_c = ak.field_k;
                        hm.field_k = em.field_C;
                        wm.field_g = param0;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var2;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static pp a(int param0, byte param1, cn param2, int param3) {
        cn var4 = null;
        cn var5 = null;
        cn var6 = null;
        cn var7 = null;
        jh.c();
        var4 = param2;
        var5 = new cn(param2.field_y, param2.field_v);
        var5.e();
        var4.f(0, 0, 96);
        var6 = param2.d();
        var6.e();
        param2.b(0, 0, 256);
        param2.b(0, 0, 256);
        if (param1 > -108) {
          field_e = -70;
          var7 = rb.a(32, param2, 8421631, (byte) 117);
          jh.b();
          return new pp(var4, var5, var6, var7, param3, param0);
        } else {
          var7 = rb.a(32, param2, 8421631, (byte) 117);
          jh.b();
          return new pp(var4, var5, var6, var7, param3, param0);
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 > 56) {
          if (10 != param1) {
            if (param1 != 12) {
              if ((param1 ^ -1) != -20) {
                if (param1 != 18) {
                  if (param1 == 9) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Being a python, the snake in this room is not venomous, but its massive size makes it no less deadly to slow-witted raiders.";
        field_e = 0;
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
