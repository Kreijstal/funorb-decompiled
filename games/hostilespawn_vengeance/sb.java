/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static double field_a;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HostileSpawn.field_I ? 1 : 0;
                    var1 = (Object) (Object) nj.field_c;
                    // monitorenter nj.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ae.field_s = ae.field_s + 1;
                        ee.field_e = nm.field_j;
                        if (-1 >= (uc.field_b ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var2 ^ -1) <= -113) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        qh.field_m[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        uc.field_b = md.field_o;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (uc.field_b == md.field_o) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = al.field_W[md.field_o];
                        md.field_o = 127 & md.field_o - -1;
                        if (var2 < 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qh.field_m[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qh.field_m[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        nm.field_j = oa.field_a;
                        // monitorexit var1
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var3;
                }
                case 14: {
                    if (param0 == -113) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = null;
                    sb.a((bd) null, -98);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        if (param9 == 3) {
          param3--;
          L0: while (true) {
            if (param3 < 0) {
              return;
            } else {
              var17 = param0;
              var10 = var17;
              var11 = param2;
              var12 = param1;
              var13 = param4;
              var14 = param8;
              var15 = (var17[var11] & 16711422) >> 1000842241;
              var10[var11] = var15 + ua.a(65280, var13 >> 353783049) + (ua.a(var12 >> 1714770401, 16711680) - -ua.a(255, var14 >> -747462351));
              param8 = param8 + param5;
              param1 = param1 + param6;
              param2++;
              param4 = param4 + param7;
              param3--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        nj var5 = null;
        if (!param0) {
            Object var4 = null;
            byte[] discarded$0 = sb.a(true, (Object) null, false);
        }
        if (param1 == null) {
            return null;
        }
        if (param1 instanceof byte[]) {
            var3 = (byte[]) param1;
            if (param2) {
                return dc.a(97, var3);
            }
            return var3;
        }
        if (param1 instanceof nj) {
            var5 = (nj) param1;
            return var5.a((byte) -26);
        }
        throw new IllegalArgumentException();
    }

    final static void a(bd param0, int param1) {
        if (param1 > -109) {
            return;
        }
        pf.b(511);
        si.a(param0.field_D, param0.field_u, param0.field_r);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0.0;
    }
}
