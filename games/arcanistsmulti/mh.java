/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends ag {
    private qm field_J;
    static int field_H;
    static long field_K;
    static String field_I;

    final static void i(byte param0) {
        L0: {
          rk.field_O.q(-256);
          if (-7 >= mj.field_p) {
            if (7 != mj.field_p) {
              gj.a(true, true, 14, mn.field_r);
              df.a((byte) 120, mj.field_p - -1);
              break L0;
            } else {
              if (param0 == 74) {
                return;
              } else {
                mh.g((byte) 11);
                return;
              }
            }
          } else {
            if (-1 != co.a(-20675)) {
              break L0;
            } else {
              L1: {
                if (7 != mj.field_p) {
                  gj.a(true, true, 14, mn.field_r);
                  df.a((byte) 120, mj.field_p - -1);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0 == 74) {
                return;
              } else {
                mh.g((byte) 11);
                return;
              }
            }
          }
        }
        if (param0 != 74) {
          mh.g((byte) 11);
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, qm param1) {
        if (param0 != 0) {
          ((mh) this).field_J = null;
          return ((mh) this).field_J.a(param0 + 0, param1);
        } else {
          return ((mh) this).field_J.a(param0 + 0, param1);
        }
    }

    mh(qm param0) {
        ((mh) this).field_J = param0;
    }

    public static void h(byte param0) {
        int var1 = 53 % ((33 - param0) / 61);
        field_I = null;
    }

    final static void g(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 45) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    mh.i((byte) -22);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null == ch.field_a) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) ch.field_a;
                    // monitorenter ch.field_a
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        ch.field_a = null;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
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
        field_I = "Wands ";
    }
}
