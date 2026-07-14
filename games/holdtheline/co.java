/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static String[] field_a;
    static int[] field_d;
    static uf field_b;
    static String field_c;
    static String field_e;

    final static int a(int param0) {
        if (param0 != 0) {
            field_b = null;
            return cb.field_j;
        }
        return cb.field_j;
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == tf.field_n) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) tf.field_n;
                    // monitorenter tf.field_n
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        tf.field_n = null;
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (!param0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = null;
                    boolean discarded$4 = co.a((gn) null, (gn) null, 26);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    if (param0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var3 = null;
                    boolean discarded$5 = co.a((gn) null, (gn) null, 26);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(gn param0, gn param1, int param2) {
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param2 == 10302) {
          if (param1.a((byte) 65)) {
            if (param0.d(0, -78)) {
              if (param0.b("car_pass_left", -93)) {
                if (!param0.b("car_pass_right", 116)) {
                  return false;
                } else {
                  L0: {
                    if (!param0.b("wacky_boom_kick", -111)) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L0;
                    }
                  }
                  return stackIn_12_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        mn.a("", param0, -1);
        ae.a(-16666, param0);
        if (param1 != 237) {
            field_a = null;
        }
    }

    final static void c(int param0) {
        if (cf.field_q != -lf.field_l + param0) {
          if (cf.field_q != -lf.field_l + 250) {
            cf.field_q = cf.field_q + 1;
            return;
          } else {
            cf.field_q = cf.field_q + 1;
            return;
          }
        } else {
          cf.field_q = cf.field_q + 1;
          return;
        }
    }

    public static void b(int param0) {
        int var1 = -96 % ((param0 - -48) / 56);
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Kick up some dust on desert tracks", "Cause mayhem in nighttime races", "Dance on ice on alpine tracks", "Put six new vehicles to the test", "The Rink, and other Demolition tracks", "Play in fullscreen mode"};
        field_c = "Username: ";
    }
}
