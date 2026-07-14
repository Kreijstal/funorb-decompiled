/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static long field_b;
    static mf field_a;
    static fj field_c;

    final static void a(boolean param0, om param1) {
        om var2 = null;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0) {
          param1.b((byte) 111);
          var2 = (om) (Object) rq.field_a.d(-76);
          L0: while (true) {
            if (var2 != null) {
              if (var2.a(param1, true)) {
                var2 = (om) (Object) rq.field_a.a((byte) 116);
                continue L0;
              } else {
                L1: {
                  if (var2 == null) {
                    rq.field_a.a((nm) (Object) param1, (byte) 3);
                    break L1;
                  } else {
                    il.a((nm) (Object) param1, -90, (nm) (Object) var2);
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (var2 == null) {
                  rq.field_a.a((nm) (Object) param1, (byte) 3);
                  break L2;
                } else {
                  il.a((nm) (Object) param1, -90, (nm) (Object) var2);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          field_b = 8L;
          param1.b((byte) 111);
          var2 = (om) (Object) rq.field_a.d(-76);
          L3: while (true) {
            if (var2 != null) {
              if (var2.a(param1, true)) {
                var2 = (om) (Object) rq.field_a.a((byte) 116);
                continue L3;
              } else {
                if (var2 == null) {
                  rq.field_a.a((nm) (Object) param1, (byte) 3);
                  return;
                } else {
                  il.a((nm) (Object) param1, -90, (nm) (Object) var2);
                  return;
                }
              }
            } else {
              if (var2 == null) {
                rq.field_a.a((nm) (Object) param1, (byte) 3);
                return;
              } else {
                il.a((nm) (Object) param1, -90, (nm) (Object) var2);
                return;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_c = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (gp.field_c != null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= -63) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = null;
                    ic.a(true, (om) null);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) gp.field_c;
                    // monitorenter gp.field_c
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        gp.field_c = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 <= -63) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = null;
                    ic.a(true, (om) null);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
