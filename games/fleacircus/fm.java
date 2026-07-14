/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (rh.field_f != null) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) rh.field_f;
                    // monitorenter rh.field_f
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        rh.field_f = null;
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
                    if (param0 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    fm.a(14);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param1.length()) {
            if (param0) {
              return false;
            } else {
              return false;
            }
          } else {
            var3 = param1.charAt(var2);
            if (!ak.a((char) var3, (byte) 67)) {
              if (!em.a((byte) -65, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
