/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static String field_c;
    static String field_a;
    static String field_b;

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        sb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new sb(param0);
                    var3 = var9.d((byte) -54);
                    var4 = var9.b((byte) 69);
                    if ((var4 ^ -1) > -1) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (eg.field_h == 0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var4 > eg.field_h) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException();
                }
                case 5: {
                    if (var3 == param1) {
                        statePc = 18;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5_int = var9.b((byte) 20);
                    if (0 > var5_int) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (eg.field_h == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var5_int <= eg.field_h) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    throw new RuntimeException();
                }
                case 11: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (-2 != (var3 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    int discarded$3 = va.a(var16, var5_int, param0, var4, 9);
                    return var6;
                }
                case 13: {
                    var7 = (Object) (Object) pi.field_g;
                    // monitorenter pi.field_g
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        pi.field_g.a(var9, true, var16);
                        // monitorexit var7
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return var6;
                }
                case 16: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) var8;
                }
                case 18: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(var17, (byte) -120, 0, var4);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static bg a(int param0, byte param1) {
        bg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        bg[] var5 = null;
        var4 = MinerDisturbance.field_ab;
        var5 = pm.b(-5596);
        var2 = var5;
        if (param1 == 77) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param0 != var5[var3].field_c) {
                var3++;
                continue L0;
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          field_a = null;
          var3 = 0;
          L1: while (true) {
            if (var5.length > var3) {
              if (param0 != var5[var3].field_c) {
                var3++;
                continue L1;
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 14912) {
            return;
        }
        field_c = null;
    }

    final static String a(CharSequence[] param0, int param1) {
        if (param1 != -1) {
          field_c = null;
          return kl.a(param0, param0.length, 0, false);
        } else {
          return kl.a(param0, param0.length, 0, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Checking";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
