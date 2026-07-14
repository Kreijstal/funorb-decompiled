/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static fh field_b;
    static String field_d;
    static String field_e;
    static dd field_c;
    static int field_f;
    static String field_a;

    final static void a(java.math.BigInteger param0, int param1, int param2, byte[] param3, ni param4, java.math.BigInteger param5, byte param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = fleas.field_A ? 1 : 0;
          var7 = pf.a(param6 ^ 104, param1);
          if (null == vk.field_N) {
            vk.field_N = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        if (param6 == -60) {
          var9 = 0;
          L1: while (true) {
            if ((var9 ^ -1) <= -5) {
              L2: {
                L3: {
                  if (null == ri.field_x) {
                    break L3;
                  } else {
                    if (var7 <= ri.field_x.field_k.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ri.field_x = new ni(var7);
                break L2;
              }
              L4: {
                L5: {
                  ri.field_x.field_i = 0;
                  ri.field_x.a(param3, param1, param2, 0);
                  ri.field_x.d(var7, 0);
                  ri.field_x.a(0, var15);
                  if (fleas.field_B == null) {
                    break L5;
                  } else {
                    if (100 > fleas.field_B.field_k.length) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                fleas.field_B = new ni(100);
                break L4;
              }
              fleas.field_B.field_i = 0;
              fleas.field_B.a(param6 + 49, 10);
              var11 = 0;
              var9 = var11;
              L6: while (true) {
                if ((var11 ^ -1) <= -5) {
                  fleas.field_B.b((byte) -49, param1);
                  fleas.field_B.a(param0, param5, 127);
                  param4.a(fleas.field_B.field_k, fleas.field_B.field_i, 0, 0);
                  param4.a(ri.field_x.field_k, ri.field_x.field_i, 0, param6 + 60);
                  return;
                } else {
                  fleas.field_B.a(var15[var11], (byte) -15);
                  var11++;
                  continue L6;
                }
              }
            } else {
              var8[var9] = vk.field_N.nextInt();
              var9++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -105) {
            return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        ni var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param1 == -22518) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    byte[] discarded$4 = qi.a((byte[]) null, -34);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var10 = new ni(param0);
                    var3 = var10.e(false);
                    var4 = var10.c((byte) 123);
                    if (0 > var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == lj.field_b) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 > lj.field_b) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 == (var3 ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var10.c((byte) 126);
                    if (0 > var5_int) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (lj.field_b == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (lj.field_b >= var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var17 = new byte[var5_int];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (var3 == 1) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7 = (Object) (Object) se.field_c;
                    // monitorenter se.field_c
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        se.field_c.a((byte) -126, var17, var10);
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var8;
                }
                case 19: {
                    int discarded$5 = fe.a(var17, var5_int, param0, var4, 9);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return var6;
                }
                case 21: {
                    var18 = new byte[var4];
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var5 = var12;
                    var10.b(var18, 0, -126, var4);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Service unavailable";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_b = new fh(8, 0, 4, 1);
    }
}
