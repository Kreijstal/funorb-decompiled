/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static String field_a;
    static int field_b;
    static String field_c;

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == hj.field_c) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) hj.field_c;
                    // monitorenter hj.field_c
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        hj.field_c = null;
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
                    if (param0 == 98) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    field_c = null;
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
                    if (param0 != 98) {
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
                    field_c = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -1) {
            Object var2 = null;
            te.a(-118, (hl[]) null);
        }
    }

    final static void a(int param0, hl[] param1) {
        Object var3 = null;
        og.field_d = param1;
        if (null != og.field_d) {
          if (-4 >= (param1.length ^ -1)) {
            if (param0 < 123) {
              var3 = null;
              te.a(117, (hl[]) null);
              return;
            } else {
              return;
            }
          } else {
            throw new IllegalArgumentException("");
          }
        } else {
          if (param0 < 123) {
            var3 = null;
            te.a(117, (hl[]) null);
            return;
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = StarCannon.field_A;
        int var3 = param2;
        while ((param0 ^ -1) < -2) {
            if ((param0 & 1) != 0) {
                var3 = var3 * param1;
            }
            param1 = param1 * param1;
            param0 = param0 >> 1;
        }
        if (!(param0 != 1)) {
            return var3 * param1;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "Names cannot contain consecutive spaces";
    }
}
