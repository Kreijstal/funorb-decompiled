/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static ue field_b;
    static String field_a;

    final static nq a(lu param0, byte param1) {
        int var2 = 0;
        if (param1 > 1) {
          var2 = param0.b(16711935);
          if (255 == var2) {
            return null;
          } else {
            return new nq(var2 >> 1651991109, var2 & 31);
          }
        } else {
          field_b = null;
          var2 = param0.b(16711935);
          if (255 == var2) {
            return null;
          } else {
            return new nq(var2 >> 1651991109, var2 & 31);
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 10) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        if (-1 == (dj.field_c.field_h.field_h & 1 << dj.field_c.field_n ^ -1)) {
          if (0 != dj.field_c.field_h.field_h) {
            lr.field_k[10] = gt.field_r;
            if (param0 < 27) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            lr.field_k[10] = nt.field_w;
            if (param0 >= 27) {
              return;
            } else {
              field_b = null;
              return;
            }
          }
        } else {
          lr.field_k[10] = cd.field_k;
          if (param0 >= 27) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = null;
                    nq discarded$3 = qi.a((lu) null, (byte) 14);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null == uc.field_m) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) uc.field_m;
                    // monitorenter uc.field_m
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        uc.field_m = null;
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
        field_a = "Are you sure you want to delete this creature?";
    }
}
