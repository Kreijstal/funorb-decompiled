/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_e;
    static int[] field_g;
    static String field_a;
    static int field_f;
    static int field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(byte[] param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        iw var9 = null;
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
                    if (param1 == -3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    hh.a((byte) 111);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = new iw(param0);
                    var3 = var9.h((byte) -107);
                    var4 = var9.k(param1 + 7);
                    if (var4 > -1) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-1 == jk.field_h) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 > jk.field_h) {
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
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(var16, 0, (byte) -6, var4);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var9.k(4);
                    if (var5 < 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (jk.field_h == 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 <= jk.field_h) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (1 != var3) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$3 = au.a(var17, var5, param0, var4, 9);
                    return var6;
                }
                case 16: {
                    var7 = (Object) (Object) lj.field_g;
                    // monitorenter lj.field_g
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        lj.field_g.a(-4019, var9, var17);
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return var6;
                }
                case 19: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 <= 53) {
          var2 = null;
          byte[] discarded$2 = hh.a((byte[]) null, (byte) -12);
          field_g = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(byte param0) {
        if (param0 == 97) {
          if (10 <= vj.field_c) {
            if (13 > hl.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = -103;
          if (10 <= vj.field_c) {
            if (13 > hl.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Join";
        field_a = "Gameplay";
        field_b = "Please log in as a subscribing member to access this feature.";
        field_c = "Click to turn on the buyout for this auction";
    }
}
