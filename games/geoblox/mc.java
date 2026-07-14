/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_a;

    final static boolean a(String param0, String param1, int param2, qh param3, int param4, boolean param5, String param6) {
        r var7 = null;
        r var8 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (kd.field_b == uf.field_l) {
          var8 = new r(kd.field_e, param3);
          var7 = var8;
          kd.field_e.a(false, (el) (Object) var8);
          if (param4 == 0) {
            if (!kf.a(122)) {
              L0: {
                if (!param5) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L0;
                }
              }
              bj.field_s = stackIn_9_0 != 0;
              rd.field_u = param2;
              dl.field_a = null;
              rh.field_i = param1;
              kd.field_b = tf.field_d;
              oj.field_a = param6;
              oc.field_a = param0;
              return true;
            } else {
              var8.q(12086);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) pg.field_c;
                    // monitorenter pg.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        gh.field_P = gh.field_P + 1;
                        gf.field_a = s.field_I;
                        if (param0 < -126) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = -77;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        qa.field_a = lj.field_b;
                        ue.field_e = eg.field_h;
                        wb.field_a = fc.field_f;
                        fc.field_f = false;
                        bi.field_g = vd.field_a;
                        field_a = ah.field_e;
                        he.field_d = hi.field_C;
                        vd.field_a = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
