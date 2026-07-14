/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static je field_a;
    static int field_e;
    static String[] field_b;
    static String field_d;
    static String field_c;

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -25534) {
            jl.a(69);
        }
        field_c = null;
    }

    final static boolean a(boolean param0) {
        nm var1 = null;
        int var2 = 0;
        int var3 = 0;
        nm var4 = null;
        var3 = TetraLink.field_J;
        var4 = (nm) (Object) bo.field_C.c(param0);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= var1.field_r) {
              return true;
            } else {
              L1: {
                if (null != var4.field_x[var2]) {
                  if (-1 != (var4.field_x[var2].field_d ^ -1)) {
                    break L1;
                  } else {
                    return false;
                  }
                } else {
                  break L1;
                }
              }
              if (null != var4.field_u[var2]) {
                if (var4.field_u[var2].field_d == 0) {
                  return false;
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
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 >= 108) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_b = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (kd.field_g != null) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var1 = (Object) (Object) kd.field_g;
                    // monitorenter kd.field_g
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        kd.field_g = null;
                        // monitorexit var1
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = TetraLink.field_J;
        ra.c(640 + -param1 >> 1484464961, param2 - param0 >> 699148417, param1, param0, 9408511);
        for (var3 = -param0; (var3 ^ -1) > -1; var3 += 2) {
            var4 = 640 * (var3 + (480 - -param0 >> -74386943)) + (640 - param1 >> 319873761);
            var5 = param1;
            while (true) {
                var5--;
                if (0 > var5) {
                    break;
                }
                var4++;
                ra.field_b[var4] = 11513855;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = "<%0> has left.";
    }
}
