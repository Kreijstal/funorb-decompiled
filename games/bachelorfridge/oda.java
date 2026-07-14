/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oda {
    static String field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        L0: {
          var35 = BachelorFridge.field_y;
          if (param4 > 122) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          if (param1 != param5) {
            break L1;
          } else {
            if (param7 != param3) {
              break L1;
            } else {
              if (param9 != param6) {
                break L1;
              } else {
                if (param2 != param0) {
                  break L1;
                } else {
                  oe.a(param3, param8, -117, param9, param0, param5);
                  return;
                }
              }
            }
          }
        }
        var10 = param5;
        var11 = param3;
        var12 = param5 * 3;
        var13 = param3 * 3;
        var14 = param1 * 3;
        var15 = 3 * param7;
        var16 = param6 * 3;
        var17 = param2 * 3;
        var18 = -var16 + (param9 + var14 - param5);
        var19 = -var17 + param0 + (var15 + -param3);
        var20 = -var14 + (-var14 + (var16 + var12));
        var21 = var13 + (-var15 + (var17 - var15));
        var22 = -var12 + var14;
        var23 = -var13 + var15;
        var24 = 128;
        L2: while (true) {
          if (4096 >= var24) {
            var25 = var24 * var24 >> -2078974164;
            var26 = var24 * var25 >> -720570900;
            var27 = var26 * var18;
            var28 = var19 * var26;
            var29 = var20 * var25;
            var30 = var21 * var25;
            var31 = var22 * var24;
            var32 = var24 * var23;
            var33 = (var31 + (var27 + var29) >> -1602436020) + param5;
            var34 = (var30 + (var28 - -var32) >> -705481812) + param3;
            oe.a(var11, param8, -88, var33, var34, var10);
            var10 = var33;
            var11 = var34;
            // wide iinc 24 128
            continue L2;
          } else {
            return;
          }
        }
    }

    final static pp a(int param0, lu param1) {
        if (param0 > -30) {
            Object var3 = null;
            pp discarded$0 = oda.a(-17, (lu) null);
            return (pp) (Object) new kq();
        }
        return (pp) (Object) new kq();
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != vv.field_e) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == -705481812) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_a = null;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) vv.field_e;
                    // monitorenter vv.field_e
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        vv.field_e = null;
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
                    if (param0 == -705481812) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_a = null;
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

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 14124) {
            Object var2 = null;
            pp discarded$0 = oda.a(-77, (lu) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Average rating";
        field_b = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
