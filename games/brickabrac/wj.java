/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends nm {
    final static void a(int param0, long param1) {
        if (param0 <= -123) {
          if (0L >= param1) {
            return;
          } else {
            if (0L == param1 % 10L) {
              bc.a(-29869, -1L + param1);
              bc.a(-29869, 1L);
              return;
            } else {
              bc.a(-29869, param1);
              return;
            }
          }
        } else {
          wj.a(112, -29L);
          if (0L >= param1) {
            return;
          } else {
            if (0L == param1 % 10L) {
              bc.a(-29869, -1L + param1);
              bc.a(-29869, 1L);
              return;
            } else {
              bc.a(-29869, param1);
              return;
            }
          }
        }
    }

    final static String a(int param0, String param1, char param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        var4 = param1.length();
        var5 = param3.length();
        var6 = var4;
        var7 = param0 + var5;
        if (var7 != 0) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param1.indexOf((int) param2, var8_int);
            if ((var8_int ^ -1) <= -1) {
              var8_int++;
              var6 = var6 + var7;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = 0;
              L1: while (true) {
                var10 = param1.indexOf((int) param2, var9);
                if (-1 >= (var10 ^ -1)) {
                  StringBuilder discarded$6 = var13.append(param1.substring(var9, var10));
                  var9 = 1 + var10;
                  StringBuilder discarded$7 = var13.append(param3);
                  continue L1;
                } else {
                  StringBuilder discarded$8 = var13.append(param1.substring(var9));
                  return var13.toString();
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          var9 = 0;
          L2: while (true) {
            var10 = param1.indexOf((int) param2, var9);
            if (-1 >= (var10 ^ -1)) {
              StringBuilder discarded$9 = var12.append(param1.substring(var9, var10));
              var9 = 1 + var10;
              StringBuilder discarded$10 = var12.append(param3);
              continue L2;
            } else {
              StringBuilder discarded$11 = var12.append(param1.substring(var9));
              return var12.toString();
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, vm param5, boolean param6) {
        Object var7 = null;
        Object var7_ref = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7_ref = (Object) (Object) eo.field_f;
                    // monitorenter eo.field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        m.field_f.e(param2, -1, 16);
                        if (!param3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var7_ref
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        ji.a(25459, param6, param5, param4, param0, param1);
                        // monitorexit var7_ref
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var8;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private wj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
